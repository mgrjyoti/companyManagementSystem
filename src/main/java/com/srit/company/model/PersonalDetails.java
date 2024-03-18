package com.srit.company.model;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "personal_details")
public class PersonalDetails {

	@Id
	private long id;
	
	@Column(nullable = false, name="Name")
	private String name;
	
//	//@OneToOne
//	private User user;
	
	@Column(nullable = false, name="Position")
	private String position;
	
	@CreatedDate
	private String hire_date;
	
	@Column(nullable = false, name="Reporting_manager")
	private long reporting_manager;
	
	@Column(nullable = false, name="Salary")
	private double salary;
	
	@Column(nullable = false, name="Address")
	private String address;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(nullable = false, name="Adhar_number",unique = true)
	private long aadhar_number;
	
	@Column(nullable = false, name="Pan_number" , unique = true)
	private String pan_number;
	
	@Column(nullable = false, name="Email", unique = true)
	private String email;
	
	@Column(nullable = false, name="Mobile_number",unique = true)
	private long mobile_number;
	
	//@CreatedDate
	@Column(nullable = false, name="Date_Of_Birth")
	private String Dob;
	
	@Column(nullable = false, name="Emagency_name")
	private String emagency_name;
	
	@Column(nullable = false, name="Emagency_mobile", unique = true,length = 10)
	private long emargency_mobile;
	
}
