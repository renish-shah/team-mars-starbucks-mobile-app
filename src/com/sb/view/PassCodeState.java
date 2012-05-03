package com.sb.view;

/*
 * Author:Manju Rajput Topic: PassCodeState
 *
 */

public interface PassCodeState {
	public void pressedNumber(String input);
	public void backspace();
	public String getState();
}
