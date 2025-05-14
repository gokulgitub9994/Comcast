package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Method {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://fb.com/");
		
		//close fb 
		driver.close();
	}

}
