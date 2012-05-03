package com.sb.view;

/*
 * Author:Manju Rajput Topic: ThreePinState (State Pattern for Pin Screen)
 *
 */


public class ThreePinState implements PassCodeState{

	KeyPad keypad;

	public ThreePinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getFourPinState());
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getTwoPinState());
	}

	@Override
	public String getState() {
		return "ThreePinState";
	}
}