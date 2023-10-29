package com.project.service;

import java.util.*;
//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.project.entities.Employee;
import com.project.entities.Student;
//import com.project.repository.StudentRepository;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>();
	
	{		
		students.add(new Student(1, "student1", "student1@email.com", "gaya", "Btech" ));
		students.add(new Student(2, "student2", "student2@email.com", "patna", "Btech" ));
		students.add(new Student(3, "student3", "student3@email.com", "kolkata", "MBA" ));
		students.add(new Student(4, "student4", "student4@email.com", "delhi", "BCA" ));
		students.add(new Student(5, "student5", "student5@email.com", "varanasi", "Law" ));
	}

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
    	students.add(student);

    	//********this can be used if the id already exists
//    	for(int i=0;i<employees.size();i++) {
//    		Employee e = employees.get(i);
//    		if(e.getId() == employee.getId()) {
//    			updateEmployee(employee);
//    			return;
//    		}
//    	}
    }

    public void updateStudent( Student updatedStudent) {
    	for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                return;
            }
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
	
	
	
	
	
//	@Autowired
//	private StudentRepository studentRepository;
//	
//	public void addStudent(Student s) {
//		studentRepository.save(s);
//	}
//	
//	public List<Student> getallStudent(){
//		return studentRepository.findAll();
//	}
//	
//	public Student edit(int id) {
//		Optional<Student> student = studentRepository.findById(id);
//		if(student.isPresent())
//			return student.get();
//		
//		return null;
//	}
//	
//	public void delete(int id) {
//		studentRepository.deleteById(id);
//	}
	
}
