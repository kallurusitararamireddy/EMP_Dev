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

public class HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage extends BasePage {

	public HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(.,'Income from Previous Employer')]")
		@CacheLookup
		WebElement IncomefromPrevious;
		
		@FindBy(xpath = "//a[contains(.,'Add Income')]")
		@CacheLookup
		WebElement Addincome;
		
		@FindBy(xpath = "//input[@id='start_date']")
		@CacheLookup
		WebElement StartDate;
		
		@FindBy(xpath = "//input[@id='end_date']")
		@CacheLookup
		WebElement EndDate;
		
		@FindBy(xpath = "//input[@id='employer_name']")
		@CacheLookup
		WebElement EmployerName;
		
		@FindBy(xpath = "//input[@id='income_from_employer']")
		@CacheLookup
		WebElement IncomeFromEmployer;
		
		
		@FindBy(xpath = "//input[@id='tax']")
		@CacheLookup
		WebElement Tax_Deduction;
		
		@FindBy(css = "#file_opener")
		@CacheLookup
		WebElement UploadDocumenButton;
		
		@FindBy(xpath = "(//a[contains(.,'Save')])[2]")
		@CacheLookup
		WebElement SaveButton;
		
		
		
		
		  public  void HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(IncomefromPrevious);
				helper.highLightElement(driver, IncomefromPrevious);
				helper.jsCLick(IncomefromPrevious);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  IncomefromPrevious Button");
				Assert.assertTrue(true, "Failed to click on IncomefromPrevious Button");
				
				helper.waitFor(Addincome);
				helper.highLightElement(driver, Addincome);
				helper.jsCLick(Addincome);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  Addincome Button");
				Assert.assertTrue(true, "Failed to click on Addincome Button");
				
				helper.waitFor(StartDate);
				helper.highLightElement(driver, StartDate);
				StartDate.sendKeys("01112021");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Entered StartDate  ");
				Assert.assertTrue(true, "Failed to Enter StartDate");
				
				helper.waitFor(EndDate);
				helper.highLightElement(driver, EndDate);
				EndDate.sendKeys("25112021");
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  EndDate ");
				Assert.assertTrue(true, "Failed to Enter EndDate ");
				
				helper.waitFor(EmployerName);
				helper.highLightElement(driver, EmployerName);
				EmployerName.sendKeys("abcde");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered   EmployerName ");
				Assert.assertTrue(true, "Failed to Enter  EmployerName ");
				
				helper.waitFor(IncomeFromEmployer);
				helper.highLightElement(driver, IncomeFromEmployer);
				IncomeFromEmployer.sendKeys("5000");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered   IncomeFromEmployer ");
				Assert.assertTrue(true, "Failed to Enter  IncomeFromEmployer ");
				
				helper.waitFor(Tax_Deduction);
				helper.highLightElement(driver, Tax_Deduction);
				Tax_Deduction.sendKeys("2000");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered Tax_Deduction ");
				Assert.assertTrue(true, "Failed to Enter  Tax_Deduction ");
				
				helper.waitFor(UploadDocumenButton);
				helper.highLightElement(driver, UploadDocumenButton);
			    helper.jsCLick(UploadDocumenButton);
			   // UploadDocumenButton.sendKeys("C:\\\\Users\\\\Official\\\\Pictures\\\\Screenshot 2021-04-14 152550.png");
			    
				helper.uploadFile("C:\\Users\\Official\\Pictures\\Screenshot 2021-04-14 152550.png");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on   UploadDocumenButton and Uploaded the Document ");
				Assert.assertTrue(true, "Failed to  UploadDocumenButton ");
				
				helper.waitFor(SaveButton);
				helper.highLightElement(driver, SaveButton);
				SaveButton.click();
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on SaveButton ");
				Assert.assertTrue(true, "Failed to click  SaveButton ");
				Thread.sleep(3000);
				

}
}
