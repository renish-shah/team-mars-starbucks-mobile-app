package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.view.CreditBalance;
import com.sb.view.MyCardsPay;

public class PayScreenTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSetBalance() {
		float expectedf = 16.4f;
		float actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.setBalance();
		assertEquals("Valid!",expectedf, actualf);
		fail("Not yet implemented");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalance() {
		float expectedf = 16.4f;
		float actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.getBalance();
		assertEquals("Valid!",expectedf, actualf);
		fail("Not yet implemented");
	}
}