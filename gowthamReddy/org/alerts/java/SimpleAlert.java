package org.alerts.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		simplealert();
	}
	
	public static  void simplealert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 
		
		
		//this is a simple-alert
		//simple alert has only one option is there i.e., accept 
		//the bellow code is also shown
		
		Thread.sleep(20);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click(); 
		Alert simpleale=driver.switchTo().alert();
		String simpMesage=simpleale.getText();
		System.out.println(simpMesage);
		Thread.sleep(20);
		simpleale.accept();
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());


	}
}
