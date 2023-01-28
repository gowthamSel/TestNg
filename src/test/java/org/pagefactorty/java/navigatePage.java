package org.pagefactorty.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class navigatePage {

	WebDriver driver;

	@FindBy(xpath="(//a[contains(@class,'oxd')])[3]")
	WebElement PIM;

	
	public  void clickOnPIM() {
		PIM.click();
	}

	public void clickOnPimButton() {
		this.clickOnPIM();
	}
	
	public navigatePage(WebDriver Driver) {
		this.driver=Driver;
		PageFactory.initElements(Driver, this);
	}
}
