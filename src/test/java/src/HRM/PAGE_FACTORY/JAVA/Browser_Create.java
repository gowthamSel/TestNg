package src.HRM.PAGE_FACTORY.JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Create {
	
	public static  WebDriver driver;

	public  static WebDriver open_browser(String browesr, String url) {

		switch (browesr.toLowerCase()) {
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
		default:
			throw new IllegalArgumentException("Unexpected value: " + browesr +"you give un-appropriate browser name ");
		}

		driver.get(url);
		return driver ;

	} 
	
	
	
	public static void NavigateToPIMAndCreate() throws InterruptedException  {
//		driversetUp("chrome", "https://opensource-demo.orangehrmlive.com/");
//		login("Admin","admin123");
		navigateTo();
		Thread.sleep(3000);
		ADDemployee("kalavathi12345678", "kala2062809");
		re_Login("kalavathi12345678", "kala2062809");

	}

	public static  void login(String username,String password) {
		WebElement elementOne =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementOne.sendKeys(username);
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementTwo.sendKeys(password);
		WebElement log =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		log.click();
	}

	public static  void navigateTo() {
		WebElement pim =driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b[text()='PIM']"));
		pim.click();
	}

	public static  void ADDemployee(String username,String password)  {
		WebElement addEmp=driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		addEmp.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("er12345678");
		WebElement middleName=driver.findElement(By.xpath("//input[@id='middleName']"));
		middleName.sendKeys("gowtham reddy12");
		WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("mps");		
		WebElement checkBox=driver.findElement(By.xpath("//input[@name='chkLogin']"));
		checkBox.click();

		WebElement userNmae=driver.findElement(By.xpath("//input[@id='user_name']"));
		userNmae.sendKeys(username);
		WebElement passWord=driver.findElement(By.xpath("//input[@id='user_password']"));
		passWord.sendKeys(password);

		WebElement re_passWord=driver.findElement(By.xpath("//input[@id='re_password']"));
		re_passWord.sendKeys(password);
		WebElement save=driver.findElement(By.xpath("//input[@id='btnSave']"));
		save.click();

		driver.quit();
	}

	public static void re_Login(String username,String password)  {
		open_browser("chrome", "https://opensource-demo.orangehrmlive.com/");
		WebElement elementOne =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementOne.sendKeys(username);
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementTwo.sendKeys(password);
		WebElement log =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		log.click();
	}
	
}
