package com.UserManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserManagementSystem.model.UMS;
import com.UserManagementSystem.service.UserService;


@RestController
public class UMSController {

	@Autowired
	UserService userservice ;
	
	@GetMapping("/getAllUsers")
	public List<UMS> getallusers() {
		return userservice.getAllusers();

	}
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody UMS ums) {
		boolean status = userservice.adduser(ums);
		 if(status)return "Successfully user added  ";
		 
		 else return "'User Not Added";
	}
	
	@GetMapping("/getUser/{id}")
	public List<UMS> getUserbyId(@PathVariable String id) {
		return userservice.getUserbyId(id);
	}
	
	 @PutMapping("/udateUserInfo")
	 public String updateuserinfo(UMS  ums) {
		 boolean status = userservice.updateuserinfo(ums);
		if(status) return "Successfully user Updated";
		
		else return "No element found";
	 }
	 
	 @DeleteMapping("/delateUser/{id}")
	 public String delatinguser(@PathVariable String id) {
		boolean status = userservice.deletainguser(id);
		if(status) return "Successfully user delated";
		
		else return " no element found";
	 }
	 
}
