package com.venkatesh.springboot.youtube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.springboot.youtube.entity.Employee;
import com.venkatesh.springboot.youtube.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

//	Saving employee details using PostMapping
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

//	Fetching all the employee List using GetMapping
	@GetMapping("/employee")
	public List<Employee> fetchEmployeeList() {
		return employeeService.fetchEmployeeList();
	}

//	Fetching employee details using employeeId
	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Long employeeId) {
		return employeeService.fetchEmployeeById(employeeId);
	}

//	Fetching employee details using employeeName
	@GetMapping("/employee/name/{name}")
	public Employee fetchEmployeeByName(@PathVariable("name") String employeeName) {
		return employeeService.fetchEmployeeByName(employeeName);
	}

//	Fetching employee details using employeeContact
	@GetMapping("/employee/contact/{contact}")
	public Employee fetchEmployeeByContact(@PathVariable("contact") Long employeeContact) {
		return employeeService.fetchEmployeeByContact(employeeContact);
	}
//	Fetching employee details using employeeEmail

}
