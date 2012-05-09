package com.sb.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.sb.controller.AppController;
import com.sb.view.FindStarbucks;

public class FindStarbucksTest {

	FindStarbucks findStarbucks;
	
	@Test
	public void testSetupFindStarbucks() {
		//AppController new AppController();
		findStarbucks=new FindStarbucks(new AppController());
		String returnStatus=findStarbucks.setupFindStarbucks();
		Assert.assertEquals("success",returnStatus);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDrawFindStarbucks() {
		
		String returnStatus=findStarbucks.drawFindStarbucks();
		Assert.assertEquals("success",returnStatus);
		//fail("Not yet implemented");
	}

}
