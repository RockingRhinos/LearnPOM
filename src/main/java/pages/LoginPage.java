package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String cName) {
		driver.findElement(By.id("username")).sendKeys(cName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {	
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	
}
