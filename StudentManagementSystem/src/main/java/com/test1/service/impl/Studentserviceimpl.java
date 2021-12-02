package com.test1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test1.entity.Student;
import com.test1.repository.Studentrepository;
import com.test1.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	
	private Studentrepository studentrepository;
	public Studentserviceimpl(Studentrepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}


    @Override
	public List<Student> getallstudents() {
		
		return studentrepository.findAll();
	}


	@Override
	public Student savestudent(Student student) {
		
		return studentrepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentrepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentrepository.save(student);
	}


	@Override
	public void deletestudentbyid(Long id) {
		studentrepository.deleteById(id);
		
	}

}
