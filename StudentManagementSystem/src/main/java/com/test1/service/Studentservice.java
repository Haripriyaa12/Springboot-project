package com.test1.service;

import java.util.List;

import com.test1.entity.Student;

public interface Studentservice {
	
	List<Student> getallstudents();
	Student savestudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deletestudentbyid(Long id);

}
