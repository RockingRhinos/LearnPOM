package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void passData() {
		
		excelfileName = "TC001";

	}
	
	@Test(dataProvider="fetchData")
	public void tc001_createLead(String uName, String pwd) {
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(pwd)
		.clickOnLogin()
		/*.clickCRMSFA()
		.clickOnLeads()
		.clickOnCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.submitCreateLead()
		.verifyFirstName()*/;
		
	}
	
}
