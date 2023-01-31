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

public class HrmsPayrollAdvancedSettingsPtsettingsOverviewPage extends BasePage {

	public HrmsPayrollAdvancedSettingsPtsettingsOverviewPage(WebDriver driver) {
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
		
		@FindBy(xpath = "(//span[contains(.,'Overview')])[2]")
		@CacheLookup
		WebElement overview;
		
		@FindBy(xpath = "//input[@id='SearchTextField']")
		@CacheLookup
		WebElement Search_Bar;
		
		@FindBy(xpath = "//button[@id='SearchButton']")
		@CacheLookup
		WebElement Search_BarButton;
		
		@FindBy(xpath = "//*[@id=\"CODE-123\"]/td[6]/a")
		@CacheLookup
		WebElement Edit_Button;
		
		@FindBy(xpath = "//body/div[@id='pt_overview_edit_modal_id']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]")
		@CacheLookup
		WebElement PTApplicable_Toggleswitch;
		
		@FindBy(xpath = "//body/div[@id='pt_overview_edit_modal_id']/div[1]/div[1]/div[3]/button[2]")
		@CacheLookup
		WebElement Save_Button;
		
		public  void HrmsPayrollAdvancedSettingsPtsettingsOverviewPage() throws InterruptedException{
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
			
			helper.waitFor(PTSettings);
			helper.highLightElement(driver, PTSettings);
			helper.jsCLick(PTSettings);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on PTSettings");
			Assert.assertTrue(true, "Failed to click on PTSettings");
			
			helper.waitFor(overview);
			helper.highLightElement(driver, overview);
			helper.jsCLick(overview);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on overview");
			Assert.assertTrue(true, "Failed to click on overview");
			
			helper.waitFor(overview);
			helper.highLightElement(driver, overview);
			helper.jsCLick(overview);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on overview");
			Assert.assertTrue(true, "Failed to click on overview");
			
			helper.waitFor(Search_Bar);
			helper.highLightElement(driver, Search_Bar);
			Search_Bar.sendKeys("auto code");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Search_Bar");
			Assert.assertTrue(true, "Failed to click on Search_Bar");
			
			helper.waitFor(Search_BarButton);
			helper.highLightElement(driver, Search_BarButton);
			helper.jsCLick(Search_BarButton);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Search_BarButton");
			Assert.assertTrue(true, "Failed to click on Search_BarButton");
			
			helper.waitFor(Edit_Button);
			helper.highLightElement(driver, Edit_Button);
			helper.jsCLick(Edit_Button);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Edit_Button");
			Assert.assertTrue(true, "Failed to click on Edit_Button");
			
			helper.waitFor(PTApplicable_Toggleswitch);
			helper.highLightElement(driver, PTApplicable_Toggleswitch);
			helper.jsCLick(PTApplicable_Toggleswitch);
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on PTApplicable_Toggleswitch");
			Assert.assertTrue(true, "Failed to click on PTApplicable_Toggleswitch");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(3000);
			
		}

}
