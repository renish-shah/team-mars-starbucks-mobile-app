package com.sb.common;

public class CreditBalance {
	private static CreditBalance crdbal;
	private static double balance = 20.0;
	
	private CreditBalance(){		
	}
	
	public static CreditBalance getInstance() {
		if(crdbal == null){
			crdbal = new CreditBalance();
		}
		return crdbal;
	}
	
	public static double getBalance() {
		return balance;
	}
	
	public static double setBalance() {
		return balance -= 3.60;
	}
	
	//Added by RENISH to add new card balance
	public static double addNewCardbalance()
	{
		return balance = 20.0;
	}
}