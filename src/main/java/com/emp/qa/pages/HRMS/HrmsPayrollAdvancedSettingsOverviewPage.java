package com.emp.qa.pages.HRMS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.Helpers;

public class HrmsPayrollAdvancedSettingsOverviewPage extends BasePage{

	public HrmsPayrollAdvancedSettingsOverviewPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//a[@onclick='overviewSettings()']")
		@CacheLookup
		WebElement Overview;
		
		@FindBy(xpath = "//input[@id='SearchTextField2']")
		@CacheLookup
		WebElement Search_bar;
		
		@FindBy(xpath = "(//button[@onclick='SearchText()'])[1]")
		@CacheLookup
		WebElement SearchBar_Button;
		
		@FindBy(xpath = "(//div[@class='table-responsive'])[2]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "//a[contains(text(),'Edit')]")
		@CacheLookup
		WebElement Edit_Button;
		
		@FindBy(css = "#edit_pf_overview_app_id")
		@CacheLookup
		WebElement PF_ApplicableToggleButton;
		
		@FindBy(xpath = "//input[@id='pf_joined_overview_edit_id']")
		@CacheLookup
		WebElement PF_JoinedDate;
		
		@FindBy(xpath = "/html//form[@id='pf_overview_edit_form_id']/div[2]/div[1]/div[1]/div[@class='col-md']/span/label/span")
		@CacheLookup
		WebElement EsiApplicableToggleButton;
		
		
		@FindBy(xpath = "//button[@onclick='savePfOverviewSettings()']")
		@CacheLookup
		WebElement Save_Button;
		
		
		public  void HrmsPayrollAdvancedSettingsOverviewPage() throws InterruptedException{
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
			
			helper.waitFor(Overview);
			helper.highLightElement(driver, Overview);
			helper.jsCLick(Overview);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Overview");
			Assert.assertTrue(true, "Failed to click on Overview");
			
			helper.waitFor(Search_bar);
			helper.highLightElement(driver, Search_bar);
			Search_bar.sendKeys("Auto code");
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Search_bar");
			Assert.assertTrue(true, "Failed to click on Search_bar");
			
			helper.waitFor(SearchBar_Button);
			helper.highLightElement(driver, SearchBar_Button);
			helper.jsCLick(SearchBar_Button);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on SearchBar_Button");
			Assert.assertTrue(true, "Failed to click on SearchBar_Button");
			
			helper.waitFor(Scroller);
			helper.highLightElement(driver, Scroller);
			helper.jsCLick(Scroller);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Scroller");
			Assert.assertTrue(true, "Failed to click on Scroller");
			
			helper.waitFor(Edit_Button);
			helper.highLightElement(driver, Edit_Button);
			helper.jsCLick(Edit_Button);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Edit_Button");
			Assert.assertTrue(true, "Failed to click on Edit_Button");
			Thread.sleep(3000);
			
			helper.waitFor(PF_ApplicableToggleButton);
			helper.highLightElement(driver, PF_ApplicableToggleButton);
			helper.jsCLick(PF_ApplicableToggleButton);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PF_ApplicableToggleButton");
			Assert.assertTrue(true, "Failed to click on PF_ApplicableToggleButton");
			Thread.sleep(3000);
			
			helper.waitFor(PF_JoinedDate);
			helper.highLightElement(driver, PF_JoinedDate);
			PF_JoinedDate.sendKeys("05052021");
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on PF_JoinedDate");
			Assert.assertTrue(true, "Failed to click on PF_JoinedDate");
			
			helper.waitFor(EsiApplicableToggleButton);
			helper.highLightElement(driver, EsiApplicableToggleButton);
			EsiApplicableToggleButton.click();
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on EsiApplicableToggleButton");
			Assert.assertTrue(true, "Failed to click on EsiApplicableToggleButton");
			
			helper.waitFor(Save_Button);
			helper.highLightElement(driver, Save_Button);
			helper.jsCLick(Save_Button);
			Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Save_Button");
			Assert.assertTrue(true, "Failed to click on Save_Button");
			Thread.sleep(3000);
			
			
			
			
			
		}

}
