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

public class HrmsEmployeeAllDetailsPage extends BasePage{

	public HrmsEmployeeAllDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper =new Helpers ();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Basic Details')]")
	@CacheLookup
	WebElement BasicDetails;
	

	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchBar;
	

	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(xpath = "//div[@class='stickyCol-2-scroller']")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='basic25278']/td[12]/a[1]")
	@CacheLookup
	WebElement ViewEmployeeInformation_Button ;
	
	@FindBy(xpath = "//div[contains(text(),'Basic details (View Only)')]")
	@CacheLookup
	WebElement BasicDetailsView ;
	
	@FindBy(xpath = "//div[contains(text(),'Family Details (View Only)')]")
	@CacheLookup
	WebElement FamilyDetails ;
	
	@FindBy(xpath = "//div[contains(text(),'Qualification Details (View Only)')]")
	@CacheLookup
	WebElement Qualification_Details ;
	
	@FindBy(xpath = "//div[contains(text(),'Experience Details (View Only)')]")
	@CacheLookup
	WebElement Experience_Details ;
	
	@FindBy(xpath = "//div[contains(text(),'Bank details (View Only)')]")
	@CacheLookup
	WebElement BankDetails ;
	
	@FindBy(xpath = "//div[contains(text(),'Complience details (View Only)')]")
	@CacheLookup
	WebElement Compliance_Details ;
	
	@FindBy(xpath = "//div[contains(text(),'Component and Perquisites details (View Only)')]")
	@CacheLookup
	WebElement Componentandprerequisites ;
	
	public  void HrmsEmployeeAllDetailsPage() throws InterruptedException{
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
		helper.Scrollintoview(Employee);
		helper.jsCLick(Employee);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Hrms Employee");
		Assert.assertTrue(true, "Failed to click on Employee");
		
		helper.waitFor(BasicDetails);
		helper.highLightElement(driver, BasicDetails);
		helper.Scrollintoview(BasicDetails);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Hrms BasicDetails");
		Assert.assertTrue(true, "Failed to click on BasicDetails");
		
		helper.waitFor(SearchBar);
		helper.highLightElement(driver, SearchBar);
		SearchBar.sendKeys("Auto code");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SearchBar And Entered Data into Search Bar ");
		Assert.assertTrue(true, "Failed to click on SearchBar And Entered Data into Search Bar");
		
		helper.waitFor(SearchButton);
		helper.highLightElement(driver, SearchButton);
		helper.jsCLick(SearchButton);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  SearchButton");
		Assert.assertTrue(true, "Failed to click on SearchButton");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(ViewEmployeeInformation_Button);
		helper.highLightElement(driver, ViewEmployeeInformation_Button);
		helper.jsCLick(ViewEmployeeInformation_Button);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  ViewEmployeeInformation_Button");
		Assert.assertTrue(true, "Failed to click on ViewEmployeeInformation_Button");
		Thread.sleep(3000);
		
		helper.waitFor(BasicDetailsView);
		helper.highLightElement(driver, BasicDetailsView);
		helper.jsCLick(BasicDetailsView);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  BasicDetailsView");
		Assert.assertTrue(true, "Failed to click on BasicDetailsView");
		Thread.sleep(3000);
		
		helper.waitFor(FamilyDetails);
		helper.highLightElement(driver, FamilyDetails);
		helper.jsCLick(FamilyDetails);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on  FamilyDetails");
		Assert.assertTrue(true, "Failed to click on FamilyDetails");
		Thread.sleep(3000);
		
		helper.waitFor(Qualification_Details);
		helper.highLightElement(driver, Qualification_Details);
		helper.jsCLick(Qualification_Details);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  Qualification_Details");
		Assert.assertTrue(true, "Failed to click on Qualification_Details");
		Thread.sleep(3000);

		
		helper.waitFor(Experience_Details);
		helper.highLightElement(driver, Experience_Details);
		helper.jsCLick(Experience_Details);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  Experience_Details");
		Assert.assertTrue(true, "Failed to click on Experience_Details");
		Thread.sleep(3000);
		
		helper.waitFor(BankDetails);
		helper.highLightElement(driver, BankDetails);
		helper.Scrollintoview(BankDetails);
		helper.jsCLick(BankDetails);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on  BankDetails");
		Assert.assertTrue(true, "Failed to click on BankDetails");
		Thread.sleep(3000);

		
		helper.waitFor(Compliance_Details);
		helper.highLightElement(driver, Compliance_Details);
		helper.Scrollintoview(Compliance_Details);
		helper.jsCLick(Compliance_Details);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on  Compliance_Details");
		Assert.assertTrue(true, "Failed to click on Compliance_Details");
		Thread.sleep(3000);

		
		helper.waitFor(Componentandprerequisites);
		helper.highLightElement(driver, Componentandprerequisites);
		helper.Scrollintoview(Componentandprerequisites);
		helper.jsCLick(Componentandprerequisites);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on  Componentandprerequisites");
		Assert.assertTrue(true, "Failed to click on Componentandprerequisites");
		Thread.sleep(3000);





}
}
