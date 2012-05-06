package com.sb.common;

/**
 * Common class to hold credit information.  As of now only the Total amount is maintained.
 * 
 * @author Anupama Patil
 * @author Renish Shah
 * @author Sachin Pisal
 * 
 */
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
		/**
		 * Returns the current Balance Value
		 * @author Anupama Patil
		 * @return Balance
		 * 
		 */
		return balance;
	}

	public static float setBalance() {
		/**
		 * Reduces the Balance of the Card by $3.60
		 * @author Anupama Patil
		 * @return balance
		 */
		return balance -= 3.15;
	}

	public static float addNewCardbalance()	{
		/**
		 * Adding a new card with Balance = $20
		 * @author Renish Shah
		 * @return Balance
		 */
		return balance = 20;
	}
}