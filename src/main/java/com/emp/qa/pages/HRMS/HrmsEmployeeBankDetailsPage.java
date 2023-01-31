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

public class HrmsEmployeeBankDetailsPage extends BasePage {

	public HrmsEmployeeBankDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Bank Details')]")
	@CacheLookup
	WebElement Bank_Details;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchField;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(xpath = "//tbody/tr[@id='bank25278']/td[7]/a[1]")
	@CacheLookup
	WebElement BankDetailsAction;
	
	@FindBy(xpath = "//input[@id='bank_name']")
	@CacheLookup
	WebElement BankName;
	
	@FindBy(xpath = "//input[@id='ifsc_code']")
	@CacheLookup
	WebElement IfscCode;
	
	@FindBy(xpath = "//input[@id='account_number']")
	@CacheLookup
	WebElement Account_Number;
	
	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Branch_Adress;
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-primary mr-2')]")
	@CacheLookup
	WebElement Save_BankDetails;
	
	public  void HrmsEmployeeBankDetailsPage() throws InterruptedException{
		
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
		
		helper.waitFor(Bank_Details);
		helper.highLightElement(driver, Bank_Details);
		helper.Scrollintoview(Bank_Details);
		Bank_Details.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Bank_Details");
		Assert.assertTrue(true, "Failed to click on Bank_Details");
		
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
		
		helper.waitFor(BankDetailsAction);
		helper.highLightElement(driver, BankDetailsAction);
		helper.Scrollintoview(BankDetailsAction);
		helper.jsCLick(BankDetailsAction);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on BankDetailsAction");
		Assert.assertTrue(true, "Failed to click on BankDetailsAction");
		
		helper.waitFor(BankName);
		helper.highLightElement(driver, BankName);
		helper.Scrollintoview(BankName);
		BankName.clear();
		BankName.sendKeys("StateBankofIndia");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on BankName");
		Assert.assertTrue(true, "Failed to click on BankName");
		
		helper.waitFor(IfscCode);
		helper.highLightElement(driver, IfscCode);
		helper.Scrollintoview(IfscCode);
		IfscCode.clear();
		IfscCode.sendKeys("SBIn0012345");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on IfscCode");
		Assert.assertTrue(true, "Failed to click on IfscCode");
		
		helper.waitFor(Account_Number);
		helper.highLightElement(driver, Account_Number);
		helper.Scrollintoview(Account_Number);
		Account_Number.clear();
		Account_Number.sendKeys("63123456789");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Account_Number");
		Assert.assertTrue(true, "Failed to click on Account_Number");
		
		
		
		helper.waitFor(Branch_Adress);
		helper.highLightElement(driver, Branch_Adress);
		helper.Scrollintoview(Branch_Adress);
		Branch_Adress.clear();
		Branch_Adress.sendKeys("Mayuri Heights,Banglore.");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Branch_Adress");
		Assert.assertTrue(true, "Failed to click on Branch_Adress");
		
		helper.waitFor(Save_BankDetails);
		helper.highLightElement(driver, Save_BankDetails);
		helper.Scrollintoview(Save_BankDetails);
		Save_BankDetails.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Save_BankDetails");
		Assert.assertTrue(true, "Failed to click on Save_BankDetails");
		Thread.sleep(5000);
		
	
	}

}
