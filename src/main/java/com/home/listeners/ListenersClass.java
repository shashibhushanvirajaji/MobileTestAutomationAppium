package com.home.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.home.reports.ExtentLogger;
import com.home.reports.ExtentReport;

public class ListenersClass implements ITestListener, ISuiteListener {

	// Before Suite
	 public  void onStart(ISuite suite) {
		 ExtentReport.initReports();
		  }
	 
	 // After Suite
	 public  void onFinish(ISuite suite) {
			ExtentReport.tearDownReports();
		  }
	public  void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getName());
	  }

	
	  public  void onTestSuccess(ITestResult result) {
	    ExtentLogger.pass(result.getName() + " is passed");
	  }

	  public  void onTestFailure(ITestResult result) {
		  ExtentLogger.fail(result.getName() + " is failed");		  
	  }

	  
	  public  void onTestSkipped(ITestResult result) {
		  ExtentLogger.skip(result.getName() + " is skipped");
	  }

	  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
}
