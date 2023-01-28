package staleElementExceptinHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExcGenerete {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/stale%20exception%20handling.html");
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		
		for (WebElement eachlink:allLinks) {
			System.out.println(eachlink.getText());
			eachlink.click();
			driver.navigate().back();
			driver.navigate().forward();
		
		}
		
		
		

	}

}
