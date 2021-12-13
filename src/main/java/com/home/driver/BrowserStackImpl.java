package com.home.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackImpl implements IDriver{

	public AndroidDriver<AndroidElement> getDriver(Map<String,String> map) throws MalformedURLException {
		

		 DesiredCapabilities caps = new DesiredCapabilities();		
		//caps.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, 8200);
		 map.forEach(caps::setCapability);
		caps.setCapability("browserstack.user", "shashibhushanv1");
		caps.setCapability("browserstack.key", "xH13H2oYyxynhctD9Sx4");		
		caps.setCapability("app", "bs://795afe634c672fef7192923169257aa4da4cd328");
		
		
		/*
		 * caps.setCapability("device", "Samsung Galaxy S10e");
		 * caps.setCapability("os_version", "9.0");
		 */
    	caps.setCapability("project", "ApisDemo");
    	caps.setCapability("build", "validating gestures");
    	caps.setCapability("name", "test name"); 		
    
    	return new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
		
	}

	
}
