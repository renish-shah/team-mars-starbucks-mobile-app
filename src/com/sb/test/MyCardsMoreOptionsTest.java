package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.common.CreditBalance;

public class MyCardsMoreOptionsTest {

	@Test
	public void testGetBalance() {
		float expectedf = 16.4f;
		double actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.getBalance();
		assertEquals("Valid!",expectedf, actualf);
		//fail("Not yet implemented");
		fail("Not yet implemented");
	}

}