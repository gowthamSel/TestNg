package findElemen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectClass {

	public static String valuetoselect="pilivendula";

	public static void main(String[] args) {
		String valuetoselect="HYdhrabad";

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/find%20elements.html");

		WebElement	element1=driver.findElement(By.tagName("select"));
		List<WebElement> allElements=element1.findElements(By.tagName("option"));

		int numberOfOptions=	allElements.size();

		for(int i=0;i<=numberOfOptions-1;i++) {

			String textOfOptin=	allElements.get(i).getText();
			if(textOfOptin.equalsIgnoreCase(valuetoselect)) {
				allElements.get(i).click();
			}
		}

	}

}
