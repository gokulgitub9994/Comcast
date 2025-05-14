package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement orgLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement homeLink;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement adminBtn;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutBtn;
	
	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}
	
	public WebElement getAdminBtn() {
		return adminBtn;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

	public void logOutFromApp() {
		Actions action = new Actions(driver);
		action.moveToElement(adminBtn).click().perform();
		signOutBtn.click();
	}

}
