package com.ana.prueba.model;

public class Transfer {
	private String id;
	private String originAccount;
	private String targetAccount;
	private double amount;

	public Transfer() {
		super();
	}

	public Transfer(String id, String originAccount, String targetAccount, double amount) {
		super();
		this.id = id;
		this.originAccount = originAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOriginAccount() {
		return originAccount;
	}

	public void setOriginAccount(String originAccount) {
		this.originAccount = originAccount;
	}

	public String getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
