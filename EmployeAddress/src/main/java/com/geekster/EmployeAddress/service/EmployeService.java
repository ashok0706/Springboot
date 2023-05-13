package com.geekster.EmployeAddress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.EmployeAddress.Model.Employe;
import com.geekster.EmployeAddress.Repository.EmployeRepository;

@Service
public class EmployeService {

	@Autowired
	EmployeRepository employeRepository;
	
	
	public List<Employe> getAllEmployes() {
		return employeRepository.findAll();
	}


	public Employe getEmploye(String id) {
		
		return employeRepository.findById(Long.valueOf(id)).get();
	}


	public void addEmploye(Employe employe) {
		employeRepository.save(employe);
		
	}


	public String updateEmploye(String id, Employe employe) {
		Employe refAddress = employeRepository.findById(Long.valueOf(id)).get();
		
		if(refAddress!=null) {
			employeRepository.save(employe);
			return "Employe details Successfully Upadated";
		}
			return "No Id Found";
	}


	public String deleteEmploye(String id) {

		Employe refAddress = employeRepository.findById(Long.valueOf(id)).get();
		
		if(refAddress!=null) {
			employeRepository.deleteById(Long.valueOf(id));
			return "Employe  Successfully delated";
		}
			return "No Id Found";
		}

}
