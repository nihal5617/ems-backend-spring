package com.springboot.ems.service;

import java.util.List;

import com.springboot.ems.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();
	
	Employee getEmployee(long id);
	
	Employee updateEmployee(long id, Employee employee);
	
	void deleteEmployee(long id);
}
