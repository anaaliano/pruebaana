package com.ana.prueba.model.util;

import com.ana.prueba.model.Transfer;

public enum TransferResult {

	OK("0", "La transferencia se ha realizado con éxito"), 
	ORIGIN_ACCOUNT_NO_VALID("1", "La cuenta de origen no es válida"),
	TARGET_ACCOUNT_NO_VALID("2", "La cuenta de destino no es válida"),
	LIMIT_OUT("3", "El valor supera el límite");

	private String id;
	private String message;

	private Transfer tranferOut;
	private String bankOriginTransfer;
	private Transfer tranferIn;
	private String bankTargetTransfer;

	
	private TransferResult(String id, String message) {
		this.id = id;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Transfer getTranferOut() {
		return tranferOut;
	}

	public void setTranferOut(Transfer tranferOut) {
		this.tranferOut = tranferOut;
	}

	public String getBankOriginTransfer() {
		return bankOriginTransfer;
	}

	public void setBankOriginTransfer(String bankOriginTransfer) {
		this.bankOriginTransfer = bankOriginTransfer;
	}

	public Transfer getTranferIn() {
		return tranferIn;
	}

	public void setTranferIn(Transfer tranferIn) {
		this.tranferIn = tranferIn;
	}

	public String getBankTargetTransfer() {
		return bankTargetTransfer;
	}

	public void setBankTargetTransfer(String bankTargetTransfer) {
		this.bankTargetTransfer = bankTargetTransfer;
	}
	
	

}
