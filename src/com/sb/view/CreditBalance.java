package com.sb.view;

public class CreditBalance {
	private static CreditBalance crdbal;
	private static float balance = 20.0f;
	
	public CreditBalance(){		
	}
	
	public static CreditBalance getInstance() {
		if(crdbal == null){
			crdbal = new CreditBalance();
		}
		return crdbal;
	}
	
	public static float getBalance() {
		return balance;
	}
	
	public static float setBalance() {
		return balance -= 3.60;
	}
}