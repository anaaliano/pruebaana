package com.ana.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ana.prueba.dao.BanksDAO;
import com.ana.prueba.model.Account;
import com.ana.prueba.model.Bank;
import com.ana.prueba.model.Client;
import com.ana.prueba.model.Transfer;
import com.ana.prueba.model.util.TransferResult;
import com.ana.prueba.model.util.TransferType;

@Service
public class TransferAgentService {

	@Autowired
	BanksDAO banksDAO;

	List<Bank> banks;
	
	public TransferResult receiveTransfer(Transfer transfer) {
		TransferResult tr = TransferResult.OK;
		banks = banksDAO.getBanks();

		// check transfer type
		TransferType type;
		
		String bankOriginAccount = getBankFromAccount(transfer.getOriginAccount());	
		if(bankOriginAccount == null) {
			return TransferResult.ORIGIN_ACCOUNT_NO_VALID;
		}
		String bankTargetAccount = getBankFromAccount(transfer.getTargetAccount());	
		if(bankTargetAccount == null) {
			return TransferResult.TARGET_ACCOUNT_NO_VALID;
		}
		
		if(bankOriginAccount.equals(bankTargetAccount)) {
			type = TransferType.INTRABANK;
		}else {
			type = TransferType.INTERBANK;
		}
		
		
		if(this.checkLimitCondition(transfer.getAmount(), type)) {
						
		}else {
			return TransferResult.LIMIT_OUT;
		}
		
		
		
		return tr;

	}
	
	private String getBankFromAccount(String accountTransfer) {
			
		for(Bank bank: banks){
			for(Client client: bank.getClients()) {
				for(Account account: client.getAccounts()) {
					if(accountTransfer.equals(account.getAccountNumber())) {
						return bank.getId();
					}
				}
			}
		}
		
		return null;
	}
	
	private Boolean checkLimitCondition(Double transferAmount, TransferType type) {
		return type.getLimit() < 0 || transferAmount < type.getLimit();
	}

}
