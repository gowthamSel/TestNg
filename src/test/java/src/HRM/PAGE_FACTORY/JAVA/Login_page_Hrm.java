package src.HRM.PAGE_FACTORY.JAVA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_Hrm {

	public static WebDriver driver;
	
//	public void Login_page_Hrm(WebDriver Driver) {
//		this.driver = Driver;
//	}
	
	public Login_page_Hrm(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		this.driver = Driver;
	}

	
	@CacheLookup
	@FindBy(xpath ="//input[@name='username']")
	public static WebElement txtuserName;

	@CacheLookup
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement txtpassWord;
	
	@CacheLookup
	@FindBy(xpath = "//button")
	public static WebElement btnLogin;


	public static void loginMainPage(String username ,String password) {
		txtuserName.sendKeys(username);
		txtpassWord.sendKeys(password);
		btnLogin.click();

	}




}
