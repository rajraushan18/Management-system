package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.entities.Employee;
import com.project.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping({"/", "/employee"})
	public String home(Model m) {
		
		List<Employee> emp = empService.gettAllEmployee();
		m.addAttribute("emp", emp);
		
		return "index";
	}
	
	@GetMapping("/addEmployee")
	public String addEmp() {
		return "addEmp";
	}
	
	@PostMapping("/submit")
	//e will store the data entered by user and pass here
	public String formSubmit(@ModelAttribute Employee e, HttpSession session) {
		System.out.println(e);
		empService.addEmp(e);
		//this message will be show when new data added
		session.setAttribute("msg", "employee added successfully..");	
		return "redirect:/";
		
//		return "addEmp";
		
	}
	
	@GetMapping("employee/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		
		Employee  e = empService.getEmpId(id);
		m.addAttribute("emp", e);
		
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e) {
		
		empService.addEmp(e);
		return "redirect:/";
	}
	
	@GetMapping("employee/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		
		empService.deleteEmp(id);
		return "redirect:/";
	}
	
	
}
