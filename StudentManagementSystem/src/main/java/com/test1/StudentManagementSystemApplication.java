package com.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test1.entity.Student;
import com.test1.repository.Studentrepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private Studentrepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Hari", "Priyaa", "priya@123");
		studentrepository.save(student1);
		
		Student student2 = new Student("Shwetha", "Krishnavel", "swetha@123");
		studentrepository.save(student2);
		
		Student student3 = new Student("Bindu", "Chandran", "bindu@123");
		studentrepository.save(student3);*/
		
		
	}

}

