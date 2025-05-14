package Basic_Selenium_Concepts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String demo = driver.getWindowHandle();
		System.out.println("Demo webshop :" + demo);

		driver.findElement(By.linkText("Facebook")).click();
		// System.out.println(driver.getTitle());

		Set<String> allWin = driver.getWindowHandles();
		String title = null;
		for (String value : allWin) {
			driver.switchTo().window(value);
			Thread.sleep(1000);
			title = driver.getTitle();
			System.out.println("Current Title :" + title);
			if (title.contains("Facebook")) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("user@gmail.com");
				driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("12344");

				System.out.println("Password entered in facebook");
			} else if (title.contains("Demo")) {
				driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
				System.out.println("So Mobiles entered in demowebshop ");
			}
			 System.out.println();
		}

		System.out.println("Current control is in: " + driver.getTitle());
		driver.findElement(By.xpath("//span[@dir='auto']/ancestor::div[@class='x1c436fg']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
