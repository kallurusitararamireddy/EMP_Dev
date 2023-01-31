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

public class HrmsEmployeeDashboardAttedancePage extends BasePage {

	public HrmsEmployeeDashboardAttedancePage(WebDriver driver) {
		super(driver);
		
	}
   Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//a[@id='clock_out']")
	@CacheLookup
	WebElement Checkin;
	
	@FindBy(xpath = "//a[@id='clock_in']")
	@CacheLookup
	WebElement Checkout;
	
	
	
	
	
     public  void HrmsEmployeeDashboardAttedancePage() throws InterruptedException{
		
		helper.waitFor(Hrms);
		helper.highLightElement(driver, Hrms);
		helper.Scrollintoview(Hrms);
		helper.jsCLick(Hrms);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Hrms Button");
		Assert.assertTrue(true, "Failed to click on Hrms");
		Thread.sleep(5000);
		
		Set<String> S1=driver.getWindowHandles();
		Iterator<String>it=S1.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		helper.waitFor(Attendance);
		helper.highLightElement(driver, Attendance);
		helper.jsCLick(Attendance);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Attendance Button");
		Assert.assertTrue(true, "Failed to click on Attendance Button");
		
		helper.waitFor(Checkin);
		helper.highLightElement(driver, Checkin);
		helper.jsCLick(Checkin);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  CheckinButton");
		Assert.assertTrue(true, "Failed to click on CheckinButton");
		Thread.sleep(5000);
		
//		helper.waitFor(Checkout);
//		helper.highLightElement(driver, Checkout);
//		helper.jsCLick(Checkout);
//		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  CheckoutButton");
//		Assert.assertTrue(true, "Failed to click on CheckoutButton");
//		Thread.sleep(5000);
		
		
		

		
		
}

}
