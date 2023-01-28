package org.javaScript.java;

import org.RECORDING.java.ScreenRecorderUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysByJs {

	public static	WebDriver driver;
	public static	JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		//		findJSElementAndConvToWebElement("gowthamreddy");
		//		valueGivenByJS();
		//		FindAllElementsAndGiveValuebyJS();
		//changeBoarderANDBackgroundWithSolid();
		changeBoarderANDBackgroundWithDotted();
	}

	/**to entered the value into the element by the use of the java script executer 
	 * and the java script executer is converted into webelement and after give the value 
	 * in this method */
	public static  void findJSElementAndConvToWebElement(String value) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		js=(JavascriptExecutor)driver;

		WebElement element=(WebElement)js.executeScript("return document.getElementById('email');");
		element.sendKeys(value);
		System.out.println("value is entered ");
	}



	/**this is another method for the gove the value into the web element 
	 * the bellow code id shown how they give  **/
	public static  void valueGivenByJS() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		js=(JavascriptExecutor)driver;

		js.executeScript("document.getElementById('email').value='gowtham';");

	}




	public static  void FindAllElementsAndGiveValuebyJS() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		js=(JavascriptExecutor)driver;

		// document.getElementById('email');
		// document.getElementsByName('pass');

		js.executeScript("document.getElementById('email').value='gowtham';");
		js.executeScript("document.getElementById('pass').value='reddy';");

	}



	// the border is solid and we compulsory give[0] because of they found multiple elements
	//if multiple elements found give the index number compulsory else not required
	public static void changeBoarderANDBackgroundWithSolid() {


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		js=(JavascriptExecutor)driver;

		//document.getElementById('email').style.background='red';  background
		// document.getElementsByName('pass')[0].style.border='5px blue solid';  border

		//this is for the back ground
		js.executeScript("document.getElementById('email').style.background='red';");
		//this is for the boarder
		js.executeScript("document.getElementsByName('pass')[0].style.border='5px blue solid';");
	}


	//boarder is dotted
	public static void changeBoarderANDBackgroundWithDotted() throws InterruptedException {

		try {
			ScreenRecorderUtil.startRecord("changeBoarderANDBackgroundWithSolid");
		} catch (Exception e) {

		}

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		//document.getElementById('email').style.background='red';  background
		// document.getElementsByName('pass')[0].style.border='5px blue solid';  border

		//this is for the back ground
		js.executeScript("document.getElementById('email').style.background='red';");
		Thread.sleep(5000);
		//this is for the boarder
		js.executeScript("document.getElementsByName('pass')[0].style.border='5px blue dotted';");

		Thread.sleep(5000);
		try {
			ScreenRecorderUtil.stopRecord();
		} catch (Exception e) {

		}

	}


}
