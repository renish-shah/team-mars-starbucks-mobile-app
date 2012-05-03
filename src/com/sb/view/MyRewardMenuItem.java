package com.sb.view;

import com.sb.controller.AppController;
/************************************************************************************
 * Author: Madhumita V
 * Course#: CMPE 202 
 * Topic: Command Pattern implementation for Menu toolbar 
 **************************************************************************************/

public class MyRewardMenuItem implements MenuItem {

	@Override
	public void execute(AppController appController) {
		try {
			appController.setCurrentScreen(appController.getMyRewards());
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		}

	}

}
