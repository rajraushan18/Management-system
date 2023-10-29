package com.project.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//import com.project.entities.Employee;
import com.project.entities.Student;
import com.project.service.StudentService;

@Controller
public class StuController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public String Student(Model m) {
		System.out.println("inside student data");
		List<Student> student = studentService.getAllStudents();
		m.addAttribute("student", student);
		return "student";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model m) {
		m.addAttribute("student", new Student());
		return "addStudent";
	}
	
	@PostMapping("/studentsubmit")
	public String studentFormSubmit(@ModelAttribute Student s) {
		studentService.addStudent(s);
		System.out.println(s);
		return "redirect:/student";
	}
	
	@GetMapping("/student/edit/{id}")
	public String studentEdit(@PathVariable int id, Model m) {
		Student student = studentService.getStudentById(id);
		m.addAttribute("student", student);
		return "studentedit";
	}
	
	@PostMapping("/studentupdate")
	public String updateStudent(@ModelAttribute Student s) {
		studentService.updateStudent(s);
		return "redirect:/student";
	}
	
	@GetMapping("/student/delete/{id}")
	public String studentDelete(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "redirect:/student";
	}
	
}
