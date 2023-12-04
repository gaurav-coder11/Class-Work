package com.demo.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Trainer_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Trainer_ID")
	private int tid;
	
	@Column(name = "Trainer_name")
	
	private String tname;
	
	@Column(name = "Contact_no")
	
	private long tphone;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "trainer_id",referencedColumnName = "Trainer_ID")
	 private List<Member> member=new ArrayList<>();
	
	
}
