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

public class HrmsPayrollAdvacedSettingsDeclarationSettingsPage extends BasePage{

	public HrmsPayrollAdvacedSettingsDeclarationSettingsPage(WebDriver driver) {
		super(driver);
		
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//a[@href='run-payroll'][contains(.,'Payroll')])[1]")
		@CacheLookup
		WebElement Payroll;
		
		@FindBy(xpath = "//span[contains(text(),'Advanced Settings')]")
		@CacheLookup
		WebElement AdvancedSettings;
		

		@FindBy(xpath = "//span[contains(.,'Declaration Settings')]")
		@CacheLookup
		WebElement DeclarationSettings;
		
		@FindBy(xpath = "/html//div[@id='Declaration']/div[@class='row']/div[@class='col-md-12']//div[@class='col-md']/span/label/span")
		@CacheLookup
		WebElement DeclarationSettingsToggleButton;
		
		@FindBy(xpath = "//input[@id='yearly_from_date_id']")
		@CacheLookup
		WebElement YearlyWindowFrom;
		
		@FindBy(xpath = "//input[@id='yearly_to_date_id']")
		@CacheLookup
		WebElement YearlyWindowTo;
		
		@FindBy(xpath = "//button[@onclick='saveDeclarationSettings()']")
		@CacheLookup
		WebElement Save_Button;
		
		
		public  void HrmsPayrollAdvacedSettingsDeclarationSettingsPage() throws InterruptedException{
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
			
			helper.waitFor(AdvancedSettings);
			helper.highLightElement(driver, AdvancedSettings);
			helper.jsCLick(AdvancedSettings);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on AdvancedSettings");
			Assert.assertTrue(true, "Failed to click on AdvancedSettings");
			
			helper.waitFor(DeclarationSettings);
			helper.highLightElement(driver, DeclarationSettings);
			helper.jsCLick(DeclarationSettings);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on DeclarationSettings");
			Assert.assertTrue(true, "Failed to click on DeclarationSettings");
			
			helper.waitFor(DeclarationSettingsToggleButton);
			helper.highLightElement(driver, DeclarationSettingsToggleButton);
			helper.jsCLick(DeclarationSettingsToggleButton);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on DeclarationSettingsToggleButton");
			Assert.assertTrue(true, "Failed to click on DeclarationSettingsToggleButton");
			
			helper.waitFor(YearlyWindowFrom);
			helper.highLightElement(driver, YearlyWindowFrom);
			YearlyWindowFrom.sendKeys("06052021");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on YearlyWindowFrom");
			Assert.assertTrue(true, "Failed to click on YearlyWindowFrom");
			
			helper.waitFor(YearlyWindowTo);
			helper.highLightElement(driver, YearlyWindowTo);
			YearlyWindowTo.sendKeys("06052022");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on YearlyWindowTo");
			Assert.assertTrue(true, "Failed to click on YearlyWindowTo");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			
		}

}
