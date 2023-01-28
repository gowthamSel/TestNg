package takeScreenShot;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting {
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports reporter;
	public static ExtentTest test;

	
	public static void instalizeThespark() {

		sparkReporter =new ExtentSparkReporter("E:\\REPORTS\\21.html");
		sparkReporter.config().setDocumentTitle("this is my first report");
		sparkReporter.config().setTheme(Theme.DARK);
	}

	public static void finalizeReporter() {

		reporter =new ExtentReports();
		reporter.attachReporter(sparkReporter);
	}

	public static void flush() {
		reporter.flush();

	}
	
	public static void test() {
		test = reporter.createTest("this is gowtham");
		
	}
	public static void steps() {
		test.log(Status.PASS,"login is success");
		test.log(Status.PASS," success");
		test.log(Status.FAIL,"save file is fail");
		test.log(Status.FAIL,"screen shot is also fail");
	}

}
