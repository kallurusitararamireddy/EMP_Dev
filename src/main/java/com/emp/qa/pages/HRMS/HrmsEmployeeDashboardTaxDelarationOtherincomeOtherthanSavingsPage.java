package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
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

public class HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage extends BasePage {

	public HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage(WebDriver driver) {
		super(driver);
	
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
		@CacheLookup
		WebElement Attendance;
		
		@FindBy(xpath = "//span[contains(text(),'Tax Declaration')]")
		@CacheLookup
		WebElement TaxDeclaration;
		
		@FindBy(xpath = "//a[contains(.,'Other Income')]")
		@CacheLookup
		WebElement OtherIncome;
		
		@FindBy(xpath = "//span[contains(.,'other than Savings Bank Int.')]")
		@CacheLookup
		WebElement otherthanSavingsBankInterest;
		
		@FindBy(xpath = "//*[@id=\"Income-Other-Savings-Bank-Interest\"]/div/div/button")
		@CacheLookup
		WebElement AddBankDetails;
		
		@FindBy(xpath = "//input[contains(@name,'empOtherBankNameName')]")
		@CacheLookup
		WebElement BankName;
		
		@FindBy(xpath = "//input[contains(@id,'empOtherAmountId')]")
		@CacheLookup
		WebElement Amount;
		
		@FindBy(xpath = "//button[@id='empOtherAddBankDetailsId']")
		@CacheLookup
		WebElement Save_Button;
		
		
		  public  void HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(TaxDeclaration);
				helper.highLightElement(driver, TaxDeclaration);
				helper.jsCLick(TaxDeclaration);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  TaxDeclaration Button");
				Assert.assertTrue(true, "Failed to click on TaxDeclaration Button"); 
				
				helper.waitFor(OtherIncome);
				helper.highLightElement(driver, OtherIncome);
				helper.jsCLick(OtherIncome);
				Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  OtherIncome Button");
				Assert.assertTrue(true, "Failed to click on OtherIncome Button"); 
				
				helper.waitFor(otherthanSavingsBankInterest);
				helper.highLightElement(driver, otherthanSavingsBankInterest);
				helper.jsCLick(otherthanSavingsBankInterest);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  otherthanSavingsBankInterest ");
				Assert.assertTrue(true, "Failed to click on otherthanSavingsBankInterest ");
				
				helper.waitFor(AddBankDetails);
				helper.highLightElement(driver, AddBankDetails);
				helper.jsCLick(AddBankDetails);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddBankDetails Button");
				Assert.assertTrue(true, "Failed to click on SavingsBankInterest Button");
				
				helper.waitFor(BankName);
				helper.highLightElement(driver, BankName);
				BankName.sendKeys("SBI");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Entered BankName ");
				Assert.assertTrue(true, "Failed to Enter BankName");
				
				helper.waitFor(Amount);
				helper.highLightElement(driver, Amount);
				Amount.sendKeys("10000");
				helper.jsCLick(Amount);
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  Amount ");
				Assert.assertTrue(true, "Failed to Enter Amount ");
				
				helper.waitFor(Save_Button);
				helper.highLightElement(driver, Save_Button);
				helper.jsCLick(Save_Button);
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  Save_Button ");
				Assert.assertTrue(true, "Failed to click on Save_Button ");
				Thread.sleep(3000);



}
}
