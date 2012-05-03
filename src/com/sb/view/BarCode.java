package com.sb.view;

import java.util.Random;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class BarCode implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings;
	private CreditBalance balance;
	int count = 0;
	
	public BarCode(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
	}// end of function setup

	// ---------------------------------------------------------------------------------------
	// Following code for muse
	// events---------------------------------------------------------
	// ............................................................................................
	public void draw(PApplet applet) {
		f = applet.loadFont("Calibri-30.vlw");
		applet.textFont(f, 11);

		applet.fill(209);
		applet.rect(20,55,220,100);//upper rectangle with scan code

		applet.fill(87);
		applet.rect(20,55,50,100);//vertical rect with startbucks logo
		applet.fill(162);
		applet.textFont(f,11);
		applet.text("CARD",35,120);//text to display in vertical screen

		// Images must be in the "data" directory to load correctly
		b = applet.loadImage("logo.png");
		applet.image(b, 25, 57);

		applet.fill(87);
		applet.rect(20,150,220,20);//middle rectangle 
		applet.fill(87);
		applet.rect(20,170,50,15);//bottom vertical rectangle
		applet.fill(209);
		applet.rect(70,170,170,15);//bottom horizontal rectangle
		applet.fill(255);
		applet.rect(80,90,150,55);//barcode
		applet.fill(0);
		
		b = applet.loadImage("barcode.png");
		applet.image(b, 80, 90);

		//above code is for center rectangle for barcode sacnning :Screen Pay

		applet.fill(162);
		applet.textFont(f,10);
		applet.text("Your Starbucks card number is",90,70);
		applet.fill(50);
		applet.textFont(f,13);
		applet.text("6055   4399   8528   8445",85,85);
		//above code to display text in first rectangle of scan code
		}

	public void mousePressed(PApplet applet) {
		if(applet.mouseX > 80 && applet.mouseX < 230
				&& applet.mouseY > 90 && applet.mouseY < 145){
			if(count == 0){
				balance = CreditBalance.getInstance();
				balance.setBalance();
				count++;
			}
		}
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}