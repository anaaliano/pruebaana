package com.ana.prueba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ana.prueba.model.Bank;
import com.ana.prueba.model.Transfer;
import com.ana.prueba.services.BankService;
import com.ana.prueba.services.TransferAgentService;

@RestController
@RequestMapping("/api/banks")
public class BanksController {

	public static final Logger logger = LoggerFactory.getLogger(BanksController.class);

	@Autowired
	BankService bankService;

	@RequestMapping(value = "/issueTransfer/", method = RequestMethod.POST)
	public ResponseEntity<Boolean> issueTransfer(@RequestBody String bankId, @RequestBody String accountNumber, @RequestBody double amount) {
		
		Boolean response = bankService.issueTransfer(bankId, accountNumber, amount);

		return new ResponseEntity<Boolean>(response, HttpStatus.OK);
	}

}