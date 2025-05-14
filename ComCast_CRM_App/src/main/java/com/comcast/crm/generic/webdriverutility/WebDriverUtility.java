package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void waitPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToTabOnUrl(WebDriver driver, String partialUrl) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iT = set.iterator();
		while (iT.hasNext()) {
			String windowId = iT.next();
			driver.switchTo().window(windowId);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(partialUrl)) {
				break;
			}
		}
	}

	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {

		Set<String> set = driver.getWindowHandles();
		Iterator<String> iT = set.iterator();
		while (iT.hasNext()) {
			String windowId = iT.next();
			driver.switchTo().window(windowId);

			String actUrl = driver.getTitle();
			if (actUrl.contains(partialTitle)) {
				//break;
			}
		}
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		sel.selectByValue(text);
	}

	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

}
