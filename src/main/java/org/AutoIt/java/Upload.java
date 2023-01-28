package org.AutoIt.java;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws InterruptedException, IOException {

		uploadfileAutoIt(); 

	}

	/**the auto it has mainly three methods are mostly important that is 
	 * 1.controlfous is the first method  it is used for the find the field 
	 * where you want to enter the text 
	 * 2.control-set-text is the second method that is used for the set the path of the file into the field 
	 * 3. control-click is the last one method it is used for the click the open button or click button on the window 
	 * this three are the most important methods in the auto it 
	 * */

	/**the main thing of the auto it is to develop the exe file of the script to automate the file upload
	 * 1.first thing is you want ot save the file of the script 
	 * 2. the second thing is to develop the exe file of the auto it
	 * 
	 *   to run the script of the auto it compulosry give the path of the exe file into the java script
	 *   i.e., the bellow script is shown how the path will be give to the java script
	 *   line number 54 is shown the script of the auto it 
	 * 
	 *   """Runtime.getRuntime().exec("D://autoit file upload.exe");""" */

	public static  void uploadfileAutoIt() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.get("https://easyupload.io/");
		driver.findElement(By.xpath("//div[@class='dz-default dz-message']")).click();
		Thread.sleep(1000);

		//https://easyupload.io/  https://xndev.com/display-image/	https://the-internet.herokuapp.com/upload js.executeScript("arguments[0].click();",element );


		//the exe file path will be allow forward slash only 
		/**this method will be execute the auto it exe file or auto it script */

		Runtime.getRuntime().exec("D:\\auto it files\\autoit file upload.exe");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gmr@206A");

		driver.findElement(By.xpath("//button[@id='upload']")).click();
		
	}

	
}
