package Basic_Selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Id Locator
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.id("small-searchterms")).clear();
		
		//class Locator
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		
		//Css selector
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		driver.quit();
	}

}
