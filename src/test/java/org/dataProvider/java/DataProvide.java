package org.dataProvider.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvide {


	public static void main(String[] args) {


	}
	/**to give the dataprovider to the test cases thet will be run in multiple times
	 * according to the how many  number of the rows in the data provider
	 * 
	 *  if the number of rows will be increase the test runs will be incrase 
	 *  if the data provider is single row the test will be run only in single time 
	 *  and give the name of the dataprovider is compulsory
	 *  if we dont give the name of the sata provider it will be take some another data also 
	 *  due to that we give the name of the data provider is comulsory */

	@Test(dataProvider ="login test data" )
	public  static void loginhrmpage(String username,String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();

		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();

		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();



		driver.close();
	}




	/**the dataproviedr is the any thing it will be string ,int,double,long, etc 
	 * but we will give thye object in this data provider 
	 * because of the  all the object super class is object
	 * due to we give the object is the data type of the dataprovider
	 * 
	 *  the dual array type is compulsory i,e., [][]*/

	@DataProvider(name="login test data")
	public Object[][] getTestData() {

		Object[][] data1=new Object[3][2];
		String[][] data2 =new String[2][2];


		data1[0][0] = "admin";
		data1[0][1] = "admin123";

		data1[1][0] = "admin";
		data1[1][1] = "admin124";

		data1[2][0] = "admin";
		data1[2][1] = "admin125";


		byte[][] data4=new byte[2][3];  //3 is the coloum
		short[][] data5=new short[2][4];  //4 is the coloum
		int[][] data3=new int[2][5];    //5 is the coloum
		long[][] data6=new long[2][6];    //6 is the coloum


		// the value is giving like this in the test cases 
		// the test cases will be run in number of rows 



		return data1;
	}
}
