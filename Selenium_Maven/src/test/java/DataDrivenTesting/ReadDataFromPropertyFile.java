package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fIs = new FileInputStream("E:\\TestData\\commondata.properties");
		
		Properties pObj = new Properties();
		
		pObj.load(fIs);
		
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		WebDriver driver = null;
		
		if(BROWSER.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.contains("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("fb4");
		
		driver.findElement(By.name("button")).click();
		
		String title = driver.findElement(By.name("dvHeaderText")).getText();
		
		if(title.contains("fb4")) {
			System.out.println("Verified...");
		}
		

	}

}
