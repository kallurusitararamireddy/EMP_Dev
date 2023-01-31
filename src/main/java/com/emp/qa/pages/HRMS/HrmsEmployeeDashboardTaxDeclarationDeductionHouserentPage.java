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

public class HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage extends BasePage {

	public HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//span[contains(text(),'House Rent')]")
	@CacheLookup
	WebElement HouseRent;
	
	@FindBy(xpath = "//button[contains(text(),'Add New HRA')]")
	@CacheLookup
	WebElement AddnewHouseRent;
	
	@FindBy(xpath = "//input[@id='MonthlyAmountHRA']")
	@CacheLookup
	WebElement MonthlyHouseRent;
	
	@FindBy(xpath = "//input[@id='declaredAmountHRA']")
	@CacheLookup
	WebElement DeclaredHouseRent;
	
	@FindBy(xpath = "//input[@id='landLordNameHRA']")
	@CacheLookup
	WebElement LandLordName;
	
	@FindBy(xpath = "//input[@id='landLordNumberHRA']")
	@CacheLookup
	WebElement LandLordPanNumber;
	
	@FindBy(xpath = "//input[@id='EmployeedateOfjoinHRA']")
	@CacheLookup
	WebElement DateOfJoin;
	
	@FindBy(xpath = "//textarea[@id='addressHRAAdd']")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath = "(//a[@title='Click here to upload..'])[2]")
	@CacheLookup
	WebElement DocumentUploadButton;
	
	@FindBy(xpath = "//textarea[@id='commentHRAAdd']")
	@CacheLookup
	WebElement Comment;
	
	@FindBy(xpath = "//button[@id='NewHRASave']")
	@CacheLookup
	WebElement SaveButton;
	
	
	
	  public  void HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage() throws InterruptedException, AWTException{
          
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
			
			helper.waitFor(HouseRent);
			helper.highLightElement(driver, HouseRent);
			helper.jsCLick(HouseRent);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  HouseRent Button");
			Assert.assertTrue(true, "Failed to click on HouseRent Button"); 
			
			helper.waitFor(AddnewHouseRent);
			helper.highLightElement(driver, AddnewHouseRent);
			helper.jsCLick(AddnewHouseRent);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddnewHouseRent Button");
			Assert.assertTrue(true, "Failed to click on AddnewHouseRent Button"); 
			
			helper.waitFor(MonthlyHouseRent);
			helper.highLightElement(driver, MonthlyHouseRent);
			MonthlyHouseRent.sendKeys("10000");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Entered   MonthlyHouseRent ");
			Assert.assertTrue(true, "Failed to Enter   MonthlyHouseRent"); 
			
			helper.waitFor(DeclaredHouseRent);
			helper.highLightElement(driver, DeclaredHouseRent);
			DeclaredHouseRent.sendKeys("9000");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered DeclaredHouseRent");
			Assert.assertTrue(true, "Failed to Enter DeclaredHouseRent"); 
			
			helper.waitFor(LandLordName);
			helper.highLightElement(driver, LandLordName);
			LandLordName.sendKeys("Abcde");
			Reporter.log("<B><font color = 'blue'>8 .</font></B> Entered LandLord Name");
			Assert.assertTrue(true, "Failed to Enter LandLord Name"); 
			
			helper.waitFor(LandLordPanNumber);
			helper.highLightElement(driver, LandLordPanNumber);
			LandLordPanNumber.sendKeys("ABFK3102R");
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Entered Landlord PAN Number");
			Assert.assertTrue(true, "Failed to Enter Landlord PAN Number"); 
			
			helper.waitFor(DateOfJoin);
			helper.highLightElement(driver, DateOfJoin);
			DateOfJoin.sendKeys("1-2021");
			DateOfJoin.click();
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Entered Date Of Join Date");
			Assert.assertTrue(true, "Failed to Enter Date Of Join Date"); 
			
			helper.waitFor(Address);
			helper.highLightElement(driver, Address);
			Address.sendKeys("Banglore");
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Entered Address Into Address Field");
			Assert.assertTrue(true, "Failed to Enter Address Field");
			
			helper.waitFor(DocumentUploadButton);
			helper.highLightElement(driver, DocumentUploadButton);
			DocumentUploadButton.click();
			helper.uploadFile("C:\\Users\\Official\\Downloads\\Payslip.png");
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on DocumentUploadButton");
			Assert.assertTrue(true, "Failed to click on  DocumentUploadButton ");
			Thread.sleep(3000);
			
			helper.waitFor(Comment);
			helper.highLightElement(driver, Comment);
			Comment.sendKeys("asdfgh");
			Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Entered Comment");
			Assert.assertTrue(true, "Failed to Enter Comment"); 
			
			helper.waitFor(SaveButton);
			helper.highLightElement(driver, SaveButton);
			SaveButton.click();
			Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on SaveButton");
			Assert.assertTrue(true, "Failed to Click on Save Button"); 
			Thread.sleep(3000);


}
}
