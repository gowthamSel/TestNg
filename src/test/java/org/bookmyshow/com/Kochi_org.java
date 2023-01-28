package org.bookmyshow.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kochi_org {
	public static void main(String[] args) throws AWTException, InterruptedException {
		launch();
	}

	public static void launch() throws AWTException, InterruptedException {
		Robot robo=new Robot();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Kochi']/../div/img")).click();
		Thread.sleep(3000);
		
		try {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
		}catch (Exception e) {
			System.out.println("scroll is not down");
			
		}
		driver.findElement(By.xpath("	//div[text()='Malayankunju']")).click();
	}


}
