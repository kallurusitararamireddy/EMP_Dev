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

public class HrmsPayrollDeclarationOtherincomePage extends BasePage {

	public HrmsPayrollDeclarationOtherincomePage(WebDriver driver) {
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
		
		@FindBy(xpath = "//a[contains(.,'Savings Bank Interest')]")
		@CacheLookup
		WebElement Savings_Bank_Interest;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction_id']")
		@CacheLookup
		WebElement FinancialYear_DropDown;
		
		@FindBy(xpath = "//input[@id='SearchTextField4']")
		@CacheLookup
		WebElement Search_Bar;
		
		@FindBy(xpath = "//button[@id='SearchButton3']")
		@CacheLookup
		WebElement Searchbar_click;
		
		@FindBy(xpath = "//a[contains(text(),'Bank Details')]")
		@CacheLookup     //a[contains(text(),'Bank Details')]
		WebElement Bank_Details;
		
		@FindBy(xpath = "(//div[contains(@class,'modal-body')])[11]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[11]")
		@CacheLookup
		WebElement Close_Button;
		
		
		
		
		public  void HrmsPayrollDeclarationOtherincomePage() throws InterruptedException{
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
			
			helper.waitFor(Savings_Bank_Interest);
			helper.highLightElement(driver, Savings_Bank_Interest);
			helper.Scrollintoview(Savings_Bank_Interest);
			helper.jsCLick(Savings_Bank_Interest);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Savings_Bank_Interest");
			Assert.assertTrue(true, "Failed to click on Savings_Bank_Interest");
			
			helper.waitFor(FinancialYear_DropDown);
			helper.highLightElement(driver, FinancialYear_DropDown);
			helper.Scrollintoview(FinancialYear_DropDown);
			helper.selectDropDownValue(FinancialYear_DropDown, "value", "2020-2021");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on FinancialYear_DropDown ");
			Assert.assertTrue(true, "Failed to click on FinancialYear_DropDown");
			
			helper.waitFor(Search_Bar);
			helper.highLightElement(driver, Search_Bar);
			Search_Bar.sendKeys("s7");
			helper.jsCLick(Search_Bar);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Search_Bar");
			Assert.assertTrue(true, "Failed to click on Search_Bar");
			
			helper.waitFor(Searchbar_click);
			helper.highLightElement(driver, Searchbar_click);
			helper.jsCLick(Searchbar_click);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Searchbar_click");
			Assert.assertTrue(true, "Failed to click on Searchbar_click");
			Thread.sleep(3000);
			
			helper.waitFor(Bank_Details);
			helper.highLightElement(driver, Bank_Details);
			helper.jsCLick(Bank_Details);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Bank_Details");
			Assert.assertTrue(true, "Failed to click on Bank_Details");
			
			helper.waitFor(Scroller);
			helper.highLightElement(driver, Scroller);
			helper.jsCLick(Scroller);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Scroller");
			Assert.assertTrue(true, "Failed to click on Scroller");
			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			

			
		}
		

}
