package com.venkatesh.springboot.youtube.service;

import java.util.List;

import com.venkatesh.springboot.youtube.entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);

	public List<Employee> fetchEmployeeList();

	public Employee fetchEmployeeById(Long employeeId);

	public Employee fetchEmployeeByName(String employeeName);

	public Employee fetchEmployeeByContact(Long employeeContact);
	public Employee updateEmployeeById(Long employeeId,Employee employee);
	public Employee updateEmployeeByName(String employeeName,Employee employee);
}
