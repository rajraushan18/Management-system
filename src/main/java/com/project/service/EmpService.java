package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Employee;
import com.project.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;
	
	public void addEmp(Employee e) {
		empRepository.save(e);
	}
	
	public List<Employee> gettAllEmployee(){
		return empRepository.findAll();
				
	}
	
	public Employee getEmpId(int id) {
		Optional<Employee> e = empRepository.findById(id);
		if(e.isPresent())
			return e.get();
		
		return null;
	}
	
	public void deleteEmp(int id) {
		empRepository.deleteById(id);
	}
	
}
