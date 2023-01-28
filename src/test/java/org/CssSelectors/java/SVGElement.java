package org.CssSelectors.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SVGElement{
   public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.tutorialspoint.com/index.htm");
      // wait of 5 seconds
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // identify element, enter text
      WebElement m= driver.findElement(By.xpath ("//*[local-name()='svg' and @data-icon='home']/*[localname()='path']"));
      // Action class to move and click element
      Actions a = new Actions(driver);
      a.moveToElement(m).
      click().build().perform();
   }
}