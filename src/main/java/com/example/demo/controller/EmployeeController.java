package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController

@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	
	EmployeeService employeeService;
	
	@PostMapping("/save")
	/*
	 * public Employee saveEmployee(Employee employee) { return
	 * employeeService.saveEmployee(employee); }
	 */
	
	public ResponseEntity<Employee> saveEmployee1(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id") Integer id){
		Optional<Employee> emp = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
	}
}
