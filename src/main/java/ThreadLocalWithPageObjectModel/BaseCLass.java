package ThreadLocalWithPageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCLass {

	private WebDriver driver;

	private static ThreadLocal<BaseCLass> BasethreadLocal = new ThreadLocal<>();

	public static void set(BaseCLass loginPage) {
		BasethreadLocal.set(loginPage);
	}

	public static BaseCLass get() {
		return BasethreadLocal.get();
	}


	public void tearUp(String browser,String url) {

		browser=(browser==null)?"chrome":browser;
		switch (browser.toLowerCase()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge": 
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}



}
