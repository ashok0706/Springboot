package com.geekster.EmployeAddress.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.EmployeAddress.Model.Address;
import com.geekster.EmployeAddress.Repository.AddressRepository;
@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;
	private Address refAddress;
	
	public Iterable<Address> getalladdress() {
		
		return addressRepository.findAll();
	}

	public Address getAddressbyId(String id) {
		
		return addressRepository.findById(Long.valueOf(id)).get();
	}

	public void addAddress(Address address) {
		addressRepository.save(address);
		
	}

	public String updatedetails(Address address, String id) {
		refAddress = addressRepository.findById(Long.valueOf(id)).get();
		
		if(refAddress!=null) {
			addressRepository.save(address);
			return "Address details Sucessfully Updated";
		}
		return "No Address id found";
	}

	public String deleteAddress(String id) {
	refAddress = addressRepository.findById(Long.valueOf(id)).get();
		
		if(refAddress!=null) {
			addressRepository.deleteById(Long.valueOf(id));
			return "Address  Sucessfully Deleted";
		}
		return "No Address id found";
	}
	

	

}
