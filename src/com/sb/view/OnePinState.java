package com.sb.view;
/**
 * It is used to implement State pattern in PinScreen. 
 * It represents the One Pin State of the PassCode.
 * @author Manju Rajput
 *
 */


public class OnePinState implements PassCodeState{
	
	KeyPad keypad;
	
	public OnePinState(KeyPad keypad){
		this.keypad = keypad;
	}
	
	@Override
	public void pressedNumber(String input) {
		/** This method calls KeyPad�s update password based on the input String and
		 *  then set the appropriate passcode state.
		 * @author Manju Rajput
		 * @return None
		 */

		keypad.updatePassword(input);
		keypad.setState(keypad.getTwoPinState());
		
	}

	@Override
	public void backspace() {
		/**
		 * 
		 * This method calls KeyPad�s update password based on the 
		 * input String and then set the appropriate passcode state. 
		 * 
		 * @author Manju Rajput
		 * @return None
		 * 
		 */

		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
	}
	
	@Override
	public String getState() {
		/**
		 * 
		 * This method is used to return the passcode state 
		 * 
		 * @author Manju Rajput
		 * @return None
		 * 
		 */

			return "OnePinState";
	}
}