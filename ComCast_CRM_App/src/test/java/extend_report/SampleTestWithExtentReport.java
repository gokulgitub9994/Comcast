package extend_report;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleTestWithExtentReport {
	
	@Test
	public void createContactTest() {
		//spark report config
		ExtentSparkReporter spark  = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM-Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		//add system info
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS","Windows-10");
		report.setSystemInfo("Browser", "Chrome-10");
		
		
		ExtentTest test =report.createTest("createContactTest");
		test.log(Status.INFO, "Login To App");
		test.log(Status.INFO, "Navigate to Contact Module");
		test.log(Status.INFO, "Create Contact");
		
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact is created");
		}else {
			test.log(Status.FAIL, "Contact is Not created");
		}
		
		report.flush();
	}

}
