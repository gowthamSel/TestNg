package org.alerts.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfermationAler {
	public static void main(String[] args) throws InterruptedException {
		//		confermationAlertACCEPT();
		confermationAlertDISMISS();
	}

	//this as an confermation alert
	//and it has two types of options are involved i.e., 1.accept and another one is 2.dismiss OR CANCEL
	//the bellow code is also shown
	public static void confermationAlertACCEPT() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		Thread.sleep(20);
		WebElement element=driver.findElement(By.xpath("//button[@id='confirmBox']")); 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		//		element.click();
		Alert confermationale=driver.switchTo().alert();
		String confMesage=confermationale.getText();
		System.out.println(confMesage);
		Thread.sleep(200);
		confermationale.accept();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());

	}

	//THIS METHOD IS USED FOR THE CANCEL THE ALERT
	//THE RESULT IS ALSO SHOWN IN THE CONSOLE OF THE ECLIPSE
	public static void confermationAlertDISMISS() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		Thread.sleep(20);
		WebElement element=driver.findElement(By.xpath("//button[@id='confirmBox']")); 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		//		element.click();
		Alert confermationale=driver.switchTo().alert();
		String confMesage=confermationale.getText();
		System.out.println(confMesage);
		Thread.sleep(200);
		confermationale.dismiss();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());

	}
}
