package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Method {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		String demo = driver.getWindowHandle();
		System.out.println("Demo : "+demo);
		
		//Switch To method used to switch new window
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://fb.com/");
		String fb = driver.getWindowHandle();
		System.out.println("Fb Title : "+fb);
		
		//Switch to demo window
		driver.switchTo().window(demo);
		
		//Switch to fb window
		driver.switchTo().window(fb);
	String cu =	driver.getWindowHandle();
	System.out.println("curent window control "+cu);
	}

}
