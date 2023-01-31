package com.emp.qa.pages.HRMS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.Helpers;

public class HrmsEmployeeExperienceDetailsPage extends BasePage {

	public HrmsEmployeeExperienceDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchBarButtoon;
	
	@FindBy(xpath = "//*[@id=\"Basic_Details\"]/div/div[3]/div")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='basic25278']/td[12]/a[1]")
	@CacheLookup
	WebElement ViewEmployeeInformation;
	
	@FindBy(xpath = "//span[contains(text(),'Experience Details')]")
	@CacheLookup
	WebElement ExperienceDetails;
	
	@FindBy(xpath = "//a[@id='add_experience']")
	@CacheLookup
	WebElement AddExperienceDetails;
	
	@FindBy(xpath = "//input[@id='company_name']")
	@CacheLookup
	WebElement company_name;
	
	@FindBy(xpath = "//input[@id='designation']")
	@CacheLookup
	WebElement Designation;
	
	@FindBy(xpath = "//input[@id='manager']")
	@CacheLookup
	WebElement ReportingManager;
	
	@FindBy(xpath = "//input[@id='contact_no']")
	@CacheLookup
	WebElement ContactNumberof_ReportingManager;
	
	
	@FindBy(xpath = "//input[@id='joining_date']")
	@CacheLookup
	WebElement Joining_Date;
	
	@FindBy(xpath = "//input[@id='leaving_date']")
	@CacheLookup
	WebElement Leaving_Date;
	
	@FindBy(xpath = "//input[@id='hr_name']")
	@CacheLookup
	WebElement HRname;
	
	@FindBy(xpath = "//input[@id='hr_mail']")
	@CacheLookup
	WebElement HR_Mail_Id;
	
	@FindBy(xpath = "//input[@id='hr_contact']")
	@CacheLookup
	WebElement HR_contact_No;
	
	@FindBy(xpath = "//input[@id='reason']")
	@CacheLookup
	WebElement Reason;
	
	@FindBy(xpath = "//a[@id='saveOrUpdateExperience']")
	@CacheLookup
	WebElement Save_Button;
	
	
public  void HrmsEmployeeExperienceDetailsPage() throws InterruptedException{
		
		helper.waitFor(Hrms);
		helper.highLightElement(driver, Hrms);
		helper.Scrollintoview(Hrms);
		helper.jsCLick(Hrms);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Hrms Button");
		Assert.assertTrue(true, "Failed to click on Hrms");
		
		Set<String> S1=driver.getWindowHandles();
		Iterator<String>it=S1.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.jsCLick(Employee);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee");
		Assert.assertTrue(true, "Failed to click on Employee");
		
		helper.waitFor(SearchBar);
		helper.highLightElement(driver, SearchBar);
		SearchBar.sendKeys("Auto code");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Etered Data into  SearchBar");
		Assert.assertTrue(true, "Failed to Enter Data into  SearchBar");
		
		helper.waitFor(SearchBarButtoon);
		helper.highLightElement(driver, SearchBarButtoon);
		helper.jsCLick(SearchBarButtoon);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SearchBarButtoon");
		Assert.assertTrue(true, "Failed to click on SearchBarButtoon");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(ViewEmployeeInformation);
		helper.highLightElement(driver, ViewEmployeeInformation);
		helper.jsCLick(ViewEmployeeInformation);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ViewEmployeeInformation");
		Assert.assertTrue(true, "Failed to click on ViewEmployeeInformation");
		
		helper.waitFor(ExperienceDetails);
		helper.highLightElement(driver, ExperienceDetails);
		helper.jsCLick(ExperienceDetails);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on ExperienceDetails");
		Assert.assertTrue(true, "Failed to click on ExperienceDetails");
		
		helper.waitFor(AddExperienceDetails);
		helper.highLightElement(driver, AddExperienceDetails);
		helper.jsCLick(AddExperienceDetails);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on AddExperienceDetails");
		Assert.assertTrue(true, "Failed to click on AddExperienceDetails");
		
		
		helper.waitFor(company_name);
		helper.highLightElement(driver, company_name);
		company_name.sendKeys("poiuy");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on company_name");
		Assert.assertTrue(true, "Failed to click on company_name");
		
		helper.waitFor(Designation);
		helper.highLightElement(driver, Designation);
		Designation.sendKeys("Tester");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Designation");
		Assert.assertTrue(true, "Failed to click on Designation");
		
		helper.waitFor(ReportingManager);
		helper.highLightElement(driver, ReportingManager);
		ReportingManager.sendKeys("Tony");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on ReportingManager");
		Assert.assertTrue(true, "Failed to click on ReportingManager");
		
		helper.waitFor(ContactNumberof_ReportingManager);
		helper.highLightElement(driver, ContactNumberof_ReportingManager);
		ContactNumberof_ReportingManager.sendKeys("8907654321");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on ContactNumberof_ReportingManager");
		Assert.assertTrue(true, "Failed to click on ContactNumberof_ReportingManager");
		
		helper.waitFor(Joining_Date);
		helper.highLightElement(driver, Joining_Date);
		Joining_Date.sendKeys("01012019");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Joining_Date");
		Assert.assertTrue(true, "Failed to click on Joining_Date");
		
		helper.waitFor(Leaving_Date);
		helper.highLightElement(driver, Leaving_Date);
		Leaving_Date.sendKeys("01082019");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Leaving_Date");
		Assert.assertTrue(true, "Failed to click on Leaving_Date");
		
		helper.waitFor(HRname);
		helper.highLightElement(driver, HRname);
		HRname.sendKeys("josh");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on HRname");
		Assert.assertTrue(true, "Failed to click on HRname");
		
		helper.waitFor(HR_Mail_Id);
		helper.highLightElement(driver, HR_Mail_Id);
		HR_Mail_Id.sendKeys("hr@gmail.com");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on HR_Mail_Id");
		Assert.assertTrue(true, "Failed to click on HR_Mail_Id");
		
		helper.waitFor(HR_contact_No);
		helper.highLightElement(driver, HR_contact_No);
		HR_contact_No.sendKeys("7654321890");
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on HR_contact_No");
		Assert.assertTrue(true, "Failed to click on HR_contact_No");
		
		helper.waitFor(Reason);
		helper.highLightElement(driver, Reason);
		Reason.sendKeys("CarrierGrowth");
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> clicked on Reason");
		Assert.assertTrue(true, "Failed to click on Reason");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed to click on Save_Button");
		Thread.sleep(4000);
		
		
		
		
}
}
