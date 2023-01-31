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

public class HrmsAttendancePage extends BasePage {

	public HrmsAttendancePage(WebDriver driver) {
		super(driver);
		
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//select[@id='location']")
	@CacheLookup
	WebElement Locations;
	
	@FindBy(xpath = "//select[@id='department']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//input[@id='selected_date']")
	@CacheLookup
	WebElement DateRanges;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement Search_bar;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement Search_bar_button;
	
	
	public  void HrmsAttendancePage() throws InterruptedException{
		
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
		
		helper.waitFor(Locations);
		helper.highLightElement(driver, Locations);
		helper.selectDropDownValue(Locations, "value", "2");
		helper.jsCLick(Locations);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Locations");
		Assert.assertTrue(true, "Failed to click on Locations");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "285");
		helper.jsCLick(Department);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  Department");
		Assert.assertTrue(true, "Failed to click on Department");
		
		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		helper.jsCLick(DateRanges);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  DateRanges");
		Assert.assertTrue(true, "Failed to click on DateRanges");
		Thread.sleep(4000);
		
		helper.waitFor(Search_bar);
		helper.highLightElement(driver, Search_bar);
		Search_bar.sendKeys("Auto code");
		helper.jsCLick(Search_bar);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on  Search_bar");
		Assert.assertTrue(true, "Failed to click on Search_bar");
		
		helper.waitFor(Search_bar_button);
		helper.highLightElement(driver, Search_bar_button);
		helper.jsCLick(Search_bar_button);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on  Search_bar_button");
		Assert.assertTrue(true, "Failed to click on Search_bar_button");
		Thread.sleep(4000);
		
		
	}
	
	

}
