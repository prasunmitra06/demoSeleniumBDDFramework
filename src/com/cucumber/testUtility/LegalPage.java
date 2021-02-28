package com.cucumber.testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LegalPage {
	
	WebDriver driver;
	
	public LegalPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="(//select[@class='form-control'])[1]")
	WebElement selectmenuforday;
	
	@FindBy(how = How.XPATH, using="(//select[@class='form-control'])[2]")
	WebElement selectmenuformonth;
	
	@FindBy(how = How.XPATH, using="(//select[@class='form-control'])[3]")
	WebElement selectmenuforyear;
	
	@FindBy(how = How.XPATH, using="//button[@type='button']")
	WebElement entersitebutton;

	public WebElement getEntersitebutton() {
		return entersitebutton;
	}

	public WebElement getSelectmenuforday() {
		return selectmenuforday;
	}

	public void setSelectmenuforday(WebElement selectmenuforday) {
		this.selectmenuforday = selectmenuforday;
	}

	public WebElement getSelectmenuformonth() {
		return selectmenuformonth;
	}

	public void setSelectmenuformonth(WebElement selectmenuformonth) {
		this.selectmenuformonth = selectmenuformonth;
	}

	public WebElement getSelectmenuforyear() {
		return selectmenuforyear;
	}

	public void setSelectmenuforyear(WebElement selectmenuforyear) {
		this.selectmenuforyear = selectmenuforyear;
	}
	
	
	

}
