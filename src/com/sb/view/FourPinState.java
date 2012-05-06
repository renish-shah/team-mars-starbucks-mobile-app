package com.sb.view;
/**
 * It is used to implement State pattern in PinScreen. 
 * It represents the Four Pin State of the PassCode.
 * @author Manju Rajput
 * @param keypad stores Keypad Object
 */


public class FourPinState implements PassCodeState{

	KeyPad keypad;

	public FourPinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {
		/**
		 * As the maximum passcode length is 4, the method is not called
		 * once the state becomes FourPinState. Therefore no implementation code 
		 * is written.
		 * @author Manju Rajput
		 * @return None
		 */
	}

	@Override
	public void backspace() {
		/**
		 * 
		 * This method calls KeyPad’s update password based on the 
		 * input String and then set the appropriate passcode state. 
		 * 
		 * @author Manju Rajput
		 * @return None
		 * 
		 */

		keypad.updatePassword("");
		keypad.setState(keypad.getThreePinState());
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

		return "FourPinState";
	}
}