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

public class HrmsPayrollDeclarationOtherincomeOtherthanSavingPage extends BasePage{

	public HrmsPayrollDeclarationOtherincomeOtherthanSavingPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'Other than Savings Bank Int.')]")
		@CacheLookup
		WebElement OtherThan_Savings;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction_id']")
		@CacheLookup
		WebElement Financialyear_DropDown;
		
		@FindBy(xpath = "//input[@id='SearchTextField4']")
		@CacheLookup
		WebElement Search_Bar;
		
		@FindBy(xpath = "(//button[contains(@onclick,'SearchText()')])[2]")
		@CacheLookup
		WebElement Searchbar_Button;
		
		@FindBy(xpath = "//a[contains(text(),'Bank Details')]")
		@CacheLookup
		WebElement BankDetails;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[11]")
		@CacheLookup
		WebElement Close_Button;
		
		

		public  void HrmsPayrollDeclarationOtherincomeOtherthanSavingPage() throws InterruptedException{
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
			
			helper.waitFor(OtherThan_Savings);
			helper.highLightElement(driver, OtherThan_Savings);
			helper.jsCLick(OtherThan_Savings);
			Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on OtherThan_Savings");
			Assert.assertTrue(true, "Failed to click on OtherThan_Savings");
			
			helper.waitFor(Financialyear_DropDown);
			helper.highLightElement(driver, Financialyear_DropDown);
			helper.selectDropDownValue(Financialyear_DropDown, "value", "2020-2021");
			Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Financialyear_DropDown");
			Assert.assertTrue(true, "Failed to click on Financialyear_DropDown");
			
			helper.waitFor(Search_Bar);
			helper.highLightElement(driver, Search_Bar);
			Search_Bar.sendKeys("s7");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Search_Bar");
			Assert.assertTrue(true, "Failed to click on Search_Bar");
			
			helper.waitFor(Searchbar_Button);
			helper.highLightElement(driver, Searchbar_Button);
			helper.jsCLick(Searchbar_Button);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Searchbar_Button");
			Assert.assertTrue(true, "Failed to click on Searchbar_Button");
			
			helper.waitFor(BankDetails);
			helper.highLightElement(driver, BankDetails);
			helper.jsCLick(BankDetails);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on BankDetails");
			Assert.assertTrue(true, "Failed to click on BankDetails");
			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			
		}

}
