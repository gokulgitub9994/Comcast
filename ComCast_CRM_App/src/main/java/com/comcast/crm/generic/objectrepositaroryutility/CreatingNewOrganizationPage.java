package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {
	
	WebDriver driver = null;
	
	public CreatingNewOrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgNameEdit;
	

	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	@FindBy(name="phone")
	private WebElement phoneNoEdit;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]']/parent::div//input)[1]")
	private WebElement saveBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgNameEdit() {
		return orgNameEdit;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getPhoneNoEdit() {
		return phoneNoEdit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
}
