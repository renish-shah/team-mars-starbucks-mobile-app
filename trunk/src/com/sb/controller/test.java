package com.sb.controller;

import java.text.DecimalFormat;

public class test {

	
	static double a=16.4;
	public static void main(String[] args) {
		//System.out.println(""+(Math.round((a-3.5))));
		a=a-3.6;
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println(""+df.format(a));
		
	}
	
}
