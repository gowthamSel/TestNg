package findElemen;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_1 {

	public static void main(String[] args) {
/*
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/find%20elements.html");

		List<WebElement>  element=driver.findElements(By.tagName("opt"));
		System.out.println(element.size());
*/
		indexout();
		
	}
	
	
	public static  void indexout() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/find%20elements.html");

		List<WebElement>  element=driver.findElements(By.tagName("option"));

		int listofelemnts =element.size();

		System.out.println(element.get(6));  



	}


}
