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

public class HrmsPayrollAdvancedSettingsPfPage extends BasePage{

	public HrmsPayrollAdvancedSettingsPfPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//span[contains(.,'PF Settings')]")
		@CacheLookup
		WebElement Pf_settings;
		
		@FindBy(xpath = "/html//div[@id='pf_Settings']/div[@class='row']/div[@class='col-md-12']/div[1]/div[@class='col-md']/span/label/span")
		@CacheLookup
		WebElement ProvidentfundStatusToggleButton;
		
		@FindBy(xpath = "//input[@id='min_monthly_amount_id']")
		@CacheLookup
		WebElement MonthlyAmountFORPfCalulation;
		
		@FindBy(xpath = "//select[@id='employee_pf_id']")
		@CacheLookup
		WebElement Employee_Pf;
		
		@FindBy(xpath = "//select[@id='employer_pf_id']")
		@CacheLookup
		WebElement Employer_Pf;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
		@CacheLookup
		WebElement Save_Button;
		
		
		
		public  void HrmsPayrollAdvancedSettingsPfPage() throws InterruptedException{
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
			
			
			helper.waitFor(Pf_settings);
			helper.highLightElement(driver, Pf_settings);
			helper.jsCLick(Pf_settings);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Pf_settings");
			Assert.assertTrue(true, "Failed to click on Pf_settings");
			
			helper.waitFor(ProvidentfundStatusToggleButton);
			helper.highLightElement(driver, ProvidentfundStatusToggleButton);
			helper.jsCLick(ProvidentfundStatusToggleButton);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ProvidentfundStatusToggleButton");
			Assert.assertTrue(true, "Failed to click on ProvidentfundStatusToggleButton");
			
			

			helper.waitFor(MonthlyAmountFORPfCalulation);
			helper.highLightElement(driver, MonthlyAmountFORPfCalulation);
			MonthlyAmountFORPfCalulation.clear();
			MonthlyAmountFORPfCalulation.sendKeys("15000");
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on MonthlyAmountFORPfCalulation");
			Assert.assertTrue(true, "Failed to click on MonthlyAmountFORPfCalulation");
			
			helper.waitFor(Employee_Pf);
			helper.highLightElement(driver, Employee_Pf);
			helper.selectDropDownValue(Employee_Pf, "value", "basic");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Employee_Pf");
			Assert.assertTrue(true, "Failed to click on Employee_Pf");
			
			helper.waitFor(Employer_Pf);
			helper.highLightElement(driver, Employer_Pf);
			helper.selectDropDownValue(Employer_Pf, "value", "basic");
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Employer_Pf");
			Assert.assertTrue(true, "Failed to click on Employer_Pf");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(4000);
			
			
		}
		

}
