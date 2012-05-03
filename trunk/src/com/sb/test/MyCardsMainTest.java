package com.sb.test;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import mockit.NonStrict;
import mockit.NonStrictExpectations;

import org.junit.Test;

import com.sb.common.CreditBalance;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import com.sb.view.MyCardsMain;

public class MyCardsMainTest {

	@NonStrict AppController applet;
    @Test
    public void testMousePressed() {
    	new NonStrictExpectations() {
            {
                applet.getCurrentScreen(); 
                returns(new MyCardsMain(applet));
            }
        };
        ScreenState returnedScreenState = applet.getCurrentScreen();
        Assert.assertEquals(MyCardsMain.class, returnedScreenState.getClass());
	}
    
    @Test
    public void testCreditBalanceDisplay() {
    	double initialBalance = 20.0f;
    	double actualBalance;
		CreditBalance bal = CreditBalance.getInstance();
		actualBalance = CreditBalance.addNewCardbalance();
		assertEquals(initialBalance, actualBalance, 1f);
    }
}