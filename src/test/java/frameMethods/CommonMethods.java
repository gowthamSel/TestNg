package frameMethods;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	public static WebDriver driver;
	public static String getTimevalue=getTimeStamp();
	
	public static void main(String[] args) {

		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/" , "orange");
		WebElement element =getelement(By.xpath("//input[@id='txtUsername']"));
		System.out.println(element);

	}

	public static   boolean checkElementExists(By by) {

		try {
			driver.findElement(by);
			return true ;

		}catch (NoSuchElementException e) {

			return false ;
		}
	}

	public static  WebElement getelement(By by) {

		try {
			return  driver.findElement(by);

		} catch (NullPointerException e) {
			return null;
		}
	}

	public static void selectCheckbox(By by) {

		WebElement elem =getelement(by);
		if(elem!=null) {
			if (elem.isDisplayed() && elem.isEnabled()) {

				if( ! elem.isSelected()) {
					elem.click();
				}else {
					System.out.println("the element is all ready clicking");
				}

			}else {
				System.out.println("the "+elem+"is not clicking");
			}
		}else {
			System.out.println("the clickElement value is null");
		}
	}

	public static  void enterValue(By by, String value) {

		WebElement elem=getelement(by);
		if(elem!=null) {
			if (elem.isDisplayed() && elem.isEnabled()) {

				elem.sendKeys(value);
			}else {
				System.out.println("we dont send the keys because of the field is disabled");
			}
		}else {
			System.out.println("the enterValue elem  is null");
		}
	}

	public static  void selectValue(By by ,String value) {

		WebElement elem=getelement(by);
		Select sel=new Select(elem);

		if(elem!=null) {
			if (elem.isDisplayed() && elem.isEnabled()) {
				//sel.deselectAll();
				sel.selectByVisibleText(value);
			}else {
				System.out.println("the "+elem+"is not selecting");
			}
		}else {
			System.out.println("the enterValue elem  is null");
		}

	}

	public static  void launchApplication(String browserName ,String URl,String title) {


		switch (browserName.toLowerCase()){
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
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
			break;


		default:
			throw new IllegalArgumentException("Unexpected value: " + browserName.toLowerCase());
		}

		driver.get(URl);
		String value= driver.getTitle();
		if(value.toLowerCase().contains(title.toLowerCase())){
			System.out.println("the URL is correct");
		}else {
			System.out.println("the URL is wrong");
		} 
	}

	public static   String getTimeStamp() {

		java.util.Date currentDate = new java.util.Date();

		Calendar calendar =Calendar.getInstance();
		calendar.setTime(currentDate);

		int currentdate =calendar.get(calendar.DAY_OF_MONTH);
		int currentweek =calendar.get(calendar.DAY_OF_WEEK);
		int currentMonth =calendar.get(calendar.MONTH);
		int currentYear =calendar.get(calendar.YEAR);
		int currentHour =calendar.get(calendar.HOUR);
		int currentMint =calendar.get(calendar.MINUTE);
		int currentSec =calendar.get(calendar.SECOND);

		return ""+currentdate+currentweek+currentMonth+ currentYear+currentHour+currentMint+currentSec ;

	}

	public static  void click(By by) {

		WebElement element =getelement(by);

		if(element!=null) {

			element.click();

		}else {
			System.out.println("the given element  is null");
		}
	}

	public static  void takeScreenPic() {


		try {

			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			File destini =new File("D:\\JAVA SELENIUM VIDEOS\\automatic screen shots\\"+getTimevalue+".png");
			FileUtils.moveFile(source, destini);

		} catch (IOException e) {
			System.out.println("handle exception"); 
		}

	}














}








