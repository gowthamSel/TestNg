package org.listeners.sel;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	
		try {
			System.out.println(result.getMethod().getMethodName()+".png");
			captureScreenShot(result.getMethod().getMethodName()+".png");
		} catch (IOException e) {
			System.out.println("exception is generated");
		}
	}

	
	
}
