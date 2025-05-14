package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXmlFile {

	@Test
	
	void readDataFromXml(XmlTest test) throws Throwable {
		
	//Reading data from Xml File
	String BROWSER	= test.getParameter("browser");
	String URL	= test.getParameter("url");
	String USERNAME	= test.getParameter("username");
	String PASSWORD	= test.getParameter("password");
	
	  //generate random num
    Random random = new Random();
    int randomInt = random.nextInt(1000);
    System.out.println(randomInt);

	
	//Reading data from Excel
	FileInputStream fIs = new FileInputStream("C:\\\\Users\\\\T470\\\\OneDrive\\\\Desktop\\\\TestScriptData\\\\org.xlsx");
	Workbook wb = WorkbookFactory.create(fIs);
    Sheet sh = wb.getSheet("Sheet1");
    Row r  = sh.getRow(1);
    Cell cl = r.getCell(1);
    String data = cl.getStringCellValue().toString()+randomInt;
    System.out.println(data);
    wb.close();
	
  
	WebDriver driver = null;
	
	if(BROWSER.equals("chrome")) {
		driver = new ChromeDriver();
	}else if(BROWSER.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if(BROWSER.equals("edge")) {
		driver = new EdgeDriver();
	}else {
		driver = new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	driver.findElement(By.name("accountname")).sendKeys("fb");
	driver.findElement(By.name("button")).click();
	System.out.println("=====Executed=====");
	
	driver.quit();
	
	
	}

}
