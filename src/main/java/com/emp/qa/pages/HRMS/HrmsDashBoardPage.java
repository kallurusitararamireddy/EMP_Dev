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

public class HrmsDashBoardPage extends BasePage {

	public HrmsDashBoardPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//*[@id=\"Basic_Details\"]/div/div[3]/div")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//a[contains(.,'Auto Code')]")
	@CacheLookup
	WebElement EditBasicDetails;
	
	@FindBy(xpath = "//select[@id='marital_status']")
	@CacheLookup
	WebElement MaritialStatus;
	
	@FindBy(xpath = "//input[@id='phone']")
	@CacheLookup
	WebElement Phonenumber;
	
	@FindBy(xpath = "//input[@id='personal_email']")
	@CacheLookup
	WebElement PersonalEmail;
	
	
	
	@FindBy(xpath = "//textarea[@id='c_address']")
	@CacheLookup
	WebElement CurrentAdress;
	
	@FindBy(xpath = "//input[@id='same_as']")
	@CacheLookup
	WebElement SameasCurrentAdress;
	
	
	@FindBy(xpath = "//a[contains(.,'Save')]")
	@CacheLookup
	WebElement BasicDetailsSave_Button;
	
	
	@FindBy(xpath = "//span[contains(text(),'Bank Details')]")
	@CacheLookup
	WebElement Bank_Details;
	
	@FindBy(xpath = "//tbody/tr[@id='bank24858']/td[6]/a[1]/i[1]")
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
	
	
	
	
	public  void HrmsDashBoardPage() throws InterruptedException{
		

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
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(EditBasicDetails);
		helper.highLightElement(driver, EditBasicDetails);
		helper.Scrollintoview(EditBasicDetails);
		helper.jsCLick(EditBasicDetails);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on EditBasicDetails");
		Assert.assertTrue(true, "Failed to click on EditBasicDetails");
		
		helper.waitFor(MaritialStatus);
		helper.highLightElement(driver, MaritialStatus);
		helper.Scrollintoview(MaritialStatus);
		helper.selectDropDownValue(MaritialStatus,"value", "1");
		//helper.jsCLick(MaritialStatus);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on MaritialStatus");
		Assert.assertTrue(true, "Failed to click on MaritialStatus");
		
//		helper.waitFor(Phonenumber);
//		helper.highLightElement(driver, Phonenumber);
//		helper.Scrollintoview(Phonenumber);
//		Phonenumber.clear();
//		Phonenumber.sendKeys("9876543210");
//		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Phonenumber");
//		Assert.assertTrue(true, "Failed to click on Phonenumber");
		
		helper.waitFor(PersonalEmail);
		helper.highLightElement(driver, PersonalEmail);
		helper.Scrollintoview(PersonalEmail);
		PersonalEmail.clear();
		PersonalEmail.sendKeys("abcedfghi@gmail.com");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on PersonalEmail");
		Assert.assertTrue(true, "Failed to click on PersonalEmail");
		
		
		helper.waitFor(CurrentAdress);
		helper.highLightElement(driver, CurrentAdress);
		helper.Scrollintoview(CurrentAdress);
		CurrentAdress.clear();
		CurrentAdress.sendKeys("Houseno:12-1,Roadno:12b,Banglore");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on CurrentAdress");
		Assert.assertTrue(true, "Failed to click on CurrentAdress");
		
		helper.waitFor(SameasCurrentAdress);
		helper.highLightElement(driver, SameasCurrentAdress);
		helper.Scrollintoview(SameasCurrentAdress);
		SameasCurrentAdress.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on SameasCurrentAdress");
		Assert.assertTrue(true, "Failed to click on SameasCurrentAdress");
		
		helper.waitFor(BasicDetailsSave_Button);
		helper.highLightElement(driver, BasicDetailsSave_Button);
		helper.Scrollintoview(BasicDetailsSave_Button);
		BasicDetailsSave_Button.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on BasicDetailsSave_Button");
		Assert.assertTrue(true, "Failed to click on BasicDetailsSave_Button");
		Thread.sleep(7000);
		
		helper.waitFor(Bank_Details);
		helper.highLightElement(driver, Bank_Details);
		helper.Scrollintoview(Bank_Details);
		Bank_Details.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Bank_Details");
		Assert.assertTrue(true, "Failed to click on Bank_Details");
		
		helper.waitFor(BankDetailsAction);
		helper.highLightElement(driver, BankDetailsAction);
		helper.Scrollintoview(BankDetailsAction);
		helper.jsCLick(BankDetailsAction);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on BankDetailsAction");
		Assert.assertTrue(true, "Failed to click on BankDetailsAction");
		
		helper.waitFor(BankName);
		helper.highLightElement(driver, BankName);
		helper.Scrollintoview(BankName);
		BankName.clear();
		BankName.sendKeys("StateBankofIndia");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on BankName");
		Assert.assertTrue(true, "Failed to click on BankName");
		
		helper.waitFor(IfscCode);
		helper.highLightElement(driver, IfscCode);
		helper.Scrollintoview(IfscCode);
		IfscCode.clear();
		IfscCode.sendKeys("SBIn0012345");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on IfscCode");
		Assert.assertTrue(true, "Failed to click on IfscCode");
		
		helper.waitFor(Account_Number);
		helper.highLightElement(driver, Account_Number);
		helper.Scrollintoview(Account_Number);
		Account_Number.clear();
		Account_Number.sendKeys("63123456789");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Account_Number");
		Assert.assertTrue(true, "Failed to click on Account_Number");
		
		
		
		helper.waitFor(Branch_Adress);
		helper.highLightElement(driver, Branch_Adress);
		helper.Scrollintoview(Branch_Adress);
		Branch_Adress.clear();
		Branch_Adress.sendKeys("Mayuri Heights,Banglore.");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Branch_Adress");
		Assert.assertTrue(true, "Failed to click on Branch_Adress");
		
		helper.waitFor(Save_BankDetails);
		helper.highLightElement(driver, Save_BankDetails);
		helper.Scrollintoview(Save_BankDetails);
		Save_BankDetails.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Save_BankDetails");
		Assert.assertTrue(true, "Failed to click on Save_BankDetails");
		
	
		
		
		
		
		
		
		
		
		
		
		



		
		
		
	}
	

}
