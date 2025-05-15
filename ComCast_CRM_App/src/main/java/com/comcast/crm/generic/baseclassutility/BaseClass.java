package com.comcast.crm.generic.baseclassutility;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.objectrepositaroryutility.HomePage;
import com.comcast.crm.generic.objectrepositaroryutility.LoginPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class BaseClass {

	public WebDriver driver = null;
	public static WebDriver sDriver = null;
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public DataBaseUtility dLib = new DataBaseUtility();
	public JavaUtility jLib = new JavaUtility();
	public ExtentReports report = new ExtentReports();

	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("Connect to dB and Report Configure");
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM SUITE RESULTS");
		spark.config().setReportName("CRM-Report");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("Browser", "Chrome-10");
	}

	@BeforeClass
	public void configBeforeClass() throws Throwable {
		System.out.println("Launch Browser");
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		if (BROWSER.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			driver = new ChromeDriver(options);
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		sDriver = driver;

		driver.manage().window().maximize();
		wLib.waitPageToLoad(driver);

	}

	@BeforeMethod
	public void configBeforeMethod() throws Throwable {
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("Login to App");

	}
	
	@AfterMethod
	public void configAfterMethod() {
		HomePage hp = new HomePage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(hp.getAdminBtn()).perform();
		hp.getSignOutBtn().click();
		System.out.println("LogOut from Application");
	}
	
	@AfterClass
	public void configAfterClass() {
		driver.quit();
		System.out.println("Close Browser");
		
	}
	
	@AfterSuite
	public void configAfterSuite() {
		report.flush();
		System.out.println("Report Backup");
		
	}

}
