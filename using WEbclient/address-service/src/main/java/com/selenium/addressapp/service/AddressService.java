package com.selenium.addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selenium.addressapp.entity.Address;
import com.selenium.addressapp.repo.AddressRepo;
import com.selenium.addressapp.response.AddressResponse;

@Service
public class AddressService {

	@Autowired 
	private AddressRepo addressRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId) {
		Address address=addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = modelMapper.map(address,AddressResponse.class);
		return addressResponse;
	}
}
