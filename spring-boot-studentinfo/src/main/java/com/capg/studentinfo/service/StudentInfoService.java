package com.capg.studentinfo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.studentinfo.controller.ListisEmptyException;
import com.capg.studentinfo.controller.StudentAlreadyExistException;
import com.capg.studentinfo.exception.StudentNotFoundException;
import com.capg.studentinfo.model.StudentInfo;
import com.capg.studentinfo.repo.StudentInfoRepo;

@Service
public class StudentInfoService {
	
	@Autowired(required = true)
	StudentInfoRepo repo;
	
	public StudentInfo getbyName(String StudentName) {
		if(!repo.existsById(StudentName)) {
			throw new StudentNotFoundException("["+StudentName+"] is Not Found"); 
		}
		return repo.getOne(StudentName);
	}
	public List<StudentInfo> getAll(){
		if(repo.findAll().isEmpty()) {
			throw new ListisEmptyException("List is empty");
		}
		return repo.findAll();
	}
	public StudentInfo addStudent(StudentInfo student) {
		if(repo.existsById(student.getStudentName())) {
			throw new StudentAlreadyExistException("["+student.getStudentName()+"] already exists");
		}
		return repo.save(student);
	}
	public boolean deleteStudent(String StudentName) {
		if(!repo.existsById(StudentName)) {
			throw new StudentNotFoundException("["+StudentName+"] is Not Found"); 
		}
		repo.deleteById(StudentName);
		return !(repo.existsById(StudentName));
	}
	public StudentInfo UpdateStudent(StudentInfo newInfo) {
		StudentInfo oldInfo= repo.getOne(newInfo.getStudentName());
		oldInfo.setStudentId(newInfo.getStudentId());
		oldInfo.setDob(newInfo.getDob());
		repo.save(oldInfo);
		return oldInfo;
	}

}
