package org.ActionsClass.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RiGHTclickandDOUBLEclick {


	public static void main(String[] args) {
		//rightClick();
		doubleClick();
	}

	//this method is for right-click
	public static void rightClick() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020");

		driver.findElement(By.xpath("//a[text()=\"Drag and Drop\"]")).click();
		WebElement element1=driver.findElement(By.xpath("//time"));

		Actions actions=new Actions(driver);
		actions.contextClick(element1).perform();
	}


	//this method is for double click
	public static void doubleClick() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020");

		driver.findElement(By.xpath("//a[text()=\"Drag and Drop\"]")).click();
		WebElement element1=driver.findElement(By.xpath("//time"));

		Actions actions=new Actions(driver);
		actions.doubleClick(element1).perform();
	}
}
