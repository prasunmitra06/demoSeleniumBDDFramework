package com.cucumber.StepDef;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.testUtility.AboutUS;
import com.cucumber.testUtility.FooterPage;
import com.cucumber.testUtility.HomePage;
import com.cucumber.testUtility.LegalPage;
import com.cucumber.testUtility.PropertiesFileReader;
import com.cucumber.testUtility.Utilityclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleSearchDef {
	
	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	
	@Given("^Open Chrome browser and enter Playtech url$")
	public void openChromeBrowserAndEnterUrl() throws Throwable
	{
		//driver.manage().deleteAllCookies();
		Properties properties = obj.getProperty();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseUrl"));
		Thread.sleep(3000);
	}
	
	
	@When("^Select day, month and year in legal page and enter Site$")
	public void enterLegalData() throws Throwable
	{
		System.out.println("11111111111");
		LegalPage lg = PageFactory.initElements(driver, LegalPage.class);
		Utilityclass uc = new Utilityclass(driver);
		uc.waitForElement(lg.getSelectmenuforday()).click();
		uc.DataSelectfromSelectDropDown(lg.getSelectmenuforday(), "10");
		Thread.sleep(3000);
		uc.DataSelectfromSelectDropDown(lg.getSelectmenuformonth(), "10");
		uc.DataSelectfromSelectDropDown(lg.getSelectmenuforyear(), "1973");
		uc.waitForElement(lg.getEntersitebutton()).click();
		
	}
	
	@Then("^Home page will be displayed$")
	public void HomePageSection() throws Throwable
	{
		System.out.println("222222222222");
		Utilityclass uc = new Utilityclass(driver);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		boolean aboutbusbtn = uc.waitForElement(hp.getAboutusathomepage()).isEnabled();
		assertEquals(aboutbusbtn, true);
	}
	
	@When("^Click About Us button in home page$")
	public void clickHomeAboutusButton() throws Throwable
	{
		System.out.println("333333333333333333");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Utilityclass uc = new Utilityclass(driver);
		boolean aboutbusbtn = uc.waitForElement(hp.getAboutusathomepage()).isDisplayed();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		hp.getCookieid().click();
		System.out.println(hp.getAboutusathomepage().getText());
		//assertEquals(aboutbusbtn, true);
		Thread.sleep(3000);
		uc.waitForElement(hp.getAboutusathomepage()).click();
		Thread.sleep(3000);	
	}
	
	@Then("^About Us page will be opened$")
	public void AboutUSPageFromHomePage() throws Throwable
	{
		System.out.println("44444444444444");
		Utilityclass uc = new Utilityclass(driver);
		AboutUS au1 = PageFactory.initElements(driver, AboutUS.class);
		String aboutbustitle = uc.waitForElement(au1.getAboutuspagetitle()).getText();
		assertEquals(aboutbustitle, "About Us");
	}
	
	@When("^Check Number of Employees Tiles$")
	public void CheckNumberofEmployeesTiles() throws Throwable
	{
		System.out.println("55555555555555555");
		AboutUS au = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		Thread.sleep(5000);		
		boolean noofemptiledefined = uc.waitForElement(au.getNumberofemployeetiles()).isEnabled();
		Thread.sleep(3000);
		assertEquals(noofemptiledefined, true);
	}
	
	@Then("^Number of Employees will be displayed$")
	public void NoOfEmpWillBeDispayed() throws Throwable
	{
		System.out.println("666666666666666");
		AboutUS au = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		uc.waitForElement(au.getDorpdownarraw()).click();
		Thread.sleep(3000);		
        js.executeScript("arguments[0].scrollIntoView();", au.getNumberofemployeetiles());
		Thread.sleep(5000);		
		String noofemptile = uc.waitForElement(au.getNumberofemployeetiles()).getAttribute("data-odometer-count").toString();
		Thread.sleep(10000);
		assertEquals(noofemptile, "5900");
	}
	
	@When("^Check Number of Countries Playtech Offices Tiles$")
	public void CheckNumberofCountriesPlaytechOfficesTiles() throws Throwable
	{
		System.out.println("7777777777777777");
		AboutUS au0 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		Thread.sleep(5000);		
		boolean noofcountryesofc = uc.waitForElement(au0.getNumberofcountriesplaytechoffices()).isEnabled();
		Thread.sleep(3000);
		assertEquals(noofcountryesofc, true);
	}
	
	@Then("^Number of Playtech Offices will be displayed$")
	public void NumberofPlaytechOfficeswillbedisplayed() throws Throwable
	{
		System.out.println("888888888888888");
		AboutUS au11 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		//uc.waitForElement(au11.getDorpdownarraw()).click();
		Thread.sleep(3000);		
        js.executeScript("arguments[0].scrollIntoView();", au11.getNumberofcountriesplaytechoffices());
		Thread.sleep(5000);		
		String noofcountryesofc = uc.waitForElement(au11.getNumberofcountriesplaytechoffices()).getAttribute("data-odometer-count").toString();
		Thread.sleep(10000);
		assertEquals(noofcountryesofc, "19");
	}
	
	
	@When("^Check Number of Global licensees Tiles$")
	public void CheckNumberofGloballicenseesTiles() throws Throwable
	{
		System.out.println("999999999999999");
		AboutUS au2 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		Thread.sleep(5000);		
		boolean noGloballicenseesTiles = uc.waitForElement(au2.getNumberofGloballicensees()).isEnabled();
		Thread.sleep(3000);
		assertEquals(noGloballicenseesTiles, true);
	}
	
	@Then("^Number of Global licensees will be displayed$")
	public void NumberofGloballicenseeswillbedisplayed() throws Throwable
	{
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		AboutUS au3 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		//uc.waitForElement(au3.getDorpdownarraw()).click();
		Thread.sleep(3000);		
        js.executeScript("arguments[0].scrollIntoView();", au3.getNumberofGloballicensees());
		Thread.sleep(5000);		
		String noGloballicenseeswillbedisplayed = uc.waitForElement(au3.getNumberofGloballicensees()).getAttribute("data-odometer-count").toString();
		Thread.sleep(10000);
		assertEquals(noGloballicenseeswillbedisplayed, "140");
	}
	
	
	@When("^Check Number of Regulated Jurisdictions Tiles$")
	public void CheckNumberofRegulatedJurisdictionsTiles() throws Throwable
	{
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		AboutUS au4 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		Thread.sleep(5000);		
		boolean noofRegulatedJurisdictionsTiles = uc.waitForElement(au4.getNumberofRegulatedJurisdictions()).isEnabled();
		Thread.sleep(3000);
		assertEquals(noofRegulatedJurisdictionsTiles, true);
	}
	
	@Then("^Number of Regulated Jurisdictions will be displayed and close browser$")
	public void NumberofRegulatedJurisdictionswillbedisplayed() throws Throwable
	{
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCcc");
		AboutUS au5 = PageFactory.initElements(driver, AboutUS.class);
		Utilityclass uc = new Utilityclass(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		//uc.waitForElement(au5.getDorpdownarraw()).click();
		Thread.sleep(3000);		
        js.executeScript("arguments[0].scrollIntoView();", au5.getNumberofRegulatedJurisdictions());
		Thread.sleep(5000);		
		String noofRegulatedJurisdictionsdis = uc.waitForElement(au5.getNumberofRegulatedJurisdictions()).getAttribute("data-odometer-count").toString();
		Thread.sleep(10000);
		driver.close();
		assertEquals(noofRegulatedJurisdictionsdis, "20");
		
	}
	
	@Given("^Open 2nd time Chrome browser and enter Playtech url$")
	public void open2ndTimeChromeBrowserAndEnterUrl() throws Throwable
	{
		//driver.manage().deleteAllCookies();
		Properties properties = obj.getProperty();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseUrl"));
		Thread.sleep(3000);
	}
	
	@When("^Click About Us button in home page footer$")
	public void ClickAboutUsbuttoninhomepagefooter() throws Throwable
	{
		FooterPage fp = PageFactory.initElements(driver, FooterPage.class);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Utilityclass uc = new Utilityclass(driver);
		Actions act = new Actions(driver);
		hp.getCookieid().click();
		Thread.sleep(5000);		
		boolean aufl = uc.waitForElement(fp.getFooteraboutus()).isEnabled();
		Thread.sleep(3000);
		uc.waitForElement(fp.getFooteraboutus()).click();
		assertEquals(aufl, true);
	} 
	
	
	
	
}
