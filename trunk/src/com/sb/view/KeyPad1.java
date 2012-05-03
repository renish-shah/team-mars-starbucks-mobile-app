package com.sb.view;

import com.sb.controller.ScreenState;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class KeyPad1 implements ScreenState {
	PFont f1;

	public void setup(PApplet applet) {

	}

	@Override
	public void mousePressed(PApplet applet) {

	}

	@Override
	public void draw(PApplet applet) {
		f1 = applet.loadFont("Calibri-Bold-30.vlw");
		/* Creating the main boundary */
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

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}