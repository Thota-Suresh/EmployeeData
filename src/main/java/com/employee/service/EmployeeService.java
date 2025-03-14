package com.employee.service;

import org.springframework.stereotype.Service;

import com.employee.dto.Employee;


@Service
public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	public Employee getEmployee(Long number);
}
