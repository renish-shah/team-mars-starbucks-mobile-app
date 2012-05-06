package com.sb.view;

/**
 * Pin Screen comprises of KeyPad and PassCode screens. The KeyPad screen represents the 
 * numbers (0-9)  and backspace displayed as key pad on the screen.
 * When a user presses a number on the screen, the mousePressed event is triggered 
 * to capture the number which is pressed.
 * 
 * @author:Manju Rajput
 * @param  img Image Type
 * @param f, f1 Font types
 * @param input	stores the inputted digit
 *
 */


import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class KeyPad implements ScreenState{

	PImage img;
	PFont f;
	PFont f1;
	private String input;
	PassCodeState state;
	static String password = ""; 

	final private String[][] keyPadNumber = {
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"},
			{null, "0"} };

	PassCodeState NoPinState;
	PassCodeState OnePinState;
	PassCodeState TwoPinState;
	PassCodeState ThreePinState;
	PassCodeState FourPinState;		


	public KeyPad() {
		NoPinState = new NoPinState(this);
		OnePinState = new OnePinState(this);
		TwoPinState = new TwoPinState(this);
		ThreePinState = new ThreePinState(this);
		FourPinState = new FourPinState(this);
		state = NoPinState;	
	}

	public void setup(PApplet applet) {

	}


	@Override
	public void mousePressed(PApplet applet) {		

	}


	@Override
	public void draw(PApplet applet) {
		/**
		 * 
		 * This method is used to draw KeyPad on the screen using applet.
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */
		/* Creating the main boundary */
		applet.size(262, 400);
		applet.background(50);

		img = applet.loadImage("/Logo.jpg");
		applet.image(img, 40, 78);

		applet.fill(0);
		applet.line(88, 240, 88, 399);
		applet.line(174, 240, 174, 399);
		applet.line(0, 240, 300, 240);
		applet.line(0, 280, 300, 280);
		applet.line(0, 320, 300, 320);
		applet.line(0, 360, 300, 360);

		f = applet.loadFont("Calibri-30.vlw");

		f1 = applet.loadFont("Calibri-Bold-30.vlw");

		applet.textFont(f1, 17);
		applet.fill(255);
		applet.text("Please enter your passcode", 33, 40);

		applet.fill(255);
		applet.textFont(f1, 20);
		applet.text("1", 30, 265);
		applet.text("2", 130, 265);
		applet.text("3", 210, 265);
		applet.text("4", 30, 305);
		applet.text("5", 130, 305);
		applet.text("6", 210, 305);
		applet.text("7", 30, 345);
		applet.text("8", 130, 345);
		applet.text("9", 210, 345);
		applet.text("0", 130, 385);

		applet.textFont(f1, 13);
		applet.text("A B C", 123, 275);
		applet.text("D E F", 205, 275);
		applet.text("G H I", 25, 315);
		applet.text("J K L", 123, 315);
		applet.text("M N O", 200, 315);
		applet.text("P Q R S", 18, 355);
		applet.text("T U V", 123, 355);
		applet.text("W X Y Z", 198, 355);

		applet.rect(210, 370, 20, 14);
		applet.triangle(200, 377, 210, 370, 210, 384);
		applet.stroke(255);
		applet.line(210, 371, 210, 383);

		applet.fill(0);
		applet.text("X", 215, 382);

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}

	public String getPassword(){
		/**
		 * 
		 * This method is used to retrieve the entered password 
		 * 
		 * @author Manju Rajput
		 * @return password returns the entered password as String
		 * 
		 */

		return password;
	}

	public void setPassword(String password){

		/**
		 * 
		 * This method is used to set the Password in the KeyPad class
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */

		KeyPad.password = password;
	} 


	public String getState(){
		/**
		 * 
		 * This method is used to return the state.
		 * 
		 * @author Manju Rajput
		 * @return pin state as String
		 * 
		 */

		return state.getState();
	}

	public void setState(PassCodeState state){
		/**
		 * 
		 * This method is used to set the PassCode state.
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */

		this.state=state;
	}



	public PassCodeState getNoPinState(){
		/**
		 * 
		 * This method is used to return the NoPinstate
		 * 
		 * @author Manju Rajput
		 * @return NoPinState PasscodeState
		 * 
		 */
		return NoPinState;
	}

	public PassCodeState getOnePinState(){
		/**
		 * 
		 * This method is used to return the OnePinstate
		 * 
		 * @author Manju Rajput
		 * @return OnePinState PasscodeState
		 * 
		 */
		return OnePinState;
	}

	public PassCodeState getTwoPinState(){
		/**
		 * 
		 * This method is used to return the TwoPinstate.
		 * 
		 * @author Manju Rajput
		 * @return twoPinState	 PasscodeState
		 * 
		 */
		return TwoPinState;
	}

	public PassCodeState getThreePinState(){
		/**
		 * 
		 * This method is used to return the ThreePinstate
		 * 
		 * @author Manju Rajput
		 * @return ThreePinState	PasscodeState
		 * 
		 */
		return ThreePinState;
	}

	public PassCodeState getFourPinState(){
		/**
		 * 
		 * This method is used to return the FourPinState
		 * 
		 * @author Manju Rajput
		 * @return FourPinState	 PasscodeState
		 * 
		 */
		return FourPinState;
	}


	public String pressedNumber(int x, int y){
		/**
		 * 
		 * This method is used to return presses key pad number
		 * 
		 * @author Manju Rajput
		 * @return keyPadNumber String
		 * 
		 */
		state.pressedNumber(keyPadNumber[y-1][x-1]);
		return keyPadNumber[y-1][x-1];
	}


	public String backspace(){
		/**
		 * 
		 * This method is used to return String for backspace when pressed
		 * 
		 * @author Manju Rajput
		 * @return backspace String
		 * 
		 */	

		state.backspace();
		return "bk";
	}

	public void updatePassword(String num){
		/**
		 * 
		 * This method is used to update the password with the passed string.
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */
		if(num == "" && password.length()>0)
			password=password.substring(0,password.length()-1);
		else 
			password += num;			
	}


}
