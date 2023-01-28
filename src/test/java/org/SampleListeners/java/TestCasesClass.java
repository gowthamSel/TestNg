package org.SampleListeners.java;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners({org.SampleListeners.java.Mylisteners.class})
public class TestCasesClass {

	@Test(retryAnalyzer =org.SampleListeners.java.Mylisteners.class )
	public void testCase1() {
		System.out.println("testCase1");
	}

	@Test(retryAnalyzer =org.SampleListeners.java.Mylisteners.class )
	public void testCase2() {
		System.out.println("testCase2");
	}


	@Test(retryAnalyzer =org.SampleListeners.java.Mylisteners.class )
	public void testCase3() {
		System.out.println("testCase3");
	}


	@Test(retryAnalyzer =org.SampleListeners.java.Mylisteners.class )
	public void testCase4() {
		System.out.println("testCase4");
	}


	@Test(timeOut=1000,retryAnalyzer =org.SampleListeners.java.Mylisteners.class)
	public void testCase5() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("testCase5");
	}

	@Test(dependsOnMethods = "testCase5",retryAnalyzer =org.SampleListeners.java.Mylisteners.class )
	public void testCase6() {
		System.out.println("testCase6");
	}

}
