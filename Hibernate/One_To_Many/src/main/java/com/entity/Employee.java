package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_ID")
private int empid;
	@Column(name = "Emp_Name")
private String empName;
	@ManyToOne
	@JoinColumn(name="Dept_Id")
private Department department1;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, Department empDepartment) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.department1 = empDepartment;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getEmpDepartment() {
		return department1;
	}
	public void setEmpDepartment(Department dept) {
		this.department1 = dept;
	}
}
