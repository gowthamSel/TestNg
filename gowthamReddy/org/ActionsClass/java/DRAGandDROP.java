package org.ActionsClass.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DRAGandDROP {

	public static void main(String[] args) {
		move();
	}

	//this method is used for the move the cursor into one place to another place 
	//and also we use drag the one element to another element 
	//use actions class only not use interface

	public static  void move() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020");

		driver.findElement(By.xpath("//a[text()=\"Drag and Drop\"]")).click();

		WebElement element1=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement element2=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));


		/**this isone process and another process is bellow shown*/
		
		  Actions action=new Actions(driver); action.moveToElement(element1).perform();
		  action.clickAndHold(element1).perform();
		  action.moveToElement(element2).perform(); action.build().perform();
		 

//		Actions action=new Actions(driver);
//		action.dragAndDrop(element1, element2);
//		action.build().perform();

	}
}
