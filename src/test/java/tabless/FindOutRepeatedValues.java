package tabless ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindOutRepeatedValues {
	@Test(priority = 1)
	public static void repeatValueFindOut() {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/tables%20withou%20fileinput.html");
		System.out.println(driver.getTitle());
		String valueTofindOut="gowtham";
		WebElement element=driver.findElement(By.tagName("table"));
		List<WebElement> allRows =element.findElements(By.tagName("tr"));
		int allRowsSize=allRows.size();
		System.out.println(allRowsSize); 
		for(int i=0;i<=allRowsSize-1;i++) {
			WebElement row=allRows.get(i);
			List<WebElement> allCellsInTheRow=row.findElements(By.tagName("td"));
			int totalCells=allCellsInTheRow.size();
			//System.out.println(totalCells); 

			for(int j=0;j<=allCellsInTheRow.size()-1;j++) {
				String cellvalue=allCellsInTheRow.get(j).getText();
				if(cellvalue.equalsIgnoreCase(valueTofindOut)) {
					System.out.println(i+"  "+j);
				}
			}
		}
	}

}
