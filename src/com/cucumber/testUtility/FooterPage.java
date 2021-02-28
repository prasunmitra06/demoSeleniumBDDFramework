package com.cucumber.testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterPage {
	
	WebDriver driver;
	
	public FooterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="(//a[@href='/about-us'])[2]")
	WebElement footeraboutus;

	public WebElement getFooteraboutus() {
		return footeraboutus;
	}

}
