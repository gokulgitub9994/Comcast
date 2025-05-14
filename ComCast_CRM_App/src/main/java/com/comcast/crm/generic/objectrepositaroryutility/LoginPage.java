package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver=null;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="user_name")
	private WebElement userNameEdit;
	
	@FindBy(name="user_password")
	private WebElement passWordEdit;
	
	
	@FindBy(id="submitButton")
	private WebElement logInBtn;


	public WebElement getUserNameEdit() {
		return userNameEdit;
	}


	public WebElement getPassWordEdit() {
		return passWordEdit;
	}


	public WebElement getLogInBtn() {
		return logInBtn;
	}
	
	public void loginToApp(String username, String password) {
		userNameEdit.sendKeys(username);
		passWordEdit.sendKeys(password);
		logInBtn.click();
	}
}
