package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.common.CreditBalance;
import com.sb.view.AddCard;
import com.sb.view.MyCardsPay;
import junit.framework.Assert;
import mockit.NonStrict;
import mockit.NonStrictExpectations;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import com.sb.view.MyCardsPay;
/**
  * @author Anupama Patil
 *
 */
public class PayScreenTest {
	
	@NonStrict AppController applet;
    @SuppressWarnings("deprecation")
	@Test
	public void testSetBalance() {
		double expectedf = 16.40f;
		double actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.setBalance();
		Assert.assertEquals("Valid!",expectedf, actualf);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalance() {
		double expectedf = 20.00f;
		double actualf; 
		CreditBalance bal = CreditBalance.getInstance();
		actualf = bal.getBalance();
		Assert.assertEquals("Valid!",expectedf, actualf);
		
	}

      public void MyCardspayTest()
      {
          new NonStrictExpectations() {
            {
                applet.getCurrentScreen(); returns( new MyCardsPay(applet));
            }
        };
        ScreenState returnedScreenState =  applet.getCurrentScreen();
        Assert.assertEquals(MyCardsPay.class,returnedScreenState.getClass() );
    
      }

}//end of class