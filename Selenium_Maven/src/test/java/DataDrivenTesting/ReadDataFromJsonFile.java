package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromJsonFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		//Covert Json Physical file into Java Object
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("E:\\TestData\\commondata.json"));
		
		//Converting JavaObject into Json Object (Downcasting)
		JSONObject map = (JSONObject) obj;
		
		//Get the value using key with the help of downcasted obj refrence
		Object BROWSER =map.get("browser");
		Object URL =map.get("url");
		Object USERNAME =map.get("username");
		Object PASSWORD =map.get("password");
		
		
//		System.out.println(BROWSER);
//		System.out.println(URL);
//		System.out.println(USERNAME);
//		System.out.println(PASSWORD);
		
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
		driver.get((String) URL);//cnvrtng Object to to String
		driver.findElement(By.name("user_name")).sendKeys(USERNAME.toString());//cnvrtng Object to to String
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD.toString());
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(data);
		driver.findElement(By.name("button")).click();
		System.out.println(data+" : is Created Successfully");
		
		driver.quit();
		
		

	}

}
