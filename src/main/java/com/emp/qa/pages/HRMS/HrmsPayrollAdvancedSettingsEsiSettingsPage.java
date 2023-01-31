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

public class HrmsPayrollAdvancedSettingsEsiSettingsPage extends BasePage {

	public HrmsPayrollAdvancedSettingsEsiSettingsPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//a[@onclick='pfSettings()']")
		@CacheLookup
		WebElement Pf_Esisettings;
		
		@FindBy(xpath = "(//span[contains(.,'ESI Settings')])[2]")
		@CacheLookup
		WebElement Esi_settings;
		
		@FindBy(xpath = "//input[@id='esi_max_monthly_amount_id']")
		@CacheLookup
		WebElement MonthlyCtcForEsi;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
		@CacheLookup
		WebElement Save_Button;
		
		public  void HrmsPayrollAdvancedSettingsEsiSettingsPage() throws InterruptedException{
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
			
			helper.waitFor(Pf_Esisettings);
			helper.highLightElement(driver, Pf_Esisettings);
			helper.jsCLick(Pf_Esisettings);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Pf_Esisettings");
			Assert.assertTrue(true, "Failed to click on Pf_Esisettings");
			
			helper.waitFor(Esi_settings);
			helper.highLightElement(driver, Esi_settings);
			helper.jsCLick(Esi_settings);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Esi_settings");
			Assert.assertTrue(true, "Failed to click on Esi_settings");
			
			helper.waitFor(MonthlyCtcForEsi);
			helper.highLightElement(driver, MonthlyCtcForEsi);
			MonthlyCtcForEsi.clear();
			MonthlyCtcForEsi.sendKeys("20000");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on MonthlyCtcForEsi");
			Assert.assertTrue(true, "Failed to click on MonthlyCtcForEsi");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.Scrollintoview(Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(3000);
			
		}
	

}
