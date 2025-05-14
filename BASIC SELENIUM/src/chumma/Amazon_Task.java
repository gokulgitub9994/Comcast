package chumma;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillbuilder.aws/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Thread.sleep(5000);
		WebElement firstAll = driver.findElement(By.xpath("//button[@id='trigger:r6u:']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(firstAll));
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//button[@id='trigger:r6u:']")).click();
		for (int i = 1; i <= 34; i++) {
			if (i != 0) {
				action.sendKeys(Keys.ARROW_DOWN).perform();
			}
		}

//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();

		// driver.quit();

	}

}
