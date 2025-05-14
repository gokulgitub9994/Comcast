package CreateContactTest;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.fileutility.JsonUtility;
import com.comcast.crm.generic.objectrepositaroryutility.ContactInfoPage;
import com.comcast.crm.generic.objectrepositaroryutility.ContactPage;
import com.comcast.crm.generic.objectrepositaroryutility.CreatingNewContactPage;
import com.comcast.crm.generic.objectrepositaroryutility.HomePage;
import com.comcast.crm.generic.objectrepositaroryutility.LoginPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateContactWithSupportDate {

	@Test(groups="RT")
	public void createContactWithDate() throws Throwable, ParseException {
		WebDriver driver = null;

		FileUtility fLib = new FileUtility();
		JsonUtility jsLib = new JsonUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();

		String BROWSER = jsLib.getDataFromJsonFile("browser");
		String URL = jsLib.getDataFromJsonFile("url");
		String USERNAME = jsLib.getDataFromJsonFile("username");
		String PASSWORD = jsLib.getDataFromJsonFile("password");

		if (BROWSER.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(URL);
		wLib.waitPageToLoad(driver);

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);

		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();

		ContactPage cp = new ContactPage(driver);
		cp.getCreateNewContactBtn().click();

		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String lastName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber(1000);
		System.out.println("Contact name going to be created is :" + lastName);
		cncp.getLastNameEdit().sendKeys(lastName);
		String startDate = jLib.getSystemDateYYYYMMDD();
		String endDate = jLib.getRequiredDateYYYYMMDD(30);
		System.out.println("EndDate is :" + endDate);
		cncp.getSupportStartDateEdit().sendKeys(startDate);
		cncp.getSupportEndDateEdit().clear();
		cncp.getSupportEndDateEdit().sendKeys(endDate);
		cncp.getSaveBtn().click();

		
		ContactInfoPage cip = new ContactInfoPage(driver);
		
		//Verify orgname 
		String expectedOrgName = lastName;
		String actualOrgName = cip.getHeaderMsg().getText();

		if (actualOrgName.contains(expectedOrgName)) {
			System.out.println("Contact created is : " + expectedOrgName);
			System.out.println(expectedOrgName + " :is verified ======> PASS");
		} else {
			System.out.println(expectedOrgName + " :is not verified ======> FAIL");
		}
		
		
		//Verify support date
		String expectedStartDate = startDate;
		String expectedEndDate = endDate;
		String actualStartDate = cip.getStartDateField().getText();
		String actualEndDate = cip.getEndDateField().getText();
		System.out.println(actualEndDate );
		
		if(actualEndDate.contains(endDate)) {
			System.out.println(actualEndDate+"Verified ===>PASS");
		}else {
			System.out.println(actualEndDate+" Not Verified ===>FAIL");
		}
		

	}

}
