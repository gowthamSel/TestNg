package alerts_P;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String subfolder;

	@BeforeTest
	public static  void SetUp() {
		WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.http.factory", "apache");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		//tdriver.set(driver);
	}

	public static WebDriver getdriver() {
		return driver;
	}

	@AfterTest
	public static void  close () {
		driver.close();

	}
	//E:\eclipse_work_space\TestNg\ScreenShots\automatic screen shots



	public  static void captureScreenShot(String name) throws IOException { 
		if(subfolder==null) {
			String subfolder="Screen"+getTimeStampCurretDATE();
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destini =new File("E:\\eclipse_work_space\\TestNg\\ScreenShots\\automatic screen shots\\"+ subfolder+"\\"+name);
		FileUtils.moveFile(source, destini);

	}


	public static  String getTimeStampCurretDATE() {  

		//it will take a current date of your system
		//and set to the calender
		Date currentDate=new Date();
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(currentDate);

		int year=calendar.get(calendar.WEEK_OF_YEAR);
		int date=calendar.get(calendar.DATE);
		int hour=calendar.get(calendar.HOUR);
		int mint=calendar.get(calendar.MINUTE);
		int sec=calendar.get(calendar.SECOND);
		int millis=calendar.get(calendar.MILLISECOND);
		int hourofday=calendar.get(calendar.HOUR_OF_DAY);

		//System.out.println(""+year+date+hour+mint+sec+hourofday+millis);
		return ""+millis+hourofday+date+hour+mint+sec+year;
	}
}
