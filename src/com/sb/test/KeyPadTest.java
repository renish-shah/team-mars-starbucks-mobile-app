package com.sb.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sb.view.KeyPad;

/**
 * @author Manju Rajput
 * Topic: To test the KeyPad class
 */

public class KeyPadTest {

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

	// To verify key press of key 1 
	@Test
	public void testKeyPad1() {
		KeyPad testKeyPad = new KeyPad();
		assertEquals("1", testKeyPad.pressedNumber(1, 1));
	}

	// To verify key press of key 0
	@Test
	public void testKeyPad2()
	{
		KeyPad testKeyPad = new KeyPad();
		assertEquals("0", testKeyPad.pressedNumber(2, 4));
	}

	// To verify key press of backspace
	@Test
	public void testKeyPad3()
	{
		KeyPad testKeyPad = new KeyPad();
		assertEquals("bk", testKeyPad.backspace());
	}

	// To verify key press of key at location(1,4) which is null 
	@Test
	public void testKeyPad4()
	{
		KeyPad testKeyPad = new KeyPad();
		assertEquals(null, testKeyPad.pressedNumber(1,4));
	}


}
