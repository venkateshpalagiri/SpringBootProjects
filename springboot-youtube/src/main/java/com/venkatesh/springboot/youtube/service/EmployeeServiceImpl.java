package com.venkatesh.springboot.youtube.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkatesh.springboot.youtube.entity.Employee;
import com.venkatesh.springboot.youtube.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
//		findAll() gives all the list
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long employeeId) {
//		First find using id and get
		return employeeRepository.findById(employeeId).get();
	}
	@Override
	public Employee fetchEmployeeByName(String employeeName) {
		return employeeRepository.findByEmployeeName(employeeName);
	}
	@Override
	public Employee fetchEmployeeByContact(Long employeeContact) {
		return employeeRepository.findByEmployeeContact(employeeContact);
	}
	@Override
	public Employee updateEmployeeById(Long employeeId,Employee employee) {
		Employee emp=employeeRepository.findById(employeeId).get();
		if(Objects.nonNull(employee.getEmployeeName())&&!"".equalsIgnoreCase(employee.getEmployeeName())) {
			emp.setEmployeeName(employee.getEmployeeName());
		}
		if (Objects.nonNull(employee.getEmployeeContact())) {
			emp.setEmployeeContact(employee.getEmployeeContact());
		}
		if (Objects.nonNull(employee.getEmployeeEmail())&&!"".equalsIgnoreCase(employee.getEmployeeEmail())) {
			emp.setEmployeeEmail(employee.getEmployeeEmail());
		}
		if (Objects.nonNull(employee.getEmployeeCountry())&&!"".equalsIgnoreCase(employee.getEmployeeCountry())) {
			emp.setEmployeeCountry(employee.getEmployeeCountry());
		}
		return employeeRepository.save(emp);
	}
	@Override
	public Employee updateEmployeeByName(String employeeName,Employee employee) {
		Employee emp=employeeRepository.findByEmployeeName(employeeName);
		if (Objects.nonNull(employee.getEmployeeName())&&!"".equalsIgnoreCase(employee.getEmployeeName())) {
			emp.setEmployeeName(employee.getEmployeeName());
		}
		if (Objects.nonNull(employee.getEmployeeContact())) {
			emp.setEmployeeContact(employee.getEmployeeContact());
		}
		if (Objects.nonNull(employee.getEmployeeEmail())&&!"".equalsIgnoreCase(employee.getEmployeeEmail())) {
			emp.setEmployeeEmail(employee.getEmployeeEmail());
		}
		if (Objects.nonNull(employee.getEmployeeCountry())&&!"".equalsIgnoreCase(employee.getEmployeeCountry())) {
			emp.setEmployeeCountry(employee.getEmployeeCountry());
		}
		return employeeRepository.save(emp);
	}

}
