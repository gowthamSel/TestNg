package takeScreenShot;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportings_OfExecutions {
	
	@Test
	public static void report() {
		
		ExtentSparkReporter sparkReporter =new ExtentSparkReporter("E:\\REPORTS\\rep123.html");
		sparkReporter.config().setDocumentTitle("this is my first report");
		sparkReporter.config().setTheme(Theme.DARK);
		
		ExtentReports reporter =new ExtentReports();
		reporter.attachReporter(sparkReporter);
		
		ExtentTest test = reporter.createTest("this is sample test");
		test.log(Status.PASS,"login is success");
		test.log(Status.PASS," success");
		test.log(Status.FAIL,"save file is fail");
		test.log(Status.FAIL,"screen shot is also fail");
		
		reporter.flush();
		
	
	}
}
