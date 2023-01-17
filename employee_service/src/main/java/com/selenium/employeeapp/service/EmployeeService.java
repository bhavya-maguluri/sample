package com.selenium.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selenium.employeeapp.entity.Employee;
import com.selenium.employeeapp.repo.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	public Employee getEmployeeById(int id){
		Employee employee = EmployeeRepo.findById(id).get();
		return employee;
	}
}
