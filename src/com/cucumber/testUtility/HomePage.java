package com.cucumber.testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="(//a[@href='/about-us'])[2]")
	WebElement aboutusathomepage;
	
	@FindBy(how = How.ID, using="close-cookie")
	WebElement cookieid;
	

	public WebElement getCookieid() {
		return cookieid;
	}



	public WebElement getAboutusathomepage() {
		return aboutusathomepage;
	}

}
