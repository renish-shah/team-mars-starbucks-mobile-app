package com.sb.controller;

import processing.core.PApplet;


/**
 * ScreenState is an interface to facilitate State Pattern and implemented by all the screens
 * @author Renish Shah
 *
 */

public interface ScreenState {
	/**
	 * This method setups the User Interface of screen
	 * @author Renish Shah
	 * @param applet facilitates all methods of PApplet to draw the screen.
	 */
	public void setup(PApplet applet);
	
	/**
	 * This method handles mouse pressed events of screen 

	 *  @author Renish Shah
	 * @param applet This param facilitates all methods of PApplet to draw the screen.
	 */
	public void mousePressed(PApplet applet);
	
	
	/**
	 * @author Renish Shah
	 * @param applet facilitates all methods of PApplet to handle the mousepressed events of the screen.
	 */
	public void draw(PApplet applet);
	
	/**
	 * This method draws the User Interface of screen
	 *  @author Renish Shah
	 *  facilitates all methods of PApplet to draw the screen.
	 * 	cx – defines ‘X’ Coordinate of screen.
	 * 	cy – defines ‘Y’ Coordinate of screen.
	 * 	len – defines length of arrow.	
	 *  angle – defines angle of arrow.
	 *  applet – This param facilitates all methods of PApplet to draw the UserInterface of Screen.
	 */
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet);

}
