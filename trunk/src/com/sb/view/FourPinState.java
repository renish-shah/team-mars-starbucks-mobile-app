package com.sb.view;
/*
 * Author:Manju Rajput Topic: FourPinState (State Pattern for Pin Screen)
 *
 */

public class FourPinState implements PassCodeState{

	KeyPad keypad;

	public FourPinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {

	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getThreePinState());
	}

	@Override
	public String getState() {
		return "FourPinState";
	}
}