package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok annotation to generate getter, setter, equals, hashCode, and toString methods
@Data

//Lombok annotation to generate an all-args constructor
@AllArgsConstructor

//Lombok annotation to generate a no-args constructor
@NoArgsConstructor

//Annotating the class as an entity, indicating it is mapped to a database table named "emptbl"
@Entity
@Table(name = "emptbl")
public class Employee {
	// Annotating empid as the primary key column with auto-increment
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Mapping empName to a column named "empname"
	@Column(name = "Emp_ID")
	private int empid;
	// Mapping empDepr to a column named "empDept"
	@Column(name = "Emp_Name")
	private String empName;

	// Mapping empSal to a column named "empdept"
	@Column(name = "Emp_Dept")
	private String empDepr;
	// Mapping empSal to a column named "empsal"
	@Column(name = "Ep_Sal")
	private Double empSal;

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

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDepr=" + empDepr + ", empSal=" + empSal
				+ "]";
	}

	// Default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor

	public Employee(String empName, String empDepr, Double empSal) {
		super();
		this.empName = empName;
		this.empDepr = empDepr;
		this.empSal = empSal;
	}
}
