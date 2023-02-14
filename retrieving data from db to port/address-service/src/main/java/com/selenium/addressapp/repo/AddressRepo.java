package com.selenium.addressapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.selenium.addressapp.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
//address based on employee id
	@Query(nativeQuery =true,value="Select ea.id,ea.lane1,ea.lane2,ea.state,ea.zip from bhavyadb.address ea join bhavyadb.employee e on e.id=ea.employee_id where ea.employee_id=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int  employeeId);
}
