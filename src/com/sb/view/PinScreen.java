package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


/**
 * Pin Screen is the first screen of Starbucks Mobile Application. It is used to authenticate 
 * a Valid user by asking to first enter a Valid Password. Whenever a user starts Starbucks 
 * application, Pin Screen is displayed with a message “Please enter your passcode”. 
 * Once user enters valid passcode, he is granted access to other screens in the application.
 * To design a loosely coupled application, Pin Screen is modularized into two classes – 
 * KeyPad and PassCode. Pin Screen is responsible for calling KeyPad and PassCode draw 
 * functions whenever a mousePressed event is triggered from the AppController.

 * @author Manju Rajput
 *
 */

public class PinScreen implements ScreenState {

	AppController appController;
	KeyPad keypad;
	PassCode passcode;
	final String validPin = "1234";

	PImage img;
	PFont f;
	PFont f1;

	public PinScreen(AppController p) {
		appController = p;
	}

	public void setup(PApplet applet) {
		/**
		 * 
		 * This method is used to initialize and setup KeyPad and PassCode instances.
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */

		keypad = new KeyPad();
		keypad.draw(applet);

		passcode = new PassCode();
		passcode.draw(applet);

	}

	public void mousePressed(PApplet applet) {
		/** 
		 * This method is called whenever a mousePressed event is triggered from the AppController.
		 * Based on the x and y coordinates appropriate mousePressed method is invoked.  
		 * The mousePressed method in turns then calls KeyPad’s pressedNumber and its setCurrent 
		 * Screen methods
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */

		if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 240
				&& applet.mouseY < 280) {

			keypad.pressedNumber(1,1);
			setCurrentScreen();


		}

		else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 281
				&& applet.mouseY < 320) {
			keypad.pressedNumber(1,2);
			setCurrentScreen();
		}

		else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 321
				&& applet.mouseY < 360) {
			keypad.pressedNumber(1,3);
			setCurrentScreen();

		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 240 && applet.mouseY < 280) {
			keypad.pressedNumber(2,1);
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 281 && applet.mouseY < 320) {
			keypad.pressedNumber(2,2);
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 321 && applet.mouseY < 360) {
			keypad.pressedNumber(2,3);
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 361 && applet.mouseY < 400) {
			keypad.pressedNumber(2,4);
			setCurrentScreen();

		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 240 && applet.mouseY < 280) {
			keypad.pressedNumber(3,1);
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 281 && applet.mouseY < 320) {
			keypad.pressedNumber(3,2);
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 321 && applet.mouseY < 360) {
			keypad.pressedNumber(3,3);
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 361 && applet.mouseY < 400) {
			keypad.backspace();
			setCurrentScreen();
		}

	}

	@Override
	public void draw(PApplet applet) {
		/**
		 * @author Manju Rajput
		 * @return	none
		 */

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		/** 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */
	}

	public void setCurrentScreen(){
		/**
		 * 
		 * This method is used to change the current screen based on the entered password.
		 * 
		 * @author Manju Rajput
		 * @return none
		 * 
		 */
		System.out.println("pwd is" + keypad.getPassword());
		if (keypad.getPassword().length() < 4) {			
			appController.setCurrentScreen(appController.getPinScreen());
		}

		else if((keypad.getPassword()).equals(validPin)){

			//Chnaged by RENISH to change the flow
			appController.setCurrentScreen(appController.getMyCardsMain());
		}
	}
}