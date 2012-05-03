package com.sb.test;
import junit.framework.Assert;
import mockit.NonStrict;
import mockit.NonStrictExpectations;
 
import org.junit.Test;
 
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import com.sb.view.AddCard;
 
public class AddCardTest {
    @NonStrict AppController applet;
    @Test
    public void testMousePressed(){
        new NonStrictExpectations() {
            {
                applet.getCurrentScreen(); returns( new AddCard(applet));
            }
        };
        ScreenState returnedScreenState =  applet.getCurrentScreen();
        Assert.assertEquals(AddCard.class,returnedScreenState.getClass() );
    } 
}