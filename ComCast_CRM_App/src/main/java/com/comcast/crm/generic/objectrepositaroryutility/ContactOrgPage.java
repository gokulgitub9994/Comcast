package com.comcast.crm.generic.objectrepositaroryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactOrgPage {
	
       WebDriver driver = null;
	
	public ContactOrgPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="search_txt")
	private WebElement orgSearchTextField;
	
	@FindBy(name="search")
	private WebElement searchNowBtn;

	@FindBy(linkText="Facebook_678")
	private WebElement orgNameLink;
	
	

	public WebElement getOrgNameLink() {
		return orgNameLink;
	}

	public WebElement getOrgSearchTextField() {
		return orgSearchTextField;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
	
	

	

	
}
