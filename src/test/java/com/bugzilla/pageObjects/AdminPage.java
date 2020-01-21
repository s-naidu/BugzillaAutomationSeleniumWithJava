package com.bugzilla.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using ="Administration")
	@CacheLookup
	WebElement lnkAdmin;
    
		
	public void clickAdminlink() {
		lnkAdmin.click();
			
	}
	
	
	
}

	