package alerts_P;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsClas {


	public static void main(String[] args) throws InterruptedException {
		alertMethod();
	}
	
	
	public static void alertMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 


//		//	simple alert acceptance
//
		/* this is a simple alert and  this alert has only perform one action 
		 * that is positive action (OK) and there is no cancel action perform on it */

		Thread.sleep(20);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click(); 
		Alert simpleale=driver.switchTo().alert();
		String simpMesage=simpleale.getText();
		System.out.println(simpMesage);
		Thread.sleep(20);
		simpleale.accept();
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());


//		//confermation  alert

//		/*  in this action has there is two actions are involved
//		 *  i.e., OK and cancel actions and we perform two actions on it cancel and OK 
//		 *  1.alert.accept 2.alert.dismiss  */
		
		
		Thread.sleep(20);
		WebElement element=driver.findElement(By.xpath("//button[@id='confirmBox']")); 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		Alert confermationale=driver.switchTo().alert();
		String confMesage=confermationale.getText();
		System.out.println(confMesage);
		Thread.sleep(200);
		confermationale.accept();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());

		
		

//		//prompt alert
//
//		/*  in this alert we perform two actions positive and negative  
//		 * and also send some information to the alert 
//		 * i.e.,  alert.sendkeys("jhgagck"); */

		
		
		WebElement eleme=driver.findElement(By.xpath("//button[@id='promptBox']")); 
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", eleme);
		Alert prmptale=driver.switchTo().alert();
		String prmptMesage=prmptale.getText();
		System.out.println(prmptMesage);
		Thread.sleep(200);
		prmptale.sendKeys("i am gowtham reddy");
		prmptale.accept();
		Thread.sleep(200);
		System.out.println(driver.findElement(By.xpath("//b[text()='Popup box output']/parent::div")).getText());

		driver.quit();

	}
}
