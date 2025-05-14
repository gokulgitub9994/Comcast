package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	WebDriver driver = null;
	
	public OrganizationInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="dvHeaderText")
	private WebElement headerMsg;
	
	@FindBy(id="mouseArea_Industry")
	private WebElement industryEdit;
	
	@FindBy(id="mouseArea_Phone")
	private WebElement phnoEdit;

	public WebElement getHeaderMsg() {
		return headerMsg;
	}

	public WebElement getIndustryEdit() {
		return industryEdit;
	}

	public WebElement getPhnoEdit() {
		return phnoEdit;
	}
	
	



	
	
	
	
	
	
	
	
	

}
