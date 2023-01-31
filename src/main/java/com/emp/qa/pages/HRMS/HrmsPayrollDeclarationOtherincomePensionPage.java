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

public class HrmsPayrollDeclarationOtherincomePensionPage extends BasePage {

	public HrmsPayrollDeclarationOtherincomePensionPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'Other Income')]")
		@CacheLookup
		WebElement OtherIncome;
		
		@FindBy(xpath = "//span[contains(.,'Pension / Family Pension')]")
		@CacheLookup
		WebElement Pension;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction_id']")
		@CacheLookup
		WebElement FinancialYear_Dropdown;
		
		@FindBy(xpath = "//input[@id='SearchTextField5']")
		@CacheLookup
		WebElement SearchBar;
		
		@FindBy(xpath = "//button[@id='SearchButton4']")
		@CacheLookup
		WebElement Search_Button;
		
		@FindBy(css = "tr#empFamilyDataundefined  .btn.btn-primary")
		@CacheLookup
		WebElement FamilyDetails;
		
		@FindBy(xpath = "(//div[contains(@class,'modal-body')])[12]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[12]")
		@CacheLookup
		WebElement Close_Button;
		
		public  void HrmsPayrollDeclarationOtherincomePensionPage() throws InterruptedException{
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
			
			helper.waitFor(OtherIncome);
			helper.highLightElement(driver, OtherIncome);
			helper.Scrollintoview(OtherIncome);
			helper.jsCLick(OtherIncome);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on OtherIncome");
			Assert.assertTrue(true, "Failed to click on OtherIncome");
			
			helper.waitFor(Pension);
			helper.highLightElement(driver, Pension);
			helper.jsCLick(Pension);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Pension");
			Assert.assertTrue(true, "Failed to click on Pension");
			
			helper.waitFor(FinancialYear_Dropdown);
			helper.highLightElement(driver, FinancialYear_Dropdown);
			helper.selectDropDownValue(FinancialYear_Dropdown,"value", "2020-2021");
			//helper.selectDropDownValue(FinancialYear_Dropdown,"value", "2020-2021");)
			//helper.jsCLick(FinancialYear_Dropdown);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on FinancialYear_Dropdown");
			Assert.assertTrue(true, "Failed to click on FinancialYear_Dropdown");
			Thread.sleep(3000);
			
			helper.waitFor(SearchBar);
			helper.highLightElement(driver, SearchBar);
			SearchBar.sendKeys("Auto code");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on SearchBar");
			Assert.assertTrue(true, "Failed to click on SearchBar");
			
			
			helper.waitFor(Search_Button);
			helper.highLightElement(driver, Search_Button);
			helper.jsCLick(Search_Button);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Search_Button");
			Assert.assertTrue(true, "Failed to click on Search_Button");
			
			helper.waitFor(FamilyDetails);
			helper.highLightElement(driver, FamilyDetails);
			helper.jsCLick(FamilyDetails);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on FamilyDetails");
			Assert.assertTrue(true, "Failed to click on FamilyDetails");
			Thread.sleep(3000);
			
			helper.waitFor(Scroller);
			helper.highLightElement(driver, Scroller);
			helper.jsCLick(Scroller);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Scroller");
			Assert.assertTrue(true, "Failed to click on Scroller");
			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			
			
		}

}
