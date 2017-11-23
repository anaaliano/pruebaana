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

import com.ana.prueba.model.Transfer;
import com.ana.prueba.model.util.TransferResult;
import com.ana.prueba.services.TransferAgentService;

@RestController
@RequestMapping("/api")
public class TransferAgentController {

	public static final Logger logger = LoggerFactory.getLogger(TransferAgentController.class);

	@Autowired
	TransferAgentService transferAgentService;

	@RequestMapping(value = "/transferAgent/receiveTransfer/", method = RequestMethod.POST)
	public ResponseEntity<TransferResult> receiveTransfer(@RequestBody Transfer transferInput) {
		TransferResult transfer = transferAgentService.receiveTransfer(transferInput);

		return new ResponseEntity<TransferResult>(transfer, HttpStatus.OK);
	}

}