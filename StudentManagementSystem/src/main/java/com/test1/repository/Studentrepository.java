package com.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test1.entity.Student;


public interface Studentrepository extends JpaRepository<Student,Long> {

}
