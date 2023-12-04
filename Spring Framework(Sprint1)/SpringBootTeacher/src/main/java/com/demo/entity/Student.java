package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "StudInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Student Name can't be blanck")
	private String sfname;

	@Column(length = 25, nullable = false)
	@NotBlank(message = "Student Surname cant be blanck")
	private String slname;

	@Column(length = 20, nullable = false, unique = true)
	@NotBlank(message = "Trainer Email id can't be blanck")
	@Email(message = "Email id isn't proper")
	private String semail;

	@Column(length = 11, nullable = false, unique = true)
	@NotBlank(message = "Phone number can't be null")
	private long sphone;

	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "Student educaation can't be blanck")
	private String sedu;

	@Column(length = 150, nullable = false, unique = true)
	@NotBlank(message = "Student Address can't be Blank")
	private String sadd;
}
