package web.notification.classs;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBasedTerminateNotification {

	public static void main(String[] args) throws InterruptedException {
		disableALL();

	}
	public static  void disableALL() throws InterruptedException {
		
		/**this method is used for it will ask every time see the notification
		 *because of the we will give the 0 as the input 
		 *give 1 it will bve allow
		 *give 2 it will be block the notification
		 *disable-nitification meanse it will disable the all the notificatins*/


		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification"); 

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		Thread.sleep(6000);
		
	}

}
