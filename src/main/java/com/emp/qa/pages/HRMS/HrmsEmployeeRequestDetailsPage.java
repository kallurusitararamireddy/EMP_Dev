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

public class HrmsEmployeeRequestDetailsPage extends BasePage {

	public HrmsEmployeeRequestDetailsPage(WebDriver driver) {
		super(driver);
	
	}
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
		@CacheLookup
		WebElement Employee;
		
		@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Request Details')]")
		@CacheLookup
		WebElement RequestdetailsPage;
		
		@FindBy(xpath = "//select[@id='requests_status']")
		@CacheLookup
		WebElement Statusfilter;
		
		@FindBy(xpath = "//tbody/tr[@id='request620e3a4aac2ff2562de2afde']/td[7]/button[1]")
		@CacheLookup
		WebElement Approve;
		
		@FindBy(xpath = "//tbody/tr[@id='request620e3a67ac2ff2562de2afe6']/td[7]/button[2]")
		@CacheLookup
		WebElement Reject;
		
		@FindBy(xpath = "//tbody/tr[@id='request620e3a78ac2ff2562de2aff9']/td[7]/button[3]")
		@CacheLookup
		WebElement Delete;
		
		public  void HrmsEmployeeRequestDetailsPage() throws InterruptedException{
			
		
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
			
			helper.waitFor(Employee);
			helper.highLightElement(driver, Employee);
			helper.jsCLick(Employee);
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee");
			Assert.assertTrue(true, "Failed to click on Employee");
			
			helper.waitFor(Employee);
			helper.highLightElement(driver, Employee);
			helper.jsCLick(Employee);
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee");
			Assert.assertTrue(true, "Failed to click on Employee");
			
			helper.waitFor(RequestdetailsPage);
			helper.highLightElement(driver, RequestdetailsPage);
			helper.jsCLick(RequestdetailsPage);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on RequestdetailsPage");
			Assert.assertTrue(true, "Failed to click on RequestdetailsPage");
			
			helper.waitFor(Statusfilter);
			helper.highLightElement(driver, Statusfilter);
			helper.selectDropDownValue(Statusfilter, "value", "1");
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Statusfilter and selected Pending status");
			Assert.assertTrue(true, "Failed to click on  Statusfilter");

}
}
