package com.home.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverManager {

	private DriverManager() {
				
	}
	
	private static ThreadLocal<AndroidDriver<AndroidElement>> threadLocalDriver = new ThreadLocal<AndroidDriver<AndroidElement>>();
	
	public static AndroidDriver<AndroidElement> getDriver()
	{
		return threadLocalDriver.get();		
	}

	public static void setDriver(AndroidDriver<AndroidElement> driverref)
	{
		threadLocalDriver.set(driverref);
	}
	
	public static void unload()
	{
		threadLocalDriver.remove();
	}
	
	
}
