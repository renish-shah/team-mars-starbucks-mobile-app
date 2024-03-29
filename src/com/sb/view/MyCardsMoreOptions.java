package com.sb.view;

import com.sb.common.CreditBalance;
import com.sb.common.Menu;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * This class is used to provide  more options for starbucks app user. 
 * This will enable user to refresh balance, reload card, view recent transactions.
 * The reload card will enable to add balance using add card and refresh balance gives 
 * the current balance in the account
 * 
 * @author Manasa Nagaraju
 * @param f		font for the screen
 * @param MainImage, MyCards, Payments, MyRewards, Stores, Settings 	 		For Images
 * @param mn			Menu Object
 */


public class MyCardsMoreOptions implements ScreenState {

	/**
	 * Starbucks-MyCards MoreOptions Author-Manasa Sollepura Nagaraju 
	 * CMPE-202-Spring2012
	 * 
	 * Modified by: RENIS SHAH
	 */

	AppController appController;

	public MyCardsMoreOptions(AppController p) {
		appController=p;
	}

	// Declaring Image and Font variables
	PImage MainImage, MyCards, Payments, MyRewards, Stores, Settings;
	PFont f;
	Menu mn;

	public void setup(PApplet applet) {
		/**
		 * 
		 * This method sets up the MyCardsMoreOptions screen by  making use of  few applet properties.
		 * 
		 * @author: Manasa Nagaraju
		 * @return None
		 */

		applet.size(262, 400); // size of the frame
		applet.background(50); // screen bg color
		applet.line(2, 2, 260, 2);// boundary line horizontal
		applet.line(2, 2, 2, 398);// boundary line vertical
		applet.line(2, 398, 260, 398);// boundary line horizontal
		applet.line(260, 2, 260, 398);// boundary line vertical
		// above code is for setting the output screen size
		// and creating a boundary rectangle

		applet.line(2, 350, 260, 350); // horizontal line for common menu
		applet.line(52, 350, 52, 398); // verticle line for menu
		applet.line(104, 350, 104, 398);
		applet.line(159, 350, 159, 398);
		applet.line(208, 350, 208, 398);
		// above code is for the common menu at the bottom of the screen

		f = applet.loadFont("Calibri-Bold-48.vlw"); // Loading font for the Screen
		// Images must be in the "data" directory to load correctly
		MainImage = applet.loadImage("StarbucksSpecialEdition.png"); // Starbucks
		// Special edition image
		applet.image(MainImage, 15, 57);

		mn = new Menu(appController);
		mn.draw(applet);

		applet.fill(27, 125, 80); // the color for rectangle
		applet.rect(2, 2, 259, 45);// The top rectangle for displaying text :More Card Options
									
		applet.fill(255); // the font color-white
		applet.textFont(f, 20); // the font size
		applet.text("Card Options", 75, 30); // text("",x,y)

		applet.fill(7, 85, 57); // the color for rectangle
		applet.rect(7, 7, 45, 35, 8, 8, 8, 8);// The top rectangle for  displaying text:  card options
	
		applet.fill(255); // the font color-white
		applet.textFont(f, 14); // the font size
		applet.text("Cancel", 11, 29);

		
		//Modified by RENISH
		applet.fill(255); // the font color-white
		applet.textFont(f, 20); // the font size
		applet.text("$"+CreditBalance.getInstance().getBalance(), 168, 100);
		applet.textFont(f, 10);
		applet.text("as of TODAY at 8.30pm", 150, 120);

		applet.fill(232, 225, 240);
		applet.rect(15, 160, 230, 35, 8, 8, 0, 0); // Draw rectangle for Refresh
		// balance
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Refresh Balance", 20, 184);

		applet.fill(232, 225, 240);
		applet.rect(15, 195, 230, 35);// Draw rectangle for Reload Card
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Reload Card", 20, 217);

		applet.fill(232, 225, 240);
		applet.rect(15, 230, 230, 35); // Draw rectangle for Auto-Reload
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Auto-Reload", 20, 250);

		applet.fill(232, 225, 240);
		applet.rect(15, 265, 230, 35, 0, 0, 8, 8); // Draw rectangle for Recent transactions
		applet.fill(50);
		applet.textFont(f, 15); // the font size
		applet.text("Recent Transactions", 20, 285);
	}// End of Setup()

	// Methods to draw arrows
	public void draw(PApplet applet) {
		/**
		 * This method calls the drawarrow()
		 * @author: Manasa Nagaraju 
		 * @return None
		 */

		applet.strokeWeight(2);
		applet.stroke(86, 83, 90);
		drawArrow(115, 203, 120, 5, applet);
		drawArrow(115, 238, 120, 5, applet);
		drawArrow(115, 273, 120, 5, applet);
	}

	@SuppressWarnings("static-access")
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		/**
		 *  This method is called to draw the arrows on Reload-card,Auto reload,view 
		 *  recent transactions
		 *  
		 *  @author Manasa Nagaraju
		 *  @return None
		 */

		applet.pushMatrix();
		applet.translate(cx, cy);
		applet.rotate(applet.radians(angle));
		applet.line(len, 0, len - 8, -8);
		applet.line(len, 0, len - 8, 8);
		applet.popMatrix();
	}

	@Override
	public void mousePressed(PApplet applet) {
		/**
		 * This method is called whenever a mousePressed event is triggered from the AppController. 
		 * Based on the x and y coordinates appropriate mousePressed method is invoked and either menu 
		 * or main screen or add screen is set as current screen 
		 * @author: Manasa Nagaraju
		 * @return None
		 */
	
		if(applet.mouseX > 3 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397){
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}
		// A click on Cancel takes  to main screen
		else if(applet.mouseX > 7 && applet.mouseX < 52
				&& applet.mouseY > 7 && applet.mouseY < 42){
			appController.setCurrentScreen(appController.getMyCardsMain());
		}
		// A click on Refresh balance takes to main screen 
		else if(applet.mouseX > 15 && applet.mouseX < 245
				&& applet.mouseY > 160 && applet.mouseY < 195){
			appController.setCurrentScreen(appController.getMyCardsMain());
		}
		// A click on Re-load  balance takes to Add card screen
		else if(applet.mouseX > 15 && applet.mouseX < 245
				&& applet.mouseY > 195 && applet.mouseY < 230){
			appController.setCurrentScreen(appController.getAddCard());
	}
}
}