package com.sb.common;

public class CreditBalance {
	private static CreditBalance crdbal;
	private static float balance = 20.00f;
	
	private CreditBalance(){		
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
		return balance -= 3.6;
	}
	
	//Added by RENISH to add new card balance
	public static float addNewCardbalance()
	{
		return balance = 20;
	}
}