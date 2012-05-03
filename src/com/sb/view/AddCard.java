package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class AddCard implements ScreenState {
	
	private static final long serialVersionUID = 1L;
	/***************************************
	 * SCREEN:Add Card AUTHOR:Madhumita V
	 *************************************** 
	 */

	AppController appController;

	public AddCard(AppController appController) {
		this.appController = appController;
	
	}

	PImage img;
	PFont f;
	PFont f1;

	@Override
	public void setup(PApplet applet) {

		img = applet.loadImage("Addcard.jpg");
		applet.size(262, 400);
		applet.background(50);
		/* Drawing card image to screen co-ordinates */
		applet.image(img, 30, 65, 200, 125);

		applet.fill(176, 177, 178, 220);
		applet.rect(0, 240, 265, 318);
		applet.line(88, 240, 88, 399);
		applet.line(174, 240, 174, 399);
		applet.line(0, 240, 300, 240);
		applet.line(0, 280, 300, 280);
		applet.line(0, 320, 300, 320);
		applet.line(0, 360, 300, 360);
		applet.rect(73, 100, 152, 22, 8, 8, 8, 8);
		applet.rect(111, 132, 80, 22, 8, 8, 8, 8);

		f = applet.loadFont("Calibri-30.vlw");

		applet.fill(27, 131, 87);
		applet.rect(0, 0, 265, 47);
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("Add Card", 88, 30);

		applet.fill(21, 67, 54);
		applet.rect(180, 5, 75, 31, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 15);
		applet.text("Add", 205, 27);

		applet.fill(21, 67, 54);
		applet.rect(5, 5, 75, 31, 8, 8, 8, 8);
		applet.fill(255);
		applet.textFont(f, 15);
		applet.text("Cancel", 25, 27);

		f1 = applet.loadFont("Calibri-Bold-30.vlw");

		/* Code Reused from Pinscreen.java --By Manju */
		applet.fill(255);
		applet.textFont(f1, 20);
		applet.text("1", 30, 265);
		applet.text("2", 130, 265);
		applet.text("3", 210, 265);
		applet.text("4", 30, 305);
		applet.text("5", 130, 305);
		applet.text("6", 210, 305);
		applet.text("7", 30, 345);
		applet.text("8", 130, 345);
		applet.text("9", 210, 345);
		applet.text("0", 130, 385);
		applet.textFont(f1, 13);
		applet.text("A B C", 123, 275);
		applet.text("D E F", 205, 275);
		applet.text("G H I", 25, 315);
		applet.text("J K L", 123, 315);
		applet.text("M N O", 200, 315);
		applet.text("P Q R S", 18, 355);
		applet.text("T U V", 123, 355);
		applet.text("W X Y Z", 198, 355);
		applet.rect(210, 370, 20, 14);
		applet.triangle(200, 377, 210, 370, 210, 384);
		applet.stroke(255);
		applet.line(210, 371, 210, 383);
		applet.fill(0);
		applet.text("X", 215, 382);
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub
		if(applet.mouseX > 5 && applet.mouseX < 80
				&& applet.mouseY > 5 && applet.mouseY < 36){
			appController.setCurrentScreen(appController.getMyCardOptions());
		}
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}

}
