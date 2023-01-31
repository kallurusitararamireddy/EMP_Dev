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

public class HrmsSetupPayrollPage extends BasePage {

	public HrmsSetupPayrollPage(WebDriver driver) {
		super(driver);
		
	}
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Payroll')])[1]")
	@CacheLookup
	WebElement Payroll;
	
	@FindBy(xpath = "//span[contains(text(),'Setup Payroll')]")
	@CacheLookup
	WebElement SetupPayroll;
	
	@FindBy(xpath = "//a[contains(text(),'Payroll Settings')]")
	@CacheLookup
	WebElement PayrollSettings;
	
	@FindBy(xpath = "//input[@id='PF_CompanyButton']")
	@CacheLookup
	WebElement DoesYourCompanyHavepf;
	
	@FindBy(xpath = "//select[@id='selectContributionType']")
	@CacheLookup
	WebElement EmployeeContribution;
	
	@FindBy(xpath = "//button[@id='payrollSettingUpdateButton']")
	@CacheLookup
	WebElement PayRoll_SaveButton;
	
	
	public  void HrmsSetupPayrollPage() throws InterruptedException{
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
		helper.jsCLick(Payroll);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Payroll");
		Assert.assertTrue(true, "Failed to click on Payroll");
		
		helper.waitFor(SetupPayroll);
		helper.highLightElement(driver, SetupPayroll);
		helper.jsCLick(SetupPayroll);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on SetupPayroll");
		Assert.assertTrue(true, "Failed to click on SetupPayroll");
		
		helper.waitFor(PayrollSettings);
		helper.highLightElement(driver, PayrollSettings);
		helper.jsCLick(PayrollSettings);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on PayrollSettings");
		Assert.assertTrue(true, "Failed to click on PayrollSettings");
		
		helper.waitFor(DoesYourCompanyHavepf);
		helper.highLightElement(driver, DoesYourCompanyHavepf);
		helper.jsCLick(DoesYourCompanyHavepf);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on DoesYourCompanyHavepf");
		Assert.assertTrue(true, "Failed to click on DoesYourCompanyHavepf");
		
		helper.waitFor(EmployeeContribution);
		helper.highLightElement(driver, EmployeeContribution);
		helper.selectDropDownValue(EmployeeContribution, "value", "12");
		helper.jsCLick(EmployeeContribution);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on EmployeeContribution");
		Assert.assertTrue(true, "Failed to click on EmployeeContribution");
		
		helper.waitFor(PayRoll_SaveButton);
		helper.highLightElement(driver, PayRoll_SaveButton);
		helper.jsCLick(PayRoll_SaveButton);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on PayRoll_SaveButton");
		Assert.assertTrue(true, "Failed to click on PayRoll_SaveButton");
	}

}
