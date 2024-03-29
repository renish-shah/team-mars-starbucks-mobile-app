/**
 * 
 */
package com.sb.test;


import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import com.sb.view.AddCard;
import com.sb.view.FindStarbucks;
import com.sb.view.MyCardOptions;
import com.sb.view.MyCardsMain;
import com.sb.view.MyCardsMoreOptions;
import com.sb.view.MyCardsPay;
import com.sb.view.MyRewards;
import com.sb.view.Payment;
import com.sb.view.PinScreen;

/**
 * @author RENISH
 * 
 */
public class AppControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	AppController applet;

	@Test
	public void testMyRewardsMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new MyRewards(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(MyRewards.class, returnedScreenState.getClass());
	}

	@Test
	public void testMyCardOptionsMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new MyCardOptions(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(MyCardOptions.class, returnedScreenState.getClass());
	}

	@Test
	public void testMyCardsMainMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new MyCardsMain(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(MyCardsMain.class, returnedScreenState.getClass());
	}
	
	@Test
	public void testMyCardMoreOptionsMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new MyCardsMoreOptions(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(MyCardsMoreOptions.class, returnedScreenState.getClass());
	}

	@Test
	public void testMyCardsPayMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new MyCardsPay(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(MyCardsPay.class, returnedScreenState.getClass());
	}
	
	@Test
	public void testPinScreenMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new PinScreen(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(PinScreen.class, returnedScreenState.getClass());
	}
	
	@Test
	public void testAddCardMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new AddCard(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(AddCard.class, returnedScreenState.getClass());
	}
	@Test
	public void testFindStarbucksMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new FindStarbucks(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(FindStarbucks.class, returnedScreenState.getClass());
	}		
	@Test
	public void testPaymentMousePressed() {

		applet = new AppController();
		applet.setCurrentScreen(new Payment(applet));

		ScreenState returnedScreenState = applet.getCurrentScreen();
		Assert.assertEquals(Payment.class, returnedScreenState.getClass());
	}		

	/*
	 * @NonStrict AppController applet;
	 * 
	 * @Test public void test() { //fail("Not yet implemented"); AppController
	 * appController = new AppController();
	 * Assert.assertEquals(ScreenState.class, appController.getCurrentScreen());
	 * }
	 */
}
