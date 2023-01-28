package org.pagefactorty.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverPage {

	WebDriver driver;
	Loginpage login;
	navigatePage home;


	@BeforeMethod
	public WebDriver launchApplication() { 
		String browser="chrome";
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";

		switch (browser.toLowerCase()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		return driver;
	}

	@AfterMethod
	public void name() {
		driver.close();
	}

	//	@Test  (priority = 0)    
	//	public void Testcase_001() throws InterruptedException { 
	//		//Thread.sleep(2000);
	//		login=new Loginpage(driver);
	//		login.loginMainPage("Admin", "admin123");
	//		home=new HomePage(driver);
	//		Thread.sleep(2000);
	//		home.clickOnPimButton();
	//
	//
	//	}
	//
	//	@Test
	//	public void testCase_002() {
	//		login=new Loginpage(driver);
	//		login.loginMainPage02("Admin", "admin123");
	//		home=new HomePage(driver);
	//		home.clickOnPIM();
	//
	//
	//	}

}
