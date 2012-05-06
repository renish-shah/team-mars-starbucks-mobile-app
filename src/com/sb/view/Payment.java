package com.sb.view;

import com.sb.common.Menu;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * This class is to display the payment setting screen that is displayed 
 * on clicking “payment menu”. This class is just to mock this Screen.
 * 
 * @author Anupama Patil
 * @author Sachin Pisal
 * 
 * @param appController 	Object of AppController class for communication
 * @param f, f3				fonts for the screen
 * @param b, MainCard, MyHome, Payments, MyRewards, Stores, Settings, TiltedArrow, Search  	For Images
 * 
 *
 */

public class Payment implements ScreenState {
	
	/**
	 *@author Anupama Patil
	 *
	 *Initiates App Controller association
	 * 
	 */

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings,
			TiltedArrow, Search;
	Menu mn;

	public Payment(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
		/**
		 * This method is responsible for base sketch setup the UI Screen of the Payment Screen.
		 * This method is called automatically by Processing and only once.
		 * 
		 * @author Anupama Patil
		 * 
		 * @return None
		 */

		applet.size(262, 400);
		applet.background(50);

		f = applet.loadFont("Calibri-30.vlw");
		applet.textFont(f, 11);

		applet.line(2, 2, 260, 2);// boundary line horizontal
		applet.line(2, 2, 2, 398);// boundary line vertical
		applet.line(2, 398, 260, 398);// boundary line horizontal
		applet.line(260, 2, 260, 398);// boundary line vertical
		// above code is for setting the output screen size
		// and creating a boundary rectangle

		// Following code is specific to my Screen
		// -------------------------------------------------------------

		applet.fill(27, 131, 87);
		applet.rect(2, 2, 259, 45);// The top rectangle for :Screen Pay
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("Payments", 100, 30);// Text in Top rectangle for : Screen pay
		// -------------------------------------------------------------

		// Images must be in the "data" directory to load correctly
		b = applet.loadImage("Payment.png");
		applet.image(b, 2, 57);

		// For Menu
		// Dividing Footer into 5 parts and loading associated images
		// Drawing the footer
		applet.noStroke();
		applet.line(0, 350, 300, 350);
		applet.fill(50);
		applet.rect(0, 350, 262, 50);

		f3 = applet.loadFont("Calibri-Bold-8.vlw"); // for Text below images in footer
		applet.textFont(f3, 10);

		mn = new Menu(appController);
		mn.draw(applet);

		applet.fill(255);
		applet.text("Settings", 220, 395); // Text for Settings

	}
	
	public void draw(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return none
		 * 
		 * Called by Processing for every frame of Payment Screen.
		 */

	}

	public void mousePressed(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return None
		 * 
		 * Called once after every time a mouse button is pressed.
		 * Here it is used to determine which Footer Menu Item has been pressed
		 */

		// Test if the cursor is over the Circle (Touch When Done)
		if (applet.mouseX > 3 && applet.mouseX < 210 && applet.mouseY > 352
				&& applet.mouseY < 397) {
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub
	}
}