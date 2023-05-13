package com.geekster.EmployeAddress.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.EmployeAddress.Model.Address;
import com.geekster.EmployeAddress.service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
//	GET /addresses - get all addresses
	@GetMapping("/allAddress")
	public Iterable<Address> getAllAddress(){
		return addressService.getalladdress();
	}
	
//	GET /addresses/{id} - get an address by id
	@GetMapping("/getAddress/{Id}")
	public Address getAddressbyId(@PathVariable String id){
		return addressService.getAddressbyId(id);
	}
	
//	POST /addresses - create a new address
	@PostMapping("/addAddress")
	public void createAddres(@RequestBody Address address) {
		addressService.addAddress(address);
	}
	
//	PUT /addresses/{id} - update an address by id
	@PutMapping("/upadate/{id}")
	public String  UpdateidDetails(Address address, @PathVariable String id) {
	 return addressService.updatedetails(address, id);
	}
	
//	DELETE /addresses/{id} - delete an address by id
	@DeleteMapping("/delete/{id}")
	public String  deleteAddress(String id) {
	 return addressService.deleteAddress(id);
	}

}
