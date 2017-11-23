package com.ana.prueba.model.util;

public enum TransferType {

	INTRABANK("Intra-bank", 0D, -1D, 0D), 
	INTERBANK("Inter-bank", 5D, 1000D, 30D);

	private String id;
	private Double comision;
	private Double limit;
	private Double possibilityFailures;

	private TransferType(String id, Double comision, Double limit, Double possibilityFailures) {
		this.id = id;
		this.comision = comision;
		this.limit = limit;
		this.possibilityFailures = possibilityFailures;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public Double getPossibilityFailures() {
		return possibilityFailures;
	}

	public void setPossibilityFailures(Double possibilityFailures) {
		this.possibilityFailures = possibilityFailures;
	}

}
