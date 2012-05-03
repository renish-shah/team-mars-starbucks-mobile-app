/***************************************
 * SCREEN:Add Card AUTHOR:Madhumita V
 *************************************** 
 */
package com.sb.view;
 
public class NewCard {
     
    private Integer[] cardNumber = new Integer[10];
     
    private Integer[] cardCode = new Integer[10];
     
    private int cardNoLength = 0;
     
    private int cardCodeLength =0;
     
    public void setCardNumberDigit(int x){
        if ( cardNoLength < 10)
            cardNumber[cardNoLength++] = x;
    }
     
    public void removeCardNumberDigit(){
        if ( cardNoLength >0 ) 
            cardNumber[--cardNoLength] = null;
    }
    public String getCardNumber() {
        StringBuilder str = new StringBuilder();
        for ( int i=0;i<getCardNoLength(); i++) {
            str.append(cardNumber[i].intValue());
        }
        return str.toString();
    }
 
    public void setCardCodeDigit(Integer pressedNumber){
        if ( cardCodeLength <4)
            cardCode[cardCodeLength++] = pressedNumber;
    }
     
    public void removeCardCodeDigit(){
        if ( cardCodeLength >0 ) 
            cardCode[--cardCodeLength] = null;
    }
    public String getCardCode() {
        StringBuilder str = new StringBuilder();
        for ( int i=0;i<getCardCodeLength(); i++) {
            str.append(cardCode[i].intValue());
        }
        return str.toString();
    }
     
    public int getCardNoLength() {
        return cardNoLength;
    }
    public int getCardCodeLength() {
        return cardCodeLength;
    }
 
    public void setCardNolength(int cardNolength) {
        this.cardNoLength = cardNolength;
    }
 
    public void setCardCode(Integer[] cardCode) {
        this.cardCode = cardCode;
    } 
}