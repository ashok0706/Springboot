package com.geekster.EmployeAddress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geekster.EmployeAddress.Model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
