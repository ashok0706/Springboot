package com.geekster.EmployeAddress.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	private String  name ;
	private String lastName ;
	
	@OneToOne
	@JoinColumn(name = "Fk_EmpId")
	private String address ;

}
