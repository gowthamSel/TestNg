package org.pagefactorty.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver Driver) {
		this.driver=Driver;
		PageFactory.initElements(Driver, this);
	}

	@FindBy(xpath ="//input[@name='username']")
	WebElement txtuserName;


	@FindBy(xpath = "//input[@type='password']")
	WebElement txtpassWord;

	@FindBy(xpath = "//button")
	WebElement btnLogin;


	public void enterUserName(String userName) {
		txtuserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		txtpassWord.sendKeys(password);
	}

	public void clickOnLogin() {
		btnLogin.click();;
	}


	public  void loginMainPage(String username ,String password) {
		this.enterUserName(username);
		this.enterPassword(password);
		this.clickOnLogin();
	}
	
//	public  void loginMainPage02(String username ,String password) {
//		
//		txtuserName.sendKeys(username);
//		txtpassWord.sendKeys(password);
//		btnLogin.click();
//
//	}
	
}
