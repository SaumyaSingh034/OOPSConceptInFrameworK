package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Pages {

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getTitleOfPage() {
		return driver.getTitle();

	}

	@Override
	public String getHeader(By locator) {
		return getElements(locator).getText();
	}

	@Override
	public WebElement getElements(By locator) {
		WebElement element = null;
		try{
			element = driver.findElement(locator);
			return element;
		}catch(Exception e)
		{
			System.out.println("Some error has occured--> "+locator.toString());
			e.printStackTrace();
		}
		return element;

	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e) {
			System.out.println("Some error has occureed while waiting for loactor to be visible-->"+locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}

		
	}

}
