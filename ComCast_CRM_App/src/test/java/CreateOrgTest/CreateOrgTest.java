package CreateOrgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.generic.baseclassutility.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.objectrepositaroryutility.CreatingNewOrganizationPage;
import com.comcast.crm.generic.objectrepositaroryutility.HomePage;
import com.comcast.crm.generic.objectrepositaroryutility.LoginPage;
import com.comcast.crm.generic.objectrepositaroryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositaroryutility.OrganizationPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

@Listeners(com.comcast.crm.generic.listimpclassutility.LisImpClass.class)

public class CreateOrgTest extends BaseClass{
	

	@Test(groups="ST")
	public void createOrganizationTest() throws Throwable {

		WebDriver driver = null;

		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();

		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		String orgname = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber(1000);
		System.out.println(orgname + " :OrgName going to be created");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		wLib.waitPageToLoad(driver);

		driver.get(URL);

		// login to app
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);

		// click on Org link
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Click on Create New Org button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		// Enter all details
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.getOrgNameEdit().sendKeys(orgname);
		cnop.getSaveBtn().click();

		// Verify the HeaderMsg
		String expectedOrgname = orgname;
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actuaOrgnmae = oip.getHeaderMsg().getText();

		if (actuaOrgnmae.contains(expectedOrgname)) {
			System.out.println(expectedOrgname + ": is verified  ===> PASSS");
		} else {
			System.out.println(expectedOrgname + ": is not  verified  ===> FAIL");
		}

		driver.quit();

	}
	
	@Test
	public void createOrgWithIndustryTest() throws Throwable {
		WebDriver driver = null;

		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();

		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		String orgname = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber(1000);
		System.out.println(orgname + " :OrgName going to be created");

		String industryname = eLib.getDataFromExcel("org", 2, 3);
		System.out.println(industryname + "  type industry is created");
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		wLib.waitPageToLoad(driver);

		driver.get(URL);

		// login to app
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);

		// click on Org link
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Click on Create New Org button
		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		// Enter all details
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.getOrgNameEdit().sendKeys(orgname);
		WebElement industrydrop = cnop.getIndustryDropDown();
		wLib.select(industrydrop, industryname);
		cnop.getSaveBtn().click();

		// verify created org based on industry
		String expectedIndustry = industryname;
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actIndustry = oip.getIndustryEdit().getText();
		if (actIndustry.contains(industryname)) {
			System.out.println(industryname + " is verified ====> PASS");
		} else {
			System.out.println(industryname + " is not  verified ====> FAIL");
		}

		driver.quit();
}
	
	@Test
	public void createOrgWithPhNumTest() throws Throwable {

		WebDriver driver = null;

		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();

		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		wLib.waitPageToLoad(driver);

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);

		String orgname = eLib.getDataFromExcel("org", 3, 2) + jLib.getRandomNumber(1000);
		String phnum = eLib.getDataFromExcel("org", 3, 5);

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.getOrgNameEdit().sendKeys(orgname);
		cnop.getPhoneNoEdit().sendKeys(phnum);
		cnop.getSaveBtn().click();

		
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		// verify orgname in header in org info page
		String expectedOrgName = orgname;
		String actualOrgName = oip.getHeaderMsg().getText();
		if (actualOrgName.contains(orgname)) {
			System.out.println(orgname + " :is verified =====> PASS");
		} else {
			System.out.println(orgname + "is not verified =====> FAIL");
		}

		// verify phnum in org info page
		String expectedPhnum = phnum;
		String actualPhnum = oip.getPhnoEdit().getText();
		if (actualPhnum.contains(phnum)) {
			System.out.println(phnum + " :is verified =====> PASS");
		} else {
			System.out.println(phnum + " :is not verified =====> FAIL");
		}

	

	}

}
