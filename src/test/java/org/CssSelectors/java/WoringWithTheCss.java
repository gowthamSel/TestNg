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

public class WoringWithTheCss {


	public static WebDriver driver;
	public static	JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException { 
		//setup();

		//		CssValueBytagNmae();
		//		CssValueById();
		CssValueById();
		//		CssValueByAllElements();

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

	public  static void CssValueBytagNmae() throws InterruptedException {
		setup();
		System.out.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement> element=	driver.findElements(By.cssSelector("input"));
		System.out.println(element);

	}


	public static void CssValueById() throws InterruptedException {
		setup();
		System.out.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement>  elements 	=driver.findElements(By.cssSelector("#firstName"));
		System.out.println(elements);
	}


	public  static void CssValueByClassName() throws InterruptedException {
		setup();
		System.out.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement>  elementss =driver.findElements(By.cssSelector(".name"));
		System.out.println(elementss);
	}


	public static void CssValueByAllElements() throws InterruptedException {
		setup();
		System.out.println("this is css selector");
		driver.findElement(By.xpath("//a[text()='CSS Selectors Practice']")).click();

		js.executeScript("window.scrollBy(0,200);");
		List<WebElement>  elementss =driver.findElements(By.cssSelector("//*"));
		System.out.println(elementss);
	}


}
