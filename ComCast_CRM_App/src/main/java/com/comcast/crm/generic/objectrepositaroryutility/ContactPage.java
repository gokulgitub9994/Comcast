package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	WebDriver driver= null;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactBtn;
	
	@FindBy(name="c")
	private WebElement searchEdit;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchDropDown;
	
	@FindBy(name="submit")
	private WebElement searchNowBtn;

	public WebElement getCreateNewContactBtn() {
		return createNewContactBtn;
	}

	public WebElement getSearchEdit() {
		return searchEdit;
	}

	public WebElement getSearchDropDown() {
		return searchDropDown;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
	
	
	
	

}
