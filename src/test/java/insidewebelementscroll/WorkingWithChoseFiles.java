package insidewebelementscroll;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.map.ListOrderedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithChoseFiles {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement elem = driver.findElement(By.xpath("//input[@id='imagesrc']"));

		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("gowtham");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Reddy");
		WebElement elems = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		elems.sendKeys("d.no:2/132-A,pulivendula(v),thondur(m),ysr(D)");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gowthamreddy07@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		List<WebElement> boxes = driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/div/input"));

		for (WebElement each : boxes) {
			each.click();

		}
		driver.findElement(By.xpath("//div[@id='msdd']")).click();

		
		String[] LanguageToAdd = { "English", "Arabic", "Urdu" };
		SelectValueFromSeachDropDown(LanguageToAdd);
		Actions act = new Actions(driver);
		act.click().perform();
		Thread.sleep(3000);

		String[] drp= {"Select Skills","C++"};
		SelectValueFromSeachDropDown(drp);
		
		//		DropDown("Skills");
		//		DropDown("Unix");

		act.click().perform();
		
		//SelectvalueFromDropDwn("countries","Select Country");
		//SelectvalueFromDropDown("yearbox", "2009");
		SelectvalueFromDropDown("monthbox", "May");
		SelectvalueFromDropDown("daybox", "30");

		act.click().perform();
		DropDown("India");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//a[text()='Widgets']"));
		Actions actw = new Actions(driver);
		actw.moveToElement(we).perform();
		Weights("Slider");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame("aswift_2");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		driver.switchTo().defaultContent();

		WebElement e = driver.findElement(By.xpath("//div[@id='slider']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(300,0)", e);




	}

	public static void SelectValueFromSeachDropDown(String[] ValuesToSlect) {
		// ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li
		for (String ValueToSelect : ValuesToSlect) {
			boolean isvalueFound = false;
			//			driver.findElement(By.xpath("//div[@style ='min-height:30px;max-width:200px']")).click();
			List<WebElement> vals = driver
					.findElements(By.xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li/a"));
			for (WebElement val : vals) {
				String ValText = val.getText();
				System.out.println(ValText);
				if (ValText.equalsIgnoreCase(ValueToSelect)) {
					//				val.click();
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("arguments[0].click();", val);
					isvalueFound = true;

				}

			}
			if (!isvalueFound) {
				System.out.println("given value " + ValueToSelect + " is not found in the given list");

			}

		}

	}

	public static void SelectvalueFromDropDwn(String FieldName, String SelectElement) {
		WebElement ele = driver.findElement(By.xpath("//select[@id='" + FieldName + "']"));
		ele.click();
		List<WebElement> elems = driver.findElements(By.xpath("//select[@id='" + FieldName + "']/option"));
		for (WebElement elem : elems) {
			String elemtext = elem.getText();
			if (elemtext.contains(SelectElement)) {
				System.out.println(elemtext);
				elem.click();
				break;

			}

		}

	}

	public static void SelectvalueFromDropDown(String FieldValue, String Selectvalue) {
		driver.findElement(By.xpath("//select[@ng-model='" + FieldValue + "']")).click();
		List<WebElement> values = driver.findElements(By.xpath("//select[@ng-model='" + FieldValue + "']/option"));
		for (WebElement value : values) {
			String valueText = value.getText();
			if (valueText.equalsIgnoreCase(Selectvalue)) {
				System.out.println(Selectvalue);
				value.click();
				break;

			}

		}

	}

	public static void DropDown(String SelectOption) {
		driver.findElement(By.xpath("//b[@role='presentation']")).click();
		List<WebElement> opts = driver.findElements(By.xpath("//span[@class='select2-results']//li"));
		for (WebElement opt : opts) {
			String opttext = opt.getText();

			if (opttext.contains(SelectOption)) {
				System.out.println(opttext);
				opt.click();
				break;

			}

		}
		driver.findElement(By.xpath("//button[@id='Button1']")).click();

	}

	public static void chosefile() {
		WebElement file = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		Actions ats = new Actions(driver);
		ats.click(file).perform();
	}

	public static void Weights(String WtElement) {

		List<WebElement> wtelems = driver.findElements(By.xpath("//a[text()='Widgets']/..//li/a[text()=' Slider ']"));
		for (WebElement wtele : wtelems) {
			if (wtele.getText().contains(WtElement)) {
				System.out.println(wtele.getText());
				wtele.click();
				break;

			}

		}

	}

}

/*
 * driver.findElement(By.xpath("//div[@id='msdd']")).click(); List<WebElement>
 * vals = driver .findElements(By.
 * xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li/a"
 * )); for (WebElement val : vals) { String ValText = val.getText();
 * System.out.println(ValText); if (ValText.contains("English")) {
 * JavascriptExecutor jse = (JavascriptExecutor) driver;
 * jse.executeScript("arguments[0].click();", val); }
 * 
 * }
 */
// driver.findElement(By.xpath("//div[@style
// ='min-height:30px;max-width:200px']")).click();
// SelectValueFromDropDown("English");


//	JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(200,0);" );


//driver.quit();

/*
 * elem.
 * sendKeys("C:\\Users\\aravi\\Downloads\\WhatsApp Image 2022-07-27 at 8.39.49 PM"
 * ); Actions act = new Actions(driver); act.click(elem).perform();
 * 
 */
