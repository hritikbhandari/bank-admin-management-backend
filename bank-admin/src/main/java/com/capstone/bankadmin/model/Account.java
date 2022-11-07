package com.capstone.bankadmin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_master")
public class Account {
	
	@Id
	@Column(name="account_number")
	private int accountNumber;
	
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="branch_id")
	private String branchId;
	
	@Column(name="opening_balance")
	private int openingBalance;
	
	@Column(name="account_type")
	private String accountType;
	
	@Column(name="account_status")
	private String accountStatus;
	
	public Account () {	}
	
	public Account(int accountNumber, int customerNumber, String branchId,
			int openingBalance, String accountType, String accountStatus ) {
		super();
		this.accountNumber = accountNumber;
		this.customerNumber = customerNumber;
		this.branchId = branchId;
		this.openingBalance = openingBalance;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(int openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	

}
