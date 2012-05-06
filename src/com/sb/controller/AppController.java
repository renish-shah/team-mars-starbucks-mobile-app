	package com.sb.controller;

import com.sb.view.AddCard;
import com.sb.view.FindStarbucks;
import com.sb.view.MyCardOptions;
import com.sb.view.MyCardsMain;
import com.sb.view.MyCardsMoreOptions;
import com.sb.view.MyCardsPay;
import com.sb.view.MyRewards;
import com.sb.view.Payment;
import com.sb.view.PinScreen;

import processing.core.PApplet;

public class AppController extends PApplet {

	/** 
	 * AppController is the controller of Starbucks App.
	 * This class implements State pattern and initialize all Screens in its constructor 
	 * and sets Current Screen to Pin Screen. Moreover, this class has all the getter and
	 * setter methods of all screens.
	 * 
	 * @author RENISH
	 * 
	 */

	private static final long serialVersionUID = 6361405752227066178L;

	ScreenState myCardsMoreOptions;
	ScreenState myCardsPay;
	ScreenState currentScreen;
	ScreenState myCardOptions;
	ScreenState myCardsMain;
	ScreenState pinScreen;
	ScreenState myRewards;
	ScreenState addCard;
	ScreenState findStarbucks;
	ScreenState payment;
	
	public AppController() {
		/**
		 * Initialize all Screens and sets current Screen “Pin Screen” 
		 * @Author Renish Shah
		 * @return None
		 */
		myCardsMoreOptions = new MyCardsMoreOptions(this);
		myCardsPay = new MyCardsPay(this);
		pinScreen = new PinScreen(this);
		myCardsMain = new MyCardsMain(this);
		myRewards = new MyRewards(this);
		myCardOptions = new MyCardOptions(this);
		addCard = new AddCard(this);
		findStarbucks = new FindStarbucks(this);
		payment = new Payment(this);
		setCurrentScreen(pinScreen);
	}
	
	public ScreenState getMyCardOptions() {
		/**
		 *  returns MyCardOptions Screen 
		 * @Author Renish Shah
		 * @return MyCardOptions
		 */
		return myCardOptions;
	}

	public void setMyCardOptions(ScreenState myCardOptions) {
		/**
		 * sets MyCardOptions Screen  
		 * @Author Renish Shah
		 * @return None
		 */
		this.myCardOptions = myCardOptions;
	}

	public ScreenState getAddCard() {
		/**
		 * returns AddCard Screen 
		 * 
		 * @Author Renish Shah
		 * @return AddCardScreen
		 */
		return addCard;
	}

	public void setAddCard(ScreenState addCard) {
		/**
		 * sets AddCard Screen 
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		this.addCard = addCard;
	}

	public ScreenState getMyCardsMain() {
		/**
		 * returns MyCardsMain Screen 
		 * 
		 * @Author Renish Shah
		 * @return MyCardsMainScreen
		 */
		return myCardsMain;
	}

	public void setMyCardsMain(ScreenState myCardsMain) {
		/**
		 * sets MyCardsMain Screen 
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		this.myCardsMain = myCardsMain;
	}

	public ScreenState getPinScreen() {
		/**
		 * returns PinScreen Screen 
		 * 
		 * @Author Renish Shah
		 * @return PinScreen
		 */		
		return pinScreen;
	}

	public void setPinScreen(ScreenState pinScreen) {
		this.pinScreen = pinScreen;
	}

	public ScreenState getMyRewards() {
		/**
		 * returns MyRewards Screen 
		 * 
		 * @Author Renish Shah
		 * @return MyRewardsScreen
		 */
		return myRewards;
	}

	public void setMyRewards(ScreenState myRewards) {
		/**
		 * Sets setMyRewards Screen 
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		this.myRewards = myRewards;
	}

	public ScreenState getFindStarbucks() {
		/**
		 * returns FindStarbucks Screen 
		 * 
		 * @Author Renish Shah
		 * @return FindStarbucksScreen
		 */
		return findStarbucks;
	}

	public void setFindStarbucks(ScreenState findStarbucks) {
		/**
		 * 
		 * Sets FindStarbucks Screen 
		 * @Author Renish Shah
		 * @return None
		 */
		this.findStarbucks = findStarbucks;
	}

	public ScreenState getCurrentScreen() {
		/**
		 * 
		 * returns CurrentScreen  
		 * @Author Renish Shah
		 * @return CurrentScreen
		 */
		return currentScreen;
	}

	public void setCurrentScreen(ScreenState currentScreen) {
		/**
		 * 
		 * Sets CurrentScreen 
		 * @Author Renish Shah
		 * @return None
		 */
		this.currentScreen = currentScreen;
	}

	@Override
	public void setup() {
		/**
		 * 
		 * Override setup method of PApplet and calls setup 
		 * method of Current Screen using Current Class object (this)
		 * @Author Renish Shah
		 * @return None
		 */
		currentScreen.setup(this);
	}

	@Override
	public void draw() {
		/**
		 * Override draw method of PApplet and calls draw 
		 * method of Current Screen using Current Class object (this) 
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		currentScreen.draw(this);
	}

	@Override
	public void mousePressed() {
		/**
		 * Override mousePressed method of PApplet and calls mousePressed() , 
		 * setup() and draw() method of Current Screen using Current Class object (this)
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		currentScreen.mousePressed(this);
		currentScreen.setup(this);
		currentScreen.draw(this);
	}

	public ScreenState getPayment() {
		/**
		 * returns payment Screen
		 * 
		 * @Author Renish Shah
		 * @return Payment
		 */
		return payment;
	}

	public void setPayment(ScreenState payment) {
		/**
		 * Sets Payment Screen
		 * 
		 * @Author Renish Shah
		 * @return None
		 */
		this.payment = payment;
	}

	public ScreenState getMyCardsMoreOptions() {
		/**
		 * 
		 * returns myCardsMoreOptions Screen
		 * @Author Renish Shah
		 * @return myCardsMoreOptions
		 */
		return myCardsMoreOptions;
	}

	public void setMyCardsMoreOptions(ScreenState myCardsMoreOptions) {
		/**
		 * 
		 * sets MyCardsMoreOptions Screen
		 * @Author Renish Shah
		 * @return None
		 */
		this.myCardsMoreOptions = myCardsMoreOptions;
	}

	public ScreenState getMyCardsPay() {
		/**
		 * 
		 * returns MyCardsPay Screen 
		 * @Author Renish Shah
		 * @return MyCardsPay
		 */
		return myCardsPay;
	}

	public void setMyCardsPay(ScreenState myCardsPay) {
		/**
		 * 
		 * sets MyCardsMoreOptions Screen
		 * @Author Renish Shah
		 * @return None
		 */
		this.myCardsPay = myCardsPay;
	}
}