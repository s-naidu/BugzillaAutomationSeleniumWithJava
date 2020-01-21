package com.bugzilla.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bugzilla.pageObjects.EditusersPage;
import com.bugzilla.pageObjects.LoginPage;
import com.bugzilla.pageObjects.AdminPage;

public class TC_addNewUser_Test_004 extends BaseClass {
	
	
	@Test
	public void addNewUser() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickLoginLink();
		logger.info("clicked login button");	
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Welcome to Bugzilla"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		Thread.sleep(3000);
		

		AdminPage adpage=new AdminPage(driver);
		
		adpage.clickAdminlink();
		logger.info("clicked adminintrator link");
		EditusersPage addnuser=new EditusersPage(driver);
		
		addnuser.AdminPage();
		logger.info("clicked add users link");
		addnuser.AdminPage1();
		logger.info("clicked add neew user link");
						
		logger.info("providing customer details....");
		String mylogin=randomestring();
		addnuser.LoginName(mylogin);
		addnuser.LoginName("@gmail.com");
		addnuser.realName("NewTest1");
		addnuser.paeeword("123123");
		addnuser.clickLinkAdd();
		
		Thread.sleep(15000);
		lp.clickLogout();
		
	}
}
