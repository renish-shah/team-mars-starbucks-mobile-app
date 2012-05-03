package com.sb.test;
 
import junit.framework.Assert;
import mockit.NonStrict;
import mockit.NonStrictExpectations;
 
import org.junit.Test;
 
import com.sb.controller.AppController;
import com.sb.controller.ScreenState;
import com.sb.view.MyCardOptions;
 
 
public class MyCardOptionsTest {
     
    @NonStrict AppController applet;
    @Test
    public void testMousePressed(){
        new NonStrictExpectations() {
            {
                applet.getCurrentScreen(); returns( new MyCardOptions(applet));
            }
        };
        ScreenState returnedScreenState =  applet.getCurrentScreen();
        Assert.assertEquals(MyCardOptions.class,returnedScreenState.getClass() );
    } 
}