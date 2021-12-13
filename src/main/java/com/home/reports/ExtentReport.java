package com.home.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	public static void initReports() {
		
		if (Objects.isNull(extentReports)) {
			extentReports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/index.html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("Automation Report");
			spark.config().setDocumentTitle("Automation Report");

			extentReports.attachReporter(spark);
		}
	}

	public static void tearDownReports() {
		if (Objects.nonNull(extentReports)) {
			extentReports.flush();
			ExtentManager.unload();
		}
	}

	public static void createTest(String testCaseName) {
		extentTest = extentReports.createTest(testCaseName);
		ExtentManager.setExtentTest(extentTest);
	}
}
