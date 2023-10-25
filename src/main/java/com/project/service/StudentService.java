package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Student;
import com.project.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student s) {
		studentRepository.save(s);
	}
	
	public List<Student> getallStudent(){
		return studentRepository.findAll();
	}
	
	public Student edit(int id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent())
			return student.get();
		
		return null;
	}
	
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	
}
