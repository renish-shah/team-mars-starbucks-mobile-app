package com.sb.view;

import java.util.Random;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * This class is to switch between main screen and pay screen. 
 * 
 * @author Anupama Patil
 * @author Renish Shah
 * @author Sachin Pisal
 * 
 * @param appcontroller		AppController Object
 * @param f, f3				fonts for the screen
 * @param b		 	 		For Images
 * @param balance			CreditBalance Object
 * @param count 			no of times the barcode is scanned.
 */

public class FlipScreen implements ScreenState {

	AppController appController;
	//static boolean flipScreenOn=false;
	PFont f, f3;
	
	public FlipScreen(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
		/**
		 * This method is responsible for base sketch setup the UI Screen.
		 * Has no implementation here.
		 * 
		 * @author Anupama Patil
		 * 
		 * @return None
		 */		
	}
	public void draw(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return none
		 * 
		 * Called by Processing for every frame of the  Screen.
		 */
		
		String[] arr = appController.getCurrentScreen().toString().split("@");
		String currentScreen = arr[0];
		if(currentScreen.compareTo("com.sb.view.MyCardsMain") == 0){
			//flipScreenOn=false;
			// Drawing the circle for Touch To Pay
			applet.noStroke();
			applet.fill(200);
			applet.ellipse(220, 180, 50, 50);

			// "Touch to pay" button
			applet.fill(0);
			applet.stroke(0);
			applet.strokeWeight(3); // Thickness of the lines
			applet.line(213, 160, 218, 160);
			applet.line(208, 165, 218, 165);
			applet.line(205, 170, 218, 170); // 3 lines before the $ symbol

			f = applet.loadFont("Calibri-Bold-8.vlw"); // for the '$' symbol
			applet.textFont(f, 18);
			applet.text("$", 220, 171);

			f = applet.loadFont("Calibri-8.vlw"); // for "Touch to Pay" text
			applet.textFont(f, 12);
			applet.text("Touch", 205, 185);
			applet.text("to Pay", 205, 197);
		}
		else{
			f = applet.loadFont("Calibri-30.vlw");
			applet.textFont(f, 11);
			
			applet.fill(162);
			applet.ellipse(224,180,50,50);
			applet.fill(0);
			applet.textFont(f,11);
			applet.text("Touch",210,175);
			applet.text("When",210,185);
			applet.text("Done",210,195);
			//above code for the circle with text "Touch when done"
		}
	}

	public void mousePressed(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return None
		 * 
		 * Called once after every time a mouse button is pressed.
		 */

		if(applet.mouseX > (224 - 50) && applet.mouseX < (224 + 50)
				&& applet.mouseY > (180 - 50) && applet.mouseY < (180 + 50)){
			appController.setCurrentScreen(appController.getMyCardsMain());
			
		}
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}