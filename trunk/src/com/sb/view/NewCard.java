package com.sb.view;

/**
 * The NewCard class consists of methods used by the AddCard Screen to add the card number 
 * and card code number.
 * 
 * @author Madhumita Vimalanathan
 * @param cardNumber	array of Integers to store the Card Number
 * @param cardCode		array of Integers to store the Card Code
 * @param cardNoLength	Stores the length of the Card Number
 * @param cardCodeLength	Stores the Length of the Card Code
 *
 */

 
public class NewCard {
     
    private Integer[] cardNumber = new Integer[10];
     
    private Integer[] cardCode = new Integer[10];
     
    private int cardNoLength = 0;
     
    private int cardCodeLength =0;
     
    public void setCardNumberDigit(int x){
       	/**
    	 * This method is used to store the pressed number in the cardNumber integer array.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        if ( cardNoLength < 10)
            cardNumber[cardNoLength++] = x;
    }
     
    public void removeCardNumberDigit(){
    	/**
    	 * This method is used to remove the pressed number in the cardNumber integer 
    	 * array when the backspace key is pressed.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        if ( cardNoLength >0 ) 
            cardNumber[--cardNoLength] = null;
    }
    public String getCardNumber() {
    	/**
    	 * This method is used to return the card number stored in the cardNumber integer array.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return String
    	 */

        StringBuilder str = new StringBuilder();
        for ( int i=0;i<getCardNoLength(); i++) {
            str.append(cardNumber[i].intValue());
        }
        return str.toString();
    }
 
    public void setCardCodeDigit(Integer pressedNumber){
    	/**
    	 * This method is used to store the pressed number in the cardCode integer array.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        if ( cardCodeLength <4)
            cardCode[cardCodeLength++] = pressedNumber;
    }
     
    public void removeCardCodeDigit(){
    	/**
    	 * This method is used to remove the pressed number in the cardCode 
    	 * integer array when the backspace key is pressed.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        if ( cardCodeLength >0 ) 
            cardCode[--cardCodeLength] = null;
    }
    public String getCardCode() {
    	/** This method is used to return the card code stored in the cardCode integer array.
    	    	 * 
    	    	 * @author Madhumita Vimalanathan
    	    	 * @return string
    	    	 */

        StringBuilder str = new StringBuilder();
        for ( int i=0;i<getCardCodeLength(); i++) {
            str.append(cardCode[i].intValue());
        }
        return str.toString();
    }
     
    public int getCardNoLength() {
     	/**
    	 * This method returns the length of the cardNumber integer array.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return integer
    	 */

        return cardNoLength;
    }
    public int getCardCodeLength() {
    	/**
    	 * This method returns the length of the cardCode integer array.
    	 * 
    	 * @author Madhumita Vimalanathan
    	 * @return integer
    	 */

        return cardCodeLength;
    }
 
    public void setCardNolength(int cardNolength) {
    	/**
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        this.cardNoLength = cardNolength;
    }
 
    public void setCardCode(Integer[] cardCode) {
    	/**
    	 * @author Madhumita Vimalanathan
    	 * @return None
    	 */

        this.cardCode = cardCode;
    } 
}