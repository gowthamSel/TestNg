package org.annotations.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {



	@Test
	public void method1() {
		System.err.println("this is method one");
	}
	@BeforeSuite
	public void method2() {
		System.err.println("this is method two");
	}
	@BeforeTest
	public void method3() {
		System.err.println("this is method three");
	}
	@BeforeClass
	public void method4() {
		System.err.println("this is method four");
	}
	@BeforeMethod
	public void method5() {
		System.err.println("this is method five");
	}
	@AfterSuite
	public void method6() {
		System.err.println("this is method six");
	}
	@AfterTest
	public void method7() {
		System.err.println("this is method seven");
	}
	@AfterClass
	public void method8() {
		System.err.println("this is method eight");
	}
	@AfterMethod
	public void method9() {
		System.err.println("this is method nine");
	}

}
