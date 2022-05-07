package com.venkatesh.springboot.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkatesh.springboot.youtube.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByEmployeeName(String employeeName);

	public Employee findByEmployeeContact(Long employeeContact);
}
