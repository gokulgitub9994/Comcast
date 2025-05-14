package chumma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LiveStatus {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/live-train-status/12675-mgr-chennai-cent-coimbatore-main-kovai-sf-exp-mas-to-cbe");
		String stationName=driver.findElement(By.xpath("//span/parent::div[@class='flexCol result_currentLocationMessage__ONL0g']//p")).getText();
		System.out.println("Current station name is :"+stationName);
		Thread.sleep(2000);
		driver.quit();
	}

}
