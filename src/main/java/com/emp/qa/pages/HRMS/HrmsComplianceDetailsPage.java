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

public class HrmsComplianceDetailsPage extends BasePage {

	public HrmsComplianceDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	
	@FindBy(xpath = "//span[contains(text(),'Compliance Details')]")
	@CacheLookup
	WebElement ComplianceDetails;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchField;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(xpath = "//tbody/tr[@id='compliance25278']/td[18]/a[1]/i[1]")
	@CacheLookup
	WebElement ComplianceDetails_Actions;
	
	@FindBy(xpath = "//input[@id='eligible_pf' and @type='checkbox']")
	@CacheLookup
	WebElement IsEmployeeEligibleForPF;
	
	
	@FindBy(xpath = "/html//div[@id='Add_New_Compliance']/div[@class='card-body']/form/div/div[7]/div[@class='form-group']/span[1]/label/span")
	@CacheLookup
	WebElement IsemployeeeligibleforexcessEPFcontribution;
	
	
	@FindBy(xpath = "//input[@id='uan_number']")
	@CacheLookup
	WebElement UanNumber;
	
	@FindBy(xpath = "//input[@id='pf_number']")
	@CacheLookup
	WebElement PFNumber;
	
	@FindBy(xpath = "//input[@id='pf_scheme']")
	@CacheLookup
	WebElement PFScheme;
	
	@FindBy(xpath = "//input[@id='pf_joining_date']")
	@CacheLookup
	WebElement PFJoiningDate;
	
	@FindBy(xpath = "//input[@id='esi_number']")
	@CacheLookup
	WebElement EsiNumber;
	
	@FindBy(xpath = "//input[@id='pan_number']")
	@CacheLookup
	WebElement PanNumber;
	
	@FindBy(xpath = "//input[@id='ctc_id']")
	@CacheLookup
	WebElement Ctc;
	
	@FindBy(xpath = "//input[@id='gross_id']")
	@CacheLookup
	WebElement Gross;
	
	
	@FindBy(xpath = "//i[contains(@class,'flaticon2-check-mark mr-2')]")
	@CacheLookup
	WebElement ComplianceDetails_Save;
	
	
	public  void HrmsComplianceDetailsPage() throws InterruptedException{
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
		
		
		
		helper.waitFor(ComplianceDetails);
		helper.highLightElement(driver, ComplianceDetails);
		helper.Scrollintoview(ComplianceDetails);
		helper.jsCLick(ComplianceDetails);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on ComplianceDetails");
		Assert.assertTrue(true, "Failed to click on ComplianceDetails");
		
		
		
		helper.waitFor(SearchField);
		helper.highLightElement(driver, SearchField);
		SearchField.sendKeys("Auto Code");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Entered Data into SearchField");
		Assert.assertTrue(true, "Failed to Enter Data Into Searchfield");
		
		helper.waitFor(SearchButton);
		helper.highLightElement(driver, SearchButton);
		helper.jsCLick(SearchButton);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on SearchButton");
		Assert.assertTrue(true, "Failed to click on SearchButton");
		
		helper.waitFor(ComplianceDetails_Actions);
		helper.highLightElement(driver, ComplianceDetails_Actions);
		helper.jsCLick(ComplianceDetails_Actions);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ComplianceDetails_Actions");
		Assert.assertTrue(true, "Failed to click on ComplianceDetails_Actions");
		
		helper.waitFor(IsEmployeeEligibleForPF);
		helper.highLightElement(driver, IsEmployeeEligibleForPF);
		helper.Scrollintoview(IsEmployeeEligibleForPF);
	//	IsEmployeeEligibleForPF.click();
		helper.jsCLick(IsEmployeeEligibleForPF);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on IsEmployeeEligibleForPF");
		Assert.assertTrue(true, "Failed to click on IsEmployeeEligibleForPF");
		
		helper.waitFor(IsemployeeeligibleforexcessEPFcontribution);
		helper.highLightElement(driver, IsemployeeeligibleforexcessEPFcontribution);
		helper.Scrollintoview(IsemployeeeligibleforexcessEPFcontribution);
	//	IsEmployeeEligibleForPF.click();
		helper.jsCLick(IsemployeeeligibleforexcessEPFcontribution);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on IsemployeeeligibleforexcessEPFcontribution");
		Assert.assertTrue(true, "Failed to click on IsemployeeeligibleforexcessEPFcontribution");
		
		helper.waitFor(UanNumber);
		helper.highLightElement(driver, UanNumber);
		UanNumber.clear();
		UanNumber.sendKeys("ELFIK3204R");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on UanNumber");
		Assert.assertTrue(true, "Failed to click on UanNumber");
		
		helper.waitFor(PFNumber);
		helper.highLightElement(driver, PFNumber);
		PFNumber.clear();
		PFNumber.sendKeys("12376859");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PFNumber");
		Assert.assertTrue(true, "Failed to click on PFNumber");
		
		helper.waitFor(PFScheme);
		helper.highLightElement(driver, PFScheme);
		PFScheme.clear();
		PFScheme.sendKeys("Sheme1234");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on PFScheme");
		Assert.assertTrue(true, "Failed to click on PFScheme");
		
		
		helper.waitFor(PFJoiningDate);
		helper.highLightElement(driver, PFJoiningDate);
		PFJoiningDate.clear();
		PFJoiningDate.sendKeys("15082021");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on PFJoiningDate");
		Assert.assertTrue(true, "Failed to click on PFJoiningDate");
		
		helper.waitFor(EsiNumber);
		helper.highLightElement(driver, EsiNumber);
		EsiNumber.clear();
		EsiNumber.sendKeys("1322886759");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on EsiNumber");
		Assert.assertTrue(true, "Failed to click on EsiNumber");
		
		helper.waitFor(PanNumber);
		helper.highLightElement(driver, PanNumber);
		PanNumber.clear();
		PanNumber.sendKeys("PR132R2886");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on PanNumber");
		Assert.assertTrue(true, "Failed to click on PanNumber");
		
		helper.waitFor(Ctc);
		helper.highLightElement(driver, Ctc);
		Ctc.clear();
		Ctc.sendKeys("700000");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Ctc");
		Assert.assertTrue(true, "Failed to click on Ctc");
		
		helper.waitFor(Gross);
		helper.highLightElement(driver, Gross);
		Gross.clear();
		Gross.sendKeys("700000");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Gross");
		Assert.assertTrue(true, "Failed to click on Gross");
		
		helper.waitFor(ComplianceDetails_Save);
		helper.highLightElement(driver, ComplianceDetails_Save);
		helper.Scrollintoview(ComplianceDetails_Save);
		ComplianceDetails_Save.click();
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on ComplianceDetails_Save");
		Assert.assertTrue(true, "Failed to click on ComplianceDetails_Save");
		Thread.sleep(10000);
		
		
		
	}

}
