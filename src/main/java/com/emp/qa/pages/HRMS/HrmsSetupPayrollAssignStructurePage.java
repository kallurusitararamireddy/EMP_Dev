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

public class HrmsSetupPayrollAssignStructurePage extends BasePage {

	public HrmsSetupPayrollAssignStructurePage(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[contains(text(),'Assign Structure')]")
	@CacheLookup
	WebElement Assign_Structure;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	@FindBy(xpath = "//input[@id='SelectCheckbox25187']")
	@CacheLookup
	WebElement testterm;
	
	@FindBy(xpath = "//input[@id='SelectCheckbox25172']")
	@CacheLookup
	WebElement Autocode;
	
	@FindBy(xpath = "//input[@id='SelectCheckbox25161']")
	@CacheLookup
	WebElement PrafulprojectBase;
	
	@FindBy(xpath = "//button[contains(text(),'Bulk Assign')]")
	@CacheLookup
	WebElement BulkAssignButton;
	
	@FindBy(xpath = "//select[@id='structreAssignListBulk']")
	@CacheLookup
	WebElement AssignStructureDropdown;
	
	@FindBy(xpath = "//button[@id='EditStructureBulkButton']")
	@CacheLookup
	WebElement Save_Button;
	
	
	
	public  void HrmsSetupPayrollAssignStructurePage() throws InterruptedException{
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
		
		helper.waitFor(Assign_Structure);
		helper.highLightElement(driver, Assign_Structure);
		helper.jsCLick(Assign_Structure);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Assign_Structure");
		Assert.assertTrue(true, "Failed to click on Assign_Structure");
		
		helper.waitFor(ShowEntries);
		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "id", "200");
		helper.jsCLick(Assign_Structure);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Assign_Structure");
		Assert.assertTrue(true, "Failed to click on Assign_Structure");
		
		helper.waitFor(testterm);
		helper.highLightElement(driver, testterm);
		helper.Scrollintoview(testterm);
		helper.jsCLick(testterm);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on testterm");
		Assert.assertTrue(true, "Failed to click on testterm");
		
		helper.waitFor(Autocode);
		helper.highLightElement(driver, Autocode);
		helper.Scrollintoview(Autocode);
		helper.jsCLick(Autocode);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Autocode");
		Assert.assertTrue(true, "Failed to click on Autocode");
		
		helper.waitFor(PrafulprojectBase);
		helper.highLightElement(driver, PrafulprojectBase);
		helper.Scrollintoview(PrafulprojectBase);
		helper.jsCLick(PrafulprojectBase);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on PrafulprojectBase");
		Assert.assertTrue(true, "Failed to click on PrafulprojectBase");
		
		helper.waitFor(BulkAssignButton);
		helper.highLightElement(driver, BulkAssignButton);
		helper.jsCLick(BulkAssignButton);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on BulkAssignButton");
		Assert.assertTrue(true, "Failed to click on BulkAssignButton");
		
		helper.waitFor(AssignStructureDropdown);
		helper.highLightElement(driver, AssignStructureDropdown);
		helper.selectDropDownValue(AssignStructureDropdown, "value", "18");
		helper.jsCLick(AssignStructureDropdown);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on AssignStructureDropdown");
		Assert.assertTrue(true, "Failed to click on AssignStructureDropdown");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed to click on Save_Button");
		Thread.sleep(5000);
		
		
		
		
	}
	

}
