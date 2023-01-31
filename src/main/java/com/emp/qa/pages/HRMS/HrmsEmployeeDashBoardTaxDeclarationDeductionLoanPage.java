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

public class HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage extends BasePage {

	public HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//span[contains(text(),'Deduction')]")
	@CacheLookup
	WebElement Deduction;
	
	@FindBy(xpath = "//span[contains(text(),'Loans')]")
	@CacheLookup
	WebElement Loans;
	

	
	@FindBy(xpath = "//button[@id='add_new_loan_button']")
	@CacheLookup
	WebElement AddNewLoans;
	
	@FindBy(xpath = "//input[@id='add_new_loan_name']")
	@CacheLookup
	WebElement LoanName;
	
	@FindBy(xpath = "//input[@id='add_new_loan_required_date']")
	@CacheLookup
	WebElement LoanRequireDate;
	
	@FindBy(xpath = "//input[@id='add_new_loan_amount']")
	@CacheLookup
	WebElement LoanAmount;
	
	@FindBy(css = "#loan_opener")
	@CacheLookup
	WebElement UploadDocument;
	
	@FindBy(xpath = "//textarea[@id='add_new_purpose_of_loan']")
	@CacheLookup
	WebElement PurposeOfLoan;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	@CacheLookup
	WebElement SaveButton;
	
	@FindBy(css = "(#kt_body > div.swal2-container.swal2-center.swal2-backdrop-show > div")
	@CacheLookup
	WebElement Success;
	
	 public  void HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage() throws InterruptedException, AWTException{
         
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
			
			helper.waitFor(Deduction);
			helper.highLightElement(driver, Deduction);
			helper.jsCLick(Deduction);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Deduction Button");
			Assert.assertTrue(true, "Failed to click on Deduction Button"); 
			
			helper.waitFor(Loans);
			helper.highLightElement(driver, Loans);
			helper.jsCLick(Loans);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Loans Button");
			Assert.assertTrue(true, "Failed to click on Loans Button"); 
			
			helper.waitFor(AddNewLoans);
			helper.highLightElement(driver, AddNewLoans);
			helper.jsCLick(AddNewLoans);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddNewLoans Button");
			Assert.assertTrue(true, "Failed to click on AddNewLoans Button"); 
			
			helper.waitFor(LoanName);
			helper.highLightElement(driver, LoanName);
			LoanName.sendKeys("CarLoan");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Entered  LoanName ");
			Assert.assertTrue(true, "Failed to Enter  LoanName "); 
			
			helper.waitFor(LoanRequireDate);
			helper.highLightElement(driver, LoanRequireDate);
			LoanRequireDate.sendKeys("20112021");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered LoanRequireDate");
			Assert.assertTrue(true, "Failed to Enter LoanRequireDate"); 
			
			helper.waitFor(LoanAmount);
			helper.highLightElement(driver, LoanAmount);
			LoanAmount.sendKeys("300000");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered LoanAmount");
			Assert.assertTrue(true, "Failed to Enter LoanAmount"); 
			
			helper.waitFor(UploadDocument);
			helper.highLightElement(driver, UploadDocument);
			//UploadDocument.click();
			helper.jsCLick(UploadDocument);
			helper.uploadFile("\"C:\\Users\\Official\\Downloads\\download.jpg\"");
			//Thread.sleep(4000);
			//helper.jsCLick(Deduction);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on  UploadDocument Button and Uploaded Document");
			Assert.assertTrue(true, "Failed to click on UploadDocument Button"); 
			
			
			helper.waitFor(PurposeOfLoan);
			helper.highLightElement(driver, PurposeOfLoan);
			PurposeOfLoan.sendKeys("Car");
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Entered  PurposeOfLoan ");
			Assert.assertTrue(true, "Failed to Enter Purpose of Loan "); 
			
			helper.waitFor(SaveButton);
			helper.highLightElement(driver, SaveButton);
			helper.jsCLick(SaveButton);
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on SaveButton ");
			Assert.assertTrue(true, "Failed to Click on Save Button "); 
			Thread.sleep(5000);
			
			helper.waitFor(Success);
			helper.highLightElement(driver, Success);
			//helper.jsCLick(Success);
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Displayed Success Message ");
			Assert.assertTrue(true, "Failed  to Display Success Message "); 
			


}
	 }
