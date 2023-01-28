package pageFactory.java;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test99GuruLoginWithPageFactory {

	WebDriver driver;

	Guru99Login objLogin;
	Guru99HomePage objHomePage; 

	@BeforeTest
	public void setup(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demo.guru99.com/V4/");
	}

	@Test(priority=0) 
	public void test_Home_Page_Appear_Correct(){
		objLogin = new Guru99Login(driver);
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		objLogin.loginToGuru99("mgr123", "mgr!23");
		objHomePage = new Guru99HomePage(driver);
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}

}