package alerts_P;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;
import org.testng.ITestContext;

public class ItestListenerClass extends BaseClass implements ITestListener {




	private static String gettestmethodname(ITestResult itestresult) {

		return itestresult.getMethod().getConstructorOrMethod().getName();

	}

	@Attachment(value="page screenshot" ,type="Image/png")
	public byte[] savescreeshotPNG(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("this is a test failure method"+gettestmethodname(result)+"failed");
		Object testclass=result.getInstance();

		//getting the driver from the base class
		WebDriver drive=BaseClass.getdriver();

		if(drive instanceof WebDriver) {

			System.out.println("screen shot of the failure test case :"+gettestmethodname(result));

			savescreeshotPNG(drive);
		}
		//save to that into the logs of the allure

		savetextlog(gettestmethodname(result)+"failed screen shot taken");
	}

	private void savetextlog(String string) {


	}





	/*
	@Override
	public void onTestFailure(ITestResult result) {

		try {
			System.out.println(result.getMethod().getMethodName()+".png");
			captureScreenShot(result.getMethod().getMethodName()+".png");
		} catch (IOException e) {
			System.out.println("exception is generated");
		}
	}
	 */


}
