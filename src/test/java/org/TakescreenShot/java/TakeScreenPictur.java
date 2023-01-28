package org.TakescreenShot.java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenPictur {


	public static void main(String[] args) throws InterruptedException {
		//getTimeStampCurrentDATE();
		takeScreenShot();

	}

	/**System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));

	 *this all above the syntaxes are used for the getting the infermation
	 * about the system /

	/**this method is used for the get the time stamp 
	 *it will be used of the give the name of the screen shots 
	 * because of the same namew is given to thescreen shot it will not be stored 
	 * thrown the exception 
	 * @return 
	 * @return */

	public static  String getTimeStampCurrentDATE() {  

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
		return ""+year+date+hour+mint+sec+hourofday+millis;
	}


	//E:\eclipse_work_space\TestNg\ScreenShots\automatic screen shots  [path]

	/**this method takes the screen shot and save the drive-e path or
	 *  same project folder i.e., testNG prg */

	public static void takeScreenShot()  { 

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");

		String filename=getTimeStampCurrentDATE();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			File destini =new File("E:\\eclipse_work_space\\TestNg\\ScreenShots\\automatic screen shots\\"+filename+".png");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			FileUtils.moveFile(source, destini);
			System.out.println("screen shot taken");
		} catch (IOException e) {
			System.out.println(" exception generated"); 
		}

	}
}
