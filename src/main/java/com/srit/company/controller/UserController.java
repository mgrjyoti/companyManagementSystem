package com.srit.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srit.company.model.User;
import com.srit.company.repository.UserRepositrory;

@Controller
public class UserController {

	@Autowired
	private UserRepositrory userRepositrory;
	
	@RequestMapping("/register")
	public String registerUser(@RequestBody User user, Model model)  {
		User user1=new User();
		user1.setFirst_name(user.getFirst_name());
		user1.setLast_name(user.getLast_name());
		user1.setMiddle_name(user.getMiddle_name());
		user1.setLast_name(user.getLast_name());
		user1.setCreated_by(user.getCreated_by());
		user1.setEmail(user.getEmail());
		user1.setDept(user.getDept());
		user1.setEmp_id(user.getEmp_id());
		user1.setProfile_img(user.getProfile_img());
		user1.setPassword(user.getPassword());
		userRepositrory.save(user1);
		System.out.println("user Register Sucessfully.");
		return "register";
	}
}
