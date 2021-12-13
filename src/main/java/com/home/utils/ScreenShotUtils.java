package com.home.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.home.driver.DriverManager;

public class ScreenShotUtils {

	private ScreenShotUtils() {
	}

	public static String getBase64Image() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
}
