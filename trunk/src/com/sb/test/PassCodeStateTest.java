package com.sb.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sb.controller.AppController;
import com.sb.view.FourPinState;
import com.sb.view.KeyPad;
import com.sb.view.NoPinState;
import com.sb.view.OnePinState;
import com.sb.view.PassCode;
import com.sb.view.PassCodeState;
import com.sb.view.ThreePinState;
import com.sb.view.TwoPinState;

/**
 * @author Manju Rajput
 * Topic : To test different Transition of pin states
 *
 */
public class PassCodeStateTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AppController app = new AppController();
		System.out.println(app.getCurrentScreen());
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

	// To verify Passcode State if user presses backspace button in NoPinState
	@Test
	public void testStateTransition1() {
		KeyPad keypad = new KeyPad();				
		assertEquals("NoPinState",keypad.getState());
		keypad.backspace();	
		assertEquals("NoPinState",keypad.getState());
		assertEquals("",keypad.getPassword());
	}

	// To verify Passcode State if user presses 1, 2 
	@Test
	public void testStateTransition2() {
		KeyPad keypad = new KeyPad();				
		assertEquals("NoPinState",keypad.getState());
		keypad.pressedNumber(1, 1);	
		assertEquals("OnePinState",keypad.getState());
		keypad.pressedNumber(2, 1);	
		assertEquals("TwoPinState",keypad.getState());	
		assertEquals("12",keypad.getPassword());
	}

	// To verify Passcode State if user presses 1, 2, 3
	// and backspace 
	@Test
	public void testStateTransition3() {
		KeyPad keypad = new KeyPad();				
		assertEquals("NoPinState",keypad.getState());
		keypad.pressedNumber(1, 1);	
		assertEquals("OnePinState",keypad.getState());
		keypad.pressedNumber(1, 2);	
		assertEquals("TwoPinState",keypad.getState());	
		keypad.pressedNumber(1, 3);	
		assertEquals("ThreePinState",keypad.getState());
		keypad.backspace();
		assertEquals("TwoPinState",keypad.getState());
	}


	// To verify Passcode State if user presses 1,2,3,4 in 
	// sequence (correct password) 
	@Test
	public void testStateTransition4() {
		KeyPad keypad = new KeyPad();	
		assertEquals("NoPinState",keypad.getState());
		keypad.pressedNumber(1, 1);	
		assertEquals("OnePinState",keypad.getState());
		keypad.pressedNumber(2, 1);	
		assertEquals("TwoPinState",keypad.getState());	
		keypad.pressedNumber(3, 1);	
		assertEquals("ThreePinState",keypad.getState());
		keypad.pressedNumber(2, 1);	
		assertEquals("FourPinState",keypad.getState());	
	}
}
