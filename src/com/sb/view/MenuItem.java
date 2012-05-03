package com.sb.view;

import com.sb.controller.AppController;
/************************************************************************************
 * Author: Madhumita V
 * Course#: CMPE 202 
 * Topic: Command Pattern implementation for Menu toolbar 
 **************************************************************************************/

public interface MenuItem {

	public void execute(AppController appController);
}
