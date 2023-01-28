package findElemen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/find%20elements.html");
				
	   

		 WebElement	element1=driver.findElement(By.tagName("span"));
		System.out.println( element1.getSize());


	}
	
	}
