package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
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

public class HrmsEmployeeDashboardPayslipPage extends BasePage {

	public HrmsEmployeeDashboardPayslipPage(WebDriver driver) {
		super(driver);
	
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//i[@class='menu-icon flaticon2-graph-1'])[2]")
		@CacheLookup
		WebElement Payslip;
		
		@FindBy(xpath = "//a[@id='downloadPayslip']")
		@CacheLookup
		WebElement DownloadPayslipButton;
		
		  public  void HrmsEmployeeDashboardPayslipPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(Payslip);
				helper.highLightElement(driver, Payslip);
				helper.jsCLick(Payslip);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Payslip Button");
				Assert.assertTrue(true, "Failed to click on Payslip Button"); 
				
				helper.waitFor(DownloadPayslipButton);
				helper.highLightElement(driver, DownloadPayslipButton);
				helper.jsCLick(DownloadPayslipButton);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  DownloadPayslipButton");
				Assert.assertTrue(true, "Failed to click on DownloadPayslipButton"); 
				Thread.sleep(5000);

}
}
