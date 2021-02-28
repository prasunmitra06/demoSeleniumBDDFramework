package com.cucumber.testUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutUS {
	
	WebDriver driver;
	By noofempxpath = By.xpath("(//div[@class='stat-count odometer odometer-auto-theme'])[1]");
	
	
	public AboutUS(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="(//div[@class='stat-count odometer odometer-auto-theme'])[1]")
	WebElement numberofemployeetiles;
	
	@FindBy(how = How.XPATH, using="(//div[@class='stat-count odometer odometer-auto-theme'])[2]")
	WebElement numberofcountriesplaytechoffices;

	@FindBy(how = How.XPATH, using="(//div[@class='stat-count odometer odometer-auto-theme'])[3]")
	WebElement numberofGloballicensees;

	@FindBy(how = How.XPATH, using="(//div[@class='stat-count odometer odometer-auto-theme'])[4]")
	WebElement numberofRegulatedJurisdictions;
	
	@FindBy(how = How.XPATH, using="//h1")
	WebElement aboutuspagetitle;
	
	
	@FindBy(how = How.XPATH, using="//div[@class='arrow arrow-scroll hidden-xs hidden-sm hidden-md']")
	WebElement dorpdownarraw;

	
	
	public WebElement getDorpdownarraw() {
		return dorpdownarraw;
	}

	public By getNoofempxpath() {
		return noofempxpath;
	}

	public WebElement getAboutuspagetitle() {
		return aboutuspagetitle;
	}

	public WebElement getNumberofemployeetiles() {
		return numberofemployeetiles;
	}

	public WebElement getNumberofcountriesplaytechoffices() {
		return numberofcountriesplaytechoffices;
	}

	public WebElement getNumberofGloballicensees() {
		return numberofGloballicensees;
	}

	public WebElement getNumberofRegulatedJurisdictions() {
		return numberofRegulatedJurisdictions;
	}
	
	
}
