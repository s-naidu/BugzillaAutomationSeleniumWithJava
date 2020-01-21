package com.bugzilla.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditusersPage {
WebDriver ldriver;
public EditusersPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(how = How.NAME, using ="login")
@CacheLookup
WebElement txtLoginName;

@FindBy(how = How.NAME, using ="name")
@CacheLookup
WebElement txtRealName;

@FindBy(how = How.NAME, using ="password")
@CacheLookup
WebElement txtpassword;

@FindBy(how = How.ID, using ="disabledtext")
@CacheLookup
WebElement txtfieldDisabled;   

@FindBy(how = How.ID, using ="add")
@CacheLookup
WebElement buttonAdd;

@FindBy(how = How.LINK_TEXT, using ="Users")
@CacheLookup
WebElement lnkAddNewuser;

@FindBy(how = How.LINK_TEXT, using ="add a new user")
@CacheLookup
WebElement lnkAddaNewuser;



public void AdminPage() {
	lnkAddNewuser.click();
	
}
public void AdminPage1() {
	lnkAddaNewuser.click();
	
}

public void LoginName(String lname) {
	txtLoginName.sendKeys(lname);
	
}

public void realName(String rname) {
	txtRealName.sendKeys(rname);
	
}
public void paeeword(String password) {
	txtpassword.sendKeys(password);
}

public void clickLinkAdd() {
	buttonAdd.click();
}
}

