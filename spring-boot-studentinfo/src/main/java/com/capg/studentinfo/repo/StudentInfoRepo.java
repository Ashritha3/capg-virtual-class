package com.capg.studentinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.studentinfo.model.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo, String>{

}
