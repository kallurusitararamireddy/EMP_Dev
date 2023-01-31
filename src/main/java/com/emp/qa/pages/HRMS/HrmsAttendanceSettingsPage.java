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

public class HrmsAttendanceSettingsPage extends BasePage{

	public HrmsAttendanceSettingsPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Settings')]")
	@CacheLookup
	WebElement Settings;
	
	@FindBy(xpath = "//input[@id='attendance3']")
	@CacheLookup
	WebElement ActiveHours;
	
	@FindBy(xpath = "//input[@id='attendance_hours3']")
	@CacheLookup
	WebElement AttendanceHours;
	
	@FindBy(xpath = "//a[@type='button'][contains(.,'Update')]")
	@CacheLookup
	WebElement Update_Button;
	
	public  void HrmsAttendanceSettingsPage() throws InterruptedException{
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
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Attendance");
		Assert.assertTrue(true, "Failed to click on Attendance");
		
		helper.waitFor(Settings);
		helper.highLightElement(driver, Settings);
		helper.jsCLick(Settings);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Settings");
		Assert.assertTrue(true, "Failed to click on Settings");
		
		helper.waitFor(ActiveHours);
		helper.highLightElement(driver, ActiveHours);
		helper.jsCLick(ActiveHours);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on ActiveHours");
		Assert.assertTrue(true, "Failed to click on ActiveHours");
		
		

		
		helper.waitFor(AttendanceHours);
		helper.highLightElement(driver, AttendanceHours);
		AttendanceHours.clear();
		AttendanceHours.sendKeys("8");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on AttendanceHours");
		Assert.assertTrue(true, "Failed to click on AttendanceHours");
		
		helper.waitFor(Update_Button);
		helper.highLightElement(driver, Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to click on Update_Button");
		
		
	}
}
