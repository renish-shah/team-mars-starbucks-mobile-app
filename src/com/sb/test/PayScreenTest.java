package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.common.CreditBalance;
import com.sb.view.MyCardsPay;

public class PayScreenTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSetBalance() {
		float expectedf = 16.4f;
		double actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.setBalance();
		assertEquals("Valid!",expectedf, actualf);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalance() {
		float expectedf = 20.00f;
		double actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.getBalance();
		assertEquals("Valid!",expectedf, actualf);
		
	}
}