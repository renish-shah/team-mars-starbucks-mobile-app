package com.sb.view;
/*
 * Author:Manju Rajput Topic: OnePinState (State Pattern for Pin Screen)
 *
 */

public class OnePinState implements PassCodeState{
	
	KeyPad keypad;
	
	public OnePinState(KeyPad keypad){
		this.keypad = keypad;
	}
	
	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getTwoPinState());
		
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
	}
	
	@Override
	public String getState() {
			return "OnePinState";
	}




}
