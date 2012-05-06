/**
 * 
 */
package com.sb.view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

import com.sb.common.Menu;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;


/**
 * This class implements ScreenState interface, draws MyRewards Screen 
 * and also handles mouse press events of the screen
 * @author RENISH
 * @param MainImage, MyCards, Payments, MyRewards, Stores, Settings Image for the Screen
 * @param mn Menu Object
 */


public class MyRewards implements ScreenState {

	AppController appController;
	PImage MainImage, MyCards, Payments, MyRewards, Stores, Settings;
	Menu mn;

	public MyRewards(AppController appController) {
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		/**
		 * @author Renish Shah
		 * @return None
		 * This method is responsible for base sketch setup the UI of My Rewards Screen.
		 * This method is called automatically by Processing and only once.
		 * 
		 */

		PFont f = applet.loadFont("Calibri-Bold-30.vlw");
		/* Creating the main boundary */
		applet.size(262, 400);
		applet.background(50);
		applet.line(2, 2, 260, 2);
		applet.line(2, 2, 2, 398);
		applet.line(2, 398, 260, 398);
		applet.line(260, 2, 260, 398);

		/* Creating the option heading and subheading */
		applet.fill(27, 131, 87);
		applet.rect(0, 0, 265, 47);
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("My Rewards", 85, 30);

		applet.line(2, 350, 260, 350); // horizontal line for common menu
		applet.line(52, 350, 52, 398); // verticle line for menu
		applet.line(104, 350, 104, 398);
		applet.line(159, 350, 159, 398);
		applet.line(208, 350, 208, 398);
		// above code is for the common menu at the bottom of the screen

		// Images must be in the "data" directory to load correctly
		MainImage = applet.loadImage("myRewardsScreen.png"); // Starbucks
		// Special
		// edition image
		applet.image(MainImage, 10, 57);

		mn = new Menu(appController);
		mn.draw(applet);

		applet.fill(27, 125, 80); // the color for rectangle
		// applet.rect(2, 2, 259, 45);// The top rectangle for displaying text :
		// card

		applet.fill(232, 225, 240);
		applet.rect(15, 260, 230, 35, 8, 8, 0, 0); // Draw rectangle for Refresh
		// balance
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Sign In", 20, 280);

		applet.fill(232, 225, 240);
		applet.rect(15, 295, 230, 35, 0, 0, 8, 8); // Draw rectangle for Recent
		// transactions
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Create Account", 20, 315);

	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * Based on the mouse coordinates pressed in the Footer Menu Item, 
		 * the appropriate Menu item will be executed
		 * 
		 */

		if(applet.mouseX > 3 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397){
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}
	}

	@Override
	public void draw(PApplet applet) {
		/**
		 * @author Renish Shah
		 * @Return None
		 */
		applet.strokeWeight(2);
		applet.stroke(86, 83, 90);
		drawArrow(115, 268, 120, 5, applet);
		drawArrow(115, 303, 120, 5, applet);

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		
		/**
		 * @author Renish Shah
		 * @return None
		 */
		applet.pushMatrix();
		applet.translate(cx, cy);
		applet.rotate(applet.radians(angle));
		applet.line(len, 0, len - 8, -8);
		applet.line(len, 0, len - 8, 8);
		applet.popMatrix();

	}

}
