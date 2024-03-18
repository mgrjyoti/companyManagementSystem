package com.srit.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "bank_details")
public class BankDetails {

	@Id
	private int id;
	private long accountNo;
	private String accountHolderNmae;
	
	
}
