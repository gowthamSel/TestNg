package takeScreenShot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCases extends Reporting {


	@BeforeSuite
	public static void instalizeThespark() {
		sparkReporter =new ExtentSparkReporter("E:\\REPORTS\\test_3.html");
		sparkReporter.config().setDocumentTitle("this is my first report");
		sparkReporter.config().setTheme(Theme.DARK);
	}

	@BeforeMethod
	public static void finalizeReporter() {
		reporter =new ExtentReports();
		reporter.attachReporter(sparkReporter);
	}

	@AfterSuite
	public static void flush() {
		reporter.flush();
	}

	@BeforeMethod
	public static void test() {
		test = reporter.createTest("test-1A");
	}

	@AfterMethod
	public static void steps() {
		test.log(Status.PASS,"login is success");
		test.log(Status.PASS," success");
		test.log(Status.FAIL,"save file is fail");
		test.log(Status.FAIL,"screen shot is also fail");
	}

	@Test
	public static void m1() {
		System.out.println("this method is 1 ");
	}

	@Test
	public static void m2() {
		System.out.println("this method is 2 ");
	}

	@Test
	public static void m3() {
		System.out.println("this method is 3 ");
	}

	@Test
	public static void m4() {
		System.out.println("this method is 4 ");
	}

}
