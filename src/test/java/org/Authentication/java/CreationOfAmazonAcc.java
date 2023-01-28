package org.Authentication.java;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreationOfAmazonAcc {

	// java.lang.IllegalStateException
	//exception is generated

	public static final String ACCOUNT_SID ="ACd82c70e2edfd0e5ea42c2f689a3a88dd";
	public static final String AUTH_TOKEN ="419e69b72097aeb5f4134d02ba2ba87e";


	public static void main(String[] args) {
		Create();
	}
	public static  void Create() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		Actions action=new Actions(driver);

		driver.get("https://www.amazon.in/");

		WebElement elemnt=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		elemnt.click();

		driver.findElement(By.xpath("//a[@id=\"createAccountSubmit\"]")).click();

		WebElement yourName=driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]"));
		yourName.sendKeys("gowtham reddy");

		WebElement countryCode=driver.findElement(By.xpath("//span[@class=\"a-dropdown-prompt\"]"));
		countryCode.click();

		List<WebElement> countryC0de1=driver.findElements(By.xpath("//li")); 

		for(WebElement all:countryC0de1) {

			String val=	all.getText();
			if(val.equalsIgnoreCase("United States +1")) {
				all.click();
			}
		}

		WebElement phoneNumber=driver.findElement(By.xpath("//input[@id=\"ap_phone_number\"]"));
		phoneNumber.sendKeys("2482137642");

		WebElement password=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		password.sendKeys("gmr@206A");

		WebElement continuee=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		continuee.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get the message from the twilio 
		Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
		String smsBody=getMessage();
		System.out.println(smsBody);


	}


	//get message from the twilio Account 
	public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
				.filter(m -> m.getTo().equals("+12482137642")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException :: new);
	}

	private static Stream<Message> getMessages() {
		ResourceSet<Message> message=Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(message.spliterator(),false);
	}

}
