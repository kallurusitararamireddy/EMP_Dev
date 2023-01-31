package com.emp.qa.pages.HRMS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.Helpers;

public class HrmsEmployeeComponentandPerquisitesPage extends BasePage {

	public HrmsEmployeeComponentandPerquisitesPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//div[@id='kt_aside_menu']/ul//a[@href='basic-detail']/i")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Component and Perquisites')]")
	@CacheLookup
	WebElement ComponentandPerquisites;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchBarButtoon;
	
	@FindBy(xpath = "//div[@id='Bank_Details']//div[@class='table-responsive']")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody[@id='custom_details_Tbody']//a[@href='#']/i[@class='flaticon2-pen']")
	@CacheLookup
	WebElement ActionButton;
	
	@FindBy(xpath = "(//input[contains(@type,'number')])[1]")
	@CacheLookup
	WebElement Annualctc;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	@CacheLookup
	WebElement Monthlyctc;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	@CacheLookup
	WebElement Employerpf;
	
	@FindBy(xpath = "(//input[@type='number'])[4]")
	@CacheLookup
	WebElement EmployerESIC;
	
	@FindBy(xpath = "(//input[@type='number'])[5]")
	@CacheLookup
	WebElement GrossSalary;
	
	@FindBy(xpath = "(//input[@type='number'])[6]")
	@CacheLookup
	WebElement BasicAllowance;
	
	@FindBy(xpath = "(//input[@type='number'])[7]")
	@CacheLookup
	WebElement HRA;
	
	@FindBy(xpath = "(//input[@type='number'])[8]")
	@CacheLookup
	WebElement MedicalAllowance;
	
	@FindBy(xpath = "(//input[@type='number'])[9]")
	@CacheLookup
	WebElement LunchAllowance;
	
	@FindBy(xpath = "(//input[@type='number'])[10]")
	@CacheLookup
	WebElement SpecialAllowance;
	
	@FindBy(xpath = "//div[contains(text(),'Additional Component')]")
	@CacheLookup
	WebElement AdditionalComponent;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Add')])[1]")
	@CacheLookup
	WebElement AdditionalComponentAddButton;
	
	@FindBy(xpath = "//input[@class='table_headersAdditional form-control']")
	@CacheLookup
	WebElement AdditionalComponentHeader;
	
	@FindBy(xpath = "//input[contains(@class,'table_valuesAdditional form-control')]")
	@CacheLookup
	WebElement AdditionalComponentHeadervalue;
	
	@FindBy(xpath = "//div[@id='editAdditionalComponent']/div[@class='col-md-6']//input[@type='date']")
	@CacheLookup
	WebElement AdditionalComponentsDatefilter;
	
	@FindBy(xpath = "//div[contains(text(),'Deduction Components')]")
	@CacheLookup
	WebElement DeductionComponents;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Add')])[2]")
	@CacheLookup
	WebElement DeductionComponentsAddButton;
	
	@FindBy(xpath = "//input[@class='table_headersDeductional form-control']")
	@CacheLookup
	WebElement DeductionComponentsHeader;
	
	@FindBy(xpath = "//input[contains(@class,'table_valuesDeductional form-control')]")
	@CacheLookup
	WebElement DeducComponentsHeadervalue;
	
	@FindBy(xpath = "//div[@id='editDeductionalComponent']/div[@class='col-md-6']//input[@type='date']")
	@CacheLookup
	WebElement DeducComponentsDatefiltervalue;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement SaveButton;
	
