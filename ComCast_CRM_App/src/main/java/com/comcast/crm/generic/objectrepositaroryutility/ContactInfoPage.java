package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	WebDriver driver = null;
	
	public ContactInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(className = "dvHeaderText")
	private WebElement headerMsg;
	
	@FindBy(id="mouseArea_Support Start Date")
	private WebElement startDateField;
	
	@FindBy(id="mouseArea_Support End Date")
	private WebElement endDateField;

	public WebElement getHeaderMsg() {
		return headerMsg;
	}

	public WebElement getStartDateField() {
		return startDateField;
	}

	public WebElement getEndDateField() {
		return endDateField;
	}
	
	
	
}
