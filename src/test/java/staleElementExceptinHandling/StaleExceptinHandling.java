package staleElementExceptinHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleExceptinHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver  driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/stale%20exception%20handling.html");
		System.out.println(driver.getTitle());
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		int size =allLinks.size();

		for (int i=0;i<=size-1;i++) {

			List<WebElement> newAllLinks =driver.findElements(By.tagName("a"));
			System.out.println(newAllLinks.get(i).getText());
			Thread.sleep(5000);
			newAllLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());	
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);

		}
	}

}
