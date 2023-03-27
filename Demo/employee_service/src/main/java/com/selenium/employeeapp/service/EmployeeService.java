package com.selenium.employeeapp.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.selenium.employeeapp.entity.Employee;
import com.selenium.employeeapp.repo.EmployeeRepo;
import com.selenium.employeeapp.response.AddressResponse;
import com.selenium.employeeapp.response.EmployeeResponse;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private WebClient webClient;
	
	//@Value("${addressservice.base.url}")
	//private String addressBaseURL;
	
	/*public EmployeeService(@Value("${addressservice.base.url}")String addressBaseURL,
			RestTemplateBuilder builder) {
		this.restTemplate=builder
				          .rootUri(addressBaseURL)
				          .build();
	}*/
	
	public EmployeeResponse getEmployeeById(int id) {
		
		//AddressResponse addressResponse=new AddressResponse();
		Employee employee=employeeRepo.findById(id).get();
		EmployeeResponse employeeResponse= modelMapper.map(employee,EmployeeResponse.class);
		//EmployeeResponse employeeResponse = new EmployeeResponse();
		//employeeResponse.setId(employee.getId());
		//employeeResponse.setName(employee.getName());
		//employeeResponse.setEmail(employee.getEmail());
		//employeeResponse.setBloodGroup(employee.getBloodGroup());
		
		//AddressResponse addressResponse=restTemplate.getForObject("/address/{id}",AddressResponse.class,id);
		AddressResponse addressResponse= webClient
				.get()
				.uri("/address/"+id)
				.retrieve()
				.bodyToMono(AddressResponse.class)
				.block();
		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;
	  
}
}