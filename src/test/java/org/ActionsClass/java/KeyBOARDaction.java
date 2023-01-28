package org.ActionsClass.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBOARDaction {

	
	/**move the mouse cursor to an elemnt
	 * copy and paste
	 * click and hold
	 * right click
	 * double click
	 * drag and drop*/
	public static void main(String[] args) throws InterruptedException {
		COPYANDPASTE();
	}
	
	
	public static  void COPYANDPASTE() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://lingojam.com/FancyTextGenerator");


		WebElement fieldone = driver.findElement(By.xpath("//textarea[@id='english-text']"));
		WebElement fieldtwo = driver.findElement(By.xpath("//textarea[@id='ghetto-text']"));
		fieldone.click();
		fieldone.sendKeys("jkhikigwfqwhbfjh");
		Thread.sleep(100);
		
		Actions act = new Actions(driver);
		fieldone.click();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		fieldtwo.click();
		Thread.sleep(100);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
	}
}
