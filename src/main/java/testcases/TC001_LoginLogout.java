package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelfileName = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001_LoginLogout(String uName, String pwd) {
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(pwd)
		.clickOnLogin();
		
	}
	
}
