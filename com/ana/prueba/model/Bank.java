package com.ana.prueba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String id;
	private List<Client> clients;
	
	public Bank() {
		clients = new ArrayList<>();
	}
	
	public Bank(String id, List<Client> clients) {
		this.id = id;
		this.clients = clients;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
