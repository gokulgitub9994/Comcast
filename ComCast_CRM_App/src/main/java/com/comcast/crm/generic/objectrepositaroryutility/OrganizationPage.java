package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	WebDriver driver =null;
	
	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	@FindBy(name="search_text")
	private WebElement searchTextField;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchDropDown;
	
	@FindBy(name="submit")
	private WebElement searchNowBtn;

	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchDropDown() {
		return searchDropDown;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	
	

}
