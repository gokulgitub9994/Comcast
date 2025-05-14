package Basic_Selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

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
		
		
		
		//Relative X-Path 
		
		//tagname[@AN='Av']
		driver.findElement(By.xpath("//input[@ id = 'As']")).click();
		
		//tagname[text()='textvalue']
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		
		//contains method 
		
		//tagname[contains(@AN,AV)]
		driver.findElement(By.xpath("//input[contains(@name,'NewsletterEmail')]")).sendKeys("news");
		
		//tagname[contains(text(),'AV')]
		driver.findElement(By.xpath("//a[contains(text(),'Books')][1]")).click();
		
		//tagname[starts-with(@AN,'AV')]
		driver.findElement(By.xpath("//input[starts-with(@value,'Search')]")).click();
		
		//tagname[starts-with(text(),'AV')]
		driver.findElement(By.xpath("(//a[starts-with(text(),'Digital')])[1]")).click();
		
		
		driver.findElement(By.xpath("//input[ends-with(@value,'store')]")).click();
		
	}

}
