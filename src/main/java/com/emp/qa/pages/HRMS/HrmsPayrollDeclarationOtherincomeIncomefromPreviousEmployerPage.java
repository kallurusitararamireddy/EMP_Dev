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

public class HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage extends BasePage{

	public HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'Income from Previous Employer')]")
		@CacheLookup
		WebElement IncomefromPrevious;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction_id']")
		@CacheLookup
		WebElement FinancialYear_DropDown;
		
		@FindBy(xpath = "//input[@id='SearchTextField3']")
		@CacheLookup
		WebElement SearchBar;
		
		@FindBy(xpath = "//button[@id='SearchButton2']")
		@CacheLookup
		WebElement SearchButton;
		
		@FindBy(xpath = "//a[@onclick='showMoreEmpDetails(9340)']")
		@CacheLookup
		WebElement MoreData;
		
		@FindBy(xpath = "(//div[@class='modal-body'])[10]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[10]")
		@CacheLookup
		WebElement Close_Button;
		
		public  void HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage() throws InterruptedException{
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
			
			helper.waitFor(IncomefromPrevious);
			helper.highLightElement(driver, IncomefromPrevious);
			helper.Scrollintoview(IncomefromPrevious);
			helper.jsCLick(IncomefromPrevious);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on IncomefromPrevious");
			Assert.assertTrue(true, "Failed to click on IncomefromPrevious");
			
			helper.waitFor(FinancialYear_DropDown);
			helper.highLightElement(driver, FinancialYear_DropDown);
			helper.selectDropDownValue(FinancialYear_DropDown, "value", "2020-2021");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on FinancialYear_DropDown");
			Assert.assertTrue(true, "Failed to click on FinancialYear_DropDown");
			
			helper.waitFor(SearchBar);
			helper.highLightElement(driver, SearchBar);
			SearchBar.sendKeys("s7");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on SearchBar");
			Assert.assertTrue(true, "Failed to click on SearchBar");
			
			helper.waitFor(SearchButton);
			helper.highLightElement(driver, SearchButton);
			helper.jsCLick(SearchButton);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on SearchButton");
			Assert.assertTrue(true, "Failed to click on SearchButton");
			Thread.sleep(3000);
			
			helper.waitFor(MoreData);
			helper.highLightElement(driver, MoreData);
			helper.jsCLick(MoreData);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on MoreData");
			Assert.assertTrue(true, "Failed to click on MoreData");
			

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
			Thread.sleep(3000);
			
			
		}
		
	
	

}
