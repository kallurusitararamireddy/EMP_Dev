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

public class HrmsEmployeeDashBoardPage extends BasePage {

	public HrmsEmployeeDashBoardPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//span[contains(.,'Leaves')]")
	@CacheLookup
	WebElement Leaves;
	
	@FindBy(xpath = "//a[contains(.,'Tax Declaration')]")
	@CacheLookup
	WebElement Tax_Declaration;
	
	@FindBy(xpath = "(//span[contains(.,'Declaration')])[2]")
	@CacheLookup
	WebElement Declaration;
	
	@FindBy(xpath = "//a[contains(.,'Overview')]")
	@CacheLookup
	WebElement overview;
	
	@FindBy(xpath = "//a[contains(.,'Deduction')]")
	@CacheLookup
	WebElement Deduction;
	
	@FindBy(xpath = "//span[contains(.,'Section 80 C / 80CCD / ETC')]")
	@CacheLookup
	WebElement Section_80C;
	
	@FindBy(xpath = "(//span[contains(.,'House Rent')])[2]")
	@CacheLookup
	WebElement House_Rent;
	
	@FindBy(xpath = "(//span[contains(.,'LTA')])[2]")
	@CacheLookup
	WebElement Lta;
	
	@FindBy(xpath = "//a[contains(.,'Other Income')]")
	@CacheLookup
	WebElement Other_Income;
	
	@FindBy(xpath = "(//span[contains(.,'Savings Bank Interest')])[2]")
	@CacheLookup
	WebElement Savingsbank_interest;
	
	@FindBy(xpath = "(//span[contains(.,'other than Savings Bank Int.')])[2]")
	@CacheLookup
	WebElement OtherthanSavingsbank_int;
	
	@FindBy(xpath = "(//a[contains(.,'One House Property')])[2]")
	@CacheLookup
	WebElement One_House_Property;
	
	@FindBy(xpath = "(//span[contains(.,'Pension / Family Pension')])[2]")
	@CacheLookup
	WebElement Pension_Family_Pension;
	
	@FindBy(xpath = "(//span[contains(.,'Income from Previous Employer')])[2]")
	@CacheLookup
	WebElement IncomefromPreviousEmployer;
	
	
	
	
	public  void HrmsEmployeeDashBoardPage() throws InterruptedException{
		
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
		
		helper.waitFor(Attendance);
		helper.highLightElement(driver, Attendance);
		helper.jsCLick(Attendance);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Attendance");
		Assert.assertTrue(true, "Failed to click on Attendance");
		
		helper.waitFor(Leaves);
		helper.highLightElement(driver, Leaves);
		helper.jsCLick(Leaves);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Leaves");
		Assert.assertTrue(true, "Failed to click on Leaves");
		
		helper.waitFor(Tax_Declaration);
		helper.highLightElement(driver, Tax_Declaration);
		helper.jsCLick(Tax_Declaration);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Tax_Declaration");
		Assert.assertTrue(true, "Failed to click on Tax_Declaration");
		
		helper.waitFor(Declaration);
		helper.highLightElement(driver, Declaration);
		helper.jsCLick(Declaration);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  Declaration");
		Assert.assertTrue(true, "Failed to click on Declaration");
		
		helper.waitFor(overview);
		helper.highLightElement(driver, overview);
		helper.jsCLick(overview);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  overview");
		Assert.assertTrue(true, "Failed to click on overview");
		
		helper.waitFor(Deduction);
		helper.highLightElement(driver, Deduction);
		helper.jsCLick(Deduction);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  Deduction");
		Assert.assertTrue(true, "Failed to click on Deduction");
		Thread.sleep(3000);
		
		helper.waitFor(Section_80C);
		helper.highLightElement(driver, Section_80C);
		helper.jsCLick(Section_80C);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  Section_80C");
		Assert.assertTrue(true, "Failed to click on Section_80C");
		Thread.sleep(3000);
		
		helper.waitFor(House_Rent);
		helper.highLightElement(driver, House_Rent);
		helper.jsCLick(House_Rent);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on  House_Rent");
		Assert.assertTrue(true, "Failed to click on House_Rent");
		Thread.sleep(3000);
		
		helper.waitFor(Lta);
		helper.highLightElement(driver, Lta);
		helper.jsCLick(Lta);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  Lta");
		Assert.assertTrue(true, "Failed to click on Lta");
		Thread.sleep(3000);
		
		helper.waitFor(Other_Income);
		helper.highLightElement(driver, Other_Income);
		helper.jsCLick(Other_Income);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  Other_Income");
		Assert.assertTrue(true, "Failed to click on Other_Income");
		Thread.sleep(3000);
		
		helper.waitFor(Savingsbank_interest);
		helper.highLightElement(driver, Savingsbank_interest);
		helper.jsCLick(Savingsbank_interest);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on  Savingsbank_interest");
		Assert.assertTrue(true, "Failed to click on Savingsbank_interest");
		Thread.sleep(3000);
		
		helper.waitFor(OtherthanSavingsbank_int);
		helper.highLightElement(driver, OtherthanSavingsbank_int);
		helper.jsCLick(OtherthanSavingsbank_int);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on  OtherthanSavingsbank_int");
		Assert.assertTrue(true, "Failed to click on OtherthanSavingsbank_int");
		Thread.sleep(3000);
		
		helper.waitFor(One_House_Property);
		helper.highLightElement(driver, One_House_Property);
		helper.jsCLick(One_House_Property);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on  One_House_Property");
		Assert.assertTrue(true, "Failed to click on One_House_Property");
		Thread.sleep(3000);
		
		helper.waitFor(Pension_Family_Pension);
		helper.highLightElement(driver, Pension_Family_Pension);
		helper.jsCLick(Pension_Family_Pension);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on  Pension_Family_Pension");
		Assert.assertTrue(true, "Failed to click on Pension_Family_Pension");
		Thread.sleep(3000);
		
		helper.waitFor(IncomefromPreviousEmployer);
		helper.highLightElement(driver, IncomefromPreviousEmployer);
		helper.jsCLick(IncomefromPreviousEmployer);
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on  IncomefromPreviousEmployer");
		Assert.assertTrue(true, "Failed to click on IncomefromPreviousEmployer");
		Thread.sleep(3000);
		
		
		
	}

}
