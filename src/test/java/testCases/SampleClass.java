package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import takeScreenShot.Reporting;

public class SampleClass  extends Reporting {
	
	
	
	
	@Test
public void testMethod1() {
	System.out.println("i am in the test method 1");
	
}
	@Test
	public void testMethod2() {
		System.out.println("i am in the test method 2");
	}
	
	@AfterMethod
	public void m1() {
		System.out.println("this method is @AfterMethod");
		
	}
	
	@BeforeMethod
	public void m2() {
		System.out.println("this method is @BeforeMethod");
		
	}
}
