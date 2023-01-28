package selectDropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByAllValues {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/multiple%20select%20drop%20down%20boxes.html");


		WebElement elem=driver.findElement(By.id("hgcbxwhv"));

		Select sel=new Select(elem);

		String[] allValuesToSelect= {"india","australia","pak","afg","himalayas","dudkasi",};


		try {
			for(String vals:allValuesToSelect) {
				sel.selectByVisibleText(vals);
			}
		}catch(NoSuchElementException e) {
			System.out.println("in this drop down box the value is not there ");

		}
	}


}
