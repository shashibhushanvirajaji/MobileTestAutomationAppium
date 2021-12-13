package com.home.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.home.utils.ScreenShotUtils;

public class ExtentLogger {

	private ExtentLogger() {
}
	
	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}
	
	public static void fail(String message) {
	//	ExtentManager.getExtentTest().fail(message);
		ExtentManager.getExtentTest().fail(message, 
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getBase64Image()).build());
	}
	
	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}
	
}

	
	
