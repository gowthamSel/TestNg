package org.ROBOTCLASS.java;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Enterkey {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
		Samplemethod();

	}	 

	//this method is used for press the keyboard keys 
	//the bellow syntaxes is shown how the robot class is used for the selenium
	public static  void Samplemethod() throws AWTException, InterruptedException { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	 
		driver.manage().window().maximize();
		//this implicit wait method is deprecated
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );


		// sample url	
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 	
		driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	


		// Robot class throws AWT Exception	
		Robot robot = new Robot();  
		Thread.sleep(2000); 

		// press arrow down key of keyboard to navigate and select Save radio button	
		robot.keyPress(KeyEvent.VK_DOWN);  
		robot.keyPress(KeyEvent.VK_DOWN);  
		robot.keyPress(KeyEvent.VK_DOWN);  
		robot.keyPress(KeyEvent.VK_DOWN);  
		// sleep has only been used to showcase each event separately
		Thread.sleep(2000);  	
		robot.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_ENTER);	

	}
}

