package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.Employee;
import com.employee.service.EmployeeServiceImple;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImple service ;
	
	@PostMapping("/employee/create")
	public Employee createEmployee(@RequestBody Employee entity) {
		
		return service.createEmployee(entity);
	}
	@GetMapping("/employee/{userId}")
	public Employee getEmpoyeeDataByID(@PathVariable("userId")  long id) {
		return service.getEmployee(id);
	}
}
