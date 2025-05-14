package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {

	WebDriver driver = null;
	
	public CreatingNewContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="lastname")
	private WebElement lastNameEdit;
	
	@FindBy(xpath="//input[@name='account_name']/parent::td[@class='dvtCellInfo']")
	private WebElement orgNameEdit;
	
	
	@FindBy(name="support_start_date")
	private WebElement supportStartDateEdit;
	
	@FindBy(name="support_end_date")
	private WebElement supportEndDateEdit;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]'][1]")
	private WebElement saveBtn;

	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getOrgNameEdit() {
		return orgNameEdit;
	}
	
	

	
	public WebElement getLastNameEdit() {
		return lastNameEdit;
	}

	public WebElement getSupportStartDateEdit() {
		return supportStartDateEdit;
	}

	public WebElement getSupportEndDateEdit() {
		return supportEndDateEdit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
}
