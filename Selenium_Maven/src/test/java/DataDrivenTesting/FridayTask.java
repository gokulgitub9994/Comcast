package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FridayTask {

	public static void main(String[] args) throws InterruptedException, Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		FileInputStream d = new FileInputStream("E:\\TestData\\commondata.properties");
		Properties p = new Properties();
		p.load(d);
	    String BROWSER =p.getProperty("browser");
	    String URL =p.getProperty("url");
		WebDriver driver = null;
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get(URL);
		Thread.sleep(3000);

		List<WebElement> rating = driver.findElements(By.xpath("//span[@class='si-text']/parent::div[@class='si-table-data si-rating']"));
		for(WebElement web :rating ) {
			String set = web.getText();
			System.out.println("Rating :"+set);
		}
		System.out.println();
		
		driver.findElement(By.xpath("//*[name()='svg']/parent::div[@class='group space-y-2 z-20']")).click();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//summary[@class='flex justify-between w-full cursor-pointer'][1]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//a[@class='text-inherit ']/parent::li"));
		for(WebElement webel: ele) {
			String drop = webel.getText();
			System.out.println("DropDown Text :"+drop);
		}
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='menu-btn menu-btn-close z-20']"))).click().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
