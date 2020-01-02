package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	@Given("enter username as (.*)")
	public LoginPage enterUsername(String cName) {
		driver.findElement(By.id("username")).sendKeys(cName);
		return this;
	}
	
	@Given("enter password as (.*)")
	public LoginPage enterPassword(String pwd) {	
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	@When("click login")
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	
}
