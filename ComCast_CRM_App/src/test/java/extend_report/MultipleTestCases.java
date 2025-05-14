package extend_report;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MultipleTestCases {
	
	ExtentReports report;
	@BeforeSuite
	public void beforeConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM SUITE RESULTS");
		spark.config().setReportName("CRM-Report");
		spark.config().setTheme(Theme.DARK);
		
		 report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS","Windows-10");
		report.setSystemInfo("Browser","Chrome-10");
		
	}
	
	@AfterSuite
	public void afterConfig() {
		report.flush();
	}
	
	@Test
	public void createContactTest() {
		ExtentTest test = report.createTest("createContactTest");
		test.log(Status.INFO,"Login To App");
		test.log(Status.INFO,"Navigate To Contact Module");
		test.log(Status.INFO,"Create Contact");
		
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact is Created");
		}else {
			test.log(Status.FAIL, "Contact is not Created");
		}
	}
	

	@Test
	public void createContactWithPhoneNumTest() {
		ExtentTest test = report.createTest("createContactWithPhoneNumTest");
		test.log(Status.INFO,"Login To App");
		test.log(Status.INFO,"Navigate To Contact Module");
		test.log(Status.INFO,"Create ContactWithPhoneNum");
		
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact is Created");
		}else {
			test.log(Status.FAIL, "Contact is not Created");
		}
	}

}
