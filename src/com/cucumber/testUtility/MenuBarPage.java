package com.cucumber.testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuBarPage {
	
	WebDriver driver;
	
	public MenuBarPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//span[@class='pull-right']")
	WebElement menuatheader;
	
	@FindBy(how = How.XPATH, using="(//span[@class='menu-link'])[1]")
	WebElement menubaraboutus;

	public WebElement getMenuatheader() {
		return menuatheader;
	}

	public WebElement getMenubaraboutus() {
		return menubaraboutus;
	}

}
