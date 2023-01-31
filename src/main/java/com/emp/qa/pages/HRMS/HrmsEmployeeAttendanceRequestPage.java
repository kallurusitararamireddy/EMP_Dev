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

public class HrmsEmployeeAttendanceRequestPage extends BasePage {

	public HrmsEmployeeAttendanceRequestPage(WebDriver driver) {
		super(driver);
		
	}
	
	  Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "//i[contains(@class,'menu-icon flaticon2-console')]")
		@CacheLookup
		WebElement Attendance;
		
		@FindBy(xpath = "//span[contains(text(),'Attendance Requests')]")
		@CacheLookup
		WebElement AttendanceRequest;
		
		@FindBy(xpath = "//select[@id='leave_requests_status']")
		@CacheLookup
		WebElement LeaveStatusFilter;
		
		@FindBy(xpath = "//input[@type='search']")
		@CacheLookup
		WebElement Search;
		
		@FindBy(xpath = "//tbody/tr[@id='69904']/td[8]/button[1]/i[1]")
		@CacheLookup     //tbody/tr[@id='69903']/td[8]/button[1]
		WebElement Approve_Button;
		
		
		public  void HrmsEmployeeAttendanceRequestPage() throws InterruptedException{
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
			
			helper.waitFor(Attendance);
			helper.highLightElement(driver, Attendance);
			helper.jsCLick(Attendance);
			Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Hrms Attendance");
			Assert.assertTrue(true, "Failed to click on Attendance");
			
			helper.waitFor(AttendanceRequest);
			helper.highLightElement(driver, AttendanceRequest);
			helper.jsCLick(AttendanceRequest);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Hrms AttendanceRequest");
			Assert.assertTrue(true, "Failed to click on AttendanceRequest");
			
			helper.waitFor(LeaveStatusFilter);
			helper.highLightElement(driver, LeaveStatusFilter);
			helper.selectDropDownValue(LeaveStatusFilter, "value", "0");
			helper.jsCLick(LeaveStatusFilter);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Hrms LeaveStatusFilter and Selected All Filter");
			Assert.assertTrue(true, "Failed to click on Hrms LeaveStatusFilter and Selected All Filter");
			Thread.sleep(3000);
			
			helper.waitFor(LeaveStatusFilter);
			helper.highLightElement(driver, LeaveStatusFilter);
			helper.selectDropDownValue(LeaveStatusFilter, "value", "1");
			helper.jsCLick(LeaveStatusFilter);
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Hrms LeaveStatusFilter and Selected Approved Filter");
			Assert.assertTrue(true, "Failed to click on Hrms LeaveStatusFilter and Selected Approved Filter");
			Thread.sleep(3000);
			
			helper.waitFor(LeaveStatusFilter);
			helper.highLightElement(driver, LeaveStatusFilter);
			helper.selectDropDownValue(LeaveStatusFilter, "value", "2");
			helper.jsCLick(LeaveStatusFilter);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Hrms LeaveStatusFilter and Selected Rejected Filter");
			Assert.assertTrue(true, "Failed to click on Hrms LeaveStatusFilter and Selected Rejected Filter");
			Thread.sleep(3000);
			
			helper.waitFor(LeaveStatusFilter);
			helper.highLightElement(driver, LeaveStatusFilter);
			helper.selectDropDownValue(LeaveStatusFilter, "value", "3");
			helper.jsCLick(LeaveStatusFilter);
			Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Hrms LeaveStatusFilter and Selected Pending Filter");
			Assert.assertTrue(true, "Failed to click on Hrms LeaveStatusFilter and Selected Pending Filter");
			Thread.sleep(3000);
			
			helper.waitFor(Search);
			helper.highLightElement(driver, Search);
			Search.sendKeys("Auto code");
			Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered Data into search Bar");
			Assert.assertTrue(true, "Failed to Enter Data into Search Bar");
			Thread.sleep(3000);
			
			helper.waitFor(Approve_Button);
			helper.highLightElement(driver, Approve_Button);
			helper.jsCLick(Approve_Button);
			Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked On Approve Button");
			Assert.assertTrue(true, "Failed to Click on Approve Button");
			Thread.sleep(5000);

}
}
