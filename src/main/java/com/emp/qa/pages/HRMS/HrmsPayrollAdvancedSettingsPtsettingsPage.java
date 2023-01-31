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

public class HrmsPayrollAdvancedSettingsPtsettingsPage extends BasePage{

	public HrmsPayrollAdvancedSettingsPtsettingsPage(WebDriver driver) {
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
		
		@FindBy(xpath = "(//span[contains(.,'PT Settings')])[1]")
		@CacheLookup
		WebElement PTSettings;
		
		@FindBy(xpath = "(//span[contains(.,'PT Settings')])[2]")
		@CacheLookup
		WebElement PT_Settings;
		
		@FindBy(xpath = "//select[@id='location_id']")
		@CacheLookup
		WebElement Locations;
		
		@FindBy(xpath = "//input[@id='start_value1']")
		@CacheLookup
		WebElement Start_value;
		
		@FindBy(xpath = "//input[@id='end_value1']")
		@CacheLookup
		WebElement End_value;
		
		@FindBy(xpath = "//input[@id='value1']")
		@CacheLookup
		WebElement value;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
		@CacheLookup
		WebElement Save_Button;
		
		
		
		
		public  void HrmsPayrollAdvancedSettingsPtsettingsPage() throws InterruptedException{
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
			
			helper.waitFor(PTSettings);
			helper.highLightElement(driver, PTSettings);
			helper.jsCLick(PTSettings);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on PTSettings");
			Assert.assertTrue(true, "Failed to click on PTSettings");
			
			helper.waitFor(PT_Settings);
			helper.highLightElement(driver, PT_Settings);
			helper.jsCLick(PT_Settings);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on PT_Settings");
			Assert.assertTrue(true, "Failed to click on PT_Settings");
			
			helper.waitFor(Locations);
			helper.highLightElement(driver, Locations);
			helper.selectDropDownValue(Locations, "value", "11");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Locations");
			Assert.assertTrue(true, "Failed to click on Locations");
			
			helper.waitFor(Start_value);
			helper.highLightElement(driver, Start_value);
			Start_value.clear();
			Start_value.sendKeys("10000");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Start_value");
			Assert.assertTrue(true, "Failed to click on Start_value");
			
			helper.waitFor(End_value);
			helper.highLightElement(driver, End_value);
			End_value.clear();
			End_value.sendKeys("15000");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on End_value");
			Assert.assertTrue(true, "Failed to click on End_value");
			
			helper.waitFor(value);
			helper.highLightElement(driver, value);
			value.clear();
			value.sendKeys("350");
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on value");
			Assert.assertTrue(true, "Failed to click on End_value");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(3000);
			
			
		}
		
			
	
	

}
