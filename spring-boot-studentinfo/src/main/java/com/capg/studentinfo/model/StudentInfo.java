package com.capg.studentinfo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class StudentInfo {
	@Id
	private String StudentName;
	private int StudentId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(String studentName, int studentId, LocalDate dob) {
		super();
		StudentName = studentName;
		StudentId = studentId;
		this.dob = dob;
	}
	

}
