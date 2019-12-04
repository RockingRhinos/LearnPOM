package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods{
	
	public ViewLeadsPage verifyFirstName() {
		String fName = driver.findElement(By.id("viewLead_firstNameLocal_sp")).getText();
		/*if (fName.contains("Sam")) {
			System.out.println("Test Case Passed");
		} else {
			System.err.println("Test Case Failed");
		}*/
		return this;
	}

}
