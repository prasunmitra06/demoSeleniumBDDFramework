package com.cucumber.testUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilityclass {
	
	
	WebDriver driver;
	
	public Utilityclass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void DataSelectfromSelectDropDown(WebElement webElement, String i)
	{
		// Create object of the Select class
		Select se = new Select(webElement);
		se.selectByValue(i);
	}
	
	public WebElement waitForElement(WebElement locator)
	{
		WebDriverWait wai = new WebDriverWait(driver, 60);
		WebElement ele = wai.until(ExpectedConditions.elementToBeClickable(locator));
		return ele;
	}
	
	public void waitForElementAjax(By xpathstring)
	{
		WebDriverWait wai = new WebDriverWait(driver, 60);
		wai.until(ExpectedConditions.presenceOfElementLocated(xpathstring));
	}

}
