package com.uiFramework.TH.Nbf.testScripts.productDetailsPage;

import org.testng.annotations.Test;

import com.uiFramework.TH.Nbf.helper.assertion.AssertionHelper;
import com.uiFramework.TH.Nbf.pageObject.ApplicationText;
import com.uiFramework.TH.Nbf.pageObject.LoginPage;
import com.uiFramework.TH.Nbf.pageObject.NavigationMenu;
import com.uiFramework.TH.Nbf.pageObject.ProductCategoryPage;
import com.uiFramework.TH.Nbf.testbase.TestBase;



public class VerifyProductCounts extends TestBase{
	
	LoginPage loginPage;
	NavigationMenu navigationMenu;
	
	@Test
	public void testVerifyProductCounts(){
		
		navigationMenu = new NavigationMenu(driver);
		ProductCategoryPage pCate = navigationMenu.clickOnMenu(navigationMenu.womenMenu);
		
		pCate.selectColor(ApplicationText.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==3){
			AssertionHelper.markPass();
		}
		else{
			AssertionHelper.markFail("product count is not matching");
		}
	}
}
