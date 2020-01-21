package com.bugzilla.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Log In")
	@CacheLookup
	WebElement login_link_top;	
	
	@FindBy(name="Bugzilla_login")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="Bugzilla_password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="log_in_top")
	@CacheLookup
	WebElement GoAheadAndLogIn;
	
	
	@FindBy(linkText="Log out")
	@CacheLookup
	WebElement lnkLogout;
	
	public void clickLoginLink()
	{
		login_link_top.click();
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		GoAheadAndLogIn.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}









