package CreateContactTest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.fileutility.JsonUtility;
import com.comcast.crm.generic.objectrepositaroryutility.ContactOrgPage;
import com.comcast.crm.generic.objectrepositaroryutility.ContactPage;
import com.comcast.crm.generic.objectrepositaroryutility.CreatingNewContactPage;
import com.comcast.crm.generic.objectrepositaroryutility.HomePage;
import com.comcast.crm.generic.objectrepositaroryutility.LoginPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateContactWithOrganizationName {

	public static void main(String[] args) throws Throwable {
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
		String orgname = eLib.getDataFromExcel("contact", 3, 3);
		System.out.println("Contact name going to be created is :" + lastName);
		cncp.getLastNameEdit().sendKeys(lastName);
		cncp.getOrgNameEdit().click();

		wLib.switchToTabOnUrl(driver, "Accounts&action");
		ContactOrgPage cop = new ContactOrgPage(driver);
		cop.getOrgSearchTextField().sendKeys(orgname);
		cop.getSearchNowBtn().click();
		cop.getOrgNameLink().click();
		wLib.switchToTabOnUrl(driver, "Marketing");
		cncp.getSaveBtn().click();

	}

}
