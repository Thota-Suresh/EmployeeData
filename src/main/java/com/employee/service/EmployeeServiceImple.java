package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.dto.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee createEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee getEmployee(Long number) {
		return dao.getById(number);
	}

}
