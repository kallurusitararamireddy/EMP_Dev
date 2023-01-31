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

public class HrmsRunPayrollPage extends BasePage {

	public HrmsRunPayrollPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//label[contains(text(),'May')]")
	@CacheLookup
	WebElement May;
	
	@FindBy(xpath = "//label[contains(text(),'June')]")
	@CacheLookup
	WebElement June;
	
	@FindBy(xpath = "//label[contains(text(),'July')]")
	@CacheLookup
	WebElement July;
	
	@FindBy(xpath = "//span[contains(text(),'Attendance & Leave')]")
	@CacheLookup
	WebElement Attendance_Leaves;
	
	@FindBy(xpath = "//span[@class='nav-text'][contains(.,'Leave')]")
	@CacheLookup
	WebElement Leaves;
	
	@FindBy(xpath = "//a[@id='Salary_RevisionMenu']")
	@CacheLookup
	WebElement Salary_Revision;
	
	@FindBy(xpath = "//a[@id='Preview_PayrollMenu']")
	@CacheLookup
	WebElement PreviewPayroll;
	
	@FindBy(xpath = "//a[contains(text(),'Pay Register')]")
	@CacheLookup
	WebElement PayRegister;
	
	@FindBy(xpath = "//input[contains(@aria-controls,'pay_register_table')]")
	@CacheLookup
	WebElement SearchBar;
	
	@FindBy(xpath = "//a[contains(text(),'Payout')]")
	@CacheLookup
	WebElement Payout;
	
	
	public  void HrmsRunPayrollPage() throws InterruptedException{
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
		
		helper.waitFor(May);
		helper.highLightElement(driver, May);
		helper.Scrollintoview(May);
		helper.jsCLick(May);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on May");
		Assert.assertTrue(true, "Failed to click on May");
		Thread.sleep(2000);
		
		helper.waitFor(June);
		helper.highLightElement(driver, June);
		helper.Scrollintoview(June);
		helper.jsCLick(June);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on June");
		Assert.assertTrue(true, "Failed to click on June");
		Thread.sleep(2000);
		
		helper.waitFor(July);
		helper.highLightElement(driver, July);
		helper.Scrollintoview(July);
		helper.jsCLick(July);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on July");
		Assert.assertTrue(true, "Failed to click on July");
		Thread.sleep(2000);
		
		helper.waitFor(Attendance_Leaves);
		helper.highLightElement(driver, Attendance_Leaves);
		helper.Scrollintoview(Attendance_Leaves);
		helper.jsCLick(Attendance_Leaves);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Attendance_Leaves");
		Assert.assertTrue(true, "Failed to click on Attendance_Leaves");
		Thread.sleep(2000);
		
		helper.waitFor(Leaves);
		helper.highLightElement(driver, Leaves);
		helper.Scrollintoview(Leaves);
		helper.jsCLick(Leaves);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Leaves");
		Assert.assertTrue(true, "Failed to click on Leaves");
		
		helper.waitFor(Salary_Revision);
		helper.highLightElement(driver, Salary_Revision);
		helper.Scrollintoview(Salary_Revision);
		helper.jsCLick(Salary_Revision);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Salary_Revision");
		Assert.assertTrue(true, "Failed to click on Salary_Revision");
		Thread.sleep(2000);
		
		helper.waitFor(PayRegister);
		helper.highLightElement(driver, PayRegister);
		helper.Scrollintoview(PayRegister);
		helper.jsCLick(PayRegister);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on PayRegister");
		Assert.assertTrue(true, "Failed to click on PayRegister");
		Thread.sleep(2000);
		
		helper.waitFor(SearchBar);
		helper.highLightElement(driver, SearchBar);
		helper.Scrollintoview(SearchBar);
		SearchBar.sendKeys("Auto");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on SearchBar");
		Assert.assertTrue(true, "Failed to click on SearchBar");
		Thread.sleep(3000);
		
		helper.waitFor(Payout);
		helper.highLightElement(driver, Payout);
		helper.Scrollintoview(Payout);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Payout");
		Assert.assertTrue(true, "Failed to click on Payout");
	}

}
