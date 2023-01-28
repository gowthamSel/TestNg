package org.listeners.java;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class ReRunListeners implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;


	/**the bellow method is used for rerun the failed test cases 
	 * if the test cases are failed this method is rerun the failed methods 
	 * and we only give the how many times the failed method will be rerun 
	 * to give the maxretrycount = intvalues this method will be according to the max value  
	 * to give the 10 number the method will be run ten times  
	 * 
	 * but we compulosorry give the listeners Annotation to the methods 
	 * @how to give    @listeners(packagename.classname.CLASS at the test method  */
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}


