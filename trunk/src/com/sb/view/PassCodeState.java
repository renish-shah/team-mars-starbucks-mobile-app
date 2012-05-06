package com.sb.view;

/**
 * It is used to implement State pattern in PinScreen. 
 * It maintains the different states of the PassCode. 
 * Different possible states are – NoPinState, OnePinState, TwoPinState, ThreePinState, 
 * FourPinState.
 * 
 * @author Manju Rajput
 *
 */


public interface PassCodeState {
	/**
	 * This method is used to pass a number pressed to appropriate state
	 * 
	 * @author Manju Rajput
	 * @param input
	 * @return None
	 * 
	 */
	public void pressedNumber(String input);
	
	/**
	 * This method is used to pass backspace pressed to appropriate state
	 * @author Manju Rajput
	 * @return None
	 */
	public void backspace();
	
	/**
	 * This method is used to retrieve the current passcode state
	 * @author Manju Rajput
	 * @Return None
	 * @return
	 */
	public String getState();
}
