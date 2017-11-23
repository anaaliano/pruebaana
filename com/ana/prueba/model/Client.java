package com.ana.prueba.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nif;
	private String name;
	private List<Account> accounts;

	public Client() {
		accounts = new ArrayList<>();
	}
	
	public Client(String nif, String name, List<Account> accounts) {
		this.nif = nif;
		this.name = name;
		this.accounts = accounts;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
