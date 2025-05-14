package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Source {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String pageSource = driver.getPageSource();
		System.out.println("Page source of the webpage: "+pageSource);

	}

}
