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
@Table(name = "TrainerDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Teacher {
	@Id
	private int id;
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Trainer Name can't be blanck")
	private String tname;

	@Column(length = 25, nullable = false)
	@NotBlank(message = "Trainer Surname cant be blanck")
	private String tsurname;

	@Column(length = 20, nullable = false, unique = true)
	@NotBlank(message = "Trainer Email id can't be blanck")
	@Email(message = "Email id isn't proper")
	private String temail;

	@Column(length = 11, nullable = false, unique = true)
	@NotBlank(message = "Phone number can't be null")
	private long tphone;

	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "Designation can't be Blank")
	private String designation;

}
