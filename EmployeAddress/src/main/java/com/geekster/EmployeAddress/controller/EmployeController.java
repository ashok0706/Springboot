package com.geekster.EmployeAddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.EmployeAddress.Model.Employe;
import com.geekster.EmployeAddress.service.EmployeService;

@RestController
@RequestMapping("/Employe")
public class EmployeController {

	@Autowired
	EmployeService employeService;
	
//	GET /employees - get all employees
	@GetMapping("/getAllEmployes")
	public List<Employe> getAllEmployes() {
		return employeService.getAllEmployes();
	}
	
//	GET /employees/{id} - get an employee by id
	@GetMapping("/getEmploye/{id}")
	public Employe getAllEmployes(@PathVariable String id) {
		return employeService.getEmploye(id);
	}
	
//	POST /employees - create a new employee
	@PostMapping("/creat")
	public void createEmploye(@RequestBody Employe employe) {
		employeService.addEmploye(employe);
	}
	
//	PUT /employees/{id} - update an employee by id
	public String  updateEmploye(@PathVariable String id, Employe employe) {
		return employeService.updateEmploye(id, employe);
	}
	
//	DELETE /employees/{id} - delete an employee by id
	public String  deleteEmploye(@PathVariable String id) {
		return employeService.deleteEmploye(id);
	} 
	
}
