package com.capg.studentinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.studentinfo.model.StudentInfo;
import com.capg.studentinfo.service.StudentInfoService;


@RestController
@RequestMapping("/studentinfo")
public class StudentInfoController {

	@Autowired
	StudentInfoService service;
	
	@GetMapping("/sName/{sName}")
	public ResponseEntity<StudentInfo> getbyName(@PathVariable("sName") String sName) {
		return new ResponseEntity<StudentInfo>(service.getbyName(sName), HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<StudentInfo>> getAllInfo(){
		return new ResponseEntity<List<StudentInfo>>(service.getAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<StudentInfo> addStudent(@RequestBody StudentInfo student) {
		return new ResponseEntity<StudentInfo>(service.addStudent(student), HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/sName/{sName}")
	public ResponseEntity<Boolean> deleteInfo(@PathVariable("sName") String sName) {
		return new ResponseEntity<Boolean> (service.deleteStudent(sName), HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<StudentInfo> updateInfo(@RequestBody StudentInfo student) {
		return new ResponseEntity<StudentInfo>(service.UpdateStudent(student), HttpStatus.ACCEPTED);
	}
}
