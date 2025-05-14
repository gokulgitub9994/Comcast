package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url of the current webpage :"+currentUrl);

	}

}
