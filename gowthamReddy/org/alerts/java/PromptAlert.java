package org.alerts.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		//promptalertaccept();
		promptalertdismiss();
	}

	//in this types of alerts they are thrww types of keys are available
	//one is accept ,dismiss and last one is sendkeys to the alert 
	//this method is for accept and send the some value into the alert
	public static void promptalertaccept() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 


		WebElement eleme=driver.findElement(By.xpath("//button[@id='promptBox']")); 
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", eleme);
		Alert prmptale=driver.switchTo().alert();
		String prmptMesage=prmptale.getText();
		System.out.println(prmptMesage);
		Thread.sleep(200);
		prmptale.sendKeys("i am gowtham reddy");
		prmptale.accept();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());
	}
	
	public static void promptalertdismiss() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 


		WebElement eleme=driver.findElement(By.xpath("//button[@id='promptBox']")); 
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", eleme);
		Alert prmptale=driver.switchTo().alert();
		String prmptMesage=prmptale.getText();
		System.out.println(prmptMesage);
		Thread.sleep(200);
		//	prmptale.sendKeys("i am gowtham reddy");
		prmptale.dismiss();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());


	}

}
