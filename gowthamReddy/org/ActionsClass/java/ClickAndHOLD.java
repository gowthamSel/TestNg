package org.ActionsClass.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHOLD {

	public static void main(String[] args) throws InterruptedException { 
		dragandDROP();
	}
	public static  void dragandDROP() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020");

		driver.findElement(By.xpath("//a[text()=\"Click and Hold in Selenium\"]")).click();

		WebElement elemnt1=	driver.findElement(By.xpath("//li[text()=\"A\"]"));
		WebElement elemnt2=	driver.findElement(By.xpath("//li[text()=\"D\"]"));

		Actions action=new Actions(driver);
		action.moveToElement(elemnt1);
		action.clickAndHold();
		action.moveToElement(elemnt2);
		//action.release().perform();
		action.build().perform();
		
	}
}
