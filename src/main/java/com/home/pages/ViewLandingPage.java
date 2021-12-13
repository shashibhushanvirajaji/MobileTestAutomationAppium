package com.home.pages;

import org.openqa.selenium.By;

import com.home.driver.DriverManager;
import com.home.reports.ExtentLogger;
import com.home.reports.ExtentManager;
import com.home.reports.ExtentReport;

public class ViewLandingPage {

	String xpath = "//android.widget.TextView[@content-desc='%s']";
	
	public void clickOnMenuItem(String menu)
	{
		String newxpath = String.format(xpath, menu);
		DriverManager.getDriver().findElement(By.xpath(newxpath)).click();
		//ExtentManager.getExtentTest().pass(menu + " element is clicked");
		ExtentLogger.pass(menu + " element is clicked");
	}
}
