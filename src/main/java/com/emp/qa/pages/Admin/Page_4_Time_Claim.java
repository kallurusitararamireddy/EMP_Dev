package com.emp.qa.pages.Admin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Page_4_Time_Claim extends BasePage {

	public Page_4_Time_Claim(WebDriver driver) {
		super(driver);

	}

	public  Helpers helper = new Helpers();

	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement SelctDateRanges;
	
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//select[@id='statusField']")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//*[@id=\"statusField\"]/option[2]")
	@CacheLookup
	WebElement All;
	
	@FindBy(xpath = "//input[@id='idle-btn']")
	@CacheLookup
	WebElement Idle_Radio_Button;
	
	@FindBy(xpath = "//input[@id='offline-btn']")
	@CacheLookup
	WebElement offline_Radio_Button;
	
	
	
	public void Time_Claim_Page()throws InterruptedException{
		
		
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> Clicked on Time-Claim Module and Clicked on Show-Entries Drop-down and selected value  ");
		Assert.assertTrue(true, "Failed to Click on Time-Claim Module and Clicked on Show-Entries Drop-down and selected value ");
		
		helper.waitFor(SelctDateRanges);
		helper.highLightElement(driver, SelctDateRanges);
		SelctDateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Calendar Drop-down and Selected Day's ");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's ");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on  Last-30-days Button");
		Assert.assertTrue(true, "Failed to Click on  Last-30-days Button");
		
		helper.waitFor(Status);
		helper.highLightElement(driver, Status);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Status Drop-down and Selected Status option");
		Assert.assertTrue(true, "Failed to Click on Status Drop-down and Selected Status option");
		
		helper.waitFor(Idle_Radio_Button);
		helper.highLightElement(driver, Idle_Radio_Button);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on  Idle_Radio Button ");
		Assert.assertTrue(true, "Failed to Click on  Idle_Radio Button");
		
		helper.waitFor(offline_Radio_Button);
		helper.highLightElement(driver, offline_Radio_Button);
		offline_Radio_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on  offline_Radio Button ");
		Assert.assertTrue(true, "Failed to Click on  offline_Radio Button");
		Thread.sleep(5000);
		
		
	}


}
