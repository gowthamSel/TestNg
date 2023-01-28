package org.listeners.sel;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.netty.channel.unix.Socket;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners(ItestListenerClass.class)
public class TestCases extends BaseClass {

		
	@Description("enter the values into the fields")
	@Test (testName = "orangeHRM" ,description="enter the values into the fields ")
	@Story("to give the values")
	@Severity(SeverityLevel.NORMAL)
	public static  void orangeHRM() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement elementOne =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		elementOne.sendKeys("admin");
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@placeholder='Password']"));
		elementTwo.sendKeys("admin123");
		WebElement log =driver.findElement(By.xpath("//button"));
		log.click();
		String title=	driver.getTitle();
		assertEquals(title, "OrangeHR");
	}
	
	
}
