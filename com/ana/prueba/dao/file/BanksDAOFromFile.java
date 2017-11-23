package com.ana.prueba.dao.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ana.prueba.dao.BanksDAO;
import com.ana.prueba.model.Bank;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BanksDAOFromFile implements BanksDAO{

	private final String BANKS_DIR = "banks";

	public List<Bank> getBanks() {

		List<Bank> banks = new ArrayList<Bank>();
		ObjectMapper mapper = new ObjectMapper();

		try {
			File dir = new File(getClass().getClassLoader().getResource(BANKS_DIR).getFile());

			if (dir.exists() && dir.isDirectory()) {
				for (File file : dir.listFiles()) {
					banks.add(mapper.readValue(file, Bank.class));
				}
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return banks;

	}

}
