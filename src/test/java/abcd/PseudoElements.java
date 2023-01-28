package abcd;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseudoElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://www.hyrtutorials.com/p/css-selectors-practice.html");

//		driver.navigate().to("https://monica-official.github.io/Pseudo-Elements/sample-pseudo-element.html");

		// Maximize the browser
		driver.manage().window().maximize(); 

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String text = js.executeScript("return window.getComputedStyle(document.querySelector('.submitButton'),'::before').getPropertyValue('content')").toString();

		String text = js.executeScript("return window.getComputedStyle(document.querySelector('.container>a:nth-of-type(2)'),'::before').getPropertyValue('content')").toString();

		//return window.getComputedStyle(document.querySelector('.container>a:nth-of-type(2)'),'::after').getPropertyValue('content')
		System.err.print(text);

//		string script = "return window.getComputedStyle(document.querySelector('#ext-gen33'),':before')";
//		IJavaScriptExecutor js = (IJavaScriptExecutor) Session.Driver;
//		js.ExecuteScript("arguments[0].click(); ", script);

//		driver.quit();

	}

}