package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Cource {
	
	@Id
	private int cid;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "Cource name cannt be blank")
	private String cNmae;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "Cource uration cannt be blank")
	private String duration;

	@Column(length = 20, nullable = true)
	@NotBlank(message = "Cource Fees cannt be blank")
	private double cFees;
}
