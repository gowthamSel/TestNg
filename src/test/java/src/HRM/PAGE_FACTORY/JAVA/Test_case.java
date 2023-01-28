package src.HRM.PAGE_FACTORY.JAVA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_case {
	
	@Test
	public  static void landingPage() throws InterruptedException { 

		WebDriver launchDriver=	Browser_Create.open_browser("chrome", "https://opensource-demo.orangehrmlive.com/");
		Login_page_Hrm log=new Login_page_Hrm(launchDriver);
		log.loginMainPage("Admin", "admin123");
		//Login_page_Hrm loginpage=PageFactory.initElements(launchDriver, Login_page_Hrm.class);
		
		//loginpage.loginMainPage("Admin", "admin123");
		
		Browser_Create  addEmployee=PageFactory.initElements(launchDriver, Browser_Create.class);
		addEmployee.NavigateToPIMAndCreate();
	}




//		@Test
//		public  static void addedpage() throws InterruptedException {
//			WebDriver launchDriver=	Browser_Create.open_browser("chrome", "https://opensource-demo.orangehrmlive.com/");
//			AddEmployee addEmployee=PageFactory.initElements(launchDriver, AddEmployee.class);
//			Thread.sleep(3000);
//			addEmployee.NavigateToPIMAndCreate();
//		}
}
