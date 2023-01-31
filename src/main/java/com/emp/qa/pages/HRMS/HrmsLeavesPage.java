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

public class HrmsLeavesPage extends BasePage {

	public HrmsLeavesPage(WebDriver driver) {
		super(driver);
		
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//span[contains(text(),'Leaves')]")
	@CacheLookup
	WebElement Leaves;
	
	@FindBy(xpath = "//a[@id='add_leave_button']")
	@CacheLookup
	WebElement AddnewLeaves;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement EmployeeName;
	
	@FindBy(xpath = "//select[@id='day_type']")
	@CacheLookup
	WebElement DayType;
	
	
	@FindBy(xpath = "//select[@id='leave_type']")
	@CacheLookup
	WebElement LeaveType;
	
	@FindBy(xpath = "//input[@id='start_date']")
	@CacheLookup
	WebElement StartDate;
	
	@FindBy(xpath = "//input[@id='end_date']")
	@CacheLookup
	WebElement EndDate;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	@CacheLookup
	WebElement Reason;
	
	@FindBy(xpath = "//a[@id='create_leave']")
	@CacheLookup
	WebElement Create_Button;
	
	@FindBy(xpath = "//select[@id='leave_status']")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//tbody/tr[@id='leave378']/td[8]/a[1]/i[1]")
	@CacheLookup     ////tbody/tr[@id='leave377']/td[8]/a[1]/i[1]
	WebElement Edit_Leave;
	
	@FindBy(xpath = "//tbody/tr[@id='leave_2022-01-20']/td[@id='input_2022-01-20']/label[1]/span[1]")
	@CacheLookup     //tbody/tr[@id='leave_2022-01-20']/td[@id='input_2022-01-20']/label[1]/span[1]
	WebElement leave_2022_01_20;
	
	@FindBy(xpath = "//tbody/tr[@id='leave_2022-01-21']/td[@id='input_2022-01-21']/label[1]/span[1]")
	@CacheLookup     //tbody/tr[@id='leave_2022-01-21']/td[@id='input_2022-01-21']/label[1]/span[1]
	WebElement leave_2022_01_21;
	
	@FindBy(xpath = "//a[@id='approve_leave']")
	@CacheLookup
	WebElement approve_leave;
	
	public  void HrmsLeavesPage() throws InterruptedException{
		
		
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
		helper.Scrollintoview(Attendance);
		helper.jsCLick(Attendance);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Attendance");
		Assert.assertTrue(true, "Failed to click on Attendance");
		
		

		helper.waitFor(Leaves);
		helper.highLightElement(driver, Leaves);
		helper.jsCLick(Leaves);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Leaves");
		Assert.assertTrue(true, "Failed to click on Leaves");
		
		helper.waitFor(AddnewLeaves);
		helper.highLightElement(driver, AddnewLeaves);
		helper.jsCLick(AddnewLeaves);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  AddnewLeaves");
		Assert.assertTrue(true, "Failed to click on AddnewLeaves");
		
		helper.waitFor(EmployeeName);
		helper.highLightElement(driver, EmployeeName);
		helper.selectDropDownValue(EmployeeName, "value", "24858");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  EmployeeName");
		Assert.assertTrue(true, "Failed to click on EmployeeName");
		
		helper.waitFor(DayType);
		helper.highLightElement(driver, DayType);
		helper.selectDropDownValue(DayType, "value", "2");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  DayType");
		Assert.assertTrue(true, "Failed to click on DayType");
		
		helper.waitFor(LeaveType);
		helper.highLightElement(driver, LeaveType);
		helper.selectDropDownValue(LeaveType, "value", "54");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  LeaveType");
		Assert.assertTrue(true, "Failed to click on LeaveType");
		
		helper.waitFor(StartDate);
		helper.highLightElement(driver, StartDate);
		StartDate.sendKeys("20012022");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.waitFor(EndDate);
		helper.highLightElement(driver, EndDate);
		EndDate.sendKeys("21012022");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on  EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
		
		helper.waitFor(Reason);
		helper.highLightElement(driver, Reason);
		Reason.sendKeys("asdfgh");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  Reason");
		Assert.assertTrue(true, "Failed to click on Reason");
		
		helper.waitFor(Create_Button);
		helper.highLightElement(driver, Create_Button);
		Create_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on  Create_Button");
		Assert.assertTrue(true, "Failed to click on Create_Button");
		Thread.sleep(4000);
		
		helper.waitFor(Status);
		helper.highLightElement(driver, Status);
		helper.selectDropDownValue(Status, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Status");
		Assert.assertTrue(true, "Failed to click on Status");
		
		helper.waitFor(Edit_Leave);
		helper.highLightElement(driver, Edit_Leave);
		Edit_Leave.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on  Edit_Leave");
		Assert.assertTrue(true, "Failed to click on Edit_Leave");
		
	
		
		
		helper.waitFor(leave_2022_01_20);
		helper.highLightElement(driver, leave_2022_01_20);
		leave_2022_01_20.click();
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on  leave_2022_01_20");
		Assert.assertTrue(true, "Failed to click on leave_2022_01_20");
		
		helper.waitFor(leave_2022_01_21);
		helper.highLightElement(driver, leave_2022_01_21);
		leave_2022_01_21.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on  leave_2022_01_21");
		Assert.assertTrue(true, "Failed to click on leave_2022_01_21");
		
		helper.waitFor(approve_leave);
		helper.highLightElement(driver, approve_leave);
		helper.Scrollintoview(approve_leave);
		approve_leave.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on  approve_leave");
		Assert.assertTrue(true, "Failed to click on approve_leave");
		
		
		
		
	}
	

}
