package insidewebelementscroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///D:/html/selenium%20%20html%20class/frames/textfileds.html");
	
	//we move the first field value into the second field
	  WebElement field1 = driver.findElement(By.id("field1"));
	   WebElement field2 = driver.findElement(By.id("field2"));
	   field1.click();
	   Actions act = new Actions(driver);
	    
	   act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	   Thread.sleep(800);
	   act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	   Thread.sleep(800);
	   field2.click();
	   act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	  
	   
	   
	   
	}

}
