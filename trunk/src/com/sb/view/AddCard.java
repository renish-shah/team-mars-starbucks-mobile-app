package com.sb.view;
 
import com.sb.common.CreditBalance;
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
    NumberPad keys;
    NewCard addCard = new NewCard();
    PApplet applet = new PApplet();
 
    public AddCard(AppController appController) {
        this.appController = appController;
 
    }
 
    PImage img;
    PFont f;
    PFont f1;
 
    @Override
    public void setup(PApplet applet) {
 
        keys = new NumberPad();
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
        keys.draw(applet);
 
    }
 
    @Override
    public void mousePressed(PApplet applet) {
        // TODO Auto-generated method stub
        Integer pressedNumber = null;
        boolean removeDigit = false;
 
        if (applet.mouseX > 5 && applet.mouseX < 80 && applet.mouseY > 5
                && applet.mouseY < 36) {
            appController.setCurrentScreen(appController.getMyCardOptions());
        }
 
        if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 240
                && applet.mouseY < 280) {
 
            pressedNumber=1;
 
        } else if (applet.mouseX > 89 && applet.mouseX < 174
                && applet.mouseY > 240 && applet.mouseY < 280) {
            pressedNumber=2;
 
        } else if (applet.mouseX > 175 && applet.mouseX < 262
                && applet.mouseY > 240 && applet.mouseY < 280) {
            pressedNumber=3;
        }
        else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 281
                && applet.mouseY < 320) {
            pressedNumber=4;
        } else if (applet.mouseX > 89 && applet.mouseX < 174
                && applet.mouseY > 281 && applet.mouseY < 320) {
            pressedNumber=5;
        } else if (applet.mouseX > 175 && applet.mouseX < 262
                && applet.mouseY > 281 && applet.mouseY < 320) {
            pressedNumber=6;
        }
        else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 321
                && applet.mouseY < 360) {
            pressedNumber=7;
        } else if (applet.mouseX > 89 && applet.mouseX < 174
                && applet.mouseY > 321 && applet.mouseY < 360) {
            pressedNumber=8;
        } else if (applet.mouseX > 175 && applet.mouseX < 262
                && applet.mouseY > 321 && applet.mouseY < 360) {
            pressedNumber=9;
        }
        else if (applet.mouseX > 89 && applet.mouseX < 174
                && applet.mouseY > 361 && applet.mouseY < 400) {
            pressedNumber=0;
        }
        else if (applet.mouseX > 175 && applet.mouseX < 262
                && applet.mouseY > 361 && applet.mouseY < 400) {
            removeDigit = true;
        }
        else if (applet.mouseX > 180 - 75 && applet.mouseX < 180 + 75
                && applet.mouseY > 5 - 35 && applet.mouseY < 5 + 35) {
            // When Button Add New is pressed
        	
        	//Added by RENISH to add New Balance
        	CreditBalance creditBalance=CreditBalance.getInstance();
            creditBalance.addNewCardbalance();
            applet.fill(250, 255, 155, 220);
            applet.rect(180, 5, 75, 35, 8, 8, 8, 8);
            appController.setCurrentScreen(appController.getMyCardsMain());
        }
        if(addCard.getCardNoLength()< 10)
        {
             if ( pressedNumber != null) {
                    addCard.setCardNumberDigit(pressedNumber);
                   
             } else if ( removeDigit) {
                 addCard.removeCardNumberDigit();
             }
           System.out.println("CardNum:::: length = " + addCard.getCardNoLength() +", CurrentNum = " +pressedNumber +", CardNum = "+ addCard.getCardNumber());
        } else {
             if ( pressedNumber != null) {
                   //String displaypressedNumber="*";
                    addCard.setCardCodeDigit(pressedNumber);
                    
             } else if ( removeDigit) {
                 addCard.removeCardCodeDigit();
             }
             System.out.println("CardCode**** length = " + addCard.getCardCodeLength() +", CurrentNum = " +pressedNumber +", CardCode = "+ addCard.getCardCode());
        }
    }
 
    @Override
    public void draw(PApplet applet) {
        // TODO Auto-generated method stub
             
            f = applet.loadFont("Calibri-30.vlw");
            applet.textFont(f, 20);
            applet.fill(0);
            String cardNumber = addCard.getCardNumber();
            String cardCode = addCard.getCardCode();
            if(addCard.getCardNoLength()< 10) {
                applet.text(cardNumber,100,120);
            } else {
                applet.text(cardNumber,100,120);
                applet.text(cardCode,125,152);
                cardNumber ="";
                cardCode="";
            }
    }
 
    @Override
    public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
        // TODO Auto-generated method stub
 
    }
 
}