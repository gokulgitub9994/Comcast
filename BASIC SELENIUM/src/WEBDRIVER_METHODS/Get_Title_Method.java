package WEBDRIVER_METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println("Title of the current webpage is :"+title);
	}

}
