package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	
	public static WebDriver driver;

	@Test
	public static void screenshots()   {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			File destini =new File("E:\\take screen shots\\1.png");
			FileUtils.moveFile(source, destini);

		} catch (IOException e) {
			System.out.println("handle exception"); 
		}
	}

	
	
	
}



