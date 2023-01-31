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

public class HrmsPayrollDelarationOtherincomeOneHousepropertyPage extends BasePage {

	public HrmsPayrollDelarationOtherincomeOneHousepropertyPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'One House Property')]")
		@CacheLookup
		WebElement Onehouse_Property;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction_id']")
		@CacheLookup
		WebElement FinancialYear_Dropdown;
		
		@FindBy(xpath = "//input[@id='SearchTextField2']")
		@CacheLookup
		WebElement SearchBar;
		
		@FindBy(xpath = "//button[@id='SearchButton1']")
		@CacheLookup
		WebElement Search_Button;
		
		@FindBy(xpath = "//a[@onclick='showHousePropertyDetails(9340)']")
		@CacheLookup
		WebElement MoreData_Button;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[15]")
		@CacheLookup
		WebElement Close_Button;
		
		public  void HrmsPayrollDelarationOtherincomeOneHousepropertyPage() throws InterruptedException{
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
			
			helper.waitFor(Onehouse_Property);
			helper.highLightElement(driver, Onehouse_Property);
			helper.jsCLick(Onehouse_Property);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Onehouse_Property");
			Assert.assertTrue(true, "Failed to click on Onehouse_Property");
			
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
			SearchBar.sendKeys("s7");
			helper.jsCLick(SearchBar);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on SearchBar");
			Assert.assertTrue(true, "Failed to click on SearchBar");
			
			helper.waitFor(Search_Button);
			helper.highLightElement(driver, Search_Button);
			helper.jsCLick(Search_Button);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Search_Button");
			Assert.assertTrue(true, "Failed to click on Search_Button");
			Thread.sleep(3000);
			
			helper.waitFor(MoreData_Button);
			helper.highLightElement(driver, MoreData_Button);
			helper.jsCLick(MoreData_Button);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on MoreData_Button");
			Assert.assertTrue(true, "Failed to click on MoreData_Button");
			Thread.sleep(2000);
			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			driver.navigate().back();
		
			
			
		}
		

}
