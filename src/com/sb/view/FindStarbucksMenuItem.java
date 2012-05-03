package com.sb.view;

import com.sb.controller.AppController;
/************************************************************************************
 * Author: Madhumita Vimalanathan 
 * Course#: CMPE 202 
 * Topic: Command Pattern implementation for Menu toolbar 
 **************************************************************************************/

public class FindStarbucksMenuItem implements MenuItem {

	@Override
	public void execute(AppController appController) {
		try {
		 appController.setCurrentScreen(appController.getFindStarbucks());
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		}

	}

}
