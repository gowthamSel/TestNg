package src.HRM.FRAMEWORK.JAVA;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static String path="E:\\eclipse_work_space\\TestNg\\common.qa.properties";
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileInputStream fis;


	public static void main(String[] args) throws IOException, InterruptedException { 
		setupBrowser();
		login("Admin", "admin123"); 
		NavigateToPIMAndCreate();
		name();
	}
	public static WebDriver setupBrowser() throws IOException {

		if(driver==null) {
			fis=new FileInputStream(path);
			prop.load(fis);
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get(prop.getProperty("url"));

			}else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get(prop.getProperty("url"));

			}else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get(prop.getProperty("url"));
			}

			if(driver!=null) {

			}else {
				return null;
			}
		}
		return driver;


	}

	public static void NavigateToPIMAndCreate() throws InterruptedException, IOException  {
		//		driversetUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		//		login("Admin","admin123");
		navigateTo();
		Thread.sleep(3000);
		ADDemployee("kalavathi12345abc", "kala2062809a");
		re_Login("kalavathi12345abc", "kala2062809a");

	}

	public static  void login(String username,String password) {
		WebElement elementOne =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementOne.sendKeys(username);
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementTwo.sendKeys(password);
		WebElement log =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		log.click();
		System.out.println("login is success");
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


	public static void re_Login(String username,String password) throws IOException, InterruptedException  {
//		WebDriver Driver =setupBrowser();
	
//		setupBrowser();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		WebElement elementOne =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementOne.sendKeys(username);
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementTwo.sendKeys(password);
		WebElement log =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		log.click();
	}
	public void ExitupBrowser() {
		driver.close();
		System.out.println("browser exit is successfull");
	}

	public static void name() throws IOException {
		WebDriver gettingDriver =setupBrowser();	
		System.out.println(gettingDriver);
		System.out.println(gettingDriver.getTitle());
	}



}
