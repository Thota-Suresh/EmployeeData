package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.Employee;
import com.employee.service.EmployeeServiceImple;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImple service ;
	
	@PostMapping("/create/employee")
	public Employee createEmployee(@RequestBody Employee entity) {
		
		return service.createEmployee(entity);
	}
	
}
