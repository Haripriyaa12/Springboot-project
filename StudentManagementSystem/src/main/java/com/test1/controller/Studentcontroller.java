package com.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test1.entity.Student;
import com.test1.service.Studentservice;


@Controller
public class Studentcontroller {
	
	private Studentservice studentservice;

	public Studentcontroller(Studentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//handler method to handle list students and return model and view
	@GetMapping("/students")
	public String liststudents(Model model) {
		model.addAttribute("students", studentservice.getallstudents());
		return "students";
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();  //empty student obj to hold student form data
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String savestudent(@ModelAttribute("student")Student student) {
		
		studentservice.savestudent(student);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/edit/{id}")
	public String editstudentform(@PathVariable Long id,Model model) {
		
		model.addAttribute("student",studentservice.getStudentById(id));
		return "edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	public String updatestudent(@PathVariable Long id, @ModelAttribute("student")Student student,Model model)
{
		//get student from database by id
		Student existingstudent = studentservice.getStudentById(id);
		existingstudent.setId(id);
		existingstudent.setFirstname(student.getFirstname());
		existingstudent.setLastname(student.getLastname());
		existingstudent.setEmail(student.getEmail());
		
		//save it
		studentservice.updateStudent(existingstudent);
		return "redirect:/students";
		
	}
	
	//delete handler
	@GetMapping("/students/{id}")
	public String deletestudent(@PathVariable Long id) {
	
		studentservice.deletestudentbyid(id);
		return "redirect:/students";
		
	}
	
	

}
