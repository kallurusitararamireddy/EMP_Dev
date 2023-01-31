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

public class HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage extends BasePage {

	public HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[@class='nav-text'][contains(.,'Pension / Family Pension')]")
		@CacheLookup
		WebElement Pension_Family;
		
		@FindBy(xpath = "//button[contains(.,'Add Family Details')]")
		@CacheLookup
		WebElement AddFamily_Details;
		
		@FindBy(xpath = "//input[@id='empFamilyMemberNameId']")
		@CacheLookup
		WebElement MembersName;
		
		@FindBy(xpath = "//input[@id='empFamilyMemberRelationid']")
		@CacheLookup
		WebElement Relation;
		
		@FindBy(xpath = "//input[@id='empFamilyMemberAccountId']")
		@CacheLookup
		WebElement Amount;
		
		@FindBy(xpath = "//input[@id='empFamilyMemberDateId']")
		@CacheLookup
		WebElement Date;
		
		
		@FindBy(xpath = "//button[@id='addEmpFamilyMembersDetailsId']")
		@CacheLookup
		WebElement Save_Button;
		
		
		
		  public  void HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(Pension_Family);
				helper.highLightElement(driver, Pension_Family);
				helper.jsCLick(Pension_Family);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Pension_Family Button");
				Assert.assertTrue(true, "Failed to click on Pension_Family Button");
				
				helper.waitFor(AddFamily_Details);
				helper.highLightElement(driver, AddFamily_Details);
				helper.jsCLick(AddFamily_Details);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddFamily_Details Button");
				Assert.assertTrue(true, "Failed to click on AddFamily_Details Button");
				
				helper.waitFor(MembersName);
				helper.highLightElement(driver, MembersName);
				MembersName.sendKeys("Abcde");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Enntered MembersName  ");
				Assert.assertTrue(true, "Failed to Enter MembersName");
				
				helper.waitFor(Relation);
				helper.highLightElement(driver, Relation);
				Relation.sendKeys("werrt");
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  Relation ");
				Assert.assertTrue(true, "Failed to Enter Relation ");
				
				helper.waitFor(Amount);
				helper.highLightElement(driver, Amount);
				Amount.sendKeys("6000");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered on  Amount ");
				Assert.assertTrue(true, "Failed to Enter  Amount ");
				
				helper.waitFor(Date);
				helper.highLightElement(driver, Date);
				Date.sendKeys("10112021");
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered on  Date ");
				Assert.assertTrue(true, "Failed to Enter  Date ");
				
				helper.waitFor(Save_Button);
				helper.highLightElement(driver, Save_Button);
				helper.jsCLick(Save_Button);
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked On Save_Button ");
				Assert.assertTrue(true, "Failed to Click On Save_Button ");
				Thread.sleep(3000);
				



		  }
}
		  
