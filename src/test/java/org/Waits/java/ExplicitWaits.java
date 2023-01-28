package org.Waits.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static WebDriver driver;
	public static void main(String[] args) {

	}

	public static  WebElement getElement(By by,int timeOut) {
		WebElement element=null;
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			return element;
		} catch (Exception e) {
			return null;
		}		
	}

	public static  boolean isElementEnable(WebElement element,int timeOut) {
		
		try {
			//WebElement element=null;
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}		
	}


}
