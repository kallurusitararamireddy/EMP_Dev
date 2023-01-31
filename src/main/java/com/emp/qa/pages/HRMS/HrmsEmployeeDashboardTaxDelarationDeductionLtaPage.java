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

public class HrmsEmployeeDashboardTaxDelarationDeductionLtaPage extends BasePage {

	public HrmsEmployeeDashboardTaxDelarationDeductionLtaPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'LTA')]")
		@CacheLookup
		WebElement Lta;
		
		@FindBy(xpath = "//button[contains(text(),'Add New LTA')]")
		@CacheLookup
		WebElement AddnewLta;
		
		@FindBy(xpath = "//input[@id='componentNameID']")
		@CacheLookup
		WebElement ComponenetName;
		
		@FindBy(xpath = "//input[@id='LTADeclaredAmount']")
		@CacheLookup
		WebElement DeclaredAmount;
		
		@FindBy(xpath = "//a[@id='LTA_opener']")
		@CacheLookup
		WebElement UploadDocument;
		
		@FindBy(xpath = "//input[@id='singleDateCalender']")
		@CacheLookup
		WebElement Date;
		
		@FindBy(xpath = "//textarea[@id='commentLTAID']")
		@CacheLookup
		WebElement Comment;
		
		@FindBy(xpath = "//*[@id=\"NewLTASave\"]")
		@CacheLookup
		WebElement SaveButton;
		
		 public  void HrmsEmployeeDashboardTaxDelarationDeductionLtaPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(Lta);
				helper.highLightElement(driver, Lta);
				helper.jsCLick(Lta);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Lta Button");
				Assert.assertTrue(true, "Failed to click on Lta Button"); 
				
				helper.waitFor(AddnewLta);
				helper.highLightElement(driver, AddnewLta);
				helper.jsCLick(AddnewLta);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddnewLta Button");
				Assert.assertTrue(true, "Failed to click on AddnewLta Button"); 
				
				helper.waitFor(ComponenetName);
				helper.highLightElement(driver, ComponenetName);
				ComponenetName.sendKeys("Bus");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Entered  ComponenetName ");
				Assert.assertTrue(true, "Entered ComponenetName "); 
				
				helper.waitFor(DeclaredAmount);
				helper.highLightElement(driver, DeclaredAmount);
				DeclaredAmount.sendKeys("7000");
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  DeclaredAmount ");
				Assert.assertTrue(true, "Failed to Enter DeclaredAmount"); 
				
				helper.waitFor(UploadDocument);
				helper.highLightElement(driver, UploadDocument);
				UploadDocument.click();
				helper.uploadFile("C:\\Users\\Official\\Downloads\\Payslip.png");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  UploadDocument Button");
				Assert.assertTrue(true, "Failed to click on UploadDocument Button"); 
				
				helper.waitFor(Date);
				helper.highLightElement(driver, Date);
				Date.sendKeys("11112021");
				Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Entered  Date ");
				Assert.assertTrue(true, "Filed to Enter Date ");
				
				helper.waitFor(Comment);
				helper.highLightElement(driver, Comment);
				Comment.sendKeys("wertyu");
				Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Entered  Comment ");
				Assert.assertTrue(true, "Filed to Enter Comment "); 
				
				helper.waitFor(SaveButton);
				helper.highLightElement(driver, SaveButton);
				SaveButton.click();
				Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  SaveButton ");
				Assert.assertTrue(true, "Filed to Click on SaveButton "); 
				Thread.sleep(3000);
				driver.navigate().refresh();

}
}
