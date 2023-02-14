package com.selenium.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selenium.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	// save,fetch,find,update etc..
}
