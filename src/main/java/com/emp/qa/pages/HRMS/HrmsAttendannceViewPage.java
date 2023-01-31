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

public class HrmsAttendannceViewPage extends BasePage {

	public HrmsAttendannceViewPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
	@CacheLookup
	WebElement Attendance;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchField;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(xpath = "//div[@id='tableRemove']")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//i[@id='employee_id_25223']")
	@CacheLookup
	WebElement ViewSymbol;
	
	@FindBy(xpath = "//div[contains(@class,'modal-body')]")
	@CacheLookup
	WebElement AttendancePageScroller;
	
	
	
public  void HrmsAttendannceViewPage() throws InterruptedException{
		
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
		
		helper.waitFor(SearchField);
		helper.highLightElement(driver, SearchField);
		SearchField.sendKeys("Auto code");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Entered data into SearchField");
		Assert.assertTrue(true, "Failed to Enter data SearchField");
		
		helper.waitFor(SearchButton);
		helper.highLightElement(driver, SearchButton);
		helper.jsCLick(SearchButton);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on SearchButton");
		Assert.assertTrue(true, "Failed to Click on SearchButton");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Scroller");
		Assert.assertTrue(true, "Failed to Click on Scroller");
		
		helper.waitFor(ViewSymbol);
		helper.highLightElement(driver, ViewSymbol);
		helper.Scrollintoview(ViewSymbol);
		helper.jsCLick(ViewSymbol);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on ViewSymbol");
		Assert.assertTrue(true, "Failed to Click on ViewSymbol");
		Thread.sleep(3000);
		
		helper.waitFor(AttendancePageScroller);
		helper.highLightElement(driver, AttendancePageScroller);
		helper.Scrollintoview(AttendancePageScroller);
		helper.jsCLick(AttendancePageScroller);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on AttendancePageScroller");
		Assert.assertTrue(true, "Failed to Click on AttendancePageScroller");
		Thread.sleep(3000);
		

}
}

