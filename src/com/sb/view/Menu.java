package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Menu implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings;

	public Menu(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
	}// end of function setup

	/************************************************************************************
	 * Modified By: Madhumita V 
	 * Course#: CMPE 202 
	 * Topic: Command Pattern implementation for Menu toolbar 
	 **************************************************************************************/
	public MenuItem getMenuItem(int x, int y) {
		MenuItem menuItem = null;
		if (x > 3 && x < 53 && y > 352 && y < 397) {
			menuItem = new CardMainMenuItem();
		}
		else if (x > 55 && x < 105 && y > 352 && y < 397) {
			menuItem = new PaymentMenuItem();
		}
		else if (x > 108 && x < 158 && y > 352 && y < 397) {
			menuItem = new MyRewardMenuItem();
		}
		else if (x > 160 && x < 210 && y > 352 && y < 397) {
			menuItem = new FindStarbucksMenuItem();
		}
		return menuItem;
		
	}
	/************************************************************************************
	 * Author: Sindhuja Sundarraman 
	 * Course#: CMPE 202 
	 * Topic: Code for generating Menu items toolbar
	 *************************************************************************************/
	public void draw(PApplet applet) {
		applet.noStroke();
		applet.line(0, 350, 300, 350);
		applet.fill(50);
		applet.rect(0, 350, 262, 50);

		f3 = applet.loadFont("Calibri-Bold-8.vlw"); // for Text below images in footer
		applet.textFont(f3, 10);

		// 1. Home
		applet.fill(80);
		applet.rect(3, 352, 50, 45);
		MyHome = applet.loadImage("MyHome.png"); // Image of MyHome
		applet.image(MyHome, 8, 355, 40, 25);

		applet.fill(255);
		applet.text("Cards", 15, 395); // Text for MyHome

		// 2. Payments
		applet.fill(80);
		applet.rect(55, 352, 50, 45);
		Payments = applet.loadImage("Payments.png"); // Image of Payments
		applet.image(Payments, 60, 355, 40, 25);

		applet.fill(255);
		applet.text("Payments", 60, 395); // Text for Payments

		// 3. My Rewards
		applet.fill(80);
		applet.rect(108, 352, 50, 45);
		MyRewards = applet.loadImage("MyRewards.png"); // Image of My Rewards
		applet.image(MyRewards, 113, 355, 40, 25);

		applet.fill(255);
		applet.text("My Rewards", 108, 395); // Text for MyRewards

		// 4. Stores
		applet.fill(80);
		applet.rect(160, 352, 50, 45);
		Stores = applet.loadImage("Stores.png"); // Image of Stores
		applet.image(Stores, 165, 355, 40, 25);

		applet.fill(255);
		applet.text("Stores", 173, 395); // Text for Stores

		// 5. Settings
		applet.fill(80);
		applet.rect(212, 352, 50, 45);
		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(255);
		applet.text("Settings", 220, 395); // Text for Settings
	}

	public void mousePressed(PApplet applet) {
		MenuItem menuItem = getMenuItem(applet.mouseX, applet.mouseY);
		menuItem.execute(appController);
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}