	public  void HrmsEmployeeComponentandPerquisitesPage() throws InterruptedException{
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
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.jsCLick(Employee);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee");
		Assert.assertTrue(true, "Failed to click on Employee");
		
		helper.waitFor(ComponentandPerquisites);
		helper.highLightElement(driver, ComponentandPerquisites);
		helper.jsCLick(ComponentandPerquisites);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on ComponentandPerquisites");
		Assert.assertTrue(true, "Failed to click on ComponentandPerquisites");
		
		helper.waitFor(SearchBar);
		helper.highLightElement(driver, SearchBar);
		SearchBar.sendKeys("Auto code");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Etered Data into  SearchBar");
		Assert.assertTrue(true, "Failed to Enter Data into  SearchBar");
		
		helper.waitFor(SearchBarButtoon);
		helper.highLightElement(driver, SearchBarButtoon);
		helper.jsCLick(SearchBarButtoon);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on SearchBarButtoon");
		Assert.assertTrue(true, "Failed to click on SearchBarButtoon");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(ActionButton);
		helper.highLightElement(driver, ActionButton);
		helper.jsCLick(ActionButton);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on ActionButton");
		Assert.assertTrue(true, "Failed to click on ActionButton");
		
		helper.waitFor(Annualctc);
		helper.highLightElement(driver, Annualctc);
		Annualctc.clear();
		Annualctc.sendKeys("120000");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered Amount into  Annualctc");
		Assert.assertTrue(true, "Failed to Entered Amount into  Annualctc");
		
		helper.waitFor(Monthlyctc);
		helper.highLightElement(driver, Monthlyctc);
		Monthlyctc.clear();
		Monthlyctc.sendKeys("100000");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Entered Amount into  Monthlyctc");
		Assert.assertTrue(true, "Failed to Enter Amount into  Monthlyctc");
		
		helper.waitFor(Employerpf);
		helper.highLightElement(driver, Employerpf);
		Employerpf.clear();
		Employerpf.sendKeys("1800");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Entered Amount into  Employerpf");
		Assert.assertTrue(true, "Failed to Enter Amount into  Employerpf");
		
		helper.waitFor(EmployerESIC);
		helper.highLightElement(driver, EmployerESIC);
		EmployerESIC.clear();
		EmployerESIC.sendKeys("1800");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Entered Amount into  EmployerESIC");
		Assert.assertTrue(true, "Failed to Enter Amount into  EmployerESIC");
		
		helper.waitFor(GrossSalary);
		helper.highLightElement(driver, GrossSalary);
		GrossSalary.clear();
		GrossSalary.sendKeys("100000");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Entered Amount into  GrossSalary");
		Assert.assertTrue(true, "Failed to Enter Amount into  GrossSalary");
		
		helper.waitFor(BasicAllowance);
		helper.highLightElement(driver, BasicAllowance);
		BasicAllowance.clear();
		BasicAllowance.sendKeys("40000");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Entered Amount into  BasicAllowance");
		Assert.assertTrue(true, "Failed to Enter Amount into  BasicAllowance");
		
		helper.waitFor(HRA);
		helper.highLightElement(driver, HRA);
		HRA.clear();
		HRA.sendKeys("16000");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Entered Amount into  HRA");
		Assert.assertTrue(true, "Failed to Enter Amount into  HRA");
		
		helper.waitFor(MedicalAllowance);
		helper.highLightElement(driver, MedicalAllowance);
		MedicalAllowance.clear();
		MedicalAllowance.sendKeys("2000");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Entered Amount into  MedicalAllowance");
		Assert.assertTrue(true, "Failed to Enter Amount into  MedicalAllowance");
		
		helper.waitFor(LunchAllowance);
		helper.highLightElement(driver, LunchAllowance);
		LunchAllowance.clear();
		LunchAllowance.sendKeys("3000");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> Entered Amount into  LunchAllowance");
		Assert.assertTrue(true, "Failed to Enter Amount into  LunchAllowance");
		
		helper.waitFor(SpecialAllowance);
		helper.highLightElement(driver, SpecialAllowance);
		SpecialAllowance.clear();
		SpecialAllowance.sendKeys("38000");
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Entered Amount into  SpecialAllowance");
		Assert.assertTrue(true, "Failed to Enter Amount into  SpecialAllowance");
		
		helper.waitFor(AdditionalComponent);
		helper.highLightElement(driver, AdditionalComponent);
		helper.jsCLick(AdditionalComponent);
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> clicked on AdditionalComponent ");
		Assert.assertTrue(true, "Failed to click on AdditionalComponent");
		
		helper.waitFor(AdditionalComponentAddButton);
		helper.highLightElement(driver, AdditionalComponentAddButton);
		helper.jsCLick(AdditionalComponentAddButton);
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> clicked on AdditionalComponentAddButton");
		Assert.assertTrue(true, "Failed to click on AdditionalComponentAddButton");
		
		helper.waitFor(AdditionalComponentHeader);
		helper.highLightElement(driver, AdditionalComponentHeader);
		AdditionalComponentHeader.sendKeys("NightAllowance");
		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> Entered name to AdditionalComponentHeader");
		Assert.assertTrue(true, "Failed to Entee name to AdditionalComponentHeader");
		
		helper.waitFor(AdditionalComponentHeadervalue);
		helper.highLightElement(driver, AdditionalComponentHeadervalue);
		AdditionalComponentHeadervalue.clear();
		AdditionalComponentHeadervalue.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> Entered value into AdditionalComponentHeadervalue");
		Assert.assertTrue(true, "Failed to Enter value into AdditionalComponentHeadervalue");
		
		helper.waitFor(AdditionalComponentsDatefilter);
		helper.highLightElement(driver, AdditionalComponentsDatefilter);
		AdditionalComponentsDatefilter.sendKeys("27052022");
		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> Entered value into AdditionalComponentsDatefilter");
		Assert.assertTrue(true, "Failed to Enter value into AdditionalComponentsDatefilter");
		
		helper.waitFor(DeductionComponents);
		helper.highLightElement(driver, DeductionComponents);
		helper.jsCLick(DeductionComponents);
		Reporter.log("<B><font color = 'blue'>Step23 .</font></B> clicked on DeductionComponents");
		Assert.assertTrue(true, "Failed to click on DeductionComponents");
		
		helper.waitFor(DeductionComponentsAddButton);
		helper.highLightElement(driver, DeductionComponentsAddButton);
		helper.jsCLick(DeductionComponentsAddButton);
		Reporter.log("<B><font color = 'blue'>Step24 .</font></B> clicked on DeductionComponentsAddButton and added deduction components");
		Assert.assertTrue(true, "Failed to click on DeductionComponents");
		
		helper.waitFor(DeductionComponentsHeader);
		helper.highLightElement(driver, DeductionComponentsHeader);
		DeductionComponentsHeader.sendKeys("Ded");
		Reporter.log("<B><font color = 'blue'>Step25 .</font></B> clicked on DeductionComponentsHeader and added deduction components name");
		Assert.assertTrue(true, "Failed to click on DeductionComponentsHeader");
		

		helper.waitFor(DeducComponentsHeadervalue);
		helper.highLightElement(driver, DeducComponentsHeadervalue);
		DeducComponentsHeadervalue.clear();
		DeducComponentsHeadervalue.sendKeys("200");
		Reporter.log("<B><font color = 'blue'>Step26 .</font></B> clicked on DeducComponentsHeadervalue");
		Assert.assertTrue(true, "Failed to click on DeducComponentsHeadervalue");
		
		helper.waitFor(DeducComponentsDatefiltervalue);
		helper.highLightElement(driver, DeducComponentsDatefiltervalue);
		DeducComponentsDatefiltervalue.sendKeys("27052022");
		Reporter.log("<B><font color = 'blue'>Step27 .</font></B> clicked on DeducComponentsDatefiltervalue");
		Assert.assertTrue(true, "Failed to click on DeducComponentsDatefiltervalue");
		
		helper.waitFor(SaveButton);
		helper.highLightElement(driver, SaveButton);
		helper.jsCLick(SaveButton);
		Reporter.log("<B><font color = 'blue'>Step28 .</font></B> clicked on SaveButton");
		Assert.assertTrue(true, "Failed to click on SaveButton");
		Thread.sleep(7000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		
		
		
		
		
		
//		helper.waitFor(SearchBar);
//		helper.highLightElement(driver, SearchBar);
//		SearchBar.sendKeys("Auto code");
//		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Etered Data into  SearchBar");
//		Assert.assertTrue(true, "Failed to Eter Data into  SearchBar");
//		
//		helper.waitFor(SearchBarButtoon);
//		helper.highLightElement(driver, SearchBarButtoon);
//		helper.jsCLick(SearchBarButtoon);
//		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on SearchBarButtoon");
//		Assert.assertTrue(true, "Failed to click on SearchBarButtoon");
//		
//		helper.waitFor(Scroller);
//		helper.highLightElement(driver, Scroller);
//		helper.jsCLick(Scroller);
//		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Scroller");
//		Assert.assertTrue(true, "Failed to click on Scroller");
//		
//		helper.waitFor(ActionButton);
//		helper.highLightElement(driver, ActionButton);
//		helper.jsCLick(ActionButton);
//		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on ActionButton");
//		Assert.assertTrue(true, "Failed to click on ActionButton");
//		
//		

		
		
	
	
	
	
	
	}
}
