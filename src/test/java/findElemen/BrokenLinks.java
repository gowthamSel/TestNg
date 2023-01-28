package findElemen;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/JAVA%20SELENIUM%20VIDEOS/NOTEPAD++/brokem%20links.html");

		List<WebElement>  allLinks=driver.findElements(By.tagName("a"));

		int sizeOfTheLinks =   allLinks.size(); 

		System.out.println(sizeOfTheLinks); 
		for(int i=0 ; i<=sizeOfTheLinks-1;i++) {

			String link1=allLinks.get(i).getAttribute("href");
			System.out.println(link1); 
			try {
				URL brokenUrls=new URL(link1);

				HttpURLConnection httpUrlServer =(HttpURLConnection)brokenUrls.openConnection();

				httpUrlServer.connect();

				int respondsCode=httpUrlServer.getResponseCode();
				System.out.println(respondsCode);

				if (respondsCode>=400) {

					System.out.println(httpUrlServer.getResponseMessage());
					System.out.println("the links are not properly working or design");

				}else {
					System.out.println("the links are working");
				}  
			}catch (Exception e) {
				System.out.println("this is not a links ");
			}
		}
	}
}
