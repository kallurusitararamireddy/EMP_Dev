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

public class HrmsPayrollRunpayrollSalaryRevisionPage extends BasePage {

	public HrmsPayrollRunpayrollSalaryRevisionPage(WebDriver driver) {
		super(driver);
	
	}
   Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Payroll')])[1]")
	@CacheLookup
	WebElement Payroll;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Run Payroll')]")
	@CacheLookup
	WebElement RunPayroll;
	
	@FindBy(xpath = "//a[@id='OverviewMenu']")
	@CacheLookup
	WebElement Overview;
	
	@FindBy(xpath = "//a[@id='Salary_RevisionMenu']")
	@CacheLookup
	WebElement SalaryRevision;
	
	@FindBy(xpath = "//button[@id='Preview_PayrollVerify']")
	@CacheLookup
	WebElement SalaryRevisionVerify_Button;
	
	@FindBy(xpath = "//button[@id='Preview_PayrollNext']")
	@CacheLookup
	WebElement Next_Button;
	
	public  void HrmsPayrollRunpayrollSalaryRevisionPage() throws InterruptedException{
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
		
		
		helper.waitFor(RunPayroll);
		helper.highLightElement(driver, RunPayroll);
		helper.jsCLick(RunPayroll);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on RunPayroll");
		Assert.assertTrue(true, "Failed to click on RunPayroll");
		
				
		helper.waitFor(SalaryRevision);
		helper.highLightElement(driver, SalaryRevision);
		helper.jsCLick(SalaryRevision);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SalaryRevision");
		Assert.assertTrue(true, "Failed to click on SalaryRevision");
		
		helper.waitFor(SalaryRevisionVerify_Button);
		helper.highLightElement(driver, SalaryRevisionVerify_Button);
		helper.jsCLick(SalaryRevisionVerify_Button);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on SalaryRevisionVerify_Button");
		Assert.assertTrue(true, "Failed to click on SalaryRevisionVerify_Button");
		Thread.sleep(6000);
		
		helper.waitFor(Next_Button);
		helper.highLightElement(driver, Next_Button);
		helper.jsCLick(Next_Button);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Next_Button");
		Assert.assertTrue(true, "Failed to click on Next_Button");
		Thread.sleep(4000);
		


}
}

