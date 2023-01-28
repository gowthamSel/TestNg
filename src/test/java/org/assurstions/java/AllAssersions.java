package org.assurstions.java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AllAssersions {

	public static void main(String[] args) {
		assersionsInMethods();
	}
	public static  void assersionsInMethods() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
		username.sendKeys("stalin");
		WebElement password = driver.findElement(By.cssSelector("input[id='pass']"));
		password.sendKeys("ajhdjha");
		password.sendKeys(Keys.ENTER);


		//font assersions

		String actualfontSize="6px";
		String expectedBoarderr="" ;
		WebElement expectedfontSize = driver.findElement(By.cssSelector("input[id='email']"));
		System.err.println("gowtham reddy");
		//System.err.println(ExpectedConditions.stalenessOf(expectedBoarder));

		//ExpectedConditions.stalenessOf(expectedBoarder) == null [it will be return the value size if the page is refresh]
		boolean   string= ExpectedConditions.stalenessOf(expectedfontSize).apply(driver);
		System.err.println(string);

		if (ExpectedConditions.stalenessOf(expectedfontSize).apply(driver)) {
			expectedfontSize =	driver.findElement(By.cssSelector("input[id='email']"));//.getCssValue("border");
		}
		System.err.println("gowtham reddy");
		System.err.println(expectedfontSize); 
		System.err.println(expectedfontSize.getCssValue("border-radius"));	
		Assert.assertEquals(actualfontSize, expectedfontSize.getCssValue("border-radius"),"the given fontSize is mis_matched");


		//error message asserstions

		String errorMessage="The password that you've entered is incorrect. ";
		String errorMessage2="Forgotten password?";
		String actualMessage=driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
		System.err.println(actualMessage);
		String exceptedMessage=errorMessage+errorMessage2;
		Assert.assertEquals(actualMessage, exceptedMessage,"the error message is mis_matched");
		driver.close();
	}
}
