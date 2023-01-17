package com.selenium.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.selenium.employeeapp.entity.Employee;
import com.selenium.employeeapp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employees/{id}")
	Employee getEmployeeDetails(@PathVariable("id")int id){
	Employee employee = employeeService.getEmployeeById(id);
	return employee;
}
}
