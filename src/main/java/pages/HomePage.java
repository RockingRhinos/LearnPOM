package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	@Then("verify page text")
	public HomePage verifyText() {
	
		System.out.println("Demosalesmanager");
		return this;

	}
}
