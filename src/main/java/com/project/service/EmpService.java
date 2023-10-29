package com.project.service;

import java.util.*;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Employee;
//import com.project.repository.EmpRepository;

@Service
public class EmpService {
	
	
	private List<Employee> employees = new ArrayList<>();
	
	{		
		employees.add(new Employee(1, "user1", "user1@email.com", 1057470, "gaya" ));
		employees.add(new Employee(2, "user2", "user2@email.com", 1064470, "patna" ));
		employees.add(new Employee(3, "user3", "user3@email.com", 102520, "kolkata" ));
		employees.add(new Employee(4, "user4", "user4@email.com", 12352500, "delhi" ));
		employees.add(new Employee(5, "user5", "user5@email.com", 104200, "varanasi" ));
	}

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
    	employees.add(employee);

    	//********this can be used if the id already exists
//    	for(int i=0;i<employees.size();i++) {
//    		Employee e = employees.get(i);
//    		if(e.getId() == employee.getId()) {
//    			updateEmployee(employee);
//    			return;
//    		}
//    	}
    }

    public void updateEmployee( Employee updatedEmployee) {
    	for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == updatedEmployee.getId()) {
                employees.set(i, updatedEmployee);
                return;
            }
        }
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getId() == id) {
//                employees.set(i, updatedEmployee);
//                break;
//            }
//        }
    }

    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
	
	
	

//	@Autowired
//	private EmpRepository empRepository;
//	
//	
//	public void addEmp(Employee e) {
//		//empRepository.save(e);
//	}
//	
//	public List<Employee> gettAllEmployee(){		
//		//return empRepository.findAll();
//	}
//	
//	public Employee getEmpId(int id) {
//		for(Employee e : emp) {
//			if(e.getId() == id) {
//				return e;
//			}
//		}
//		return null;
////		Optional<Employee> e = empRepository.findById(id);
////		if(e.isPresent())
////			return e.get();
////		
////		return null;
//	}
//	
//	public void deleteEmp(int id) {
//		Iterator<Employee> iterator = emp.iterator();
//			while (iterator.hasNext()) {
//				Employee employee = iterator.next();
//		        if (employee.getId() == id) {
//		            iterator.remove();
//		        }
//		 }
//		//empRepository.deleteById(id);
//	}
//	
}
