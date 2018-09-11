package com.uiFramework.TH.Nbf.testScripts.loginPage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.uiFramework.TH.Nbf.helper.assertion.AssertionHelper;
import com.uiFramework.TH.Nbf.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.TH.Nbf.helper.logger.LoggerHelper;
import com.uiFramework.TH.Nbf.pageObject.LoginPage;
import com.uiFramework.TH.Nbf.testbase.TestBase;

public class LoginTest extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
		
		boolean status = loginPage.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);
	}
}
