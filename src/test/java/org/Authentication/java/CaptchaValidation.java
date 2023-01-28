package org.Authentication.java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CaptchaValidation {


	public   static void main(String[] args) throws IOException, TesseractException, InterruptedException {

		CaptchValid("sample");
	}
	public static void CaptchValid(String imageNmae) throws IOException, TesseractException, InterruptedException {
		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("notifications", 2);
		conentSettings.put("geolocation", 2); 
		conentSettings.put("media_stream", 2);
		profile.put("managed_default_content_settings", conentSettings); 
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" LOGIN \"]")).click();

		Thread.sleep(2000);
		File source=driver.findElement(By.xpath("(//img[@border=\"0\"])[2]")).getScreenshotAs(OutputType.FILE);

		String path=System.getProperty("user.dir")+"\\ScreenShots\\CaptchaImages\\"+imageNmae+".png";
		System.out.println(path);

		File Destini =new File(path);
		String absouletepath=Destini.getAbsolutePath();
		FileUtils.moveFile(source, Destini);
		
		Thread.sleep(2000);
		ITesseract image=new Tesseract();
		String text=image.doOCR(Destini);
	
		//		try {
		//			File Destini =new File(path);
		//			ITesseract image=new Tesseract();
		//			FileUtils.moveFile(source, Destini);
		//			String result = image.doOCR(Destini);
		//			System.out.println(result);
		//		} catch (Exception e) {
		//			e.printStackTrace();
		//		}   

		System.out.println(text);
	}
}
