package com.demo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	
	@Column(name = "StudentName")
	private String sName;

	@Column(name = "StudentAge")
	private int sage;

	@Column(name = "studentDept")
	private String dept;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name = "StudentCource",
	joinColumns= {
			@JoinColumn(name = "student_id",referencedColumnName = "sid")
			
	},
	inverseJoinColumns= {
		@JoinColumn(name="cource_id,",referencedColumnName="cid")	
	}
	)
	private Set<Course> courses;
}
