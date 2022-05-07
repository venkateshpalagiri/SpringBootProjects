package com.venkatesh.springboot.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.springboot.youtube.entity.Employee;
import com.venkatesh.springboot.youtube.service.EmployeeService;

@RestController
public class EmployeePostController {
	@Autowired
	private EmployeeService employeeService;
//	Updating with id
	@PutMapping("/employee/update/{id}")
	public Employee updateEmployeeById(@PathVariable("id") Long employeeId,
			@RequestBody Employee employee) {
		return employeeService.updateEmployeeById(employeeId,employee);
	}
//	Updating with name
	@PutMapping("/employee/update/name/{name}")
	public Employee updateEmployeeByName(@PathVariable("name")String employeeName,@RequestBody Employee employee) {
		return employeeService.updateEmployeeByName(employeeName,employee);
	}

}
