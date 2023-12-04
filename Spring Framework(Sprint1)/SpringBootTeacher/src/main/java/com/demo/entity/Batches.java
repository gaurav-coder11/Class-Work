package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Batches {
	
	@Id
	private int bid;
	
	private String bName;
	
	private String bSubject;
	
	private String strtdate;
	
	private String enddate;	
	
	private long duration;
}
