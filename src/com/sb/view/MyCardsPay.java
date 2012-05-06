package com.sb.view;

import com.sb.common.CreditBalance;
import com.sb.common.Menu;
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * This class is to display “ Pay on Go” Screen. This class displays the pay screen,
 * but the barcode and touch when done components of the screen are divided into two 
 * different classes. It also gets the Menu display from Menu Class.
 * 
 * @author Anupama Patil
 * @author Renish Shah
 * 
 * @param appController	AppController Object
 * @param f				fonts for the screen
 * @param b 	 		For Images
 * @param mn			Menu Object
 * @param bcd			Barcode Object
 * @param tch			Flip Screen Object
 *
 */


public class MyCardsPay implements ScreenState {

	/**
	 *@author Anupama Patil
	 *
	 *Initiates App Controller association
	 * 
	 */

	AppController appController;

	PFont f;
	PImage b;
	Menu mn;
	BarCode bcd;
	FlipScreen tch;

	public MyCardsPay(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
		/**
		 * This method is responsible for base sketch setup the UI Screen of the My Cards Pay Screen.
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

		applet.line(2, 350, 260, 350); // horizontal applet.line for common menu
		applet.line(52, 350, 52, 398);// verticle applet.line for menu
		applet.line(104, 350, 104, 398);
		applet.line(159, 350, 159, 398);
		applet.line(208, 350, 208, 398);
		// above code if for the common menu at the bottom of the screen

		// Above code is to display the menus at the bottom of the screen
		// Following code is specific to my Screen
		// -------------------------------------------------------------
				
		applet.fill(255);
		applet.ellipse(135,210,40,7);
		applet.ellipse(137,214,50,10);
		applet.beginShape();
		applet.vertex(115, 215);
		applet.vertex(125, 270);
		applet.vertex(150, 270);
		applet.vertex(160, 215);
		applet.textFont(f, 20);
		applet.text("Scan Now", 100, 300);// applet.text for : Screen Pay
		applet.endShape();
		applet.fill(50);
		applet.ellipse(137,240,15,15);
		//above code is to display cup image and the circle on it
		
		

		applet.fill(27, 131, 87);
		applet.rect(2, 2, 259, 45);// The top applet.rectangle for :Screen Pay
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("My Cards", 100, 30);// applet.text in Top applet.rectangle
											// for :
											// Screen pay

				
		bcd = new BarCode(appController);
		bcd.draw(applet);
		
		tch = new FlipScreen(appController);
		tch.draw(applet);
		
		mn = new Menu(appController);
		mn.draw(applet);
	}// end of function setup

	public void draw(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return none
		 * 
		 * Called by Processing for every frame of My Cards Pay Screen.
		 */

	}// this function is needed to make the mousepressesd() work.Its just empty
		// but u shld have it .

	public void mousePressed(PApplet applet) {
		/**
		 * @author Anupama Patil
		 * 
		 * @return None
		 * 
		 * Called once after every time a mouse button is pressed.
		 * Here it is used to determine if Footer Menu Item or Barcode or 'Touch When Done' has been pressed
		 */

		if(applet.mouseX > 3 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397){
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}

		new BarCode(appController).mousePressed(applet);	
	
	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}
