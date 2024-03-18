package com.srit.company.model;

//import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true, nullable = false, name = "Email")
	private String email;
	
	@Column( nullable = false, name = "Password")
	private String password;
	
	@Column(nullable = false, name = "Frist_Name")
	private String first_name;
	
	@Column(nullable = false, name = "Middle_Name")
	private String middle_name;
	
	@Column(nullable = false, name = "Last_Name")
	private String last_name;
	
	@Column(nullable = false, name = "Emp_id", unique = true, length = 7)
	private long emp_id;
	
	//@DateTimeFormat
	@Column(nullable = false, name = "Created_Date")
	private String created_date;
	
	@Column(name="Created_by" ,nullable = false)
	private long created_by;
	
	@Column(name="Blocked" ,nullable = false)
	private boolean blocked;
	
	@Column(name="Failuer_count" ,nullable = false)
	private int failuer_count;
	
	@Column(name="Last_success_count" ,nullable = false)
	private String last_success_login;
	
	@Column(name = "dept" , nullable = false)
	private String dept;
	
	@Column(name = "Profile_img" ,nullable = false)
	private String profile_img;
	
//	//@OneToMany
//	private UserRoll roll;
//	
//	
//	
//	//@OneToOne
//	private BankDetails bankDetails;
//	
//	//@OneToOne
//	private PersonalDetails personalDetails;
}
