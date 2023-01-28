package org.pagefactorty.java;

import org.testng.annotations.Test;

public class TestCaseAtOnePlace extends DriverPage{
	Loginpage login;
	navigatePage home;
	
	@Test
	public void testcase_0001() {
		login=new Loginpage(driver);
		login.loginMainPage("Admin", "admin123");
		home=new navigatePage(driver);
		home.clickOnPIM();
	}


}
