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

public class HrmsPayrollAdvancedSettingsPage extends BasePage {

	public HrmsPayrollAdvancedSettingsPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//a[@href='#PayrollSetting']")
		@CacheLookup
		WebElement Payroll_Settings;
		
		@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/label[1]/span[1]")
		@CacheLookup
		WebElement Payroll_toggle_switch;
		
		
		@FindBy(xpath = "//span[@class='nav-text'][contains(.,'Pay Settings')]")
		@CacheLookup
		WebElement Pay_Settings;
		
		@FindBy(xpath = "//select[@id='from_paycycle_id']")
		@CacheLookup
		WebElement Paycycle_From;
		
		@FindBy(xpath = "//select[@id='to_paycycle_id']")
		@CacheLookup
		WebElement Paycycle_To;
		
		@FindBy(xpath = "//select[@id='from_payroll_leave_id']")
		@CacheLookup
		WebElement PayRoll_LeaveFrom;
		
		@FindBy(xpath = "//select[@id='to_payroll_leave_id']")
		@CacheLookup
		WebElement PayRoll_LeaveTo;
		
		@FindBy(xpath = "//select[@id='payout_Date_id']")
		@CacheLookup
		WebElement PayOut_Date;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
		@CacheLookup
		WebElement Save_Button;
		
		@FindBy(xpath = "//span[contains(text(),'Pay Days Calculation')]")
		@CacheLookup
		WebElement PayDays_Caluclations;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
		@CacheLookup
		WebElement Save;
		
				
		
		public  void HrmsPayrollAdvancedSettingsPage() throws InterruptedException{
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
			
			helper.waitFor(Payroll_Settings);
			helper.highLightElement(driver, Payroll_Settings);
			helper.jsCLick(Payroll_Settings);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Payroll_Settings");
			Assert.assertTrue(true, "Failed to click on Payroll_Settings");
			
//			helper.waitFor(Payroll_toggle_switch);
//			helper.highLightElement(driver, Payroll_toggle_switch);
//			helper.jsCLick(Payroll_toggle_switch);
//			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Payroll_toggle_switch");
//			Assert.assertTrue(true, "Failed to click on Payroll_toggle_switch");
			
			helper.waitFor(Pay_Settings);
			helper.highLightElement(driver, Pay_Settings);
			helper.jsCLick(Pay_Settings);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Pay_Settings");
			Assert.assertTrue(true, "Failed to click on Pay_Settings");
			
			helper.waitFor(Paycycle_From);
			helper.highLightElement(driver, Paycycle_From);
			helper.selectDropDownValue(Paycycle_From, "value", "1");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Paycycle_From");
			Assert.assertTrue(true, "Failed to click on Paycycle_From");
			
			helper.waitFor(Paycycle_To);
			helper.highLightElement(driver, Paycycle_To);
			helper.selectDropDownValue(Paycycle_To, "value", "31");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Paycycle_To");
			Assert.assertTrue(true, "Failed to click on Paycycle_To");
			
			helper.waitFor(PayRoll_LeaveFrom);
			helper.highLightElement(driver, PayRoll_LeaveFrom);
			helper.selectDropDownValue(PayRoll_LeaveFrom, "value", "1");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on PayRoll_LeaveFrom");
			Assert.assertTrue(true, "Failed to click on PayRoll_LeaveFrom");
			
			helper.waitFor(PayRoll_LeaveTo);
			helper.highLightElement(driver, PayRoll_LeaveTo);
			helper.selectDropDownValue(PayRoll_LeaveTo, "value", "31");
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on PayRoll_LeaveTo");
			Assert.assertTrue(true, "Failed to click on PayRoll_LeaveTo");
			
			helper.waitFor(PayOut_Date);
			helper.highLightElement(driver, PayOut_Date);
			helper.selectDropDownValue(PayOut_Date, "value", "31");
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PayOut_Date");
			Assert.assertTrue(true, "Failed to click on PayOut_Date");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.Scrollintoview(Save_Button);			
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(4000);
			
			helper.waitFor(PayDays_Caluclations);
			helper.highLightElement(driver, PayDays_Caluclations);
			helper.Scrollintoview(PayDays_Caluclations);			
			helper.jsCLick(PayDays_Caluclations);
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on PayDays_Caluclations");
			Assert.assertTrue(true, "Failed to click on PayDays_Caluclations");
			
			helper.waitFor(Save);
			helper.highLightElement(driver, Save);
			helper.Scrollintoview(Save);			
			helper.jsCLick(Save);
			Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Save");
			Assert.assertTrue(true, "Failed to click on Save");
			
			
			
			
			
			
		}
		

}
