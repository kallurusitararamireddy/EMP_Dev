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

public class HrmsSetupPayrollCreateStructuresDeductionPage extends BasePage {

	public HrmsSetupPayrollCreateStructuresDeductionPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[contains(text(),'Create Structure')]")
	@CacheLookup
	WebElement Create_Structure;
	
	@FindBy(xpath = "//span[contains(text(),'New structureAuto Structure')]")
	@CacheLookup
	WebElement NewstructureAutoStructure;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Deductions')]")
	@CacheLookup
	WebElement Deductions;
	
	@FindBy(xpath = "//button[@id='AddComponentButton2']")
	@CacheLookup
	WebElement AddComponentButton2;
	
	@FindBy(xpath = "//select[@id='Select82']")
	@CacheLookup
	WebElement DeductionSalaryComponent1;
	
	@FindBy(xpath = "//select[@id='ctcDropdown82']")
	@CacheLookup
	WebElement PT_Fixed1;
	
	
	@FindBy(xpath = "//input[@id='SYS_CALC82']")
	@CacheLookup
	WebElement Amount1;
	
	@FindBy(xpath = "//select[@id='Select92']")
	@CacheLookup
	WebElement EmployeePF;
	
	@FindBy(xpath = "//select[@id='ctcDropdown92']")
	@CacheLookup
	WebElement Pf_Fixed;
	
	
	@FindBy(xpath = "//input[@id='SYS_CALC92']")
	@CacheLookup
	WebElement PF_Fixed;
	

	@FindBy(xpath = "//button[@id='structureEditButton']")
	@CacheLookup
	WebElement Save_Button;
	
	public  void HrmsSetupPayrollCreateStructuresDeductionPage() throws InterruptedException{
		
	
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
		
		helper.waitFor(Create_Structure);
		helper.highLightElement(driver, Create_Structure);
		helper.jsCLick(Create_Structure);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Create_Structure");
		Assert.assertTrue(true, "Failed to click on Create_Structure");
		
		helper.waitFor(NewstructureAutoStructure);
		helper.highLightElement(driver, NewstructureAutoStructure);
		helper.jsCLick(NewstructureAutoStructure);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on NewstructureAutoStructure");
		Assert.assertTrue(true, "Failed to click on NewstructureAutoStructure");
		
		
		helper.waitFor(Deductions);
		helper.highLightElement(driver, Deductions);
		helper.jsCLick(Deductions);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Deductions");
		Assert.assertTrue(true, "Failed to click on Deductions");
		
		helper.waitFor(AddComponentButton2);
		helper.highLightElement(driver, AddComponentButton2);
		helper.Scrollintoview(AddComponentButton2);
		helper.jsCLick(AddComponentButton2);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on AddComponentButton2");
		Assert.assertTrue(true, "Failed to click on AddComponentButton2");
		
		helper.waitFor(DeductionSalaryComponent1);
		helper.highLightElement(driver, DeductionSalaryComponent1);
		//DeductionSalaryComponent1.click();
		helper.Scrollintoview(DeductionSalaryComponent1);
		helper.selectDropDownValue(DeductionSalaryComponent1, "value", "PT");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Selected  DeductionSalaryComponent1");
		Assert.assertTrue(true, "Failed to click on DeductionSalaryComponent1");
		
		
		helper.waitFor(PT_Fixed1);
		helper.highLightElement(driver, PT_Fixed1);
		helper.selectDropDownValue(PT_Fixed1, "value", "Fixed");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Selected  PT_Fixed1");
		Assert.assertTrue(true, "Failed to click on PT_Fixed1");

		
		helper.waitFor(Amount1);
		helper.highLightElement(driver, Amount1);
		Amount1.clear();
		Amount1.sendKeys("200");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Selected  Amount1");
		Assert.assertTrue(true, "Failed to click on Amount1");
		
		helper.waitFor(AddComponentButton2);
		helper.highLightElement(driver, AddComponentButton2);
		helper.Scrollintoview(AddComponentButton2);
		helper.jsCLick(AddComponentButton2);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on AddComponentButton2");
		Assert.assertTrue(true, "Failed to click on AddComponentButton2");
		
		helper.waitFor(EmployeePF);
		helper.highLightElement(driver, EmployeePF);
		helper.selectDropDownValue(EmployeePF, "value", "PF");
		//EmployeePF.sendKeys("EmployeePF");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Selected  EmployeePF");
		Assert.assertTrue(true, "Failed to click on EmployeePF");
		
		
		helper.waitFor(Pf_Fixed);
		helper.highLightElement(driver, Pf_Fixed);
		helper.selectDropDownValue(Pf_Fixed, "value", "Fixed");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Selected  Pf_Fixed");
		Assert.assertTrue(true, "Failed to click on Pf_Fixed");

		
		helper.waitFor(PF_Fixed);
		helper.highLightElement(driver, PF_Fixed);
		PF_Fixed.clear();
		PF_Fixed.sendKeys("1800");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Selected  PF_Fixed");
		Assert.assertTrue(true, "Failed to click on PF_Fixed");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed to click on Save_Button");
		Thread.sleep(5000);

		
		
	}

}
