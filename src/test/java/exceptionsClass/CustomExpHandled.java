package exceptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomExpHandled {

	public static void main(String[] args)    { 
	
		openBrows();
	}
	public static void openBrowse() throws ExceptError  {
		String browserString="hhgegedgg";
		WebDriver driver;
		switch (browserString.toString()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		default:
			throw new ExceptError("give proper name of the browser"   +browserString+"");
		}
	}
			
	public static void openBrows()   {
		String browserString="chrome";
		WebDriver driver;
		switch (browserString.toString()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		default:
			throw new ExceptError("give proper name of the browser"   +browserString+"");
		}
	
		
		
			
		
}

}
