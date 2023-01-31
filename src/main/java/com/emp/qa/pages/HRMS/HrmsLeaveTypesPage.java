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

public class HrmsLeaveTypesPage extends BasePage {

	public HrmsLeaveTypesPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//span[contains(text(),'Leave Types')]")
	@CacheLookup
	WebElement LeaveTypes;
	
	@FindBy(xpath = "//a[@href='#Add_Leave_Type']")
	@CacheLookup
	WebElement AddnewLeaveTypes;
	
	@FindBy(xpath = "//input[@id='leave_type']")
	@CacheLookup
	WebElement TypeofLeaves;
	
	@FindBy(xpath = "//input[@id='number_of_days']")
	@CacheLookup
	WebElement Numberofdays;
	
	@FindBy(xpath = "//input[@id='duration2']")
	@CacheLookup
	WebElement Duration_HalfyerlyRadioButton;
	
	@FindBy(xpath = "//a[@id='createLeaveType']")
	@CacheLookup
	WebElement create_Button;
	
	
public  void HrmsLeaveTypesPage() throws InterruptedException{
	

		
		
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
		
		helper.waitFor(LeaveTypes);
		helper.highLightElement(driver, LeaveTypes);
		helper.jsCLick(LeaveTypes);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  LeaveTypes");
		Assert.assertTrue(true, "Failed to click on LeaveTypes");
		
		helper.waitFor(AddnewLeaveTypes);
		helper.highLightElement(driver, AddnewLeaveTypes);
		helper.jsCLick(AddnewLeaveTypes);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  AddnewLeaveTypes");
		Assert.assertTrue(true, "Failed to click on AddnewLeaveTypes");
		
		helper.waitFor(TypeofLeaves);
		helper.highLightElement(driver, TypeofLeaves);
		TypeofLeaves.sendKeys("ABCDEFgh");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  TypeofLeaves");
		Assert.assertTrue(true, "Failed to click on TypeofLeaves");
		
		helper.waitFor(Numberofdays);
		helper.highLightElement(driver, Numberofdays);
		Numberofdays.sendKeys("5");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  Numberofdays");
		Assert.assertTrue(true, "Failed to click on Numberofdays");
		
		helper.waitFor(Duration_HalfyerlyRadioButton);
		helper.highLightElement(driver, Duration_HalfyerlyRadioButton);
		helper.jsCLick(Duration_HalfyerlyRadioButton);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  Duration_HalfyerlyRadioButton");
		Assert.assertTrue(true, "Failed to click on Duration_HalfyerlyRadioButton");
		
		helper.waitFor(create_Button);
		helper.highLightElement(driver, create_Button);
		create_Button.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  create_Button");
		Assert.assertTrue(true, "Failed to click on create_Button");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
}
}
