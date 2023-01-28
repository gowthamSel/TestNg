package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {

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

	@Test(priority = 3)
	public void testMethod4() {
		System.out.println("i am in the test method 4");
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
