package com.sb.view;

/**
 * Pin Screen comprises of KeyPad and PassCode screens.  
 * The PassCode depicts the four rectangular boxes in the Pin Screen. 
 * When a user presses a number accordingly a black round circle is drawn/deleted in 
 * the Passcode box or an error message is displayed or Pin is validated. There are many 
 * different scenarios for PassCode class that are done by PassCodeState and other classes.
 * 
 * @author Manju Rajput
 *
 */


import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;

public class PassCode implements ScreenState {

	PFont f2;
	KeyPad keypad;
	private int passcodeLength;
	final String validPin = "1234"; 

	public PassCode(){
		keypad = new KeyPad();
	}

	public void setup(PApplet applet) {

	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(PApplet applet) {
		/**
		 * 
		 * This method is used to draw PassCode on the screen using applet  
		 * 
		 * @author Manju Rajput
		 * @return None
		 * 
		 */

		f2 = applet.loadFont("Calibri-Bold-30.vlw");
		applet.fill(255);
		applet.textFont(f2, 17);
		applet.rect(35, 45, 40, 35);
		applet.rect(85, 45, 40, 35);
		applet.rect(135, 45, 40, 35);
		applet.rect(185, 45, 40, 35);

		System.out.println("password is" + keypad.getPassword());

		checkPin(applet);
		applet.textFont(f2, 80);
		passcodeLength = keypad.getPassword().length();


		switch(passcodeLength){
		case 1: applet.fill(0);
				applet.text(".", 43, 70);
				break;
		case 2: applet.fill(0);
				applet.text(".", 43, 70);
				applet.text(".", 93, 70);
				break;
		case 3: applet.fill(0);
				applet.text(".", 43, 70);
				applet.text(".", 93, 70);
				applet.text(".", 143, 70);
				break;
		case 4: applet.fill(0);
				applet.text(".", 43, 70);
				applet.text(".", 93, 70);
				applet.text(".", 143, 70);
				applet.text(".", 193, 70);
				System.out.println("in4");
				break;
		}
}

@Override
public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
	// TODO Auto-generated method stub

}

public String checkPin(PApplet applet){
	/**
	 * 
	 * It verifies the Pin once the length of entered password becomes 4
	 * 
	 * @author Manju Rajput
	 * @return None
	 * 
	 */

	if(keypad.getPassword().length() == 4 && !(keypad.getPassword()).equals(validPin)){
		System.out.println("Incorrect password");
		keypad.setState(keypad.getNoPinState());
		keypad.setPassword("");
		applet.fill(255,0,0);
		applet.textFont(f2, 17);
		applet.text("Incorrect Pin, enter again",45,95);		
	}
	return "Valid Pin";
}

}
