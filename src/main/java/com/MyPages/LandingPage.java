package com.MyPages;

import org.apache.logging.log4j.util.Base64Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.MyUtilities.BasicUtility;

public class LandingPage extends BasePage{
	
	private By account = By.xpath("//a[@class='skip-link skip-account']");
	private By register = By.xpath("//*[text()='Register']");
	private By logIn = By.xpath("//*[text()='Log In']");
	private By header = By.xpath("//div[@class='page-title']/h2");

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAccount() {
		return getElements(account);
	}

	public WebElement getRegister() {
		return getElements(register);
	}

	public WebElement getLogIn() {
		return getElements(logIn);
	}

	public WebElement getHeader() {
		return getElements(header);
	}
	
	public void getTitleOfPage_Lan()
	{
		String ACTUAL_TITLE_OF_PAGE = getTitleOfPage();
		Assert.assertEquals(BasicUtility.EXPECTED_HOMEPAGE_TITLE, ACTUAL_TITLE_OF_PAGE);
	}
	
	public void clickOnAccountLink()
	{
		getAccount().click();
	}
	public RegisterPage clickOnRegister() {
		getRegister().click();
		return getInstance(RegisterPage.class);
	}
	
	public LoginPage clickOnLogin()
	{
		getLogIn().click();
		return getInstance(LoginPage.class);
	}
	public void getHeaderOfLandingPage()
	{
		String HeaderofThePage = getHeader().getText();
		System.out.println(HeaderofThePage);
	}

	
	
	

}
