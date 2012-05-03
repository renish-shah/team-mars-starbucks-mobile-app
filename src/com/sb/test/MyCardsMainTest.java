package com.sb.test;

import junit.framework.Assert;
import mockit.NonStrict;
import mockit.NonStrictExpectations;

import org.junit.Test;

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
}