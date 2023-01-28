package alerts_P;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test {

	public static	WebDriver driver;
		
	@BeforeClass
	public static  void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}


	@org.testng.annotations.Test 
	public static  void sampleAler() throws InterruptedException {
		

		WebElement elementOne =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		elementOne.sendKeys("admin");
		WebElement elementTwo =	driver.findElement(By.xpath("//input[@placeholder='Password']"));
		elementTwo.sendKeys("admin123");
		WebElement log =driver.findElement(By.xpath("//button"));
		log.click();
		String title=	driver.getTitle();
		assertEquals(title, "OrangeHRM");
		
		
	}

	@AfterClass
	public static void quit() {
		driver.quit();
	}
}

