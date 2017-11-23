package com.ana.prueba.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	private double amount;
	private List<Transfer> transfers;

	
	
	public Account() {
		super();
		transfers = new ArrayList<>();
	}

	public Account(String accountNumber, double amount, List<Transfer> transfers) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transfers = transfers;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

}
