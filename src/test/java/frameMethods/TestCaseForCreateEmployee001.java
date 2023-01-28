package frameMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseForCreateEmployee001 extends CommonMethods {


	@Test
	public static void tc001_AddEmployee()  {


		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/" , "orange");
		enterValue(By.xpath("//input[@name=\"username\"]"),"Admin");
		enterValue(By.xpath("//input[@name=\"password\"]"),"admin123");
		click(By.xpath("//button[@type=\"submit\"]"));

		//takeScreenPic();

		click(By.xpath("//a[@id='menu_pim_viewPimModule']"));

		click(By.xpath("//a[@id='menu_pim_addEmployee']"));

		//takeScreenPic();


		enterValue(By.xpath("//input[@id='firstName']"),"gowtham reddy");
		enterValue(By.xpath("//input[@id='lastName']"),"reddy");
		selectCheckbox(By.xpath("//input[@id='chkLogin']"));
		enterValue(By.xpath("//input[@id='user_name']") , "gowtham_705");
		enterValue(By.xpath("//input[@id='user_password']") , "gowtham@206280_A");
		enterValue(By.xpath("//input[@id='re_password']") , "gowtham@206280_A");
		selectValue(By.xpath("//select"), "Enabled");

		//takeScreenPic();
		click(By.xpath("//input[@id='btnSave']"));
		takeScreenPic();

	}
	
}
