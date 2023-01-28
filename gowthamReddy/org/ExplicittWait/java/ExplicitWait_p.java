package org.ExplicittWait.java;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_p {

	public static	WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html  ");

		//	WebElement element=	driver.findElement(By.xpath("//button[@id=\"alertBox\"]"));

		boolean elementexists=explictWaitForElement(By.xpath("//button[@id=\"alertBox\"]"), 20);
		System.out.println(elementexists);
	}


	//this method is used for the explicit wait 
	//the arguments of the method is By by and time outs and seconds
	public static boolean explictWaitForElement(By by ,int timeouts) {

		try {

			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
			return true;

		}catch (Exception e) {

			return false ;

		}
	}
}
