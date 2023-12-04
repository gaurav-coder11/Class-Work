package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	private int did;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "Department name cannt be blank")
	private String deptName;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "HOD's name cannt be blank")
	private String deptHOD;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "Kindly mention no of Employees")
	private int noOfEmp;
}
