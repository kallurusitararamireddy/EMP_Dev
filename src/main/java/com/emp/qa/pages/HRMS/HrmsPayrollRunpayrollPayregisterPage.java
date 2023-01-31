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

public class HrmsPayrollRunpayrollPayregisterPage extends BasePage {

	public HrmsPayrollRunpayrollPayregisterPage(WebDriver driver) {
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
		
		@FindBy(xpath = "//a[contains(text(),'Pay Register')]")
		@CacheLookup
		WebElement Payregister;
		
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
		
		@FindBy(xpath = "//*[@id=\"pay_register_table_filter\"]/label/input")
		@CacheLookup
		WebElement SearchBar;
		
		@FindBy(xpath = "//div[contains(@class,'scrollBody')]")
		@CacheLookup
		WebElement Scroller;
		
		@FindBy(xpath = "//a[contains(text(),'Components')]")
		@CacheLookup
		WebElement Components;
		
		@FindBy(xpath = "//button[contains(text(),'Close')]")
		@CacheLookup
		WebElement Close_Button;
		
		public  void HrmsPayrollRunpayrollPayregisterPage() throws InterruptedException{
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
			
			helper.waitFor(Payregister);
			helper.highLightElement(driver, Payregister);
			helper.jsCLick(Payregister);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Payregister");
			Assert.assertTrue(true, "Failed to click on Payregister");
			
//			helper.waitFor(July);
//			helper.highLightElement(driver, July);
//			helper.jsCLick(July);
//			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on July");
//			Assert.assertTrue(true, "Failed to click on July");
//			
//			helper.waitFor(August);
//			helper.highLightElement(driver, August);
//			helper.jsCLick(August);
//			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on August");
//			Assert.assertTrue(true, "Failed to click on August");
//			
//			helper.waitFor(September);
//			helper.highLightElement(driver, September);
//			helper.jsCLick(September);
//			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on September");
//			Assert.assertTrue(true, "Failed to click on September");
			
			helper.waitFor(October);
			helper.highLightElement(driver, October);
			helper.jsCLick(October);
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on October");
			Assert.assertTrue(true, "Failed to click on October");
			
			helper.waitFor(SearchBar);
			helper.highLightElement(driver, SearchBar);
			SearchBar.sendKeys("Auto Code");
			helper.jsCLick(SearchBar);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on SearchBar");
			Assert.assertTrue(true, "Failed to click on SearchBar");
			
			helper.waitFor(Scroller);
			helper.highLightElement(driver, Scroller);
			helper.jsCLick(Scroller);
			Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Scroller");
			Assert.assertTrue(true, "Failed to click on Scroller");
			
			helper.waitFor(Components);
			helper.highLightElement(driver, Components);
			helper.jsCLick(Components);
			Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Components");
			Assert.assertTrue(true, "Failed to click on Components");
			Thread.sleep(5000);
			
			helper.waitFor(Close_Button);
			helper.highLightElement(driver, Close_Button);
			helper.jsCLick(Close_Button);
			Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Close_Button");
			Assert.assertTrue(true, "Failed to click on Close_Button");
			
			
			
	

}
}
