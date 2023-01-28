package org.CssSelectors.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssByTagNameAndAttribute {
	public static WebDriver driver;
	public static	JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
//		byTagnameAndAttribute();
		byTagnameAndAttributrWithValue();
	}

	public static void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/#");

		js=(JavascriptExecutor)driver;
		Actions actions =new Actions(driver);
		WebElement element=	driver.findElement(By.xpath("(//div//a[@href='#'])[4]"));
		actions.moveToElement(element).build().perform();
		Thread.sleep(2000);


	}

	public static  void byTagnameAndAttribute() throws InterruptedException { 
		setup();
		System.err.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement>  elementss =driver.findElements(By.cssSelector("input[class]"));
		System.err.println(elementss);
		System.err.println("printing");
	}


	public static  void byTagnameAndAttributrWithValue() throws InterruptedException {
		setup();
		System.err.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement>  elementss =driver.findElements(By.cssSelector("input[id='firstName']"));
		System.err.println(elementss);
		System.err.println("printing");
	}

}
