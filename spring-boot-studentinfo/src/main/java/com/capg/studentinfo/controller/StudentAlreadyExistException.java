package com.capg.studentinfo.controller;

public class StudentAlreadyExistException extends RuntimeException{
	
	public StudentAlreadyExistException(String message) {
		super(message);
		
	}

}
