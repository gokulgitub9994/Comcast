package chumma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/bus_search/Hyderabad/3/Bangalore/7/30-04-2025/O");
		String seats =driver.findElement(By.xpath("(//div[contains(@class='col')]/ancestor::div[@id='service-container-2771210818']//div[contains(@class='container')]/div[contains(@class='col')])[position()=2]")).getText();
		System.out.println("Seats available right now :"+seats);
	}

}
