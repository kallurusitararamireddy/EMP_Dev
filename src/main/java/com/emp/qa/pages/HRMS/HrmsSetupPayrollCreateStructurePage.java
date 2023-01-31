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

public class HrmsSetupPayrollCreateStructurePage extends BasePage {

	public HrmsSetupPayrollCreateStructurePage(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[contains(.,'Create New Structure')]")
	@CacheLookup
	WebElement Create_New_Structure;
	
	@FindBy(xpath = "//input[@id='structureNameField']")
	@CacheLookup
	WebElement Structure_Name;
	
	@FindBy(xpath = "//textarea[@id='DescriptionStructure']")
	@CacheLookup
	WebElement Description_Name;
	
	@FindBy(xpath = "//button[@id='AddComponentButton1']")
	@CacheLookup
	WebElement Add_ComponentButton;
	
	@FindBy(xpath = "//select[@id='Select11']")
	@CacheLookup
	WebElement Salary_Component1;
	
	@FindBy(xpath = "//select[@id='componentSymbolOption11']")
	@CacheLookup
	WebElement ComponentSymbol1;
	
	@FindBy(xpath = "//select[@id='ctcDropdown11']")
	@CacheLookup
	WebElement CtcDropDown1;
	
	@FindBy(xpath = "//input[@id='SYS_CALC11']")
	@CacheLookup
	WebElement Caluclation1;
	
	
	@FindBy(xpath = "//select[@id='Select21']")
	@CacheLookup
	WebElement Salary_Component2;
	
	@FindBy(xpath = "//select[@id='componentSymbolOption12']")
	@CacheLookup
	WebElement ComponentSymbol2;
	
	@FindBy(xpath = "//select[@id='ctcDropdown21']")
	@CacheLookup
	WebElement CtcDropDown2;
	
	@FindBy(xpath = "//input[@id='SYS_CALC21']")
	@CacheLookup
	WebElement Caluclation2;
	
	@FindBy(xpath = "//select[@id='Select31']")
	@CacheLookup
	WebElement Salary_compoent3;
	
	@FindBy(xpath = "//select[@id='ctcDropdown31']")
	@CacheLookup
	WebElement CtcDropDown3;
	
	@FindBy(xpath = "//input[@id='SYS_CALC31']")
	@CacheLookup
	WebElement Caluclation3;
	
	@FindBy(xpath = "//select[@id='Select41']")
	@CacheLookup
	WebElement Salary_compoent4;
	
	@FindBy(xpath = "//select[@id='ctcDropdown41']")
	@CacheLookup
	WebElement CtcDropDown4;
	
	@FindBy(xpath = "//input[@id='SYS_CALC41']")
	@CacheLookup
	WebElement Caluclation4;
	
	@FindBy(xpath = "//select[@id='Select51']")
	@CacheLookup
	WebElement Salary_compoent5;
	
	@FindBy(xpath = "//select[@id='ctcDropdown51']")
	@CacheLookup
	WebElement CtcDropDown5;
	
	@FindBy(xpath = "//input[@id='SYS_CALC51']")
	@CacheLookup
	WebElement Caluclation5;
	
	@FindBy(xpath = "//select[@id='Select61']")
	@CacheLookup
	WebElement Salary_compoent6;
	
	@FindBy(xpath = "//select[@id='ctcDropdown61']")
	@CacheLookup
	WebElement CtcDropDown6;
	
	@FindBy(xpath = "//input[@id='SYS_CALC61']")
	@CacheLookup
	WebElement Caluclation6;
	
	@FindBy(xpath = "//button[@id='structureEditButton']")
	@CacheLookup
	WebElement Save_Button;
	
//	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Deductions')]")
//	@CacheLookup
//	WebElement Deductions;
//	
//	@FindBy(xpath = "//button[@id='AddComponentButton2']")
//	@CacheLookup
//	WebElement AddComponentButton2;
//	
//	@FindBy(xpath = "//option[contains(text(),'PT')]")
//	@CacheLookup
//	WebElement DeductionSalaryComponent1;
//	
//	@FindBy(xpath = "//option[contains(text(),'Fixed')]")
//	@CacheLookup
//	WebElement PT_Fixed1;
//	
//	
//	@FindBy(xpath = "//input[@id='SYS_CALC22']")
//	@CacheLookup
//	WebElement Amount1;
//	
//	@FindBy(xpath = "//select[@id='Select32']")
//	@CacheLookup
//	WebElement EmployeePF;
//	
//	@FindBy(xpath = "//select[@id='ctcDropdown32']")
//	@CacheLookup
//	WebElement Pf_Fixed;
//	
//	
//	@FindBy(xpath = "//input[@id='SYS_CALC32']")
//	@CacheLookup
//	WebElement PF_Fixed;
//	
	
	
	
	
	
	public  void HrmsSetupPayrollCreateStructurePage() throws InterruptedException{
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
		
		helper.waitFor(Create_New_Structure);
		helper.highLightElement(driver, Create_New_Structure);
		helper.jsCLick(Create_New_Structure);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Create_New_Structure");
		Assert.assertTrue(true, "Failed to click on Create_New_Structure");
		
		helper.waitFor(Structure_Name);
		helper.highLightElement(driver, Structure_Name);
		Structure_Name.sendKeys("Auto Structure1");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Structure_Name and Added name as Auto structure");
		Assert.assertTrue(true, "Failed to click on Structure_Name");
		
		helper.waitFor(Description_Name);
		helper.highLightElement(driver, Description_Name);
		Description_Name.sendKeys("Automation creation1");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Structure_Name and Added name as Automation creation");
		Assert.assertTrue(true, "Failed to click on Description_Name");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		helper.waitFor(Salary_Component1);
		helper.highLightElement(driver, Salary_Component1);
		helper.selectDropDownValue(Salary_Component1, "value", "Basic");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Salary_Component1");
		Assert.assertTrue(true, "Failed to click on Salary_Component1");
		
		
		
		helper.waitFor(CtcDropDown1);
		helper.highLightElement(driver, CtcDropDown1);
		helper.selectDropDownValue(CtcDropDown1, "value", "CTC");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on CtcDropDown1");
		Assert.assertTrue(true, "Failed to click on CtcDropDown1");
		
		helper.waitFor(ComponentSymbol1);
		helper.highLightElement(driver, ComponentSymbol1);
		helper.selectDropDownValue(ComponentSymbol1, "value", "*");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on ComponentSymbol1");
		Assert.assertTrue(true, "Failed to click on ComponentSymbol1");
		
		
		helper.waitFor(Caluclation1);
		helper.highLightElement(driver, Caluclation1);
		Caluclation1.clear();
		Caluclation1.sendKeys("0.4");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Caluclation1");
		Assert.assertTrue(true, "Failed to click on Caluclation1");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		helper.waitFor(Salary_Component2);
		helper.highLightElement(driver, Salary_Component2);
		helper.selectDropDownValue(Salary_Component2, "value", "HRA");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Salary_Component2");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		helper.waitFor(ComponentSymbol2);
		helper.highLightElement(driver, ComponentSymbol2);
		helper.selectDropDownValue(ComponentSymbol2, "value", "*");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on ComponentSymbol2");
		Assert.assertTrue(true, "Failed to click on ComponentSymbol2");
		
		
		helper.waitFor(CtcDropDown2);
		helper.highLightElement(driver, CtcDropDown2);
		helper.selectDropDownValue(CtcDropDown2, "value", "Basic");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on CtcDropDown2");
		Assert.assertTrue(true, "Failed to click on CtcDropDown2");
		
		
		helper.waitFor(Caluclation2);
		helper.highLightElement(driver, Caluclation2);
		Caluclation2.clear();
		Caluclation2.sendKeys("0.4");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Caluclation2");
		Assert.assertTrue(true, "Failed to click on Caluclation2");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		helper.waitFor(Salary_compoent3);
		helper.highLightElement(driver, Salary_compoent3);
		helper.selectDropDownValue(Salary_compoent3, "value", "Telephone & Internet");
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> clicked on Salary_compoent3");
		Assert.assertTrue(true, "Failed to click on Salary_compoent3");
		
		helper.waitFor(CtcDropDown3);
		helper.highLightElement(driver, CtcDropDown3);
		helper.selectDropDownValue(CtcDropDown3, "value", "Fixed");
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> clicked on CtcDropDown3");
		Assert.assertTrue(true, "Failed to click on CtcDropDown3");
		
		helper.waitFor(Caluclation3);
		helper.highLightElement(driver, Caluclation3);
		Caluclation3.clear();
		Caluclation3.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> clicked on Caluclation3");
		Assert.assertTrue(true, "Failed to click on Caluclation3");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		helper.waitFor(Salary_compoent4);
		helper.highLightElement(driver, Salary_compoent4);
		helper.selectDropDownValue(Salary_compoent4, "value", "Medical Allowance");
		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> clicked on Salary_compoent4");
		Assert.assertTrue(true, "Failed to click on Salary_compoent4");
		
		helper.waitFor(CtcDropDown4);
		helper.highLightElement(driver, CtcDropDown4);
		helper.selectDropDownValue(CtcDropDown4, "value", "CTC");
		Reporter.log("<B><font color = 'blue'>Step23 .</font></B> clicked on CtcDropDown4");
		Assert.assertTrue(true, "Failed to click on CtcDropDown4");
		
		helper.waitFor(Caluclation4);
		helper.highLightElement(driver, Caluclation4);
		Caluclation4.clear();
		Caluclation4.sendKeys("0.02");
		Reporter.log("<B><font color = 'blue'>Step24 .</font></B> clicked on Caluclation4");
		Assert.assertTrue(true, "Failed to click on Caluclation4");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step25 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		
		helper.waitFor(Salary_compoent5);
		helper.highLightElement(driver, Salary_compoent5);
		helper.selectDropDownValue(Salary_compoent5, "value", "Lunch Allowance");
		Reporter.log("<B><font color = 'blue'>Step26 .</font></B> clicked on Salary_compoent5");
		Assert.assertTrue(true, "Failed to click on Salary_compoent5");
		
		helper.waitFor(CtcDropDown5);
		helper.highLightElement(driver, CtcDropDown5);
		helper.selectDropDownValue(CtcDropDown5, "value", "CTC");
		Reporter.log("<B><font color = 'blue'>Step27 .</font></B> clicked on CtcDropDown5");
		Assert.assertTrue(true, "Failed to click on CtcDropDown5");
		
		helper.waitFor(Caluclation5);
		helper.highLightElement(driver, Caluclation5);
		Caluclation5.clear();
		Caluclation5.sendKeys("0.03");
		Reporter.log("<B><font color = 'blue'>Step28 .</font></B> clicked on Caluclation5");
		Assert.assertTrue(true, "Failed to click on Caluclation5");
		
		helper.waitFor(Add_ComponentButton);
		helper.highLightElement(driver, Add_ComponentButton);
		helper.jsCLick(Add_ComponentButton);
		Reporter.log("<B><font color = 'blue'>Step25 .</font></B> clicked on Add_ComponentButton");
		Assert.assertTrue(true, "Failed to click on Add_ComponentButton");
		
		
		helper.waitFor(Salary_compoent6);
		helper.highLightElement(driver, Salary_compoent6);
		helper.selectDropDownValue(Salary_compoent6, "value", "Special Allowance");
		Reporter.log("<B><font color = 'blue'>Step26 .</font></B> clicked on Salary_compoent6");
		Assert.assertTrue(true, "Failed to click on Salary_compoent6");
		
		helper.waitFor(CtcDropDown6);
		helper.highLightElement(driver, CtcDropDown6);
		helper.selectDropDownValue(CtcDropDown6, "value", "Expression");
		Reporter.log("<B><font color = 'blue'>Step27 .</font></B> clicked on CtcDropDown6");
		Assert.assertTrue(true, "Failed to click on CtcDropDown6");
		
		helper.waitFor(Caluclation6);
		helper.highLightElement(driver, Caluclation6);
		Caluclation6.clear();
		Caluclation6.sendKeys("CTC-(Basic + HRA + Telephone & Internet + Lunch Allowance + Medical Allowance)");
		Reporter.log("<B><font color = 'blue'>Step28 .</font></B> clicked on Caluclation6");
		Assert.assertTrue(true, "Failed to click on Caluclation6");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step29 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed to click on Save_Button");
		
//		helper.waitFor(Deductions);
//		helper.highLightElement(driver, Deductions);
//		helper.jsCLick(Deductions);
//		Reporter.log("<B><font color = 'blue'>Step30 .</font></B> clicked on Deductions");
//		Assert.assertTrue(true, "Failed to click on Deductions");
//		
//		helper.waitFor(AddComponentButton2);
//		helper.highLightElement(driver, AddComponentButton2);
//		helper.Scrollintoview(AddComponentButton2);
//		helper.jsCLick(AddComponentButton2);
//		Reporter.log("<B><font color = 'blue'>Step31 .</font></B> clicked on AddComponentButton2");
//		Assert.assertTrue(true, "Failed to click on AddComponentButton2");
//		
//		helper.waitFor(DeductionSalaryComponent1);
//		helper.highLightElement(driver, DeductionSalaryComponent1);
//		//DeductionSalaryComponent1.click();
//		helper.Scrollintoview(DeductionSalaryComponent1);
//		//helper.selectDropDownValue(DeductionSalaryComponent1, "value", "PT");
//		Reporter.log("<B><font color = 'blue'>Step32 .</font></B> Selected  DeductionSalaryComponent1");
//		Assert.assertTrue(true, "Failed to click on DeductionSalaryComponent1");
//		
//		
//		helper.waitFor(PT_Fixed1);
//		helper.highLightElement(driver, PT_Fixed1);
//		//helper.selectDropDownValue(PT_Fixed1, "value", "Fixed");
//		Reporter.log("<B><font color = 'blue'>Step33 .</font></B> Selected  PT_Fixed1");
//		Assert.assertTrue(true, "Failed to click on PT_Fixed1");
//
//		
//		helper.waitFor(Amount1);
//		helper.highLightElement(driver, Amount1);
//		Amount1.sendKeys("200");
//		Reporter.log("<B><font color = 'blue'>Step34 .</font></B> Selected  Amount1");
//		Assert.assertTrue(true, "Failed to click on Amount1");
//		
//		helper.waitFor(EmployeePF);
//		helper.highLightElement(driver, EmployeePF);
//		helper.selectDropDownValue(EmployeePF, "value", "Add_Component");
//		EmployeePF.sendKeys("EmployeePF");
//		Reporter.log("<B><font color = 'blue'>Step35 .</font></B> Selected  EmployeePF");
//		Assert.assertTrue(true, "Failed to click on EmployeePF");
//		
//		
//		helper.waitFor(Pf_Fixed);
//		helper.highLightElement(driver, Pf_Fixed);
//		helper.selectDropDownValue(Pf_Fixed, "value", "Fixed");
//		Reporter.log("<B><font color = 'blue'>Step36 .</font></B> Selected  Pf_Fixed");
//		Assert.assertTrue(true, "Failed to click on Pf_Fixed");
//
//		
//		helper.waitFor(PF_Fixed);
//		helper.highLightElement(driver, PF_Fixed);
//		PF_Fixed.clear();
//		PF_Fixed.sendKeys("1800");
//		Reporter.log("<B><font color = 'blue'>Step37 .</font></B> Selected  PF_Fixed");
//		Assert.assertTrue(true, "Failed to click on PF_Fixed");



		
		
		
		
		
		



}
}
