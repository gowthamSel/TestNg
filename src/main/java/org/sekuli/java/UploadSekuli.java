package org.sekuli.java;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadSekuli {


	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		uploadfileBySikuli(); 
	}
	public static  void uploadfileBySikuli() throws InterruptedException, IOException, FindFailed {


//		WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
//		//driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//
//		driver.get("https://easyupload.io/");
//		driver.findElement(By.xpath("//div[@class='dz-default dz-message']")).click();
//		Thread.sleep(1000);
//

//		Thread.sleep(10000);
		Screen screen=new Screen();

		Pattern fileUpload=new  Pattern("E:\\sikuli\\images\\FileUpload.png");
		Pattern openclickField=new Pattern("E:\\sikuli\\images\\OpenButton.png");

		screen.wait(fileUpload, 20);
		screen.type(fileUpload, "D:\\JAVA SELENIUM VIDEOS\\10.class books\\5.EXCEPTIONS.docx");
//		screen.click(openclickField);
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gmr@206A");
//		driver.findElement(By.xpath("//button[@id='upload']")).click();

	}
}
