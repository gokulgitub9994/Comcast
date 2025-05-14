package CreateOrganizationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.objectrepositaroryutility.CreatingNewOrganizationPage;
import com.comcast.crm.generic.objectrepositaroryutility.HomePage;
import com.comcast.crm.generic.objectrepositaroryutility.LoginPage;
import com.comcast.crm.generic.objectrepositaroryutility.OrganizationInfoPage;
import com.comcast.crm.generic.objectrepositaroryutility.OrganizationPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateOrganizationWithPhoneNumber {

	public static void main(String[] args) throws Throwable {

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
