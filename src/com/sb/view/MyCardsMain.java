package com.sb.view;

import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;

import com.sb.common.CreditBalance;
import com.sb.common.Menu;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * My Cards Main is the first screen the user is presented with, after the pin to enter the app
 * is validated. It contains the Balance of the last card used. 
 * The user has option to make payment for item(s) purchased, or add Value to his balance or
 * go to other screens via the footer Menu Item
 * 
 * @author Sindhuja Sundarraman
 * 
 * @param f1, f2, f3,f4,f5,f6,f7			fonts for the screen
 * @param MainCard, MyHome, Payments, MyRewards, Stores, Settings 	 		For Images
 * @param mn			Menu Object
 * @param tch			Flip Screen Object
 *
 */

public class MyCardsMain implements ScreenState {
	

	public static int status = 0;

	AppController appController;

	public MyCardsMain(AppController p) {
		appController = p;
	}

	// Declarations
	PImage MainCard, MyHome, Payments, MyRewards, Stores, Settings;
	PFont f1, f2, f3, f4, f5, f6, f7;
	Menu mn;
	FlipScreen tch;
	private CreditBalance bal;

	@Override
	public void setup(PApplet applet) {
		
		/**
		 * @author Sindhuja Sundarraman
		 * This method is responsible for base sketch setup the UI of My Cards Main Screen.
		 * This method is called automatically by Processing and only once.
		 * 
		 * @return None
		 */
		
		// Setting the size of the screen
		applet.size(262, 400);

		// Setting the background color - middle screen
		applet.background(70, 10);

		// Drawing Green rectangular Header
		applet.fill(27, 131, 87); 
		applet.rect(0, 0, 265, 47);

		// Text for header - My Cards
		applet.fill(255);
		f4 = applet.loadFont("Calibri-Bold-8.vlw");
		applet.textFont(f4, 20);
		applet.text("My Cards", 80, 30);

		// Drawing the rectangle for smaller rectangle within Header - 'View
		// All'
		applet.fill(21, 67, 54); // Color Spec from Madhumita's code
		applet.rect(190, 10, 65, 25, 8, 8, 8, 8);

		// Text for button - View All
		applet.fill(255);
		f5 = applet.loadFont("Calibri-Bold-8.vlw");
		applet.textFont(f5, 12);
		applet.text("View All", 200, 28);

		// Loading the Starbucks Green card
		MainCard = applet.loadImage("StarbucksSpecialEditionCard.jpg");
		applet.image(MainCard, 25, 60, 210, 130);

		// Drawing the applet.rectangle to show the Balance
		applet.noStroke();
		applet.fill(90);
		applet.rect(40, 220, 170, 60, 8, 8, 8, 8);

		/*******************************************************************************/
		// Displaying Balance - Need to come in from Calculation!!!

		Calendar cal = new GregorianCalendar();
		String am_pm;
		
		int hour = cal.get(Calendar.HOUR);
		if(cal.get(Calendar.AM_PM) == 0){
			am_pm = "AM";
		}
		else {
			am_pm = "PM";
		}
		
		bal = CreditBalance.getInstance();
		
		applet.fill(255);
		f6 = applet.loadFont("Calibri-8.vlw");
		applet.textFont(f6, 36);
		//applet.text("$16.50", 70, 250);
		applet.text(""+bal.getBalance(), 70, 250);

		f7 = applet.loadFont("Calibri-8.vlw");
		applet.textFont(f7, 16);
		//applet.text("as of TODAY at 9:00pm", 45, 270);
		applet.text("as of TODAY at " + hour + am_pm, 60, 270);

		/*******************************************************************************/

		// Drawing the footer
		applet.noStroke();
		applet.line(0, 350, 300, 350);
		applet.fill(50);
		applet.rect(0, 350, 262, 50);
		
		mn = new Menu(appController);
		mn.draw(applet);
		
		// 5. Settings
		applet.fill(80);
		applet.rect(212, 352, 50, 45);
		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(255);
		applet.text("Settings", 220, 395); // applet.text for Settings
	}

	/*******************************/
	// Initializing
	int value = 200;

	@Override
	public void mousePressed(PApplet applet) {
		
		/**
		 * @author Sindhuja Sundarraman
		 * 
		 * Called once after every time a mouse button is pressed.
		 * Here it is used to determine if Footer Menu Item or 
		 * Balance or 'Touch To Pay' has been pressed
		 * 
		 * @return None
		 */
		
		if(applet.mouseX > 3 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397){
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}
		else if(applet.mouseX > 40 && applet.mouseX < 210
				&& applet.mouseY > 220 && applet.mouseY < 280){
			appController.setCurrentScreen(appController.getMyCardOptions());
		}
		else if(applet.mouseX > (220 - 50) && applet.mouseX < (220 + 50)
				&& applet.mouseY > (180 - 50) && applet.mouseY < (180 + 50)){
			appController.setCurrentScreen(appController.getMyCardsPay());
		}
	}

	@Override
	public void draw(PApplet applet) {		
		
		/**
		 * @author Sindhuja Sundarraman
		 * @return None
		 *  
		 * Initiate Flipscreen object
		 */
		
		tch = new FlipScreen(appController);
		tch.draw(applet);
		
	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub
	}
}