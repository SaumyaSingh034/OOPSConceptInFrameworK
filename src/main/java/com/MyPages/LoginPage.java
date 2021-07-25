package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By firstName = By.cssSelector("#firstname");
	private By lastName = By.cssSelector("#lastname");
	private By emailId = By.cssSelector("#email_address");
	private By pwd = By.cssSelector("#password");
	
	
	public WebElement getFirstName() {
		return getElements(firstName);
	}

	public WebElement getLastName() {
		return getElements(lastName);
	}

	public WebElement getEmailId() {
		return getElements(emailId);
	}

	public WebElement getPwd() {
		return getElements(pwd);
	}
	

	

}
