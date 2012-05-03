package com.sb.controller;

import processing.core.PApplet;

/**
 * @author RENISH
 *
 */

public interface ScreenState {

	public void setup(PApplet applet);
	public void mousePressed(PApplet applet);
	public void draw(PApplet applet);
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet);

}
