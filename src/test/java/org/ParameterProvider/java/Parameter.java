package org.ParameterProvider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {

//	public static void main(String[] args) {
//		loginPageOfHrm("Admin", "admin123");
//	}
	
	@Parameters({"username","password"})
	@Test
	public static  void loginPageOfHrm(String username,String password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();

		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();

		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();



		driver.close();
	}
}
