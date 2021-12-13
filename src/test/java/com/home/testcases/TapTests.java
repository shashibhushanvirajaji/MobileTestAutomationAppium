//ruthvika
package com.home.testcases;

import static com.home.driver.DriverManager.getDriver;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.home.driver.Driver;

import facade.ButtonsFacade;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

public class TapTests extends BaseTest{

	
	
	@Test(dataProvider = "getTestData")
	public void tapTest(Map<String, String> map) throws MalformedURLException {
		    	
		//AndroidElement views =getDriver().findElement(MobileBy.AccessibilityId("Views"));    	
		//tap(views);		
		//getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		//new HomePage().ClickOnViews().clickOnMenuItem("Buttons");
			
		new ButtonsFacade()
		.buttons();
		
	//	new ViewLandingPage().clickOnMenuItem("Buttons");
	}
	
	@DataProvider(parallel = true)
	public Object[] getTestData() {
		
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("device", "Google Pixel 3");
		map1.put("os_version", "9.0");
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("device", "Samsung Galaxy S10e");
		map.put("os_version", "9.0");
		
		
		
		
		List<Map<String, String>> list = new ArrayList<>();
		list.add(map);
		list.add(map1);
		
		return list.toArray();
	}
	/*
	 * @Test() public void swipeTest(Method m) throws MalformedURLException {
	 * 
	 * // AndroidElement views
	 * =getDriver().findElement(MobileBy.AccessibilityId("Views")); // tap(views);
	 * //getDriver().findElement(By.xpath(
	 * "//android.widget.TextView[@content-desc='Views']")).click(); new
	 * HomePage().ClickOnViews();
	 * 
	 * 
	 * }
	 */
	
	
	private void tap(AndroidElement element) {
		new AndroidTouchAction(getDriver())
		.tap(tapOptions().withElement(element(element))).perform();
	}
}
