package workingWithXml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterClass {

	@Parameters("argument")
	@Test
	public  static void  openBrowser(String browser) {

		WebDriver driver ;

		switch (browser.toLowerCase()){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;

		default:
			throw new IllegalArgumentException("this is not a browser value: " + browser.toLowerCase());
		}

	}



	@Parameters("val")
	@Test
	public static void addNumber(int a) {
		int b =22;
		int c=10;
		int d =(a+b)*c;
		System.out.println(d);
	}


}
