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

public class HrmsPayrollDeclarationTaxSchemePage extends BasePage {

	public HrmsPayrollDeclarationTaxSchemePage(WebDriver driver) {
		super(driver);
		
	}
	
  Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//a[@href='run-payroll'][contains(.,'Payroll')])[1]")
	@CacheLookup
	WebElement Payroll;
	
	@FindBy(xpath = "//span[contains(text(),'Declaration')]")
	@CacheLookup
	WebElement Declaration;
	
	@FindBy(xpath = "//select[@id='employeTypeId']")
	@CacheLookup
	WebElement EmployeeDropdown;
	
	@FindBy(xpath = "//a[@id='home-tab-2']")
	@CacheLookup
	WebElement TaxScheme;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement Search_Bar;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-search')])[1]")
	@CacheLookup
	WebElement SearchBarclick;
	
	@FindBy(xpath = "//select[@id='taxScheme24858']")
	@CacheLookup
	WebElement TaxScheme_DropDown;
	
	public  void HrmsPayrollDeclarationTaxSchemePage() throws InterruptedException{
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
		
		helper.waitFor(Payroll);
		helper.highLightElement(driver, Payroll);
		helper.Scrollintoview(Payroll);
		helper.jsCLick(Payroll);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Payroll");
		Assert.assertTrue(true, "Failed to click on Payroll");
		
		helper.waitFor(Declaration);
		helper.highLightElement(driver, Declaration);
		helper.Scrollintoview(Declaration);
		helper.jsCLick(Declaration);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Declaration");
		Assert.assertTrue(true, "Failed to click on Declaration");
		
		helper.waitFor(TaxScheme);
		helper.highLightElement(driver, TaxScheme);
		helper.Scrollintoview(TaxScheme);
		helper.jsCLick(TaxScheme);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on TaxScheme");
		Assert.assertTrue(true, "Failed to click on TaxScheme");
		
		helper.waitFor(EmployeeDropdown);
		helper.highLightElement(driver, EmployeeDropdown);
		helper.Scrollintoview(EmployeeDropdown);
	    helper.selectDropDownValue(EmployeeDropdown, "value", "2");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on EmployeeDropdown");
		Assert.assertTrue(true, "Failed to click on EmployeeDropdown");
		

		helper.waitFor(Search_Bar);
		helper.highLightElement(driver, Search_Bar);
		Search_Bar.sendKeys("Auto");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Search_Bar");
		Assert.assertTrue(true, "Failed to click on Search_Bar");

		

		helper.waitFor(SearchBarclick);
		helper.highLightElement(driver, SearchBarclick);
		helper.jsCLick(SearchBarclick);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on SearchBarclick");
		Assert.assertTrue(true, "Failed to click on SearchBarclick");
		Thread.sleep(4000);
		

		helper.waitFor(TaxScheme_DropDown);
		helper.highLightElement(driver, TaxScheme_DropDown);
	    helper.selectDropDownValue(TaxScheme_DropDown, "value", "2");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on TaxScheme_DropDown");
		Assert.assertTrue(true, "Failed to click on TaxScheme_DropDown");
		Thread.sleep(5000);
		
	}
	

}
