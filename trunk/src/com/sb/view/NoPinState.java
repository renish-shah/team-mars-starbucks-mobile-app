package com.sb.view;

/*
 * Author:Manju Rajput Topic: NoPinState (State Pattern for Pin Screen)
 *
 */

public class NoPinState implements PassCodeState{
	
	KeyPad keypad;
	
	public NoPinState(KeyPad keypad){
		this.keypad = keypad;
	}
	
	@Override
	public void pressedNumber(String input){
		keypad.updatePassword(input);
		keypad.setState(keypad.getOnePinState());

	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
	}

	@Override
	public String getState() {
		return "NoPinState";
	}


}
