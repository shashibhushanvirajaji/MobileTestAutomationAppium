package com.home.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.home.driver.DriverManager;
import com.home.reports.ExtentLogger;
import com.home.reports.ExtentManager;
import com.home.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
	private MobileElement views;
	
	public HomePage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
	}
	
	public ViewLandingPage ClickOnViews()
	{
		views.click();
		//ExtentReport.extentTest.pass(" Views element is clicked");
		//ExtentManager.getExtentTest().pass(" Views element is clicked");
		ExtentLogger.pass(" Views element is clicked");
		Assertions.assertThat(false);
		
		return new ViewLandingPage();
	}
	
}
