package com.home.driver;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import com.home.utils.PropertyUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static com.home.driver.DriverManager.setDriver;
import static com.home.driver.DriverManager.getDriver;
import static com.home.driver.DriverManager.unload;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;;
public class Driver {

	private Driver() {
	}

	private static AndroidDriver<AndroidElement> driver;

	public static void initDriver(Map<String, String> map) throws MalformedURLException {
		if (isNull(getDriver())) {
			String mode = PropertyUtils.getValue("mode");
			driver = DriverFactory.get(Modes.valueOf(mode),map);
			setDriver(driver);
		}
	}

	public static void quitDriver() {

		if (nonNull(getDriver())) {
			getDriver().quit();
			unload();
		}

	}
}
