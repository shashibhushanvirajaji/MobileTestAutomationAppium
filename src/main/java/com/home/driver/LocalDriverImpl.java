package com.home.driver;

import java.net.MalformedURLException;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LocalDriverImpl implements IDriver{

	public AndroidDriver<AndroidElement> getDriver(Map<String,String> map) throws MalformedURLException {
		
		return null;
	}

	
}
