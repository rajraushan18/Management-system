package com.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String EmpName;
	private String EmpEmail;
	private int EmpSalary;
	private String EmpCity;
	
	public Employee(int id, String empName, String empEmail, int empSalary, String empCity) {
		super();
		this.id = id;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpSalary = empSalary;
		EmpCity = empCity;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail + ", EmpSalary=" + EmpSalary
				+ ", EmpCity=" + EmpCity + "]";
	}
	
	
	
}
