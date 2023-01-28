package abcd;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromXml {

//	public static String readXmlData(String data) throws ParserConfigurationException, SAXException, IOException {
//		File file = new File("E:\\eclipse_work_space\\TestNg\\ObjectRepositary.xml");
//		DocumentBuilderFactory Df = DocumentBuilderFactory.newInstance();
//		DocumentBuilder Db = Df.newDocumentBuilder();
//		Document document = Db.parse(file);
//		NodeList list = document.getElementsByTagName("locator");
//		Node node1 = list.item(0);
//		Element ele = (Element) node1;
//		return ele.getElementsByTagName(data).item(0).getTextContent();
//	}

//	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.google.com");
//		driver.findElement(By.xpath(readXmlData("gmail"))).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath(readXmlData("image"))).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath(readXmlData("search"))).sendKeys("Selenium", Keys.ENTER);
//	}
}