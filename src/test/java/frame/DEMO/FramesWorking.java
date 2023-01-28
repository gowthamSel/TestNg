//package frame.DEMO;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.w3c.dom.*;
////import org.w3c.dom.Element;
////import org.w3c.dom.Node;
////import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class FramesWorking {
//
//
//	public static void main(String[] args) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
//		sigleFrame();
//	}
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
//	public static void sigleFrame() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		String url="https://www.hyrtutorials.com/p/frames-practice.html";
//		driver.get(url);
//
//		//		String xpathForInput="//input[@id='name']"; 
//		driver.findElement(By.xpath(readXmlData("xpathForInput"))).sendKeys("i am gowtham reddy");
//		System.out.println("is working");
//
//		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frm1']"));
//		try {
//			driver.switchTo().frame(frame);
//			System.out.println("frame is switched");
//		} catch (Exception e) {
//			System.out.println("frame is not switched");
//		}
//
//		WebElement course=driver.findElement(By.xpath("//select[@id='course']"));
//		Select select=new Select(course);
//
//		Thread.sleep(3000);
//		try {
//			select.selectByVisibleText("Java");
//			System.out.println("value is selected");
//		} catch (Exception e) {
//			System.out.println("value is not selected");
//		}
//
//		driver.switchTo().parentFrame();
//
//		try {
//			WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frm2']"));
//			driver.switchTo().frame(frame2); 
//			System.out.println("frame is switched");
//		}catch (Exception e) {
//			System.out.println("frame is not-switched");
//		}
//
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gmr.mps@gmail.com");
//		try {
//			driver.switchTo().parentFrame();
//			System.out.println("switch to parent frame");
//		}catch (Exception e) {
//			System.out.println("not-switch to parent frame");
//		}
//
//
//
//		try {
//			WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frm3']"));
//			driver.switchTo().frame(frame3); 
//			System.out.println("frame is switched");
//		}catch (Exception e) {
//			System.out.println("frame is not-switched");
//		}
//
//		WebElement elemnt3=	driver.findElement(By.xpath("//input[@id='name']"));
//		elemnt3.sendKeys("i am a man");
//
//
//		try {
//			WebElement frame31=driver.findElement(By.xpath("//iframe[@id='frm1']"));
//			driver.switchTo().frame(frame31); 
//			System.out.println("frame is switched to nested frame of the frame 3");
//		}catch (Exception e) {
//			System.out.println("frame is not-switched to nested frame of the frame 3 ");
//		}
//
//		//a[@class='instagram']
//
//		try {
//			WebElement elemnt4=	driver.findElement(By.xpath("//a[@class='instagram']"));
//			elemnt4.click();
//			System.out.println("element is clicked"); 
//		}catch (Exception e) {
//			System.out.println("element is not clicked"); 
//		}
//
//
//
//
//
//
//
//	}
//
//
//
//
//
//}
