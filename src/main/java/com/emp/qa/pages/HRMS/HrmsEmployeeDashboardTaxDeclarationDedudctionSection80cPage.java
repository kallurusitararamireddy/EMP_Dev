package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
import java.awt.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.Helpers;

public class HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage extends BasePage {

	public HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(text(),'Section 80 C / 80CCD / ETC')]")
		@CacheLookup
		WebElement Section80C;
		
		@FindBy(xpath = "//select[@id='finalcial_year_deduction']")
		@CacheLookup
		WebElement FinancialYearDropDown;
		
		@FindBy(css = "tr:nth-of-type(1) > td:nth-of-type(8) > .btn.btn-icon.btn-light.btn-sm.mx-3 > .flaticon2-pen")
		@CacheLookup      
		WebElement LifeInusrancePremium_EditButton;
		
		@FindBy(xpath = "//input[@id='DeclarationDeclaredAmount']")
		@CacheLookup
		WebElement DeclaredAmount;
		
		@FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p[2]/a[1]/i[1]")
		@CacheLookup
		WebElement UploadDocument;
		
		@FindBy(xpath = "//textarea[@id='sectionCommentEmployee']")
		@CacheLookup
		WebElement Comment;
		
		@FindBy(xpath = "//*[@id=\"NewLTASave\"]")
		@CacheLookup
		WebElement SaveButton;
		
		
		
		
        public  void HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage() throws InterruptedException, AWTException{
             
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
				


				helper.waitFor(Section80C);
				helper.highLightElement(driver, Section80C);
				helper.jsCLick(Section80C);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Section80C Button");
				Assert.assertTrue(true, "Failed to click on Section80C Button"); 
				
//				helper.waitFor(FinancialYearDropDown);
//				helper.highLightElement(driver, FinancialYearDropDown);
//				helper.selectDropDownValue(FinancialYearDropDown, "value", "2020-2021");
//				helper.jsCLick(FinancialYearDropDown);
//				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  FinancialYearDropDown Button");
//				Assert.assertTrue(true, "Failed to click on FinancialYearDropDown Button"); 
				
				
			
				helper.waitFor(LifeInusrancePremium_EditButton);
				helper.highLightElement(driver, LifeInusrancePremium_EditButton);
				helper.jsCLick(LifeInusrancePremium_EditButton);
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  LifeInusrancePremium_EditButton Button");
				Assert.assertTrue(true, "Failed to click on LifeInusrancePremium_EditButton Button"); 
				
				helper.waitFor(DeclaredAmount);
				helper.highLightElement(driver, DeclaredAmount);
				DeclaredAmount.clear();
				DeclaredAmount.sendKeys("10000");
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  DeclaredAmount ");
				Assert.assertTrue(true, "Failed to Enter DeclaredAmount"); 
				
				helper.waitFor(UploadDocument);
				helper.highLightElement(driver, UploadDocument);
                helper.jsCLick(UploadDocument);
				helper.uploadFile("‪‪‪‪C:\\Users\\Official\\Downloads\\download.jpg");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  UploadDocument Button and Uploaded the Document");
				Assert.assertTrue(true, "Failed to click on UploadDocument Button");
				Thread.sleep(3000);
				
				helper.waitFor(Comment);
				helper.highLightElement(driver, Comment);
				Comment.clear();
				Comment.sendKeys("asdf");
				Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Entered Comment");
				Assert.assertTrue(true, "Failed to Enter Comment"); 
				
				helper.waitFor(SaveButton);
				helper.highLightElement(driver, SaveButton);
				helper.jsCLick(SaveButton);
				Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  SaveButton ");
				Assert.assertTrue(true, "Failed to click on SaveButton "); 
				Thread.sleep(3000);
				
				


}
}

