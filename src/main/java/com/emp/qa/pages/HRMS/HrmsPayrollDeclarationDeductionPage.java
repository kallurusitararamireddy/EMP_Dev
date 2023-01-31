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

public class HrmsPayrollDeclarationDeductionPage extends BasePage {

	public HrmsPayrollDeclarationDeductionPage(WebDriver driver) {
		super(driver);
		
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//a[@href='run-payroll'][contains(.,'Payroll')])[1]")
		@CacheLookup
		WebElement Payroll;
		
		@FindBy(xpath = "//span[contains(text(),'Declaration')]")
		@CacheLookup
		WebElement Declaration;
		
		@FindBy(xpath = "//span[contains(text(),'Deduction')]")
		@CacheLookup
		WebElement Deduction;
		

		@FindBy(xpath = "//span[contains(text(),'Section 80 C / 80CCD / ETC')]")
		@CacheLookup
		WebElement Section_80c;
		
		@FindBy(xpath = "//div[@id='sectionAdminCard']//table/tbody//a[@class='btn btn-primary']")
		@CacheLookup
		WebElement MoreData;
		
		@FindBy(xpath = "(//div[contains(@class,'modal-body')])[1]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "//tbody/tr[@id='section170']/td[10]/a[1]/i[1]")
		@CacheLookup
		WebElement Actions_Button;
		
		@FindBy(xpath = "//input[@id='approvedAmountByAdmin']")
		@CacheLookup
		WebElement ApprovedAmount;
		
		@FindBy(xpath = "//select[@id='approvalStatus']")
		@CacheLookup
		WebElement Status;
		
		@FindBy(xpath = "//button[contains(text(),'Update')]")
		@CacheLookup
		WebElement Update;
		
		@FindBy(xpath = "(//button[contains(.,'Close')])[1]")
		@CacheLookup
		WebElement Close_Button;
		
		@FindBy(xpath = "//span[contains(text(),'House Rent')]")
		@CacheLookup
		WebElement House_rent;
		
		@FindBy(xpath = "(//div[@class='dataTables_scrollBody'])[2]")
		@CacheLookup
		WebElement ScrollBar;
		

		@FindBy(xpath = "//button[contains(@onclick,'fillHRAFormEdit(100)')]")
		@CacheLookup
		WebElement Actions;
		
		@FindBy(xpath = "(//button[contains(.,'Approve')])[2]")
		@CacheLookup
		WebElement Approve_Button;
		
		@FindBy(xpath = "//span[contains(text(),'LTA')]")
		@CacheLookup
		WebElement Lta_Button;
		
		@FindBy(xpath = "//tbody/tr[@id='LTA_table_TR_164']/td[8]/button[1]")
		@CacheLookup
		WebElement Lta_Action_Button;
		
		@FindBy(xpath = "//input[@id='LTAApprovedAmountAdded']")
		@CacheLookup
		WebElement LTAApprovedAmount;
		

		@FindBy(xpath = "(//button[contains(@value,'1')])[3]")
		@CacheLookup
		WebElement LTAApprove_Button;
		
		public  void HrmsPayrollDeclarationDeductionPage() throws InterruptedException{
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
			helper.Scrollintoview(Payroll);
			helper.jsCLick(Payroll);
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Payroll");
			Assert.assertTrue(true, "Failed to click on Payroll");
			
			helper.waitFor(Declaration);
			helper.highLightElement(driver, Declaration);
			helper.Scrollintoview(Declaration);
			helper.jsCLick(Declaration);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Declaration");
			Assert.assertTrue(true, "Failed to click on Declaration");
			
			helper.waitFor(Deduction);
			helper.highLightElement(driver, Deduction);
			helper.Scrollintoview(Deduction);
			helper.jsCLick(Deduction);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Deduction");
			Assert.assertTrue(true, "Failed to click on Deduction");
			
			helper.waitFor(Section_80c);
			helper.highLightElement(driver, Section_80c);
			helper.Scrollintoview(Section_80c);
			helper.jsCLick(Section_80c);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Section_80c");
			Assert.assertTrue(true, "Failed to click on Section_80c");
			
			helper.waitFor(MoreData);
			helper.highLightElement(driver, MoreData);
			helper.Scrollintoview(MoreData);
			helper.jsCLick(MoreData);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on MoreData");
			Assert.assertTrue(true, "Failed to click on MoreData");
			Thread.sleep(3000);
			
			helper.waitFor(Scroller);
			helper.highLightElement(driver, Scroller);
			helper.jsCLick(Scroller);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Scroller");
			Assert.assertTrue(true, "Failed to click on Scroller");
			
//			helper.waitFor(Actions_Button);
//			helper.highLightElement(driver, Actions_Button);
//			helper.Scrollintoview(Actions_Button);
//			helper.jsCLick(Actions_Button);
//			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Actions_Button");
//			Assert.assertTrue(true, "Failed to click on Actions_Button");
//			
//			helper.waitFor(ApprovedAmount);
//			helper.highLightElement(driver, ApprovedAmount);
//			ApprovedAmount.clear();
//			ApprovedAmount.sendKeys("1000");
//			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on ApprovedAmount");
//			Assert.assertTrue(true, "Failed to click on ApprovedAmount");
//			
//			
//			helper.waitFor(Status);
//			helper.highLightElement(driver, Status);
//			helper.Scrollintoview(Status);
//			helper.selectDropDownValue(Status, "value", "1");
//			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Status");
//			Assert.assertTrue(true, "Failed to click on Status");
//			
//			
//			helper.waitFor(Update);
//			helper.highLightElement(driver, Update);
//			helper.jsCLick(Update);
//			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Update");
//			Assert.assertTrue(true, "Failed to click on Update");
//			Thread.sleep(4000);
//			
//			helper.waitFor(Close_Button);
//			helper.highLightElement(driver, Close_Button);
//			helper.jsCLick(Close_Button);
//			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Close_Button");
//			Assert.assertTrue(true, "Failed to click on Close_Button");
//			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			
			helper.waitFor(House_rent);
			helper.highLightElement(driver, House_rent);
			helper.jsCLick(House_rent);
			Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on House_rent");
			Assert.assertTrue(true, "Failed to click on House_rent");
			

			helper.waitFor(ScrollBar);
			helper.highLightElement(driver, ScrollBar);
			helper.jsCLick(ScrollBar);
			Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on ScrollBar");
			Assert.assertTrue(true, "Failed to click on ScrollBar");
			
			
//			helper.waitFor(Actions);
//			helper.highLightElement(driver, Actions);
//			helper.Scrollintoview(Actions);
//			helper.jsCLick(Actions);
//			Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Actions");
//			Assert.assertTrue(true, "Failed to click on Actions");
//			Thread.sleep(3000);
//			
//			helper.waitFor(Approve_Button);
//			helper.highLightElement(driver, Approve_Button);
//			helper.Scrollintoview(Approve_Button);
//			helper.jsCLick(Approve_Button);
//			Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on Approve_Button");
//			Assert.assertTrue(true, "Failed to click on Approve_Button");
			
			helper.waitFor(Lta_Button);
			helper.highLightElement(driver, Lta_Button);
			helper.Scrollintoview(Lta_Button);
			helper.jsCLick(Lta_Button);
			Reporter.log("<B><font color = 'blue'>Step18 .</font></B> clicked on Lta_Button");
			Assert.assertTrue(true, "Failed to click on Lta_Button");
			Thread.sleep(1000);
			
//			helper.waitFor(Lta_Action_Button);
//			helper.highLightElement(driver, Lta_Action_Button);
//			helper.jsCLick(Lta_Action_Button);
//			Reporter.log("<B><font color = 'blue'>Step19 .</font></B> clicked on Lta_Action_Button");
//			Assert.assertTrue(true, "Failed to click on Lta_Action_Button");
//			
//			helper.waitFor(LTAApprovedAmount);
//			helper.highLightElement(driver, LTAApprovedAmount);
//			LTAApprovedAmount.clear();
//			LTAApprovedAmount.sendKeys("1000");
//			Reporter.log("<B><font color = 'blue'>Step20 .</font></B> clicked on LTAApprovedAmount");
//			Assert.assertTrue(true, "Failed to click on LTAApprovedAmount");
//			
//			helper.waitFor(LTAApprove_Button);
//			helper.highLightElement(driver, LTAApprove_Button);
//			helper.jsCLick(LTAApprove_Button);
//			Reporter.log("<B><font color = 'blue'>Step21 .</font></B> clicked on LTAApprove_Button");
//			Assert.assertTrue(true, "Failed to click on LTAApprove_Button");
//			
//			
			
			
			
			
			
			
		}
		

}
