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

public class HrmsHolidaysPage extends BasePage {

	public HrmsHolidaysPage(WebDriver driver) {
		super(driver);
		
	}
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//span[contains(text(),'Holidays')]")
	@CacheLookup
	WebElement Holidays;
	
	@FindBy(xpath = "//a[@id='add_holiday']")
	@CacheLookup
	WebElement AddHolidayList;
	
	@FindBy(xpath = "//input[@id='holiday_name']")
	@CacheLookup
	WebElement HolidayName;
	
	@FindBy(xpath = "//input[@id='holiday_date']")
	@CacheLookup
	WebElement HolidayDate;
	
	@FindBy(xpath = "//a[@href='#'][contains(.,'Add More')]")
	@CacheLookup
	WebElement AddMore;
	
	@FindBy(xpath = "(//input[contains(@placeholder,'Holiday Name')])[2]")
	@CacheLookup
	WebElement HolidayName2;
	
	@FindBy(xpath = "(//input[@name='holiday_date'])[2]")
	@CacheLookup
	WebElement HolidayDate2;
	
	@FindBy(xpath = "//a[contains(@id,'createHoliday')]")
	@CacheLookup
	WebElement Create_Button;
	
	
	
	
	public  void HrmsHolidaysPage() throws InterruptedException{
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
		
		helper.waitFor(Holidays);
		helper.highLightElement(driver, Holidays);
		helper.jsCLick(Holidays);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Holidays");
		Assert.assertTrue(true, "Failed to click on Holidays");
		
		helper.waitFor(AddHolidayList);
		helper.highLightElement(driver, AddHolidayList);
		helper.jsCLick(AddHolidayList);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on AddHolidayList");
		Assert.assertTrue(true, "Failed to click on AddHolidayList");
		
		helper.waitFor(HolidayName);
		helper.highLightElement(driver, HolidayName);
		HolidayName.sendKeys("Newyear");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on HolidayName");
		Assert.assertTrue(true, "Failed to click on HolidayName");
		
		helper.waitFor(HolidayDate);
		helper.highLightElement(driver, HolidayDate);
		HolidayDate.sendKeys("01012022");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on HolidayDate");
		Assert.assertTrue(true, "Failed to click on HolidayDate");
		
		helper.waitFor(AddMore);
		helper.highLightElement(driver, AddMore);
		helper.jsCLick(AddMore);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on AddMore");
		Assert.assertTrue(true, "Failed to click on AddMore");
		
		helper.waitFor(HolidayName2);
		helper.highLightElement(driver, HolidayName2);
		HolidayName2.sendKeys("IndpendenceDay");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on HolidayName2");
		Assert.assertTrue(true, "Failed to click on HolidayName2");
		
		helper.waitFor(HolidayDate2);
		helper.highLightElement(driver, HolidayDate2);
		HolidayDate2.sendKeys("15082022");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on HolidayDate2");
		Assert.assertTrue(true, "Failed to click on HolidayDate2");
		
		helper.waitFor(Create_Button);
		helper.highLightElement(driver, Create_Button);
		helper.jsCLick(Create_Button);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Create_Button");
		Assert.assertTrue(true, "Failed to click on Create_Button");
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}
	

}
