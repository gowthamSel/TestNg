package testCases;

import org.testng.annotations.Test;

public class EnableMethod {
	@Test(priority = 1)
	public void testMethod1() {
		System.out.println("i am in the test method 1");

	}
	@Test(priority = 2 ,enabled = false )
	public void testMethod2() {
		System.out.println("i am in the test method 2");
	}

	@Test(priority = -1)
	public void testMethod3() {
		System.out.println("i am in the test method 3");
	}

}
