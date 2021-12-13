package com.home.testcases;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.home.driver.Driver;
import com.home.reports.ExtentManager;
import com.home.reports.ExtentReport;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {

	
	@BeforeMethod
	public void setUp(Object[] data) throws MalformedURLException {	
		//ExtentReport.createTest(m.getName());
		Map<String, String> map = (Map<String,String>) data[0];
		Driver.initDriver(map);	
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
}
