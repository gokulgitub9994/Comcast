package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadRunTimeParameterFromCmd {
	
	@Test
	void runTimeParameter() {
	     String BROWSER =System.getProperty("browser");
	     String URL =System.getProperty("url");
	     String USERNAME =System.getProperty("username");
	     String PASSWORD =System.getProperty("password");
		
		System.out.println("Browser is :"+BROWSER);
		System.out.println("Url is :"+URL);
		System.out.println("username is :"+USERNAME);
		System.out.println("password is :"+PASSWORD);
		

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
		
	
	}

}
