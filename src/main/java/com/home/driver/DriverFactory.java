package com.home.driver;

import java.net.MalformedURLException;
import java.util.Map;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public final class DriverFactory {

	private DriverFactory() {
		
	}
	
	public static AndroidDriver<AndroidElement>  get(Modes mode, Map<String,String> map) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = null;
		
		if(mode.equals(Modes.Browserstack))
			driver = new BrowserStackImpl().getDriver(map);
		
		if(mode.equals(Modes.Local))
			driver = new LocalDriverImpl().getDriver(map);
		
		
		return driver;
	}
	
}
