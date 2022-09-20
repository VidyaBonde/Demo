package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	
	public Optional<Employee> getEmployeeById(Integer id);
	
	public void deleteEmployee(Integer id);
}
