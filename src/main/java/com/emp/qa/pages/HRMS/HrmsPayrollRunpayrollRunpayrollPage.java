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

public class HrmsPayrollRunpayrollRunpayrollPage extends BasePage {

	public HrmsPayrollRunpayrollRunpayrollPage(WebDriver driver) {
		super(driver);
	
	}
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Payroll')])[1]")
	@CacheLookup
	WebElement Payroll;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Run Payroll')]")
	@CacheLookup
	WebElement RunPayroll;
	
	@FindBy(xpath = "//a[@id='OverviewMenu']")
	@CacheLookup
	WebElement Overview;
	
	@FindBy(xpath = "//select[@id='years']")
	@CacheLookup
	WebElement YearDropsdown;
	
	@FindBy(xpath = "//label[contains(text(),'January')]")
	@CacheLookup
	WebElement January;
	
	@FindBy(xpath = "//label[contains(text(),'February')]")
	@CacheLookup
	WebElement February;
	
	@FindBy(xpath = "//label[contains(text(),'March')]")
	@CacheLookup
	WebElement March;
	
	@FindBy(xpath = "//label[contains(text(),'April')]")
	@CacheLookup
	WebElement April;
	
	@FindBy(xpath = "//label[contains(text(),'May')]")
	@CacheLookup
	WebElement May;
	
	@FindBy(xpath = "//label[contains(text(),'June')]")
	@CacheLookup
	WebElement June;
	
	@FindBy(xpath = "//label[contains(text(),'July')]")
	@CacheLookup
	WebElement July;
	
	@FindBy(xpath = "//label[contains(text(),'August')]")
	@CacheLookup
	WebElement August;
	
	@FindBy(xpath = "//label[contains(text(),'September')]")
	@CacheLookup
	WebElement September;
	
	@FindBy(xpath = "//label[contains(text(),'October')]")
	@CacheLookup
	WebElement October;
	
	@FindBy(xpath = "//span[contains(text(),'Preview and Run Payroll')]")
	@CacheLookup
	WebElement Previewandrunpayroll;
	
	@FindBy(xpath = "//input[contains(@aria-controls,'run_payroll_table')]")
	@CacheLookup
	WebElement Searchbar;
	
	@FindBy(xpath = "(//div[contains(@class,'scrollBody')])[1]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='preview24858']/td[20]/a[1]")
	@CacheLookup
	WebElement Components;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement Close;
	
	
	
	
	public  void HrmsPayrollRunpayrollRunpayrollPage() throws InterruptedException{
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
		helper.jsCLick(Payroll);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Payroll");
		Assert.assertTrue(true, "Failed to click on Payroll");
		
		
		helper.waitFor(RunPayroll);
		helper.highLightElement(driver, RunPayroll);
		helper.jsCLick(RunPayroll);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on RunPayroll");
		Assert.assertTrue(true, "Failed to click on RunPayroll");
		
		helper.waitFor(Overview);
		helper.highLightElement(driver, Overview);
		helper.Scrollintoview(Overview);
		helper.jsCLick(Overview);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Overview");
		Assert.assertTrue(true, "Failed to click on Overview");
		
		helper.waitFor(YearDropsdown);
		helper.highLightElement(driver, YearDropsdown);
		helper.selectDropDownValue(YearDropsdown, "value", "2021");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on YearDropsdown");
		Assert.assertTrue(true, "Failed to click on YearDropsdown");
		
//		helper.waitFor(January);
//		helper.highLightElement(driver, January);
//		helper.jsCLick(January);
//		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on January");
//		Assert.assertTrue(true, "Failed to click on January");
//		
//		helper.waitFor(February);
//		helper.highLightElement(driver, February);
//		helper.jsCLick(February);
//		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on February");
//		Assert.assertTrue(true, "Failed to click on February");
//		
//		helper.waitFor(March);
//		helper.highLightElement(driver, March);
//		helper.jsCLick(March);
//		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on March");
//		Assert.assertTrue(true, "Failed to click on March");
//		
//		helper.waitFor(April);
//		helper.highLightElement(driver, April);
//		helper.jsCLick(April);
//		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on April");
//		Assert.assertTrue(true, "Failed to click on April");
//		
//		helper.waitFor(May);
//		helper.highLightElement(driver, May);
//		helper.jsCLick(May);
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on May");
//		Assert.assertTrue(true, "Failed to click on May");
//		
//		helper.waitFor(June);
//		helper.highLightElement(driver, June);
//		helper.jsCLick(June);
//		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on June");
//		Assert.assertTrue(true, "Failed to click on June");
//		
//		helper.waitFor(July);
//		helper.highLightElement(driver, July);
//		helper.jsCLick(July);
//		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on July");
//		Assert.assertTrue(true, "Failed to click on July");
//		
//		helper.waitFor(August);
//		helper.highLightElement(driver, August);
//		helper.jsCLick(August);
//		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on January");
//		Assert.assertTrue(true, "Failed to click on January");
//		
//		helper.waitFor(September);
//		helper.highLightElement(driver, September);
//		helper.jsCLick(September);
//		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on September");
//		Assert.assertTrue(true, "Failed to click on September");
		
		
		helper.waitFor(Previewandrunpayroll);
		helper.highLightElement(driver, Previewandrunpayroll);
		helper.jsCLick(Previewandrunpayroll);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Previewandrunpayroll");
		Assert.assertTrue(true, "Failed to click on Previewandrunpayroll");
		Thread.sleep(6000);
		
//		helper.waitFor(October);
//		helper.highLightElement(driver, October);
//		helper.jsCLick(October);
//		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on OctoberOctober");
//		Assert.assertTrue(true, "Failed to click on October");
//		Thread.sleep(5000);
		
		
		helper.waitFor(Searchbar);
		helper.highLightElement(driver, Searchbar);
		helper.Scrollintoview(Searchbar);
		Searchbar.sendKeys("Auto code");
		helper.jsCLick(Searchbar);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Searchbar");
		Assert.assertTrue(true, "Failed to click on Searchbar");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		
		
		
		helper.waitFor(Components);
		helper.highLightElement(driver, Components);
		helper.jsCLick(Components);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Components");
		Assert.assertTrue(true, "Failed to click on Components");
		Thread.sleep(4000);
		
		helper.waitFor(Close);
		helper.highLightElement(driver, Close);
		helper.jsCLick(Close);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Close");
		Assert.assertTrue(true, "Failed to click on Close");
		
		

}
}