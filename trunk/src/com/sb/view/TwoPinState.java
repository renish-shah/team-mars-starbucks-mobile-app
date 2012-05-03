package com.sb.view;

/*
 * Author:Manju Rajput Topic: TwoPinState (State Pattern for Pin Screen)
 *
 */


public class TwoPinState implements PassCodeState{

	KeyPad keypad;

	public TwoPinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getThreePinState());
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getOnePinState());
	}

	@Override
	public String getState() {
		return "TwoPinState";
	}
}