package com.geekster.EmployeAddress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.EmployeAddress.Model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
