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

public class HrmsPayrollRunpayrollAttendanceandLeavePage extends BasePage {

	public HrmsPayrollRunpayrollAttendanceandLeavePage(WebDriver driver) {
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
	
	@FindBy(xpath = "//button[contains(@href,'Leave')]")
	@CacheLookup
	WebElement NextButton;
	
	@FindBy(xpath = "//div[@id='attendance_Leave']//ul[@role='tablist']//a[@href='#attendance']/span[@class='nav-text']")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//button[@id='Salary_RevisionNext']/i[@class='flaticon2-checkmark mr-3']")
	@CacheLookup
	WebElement Verify_Button;
	
	@FindBy(xpath = "//a[contains(@onclick,'EmployeeLeaves();')]")
	@CacheLookup
	WebElement Leaves_Button;
	
	@FindBy(xpath = "//button[@id='Salary_RevisionNext']/i[@class='flaticon2-checkmark mr-3']")
	@CacheLookup
	WebElement LeavesVerify_Button;
	
	@FindBy(xpath = "//button[@id='Salary_RevisionNext']")
	@CacheLookup
	WebElement SalaryRevision_NextButton;
	
	
	public  void HrmsPayrollRunpayrollAttendanceandLeavePage() throws InterruptedException{
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
		
		helper.waitFor(Overview);
		helper.highLightElement(driver, Overview);
		helper.Scrollintoview(Overview);
		helper.jsCLick(Overview);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Overview");
		Assert.assertTrue(true, "Failed to click on Overview");
		
		helper.waitFor(NextButton);
		helper.highLightElement(driver, NextButton);
		helper.jsCLick(NextButton);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on NextButton");
		Assert.assertTrue(true, "Failed to click on NextButton");
	
		
		helper.waitFor(Attendance);
		helper.highLightElement(driver, Attendance);
		helper.jsCLick(Attendance);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Attendance");
		Assert.assertTrue(true, "Failed to click on Attendance");
		Thread.sleep(3000);
		
		
//		helper.waitFor(Verify_Button);
//		helper.highLightElement(driver, Verify_Button);
//		helper.jsCLick(Verify_Button);
//		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Verify_Button");
//		Assert.assertTrue(true, "Failed to click on Verify_Button");
//		Thread.sleep(20000);
		
		helper.waitFor(Leaves_Button);
		helper.highLightElement(driver, Leaves_Button);
		helper.jsCLick(Leaves_Button);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Leaves_Button");
		Assert.assertTrue(true, "Failed to click on Leaves_Button");
		Thread.sleep(4000);
		
		helper.waitFor(LeavesVerify_Button);
		helper.highLightElement(driver, LeavesVerify_Button);
		helper.Scrollintoview(LeavesVerify_Button);
		helper.jsCLick(LeavesVerify_Button);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on LeavesVerify_Button");
		Assert.assertTrue(true, "Failed to click on LeavesVerify_Button");
		Thread.sleep(20000);
		
		helper.waitFor(SalaryRevision_NextButton);
		helper.highLightElement(driver, SalaryRevision_NextButton);
		helper.jsCLick(SalaryRevision_NextButton);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on SalaryRevision_NextButton");
		Assert.assertTrue(true, "Failed to click on SalaryRevision_NextButton");
		Thread.sleep(4000);

}
}

