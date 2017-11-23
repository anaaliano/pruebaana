package com.ana.prueba.dao.file;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ana.prueba.dao.BanksDAO;

public class BanksDAOFromFileTest {

	@Test
	public void testGetBanks() {
		BanksDAO bankDao = new BanksDAOFromFile();
		assertEquals(2, bankDao.getBanks().size());
	}

}
