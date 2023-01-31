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

public class HrmsEmployeeDashboardTaxDeclarationOverviewPage extends BasePage {

	public HrmsEmployeeDashboardTaxDeclarationOverviewPage(WebDriver driver) {
		super(driver);
		
	}
	    Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
		@CacheLookup
		WebElement Attendance;
		
		@FindBy(xpath = "//span[contains(text(),'Tax Declaration')]")
		@CacheLookup
		WebElement TaxDeclaration;
		
		@FindBy(xpath = "//select[@id='emp_finalcial_year_tax_scheme']")
		@CacheLookup
		WebElement FinancialYearDropDown;
		
		@FindBy(xpath = "//a[contains(@href,'Overview')]")
		@CacheLookup
		WebElement overviewpage;
		
		@FindBy(xpath = "//a[@id='new_tax_scheme_id']")
		@CacheLookup
		WebElement NewTaxScheme;
		
		@FindBy(xpath = "//a[@id='old_tax_scheme_id']")
		@CacheLookup
		WebElement OldTaxScheme;
		
		
		
		 public  void HrmsEmployeeDashboardTaxDeclarationOverviewPage() throws InterruptedException{
             
			 helper.waitFor(Hrms);
				helper.highLightElement(driver, Hrms);
				helper.Scrollintoview(Hrms);
				helper.jsCLick(Hrms);
				Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Hrms Button");
				Assert.assertTrue(true, "Failed to click on Hrms");
				Thread.sleep(5000);
				
				Set<String> S1=driver.getWindowHandles();
				Iterator<String>it=S1.iterator();
				String parent=it.next();
				String child=it.next();
				
				driver.switchTo().window(child);
				
				helper.waitFor(TaxDeclaration);
				helper.highLightElement(driver, TaxDeclaration);
				helper.jsCLick(TaxDeclaration);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  TaxDeclaration Button");
				Assert.assertTrue(true, "Failed to click on TaxDeclaration Button");  
				
				helper.waitFor(overviewpage);
				helper.highLightElement(driver, overviewpage);
				helper.jsCLick(overviewpage);
				Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  overviewpage Button");
				Assert.assertTrue(true, "Failed to click on overviewpage Button");
				
				helper.waitFor(FinancialYearDropDown);
				helper.highLightElement(driver, FinancialYearDropDown);
				helper.Scrollintoview(FinancialYearDropDown);
			    helper.selectDropDownValue(FinancialYearDropDown, "value", "2020-2021");
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  FinancialYearDropDown Button");
				Assert.assertTrue(true, "Failed to click on FinancialYearDropDown Button");
				Thread.sleep(4000);
				
				helper.waitFor(NewTaxScheme);
				helper.highLightElement(driver, NewTaxScheme);
				helper.Scrollintoview(NewTaxScheme);
				helper.jsCLick(NewTaxScheme);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  NewTaxScheme Button");
				Assert.assertTrue(true, "Failed to click on NewTaxScheme Button");
				Thread.sleep(4000);
				
				helper.waitFor(OldTaxScheme);
				helper.highLightElement(driver, OldTaxScheme);
				helper.Scrollintoview(OldTaxScheme);
				helper.jsCLick(OldTaxScheme);
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  OldTaxScheme Button");
				Assert.assertTrue(true, "Failed to click on OldTaxScheme Button");
				Thread.sleep(4000);
				
				


	

}
}

