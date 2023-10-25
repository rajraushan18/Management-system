package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
