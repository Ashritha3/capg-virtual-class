package com.capg.studentinfo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.studentinfo.exception.StudentNotFoundException;

@ControllerAdvice
@RestController
public class StudentErrorController {
	
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Student with this name Not Found" , code = HttpStatus.NOT_FOUND)
	public void handleStudentNotFoundException() {
		
	}
	@ExceptionHandler(StudentAlreadyExistException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Student already exists" , code = HttpStatus.BAD_REQUEST)
	public void handleStudentAlreadyExistException() {
		
	}
	@ExceptionHandler(ListisEmptyException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Student already exists" , code = HttpStatus.BAD_REQUEST)
	public void handleListisEmptyException() {
		
	}

}
