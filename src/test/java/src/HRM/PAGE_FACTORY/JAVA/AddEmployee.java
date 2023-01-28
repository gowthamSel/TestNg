package src.HRM.PAGE_FACTORY.JAVA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddEmployee {

	public static WebDriver driver;

	public static void NavigateToPIMAndCreate()  {
		driversetUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		login("Admin","admin123");
		navigateTo();
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
		driversetUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		WebElement elementOne =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		elementOne.sendKeys(username);
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		elementTwo.sendKeys(password);
		WebElement log =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		log.click();
	}
	
	public static  void driversetUp(String browser,String url) {


		switch (browser.toLowerCase()) {
		case "chrome": 
			System.setProperty("webdriver.chrome.driver","E:\\excutable_files\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get(url);
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver","E:\\excutable_files\\msedgedriver.exe");
			driver =new EdgeDriver();
			driver.get(url);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);


		}
	}

}




