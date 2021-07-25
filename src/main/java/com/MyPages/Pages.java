package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Pages {
	WebDriver driver;
	WebDriverWait wait;
	
	public Pages(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);
	}
	
	
	//defining Abstract methods
	public abstract String getTitleOfPage();
	public abstract String getHeader(By locator);
	public abstract WebElement getElements(By locator);
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitle(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass)
	{
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	
	}


}
