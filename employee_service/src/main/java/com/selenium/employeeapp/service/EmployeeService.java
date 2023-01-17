package com.selenium.employeeapp.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selenium.employeeapp.entity.Employee;
import com.selenium.employeeapp.repo.EmployeeRepo;
import com.selenium.employeeapp.response.EmployeeResponse;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeById(int id) {
		
		Employee employee=EmployeeRepo.findById(id).get();
		EmployeeResponse employeeResponse= modelMapper.map(employee,EmployeeResponse.class);
		//EmployeeResponse employeeResponse = new EmployeeResponse();
		//employeeResponse.setId(employee.getId());
		//employeeResponse.setName(employee.getName());
		//employeeResponse.setEmail(employee.getEmail());
		//employeeResponse.setBloodGroup(employee.getBloodGroup());
		return employeeResponse;
	
}
}