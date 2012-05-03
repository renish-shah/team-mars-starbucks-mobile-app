/********************************************/
/***       Author : Sachin Pisal         ****/
/********************************************/

package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class FindStarbucks implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings,
			TiltedArrow, Search;
	Menu mn;

	public FindStarbucks(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
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
		applet.rect(0, 0, 265, 47);
		applet.fill(255);
		applet.textFont(f, 20);
		// text("My Cards", 85, 30);

		applet.fill(21, 67, 54);
		applet.rect(8, 10, 30, 30, 8, 8, 8, 8);
		applet.fill(255);
		TiltedArrow = applet.loadImage("arrow.png");
		applet.image(TiltedArrow, 15, 15, 20, 20);

		applet.fill(21, 67, 54);
		applet.rect(70, 10, 60, 30, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 15);
		applet.text("Map", 90, 30);

		applet.fill(21, 67, 54);
		applet.rect(130, 10, 60, 30, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 15);
		applet.text("List", 150, 30);

		applet.fill(21, 67, 54);
		applet.rect(227, 10, 30, 30, 8, 8, 8, 8);
		applet.fill(255);
		// textFont(f, 15);
		Search = applet.loadImage("Stores.png");
		applet.image(Search, 230, 13, 25, 25);
		// -------------------------------------------------------------

		// Images must be in the "data" directory to load correctly
		b = applet.loadImage("Map.png");
		applet.image(b, 0, 45);

		mn = new Menu(appController);
		mn.draw(applet);
	}// end of function setup

	// ---------------------------------------------------------------------------------------
	// Following code for muse
	// events---------------------------------------------------------
	// ............................................................................................
	public void draw(PApplet applet) {
	}

	public void mousePressed(PApplet applet) {
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