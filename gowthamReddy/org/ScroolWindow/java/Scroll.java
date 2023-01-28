package org.ScroolWindow.java;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException { 
		Scroll_y_Axis();
		//scr_y_axis();

	}

	/**the bellow method is shown it has two functions are developed 
	 * one is notification is disabled 
	 * another one is scroll down by the window [for down to high use +numerics values on the js.exe
	 * by using java scriot executor*/

	public static  void Scroll_y_Axis() throws InterruptedException {

		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("--incognito", 1);
		conentSettings.put("cookies",2);
		conentSettings.put("profile.default_content_setting_values.cookies", 2);
		conentSettings.put("notifications", 1);
		conentSettings.put("geolocation", 1); 
		conentSettings.put("media_stream", 1);
		profile.put("managed_default_content_settings", conentSettings); 
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("https://www.yatra.com/"); 
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500);");


	}

	public static void scr_y_axis() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//URL launch
		driver.get("https://www.tutorialspoint.com/index.htm");
		// scroll down by 500 pixels with Javascript Executor
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// scroll down up 500 pixels with Javascript Executor
		j.executeScript("window.scrollBy(0,-500)");
		// identify element

		WebElement n = driver.findElement(By.tagName("h4"));
		String r = n.getText();
		System.out.println("Text obtained on scrolling up: "+ r);

	}


}
