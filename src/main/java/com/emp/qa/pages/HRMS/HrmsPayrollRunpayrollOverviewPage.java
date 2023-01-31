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

public class HrmsPayrollRunpayrollOverviewPage extends BasePage {

	public HrmsPayrollRunpayrollOverviewPage(WebDriver driver) {
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
	
	@FindBy(xpath = "/html//button[@id='overviewNext']")
	@CacheLookup
	WebElement Next_Button;
	
	public  void HrmsPayrollRunpayrollOverviewPage() throws InterruptedException{
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
		
		helper.waitFor(June);
		helper.highLightElement(driver, June);
		helper.jsCLick(June);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on June");
		Assert.assertTrue(true, "Failed to click on June");
		
		helper.waitFor(July);
		helper.highLightElement(driver, July);
		helper.jsCLick(July);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on July");
		Assert.assertTrue(true, "Failed to click on July");
		
		helper.waitFor(August);
		helper.highLightElement(driver, August);
		helper.jsCLick(August);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on August");
		Assert.assertTrue(true, "Failed to click on August");
		
		helper.waitFor(September);
		helper.highLightElement(driver, September);
		helper.jsCLick(September);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on September");
		Assert.assertTrue(true, "Failed to click on September");
		
		helper.waitFor(October);
		helper.highLightElement(driver, October);
		helper.jsCLick(October);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on October");
		Assert.assertTrue(true, "Failed to click on October");
		
		helper.waitFor(Next_Button);
		helper.highLightElement(driver, Next_Button);
		helper.Scrollintoview(Next_Button);
		helper.jsCLick(Next_Button);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Next_Button");
		Assert.assertTrue(true, "Failed to click on Next_Button");
		Thread.sleep(3000);

}
}
