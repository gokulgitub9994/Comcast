package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://fb.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
