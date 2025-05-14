package WEBDRIVER_METHODS;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String demo = driver.getWindowHandle();
		System.out.println("Session ID of demo: "+demo);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://fb.com/");
		String fb = driver.getWindowHandle();
		System.out.println("Session ID of FB: "+fb);
		
		//All window address
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All session Id's :"+windowHandles);
	}

}
