package org.SampleListeners.java;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylisteners  implements ITestListener ,IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("the test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("the test is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("the test is failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("the test is skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("the test is failed because of the time out");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("the test are on");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("the tests are finished");
	}

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}


}
