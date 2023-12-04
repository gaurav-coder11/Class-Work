package com.demo.entity;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name ="Member_info")
public class Member {
	
	@Id
	@Column(name = "Member_ID")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int mid;

	@Column(name = "Member_Name")
	private String name;		
	
	@Column(name = "Contact_no")
	private long phone;
	
	private String Address;
	
	private int price;
	
	@Column(name = "Joining_Date")
	private Date joinDate;
	
	@Column(name = "Ending_Date")
	private Date EndDate;
	
	private String Membership;

	
	 public Member(String name, long phone, String address, int price, Date joinDate, Date endDate, String membership) {
		super();
		this.name = name;
		this.phone = phone;
		Address = address;
		this.price = price;
		this.joinDate = joinDate;
		EndDate = endDate;
		Membership = membership;
	}


	public String getMembership() {
		return Membership;
	}


	public void setMembership(String membership) {
		Membership = membership;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}


	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public int getId() {
		return mid;
	}


	public void setId(int mid) {
		this.mid = mid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
    public String getAddress() {
			return Address;
		}

     public void setAddress(String address) {
			Address = address;
		}
	
	
     //Json member code
     
//     {"name":"Rohit",
//    	 "phone":7895878588,
//    	 "address":"Ghansoli",
//    	 "price":"3000",
//    	 "joinDate":"2013-12-20",
//    	 "endDate":"2014-12-19",
//    	 "Membership":"Gold",
//    	 "Trainer_Id":"1",
//    	 "Trainer_Name":"Karan"
//    	 }
//

     
     
     
//	package com.demo.repository;
//
//	import static org.assertj.core.api.Assertions.assertThat;
//
//	import org.junit.jupiter.api.Disabled;
//	import org.junit.jupiter.api.Test;
//	import org.springframework.beans.factory.annotation.Autowired;
//	//import org.springframework.boot.autoconfigure.SpringBootApplication;
//	import org.springframework.boot.test.context.SpringBootTest;

	//import com.demo.entity.Gym;
	//
	//@SpringBootTest
	// class MemberRepoTest {
	//	
//		@Autowired
//		private  GymRepository gymrepo;
	//
//		@Test
//		@Disabled
//		void isPersonExistsById() {
//			Gym gym=new Gym("Khushal",578585696,"Digha",3000);    //checking the values are present or not
//			gymrepo.save(gym);
//			
//			Boolean actualResult=gymrepo.isPersonExistsById(2);     
//			
//			assertThat(actualResult).isTrue();
//			
//		}
	//}

}
