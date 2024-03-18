package com.srit.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_roll")
public class UserRoll {

	@Id
	private int id;
	private String roll;
}
