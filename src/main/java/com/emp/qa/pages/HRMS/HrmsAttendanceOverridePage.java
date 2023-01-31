package com.emp.qa.pages.HRMS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.Helpers;

public class HrmsAttendanceOverridePage extends BasePage {

	public HrmsAttendanceOverridePage(WebDriver driver) {
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
	
	@FindBy(xpath = "//tbody/tr[@id='24858']/td[5]")
	@CacheLookup
	WebElement Attendanceday;
	
	@FindBy(xpath = "//tbody/tr/td[@title='Absent'][1]")   ////*[@id="24858"]/td[5] ////tbody/tr/td[@title='Absent'][1]
	@CacheLookup
	WebElement Wednesday;
	
	@FindBy(xpath = "//tbody/tr/td[@title='Present'][1]")   ////*[@id="24858"]/td[5] ////tbody/tr/td[@title='Absent'][1]
	@CacheLookup
	WebElement Wednesdaypresent;
	
	@FindBy(xpath = "//select[@id='drop']")
	@CacheLookup
	WebElement AttendaneOverrideDropDown;
	
	
public  void HrmsAttendanceOverridePage() throws InterruptedException{
		
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
		Thread.sleep(3000);
		
//		helper.waitFor(Attendanceday);
//		helper.highLightElement(driver, Attendanceday);
//		helper.jsCLick(Attendanceday);
//		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Attendanceday");
//		Assert.assertTrue(true, "Failed to Click on Attendanceday");

	
			try {
			helper.waitFor(Wednesday);
			helper.highLightElement(driver, Wednesday);
			helper.jsCLick(Wednesday);
			helper.waitForpage();
			Actions act = new Actions(driver);
			WebElement dropdwn = driver.findElement(By.xpath("//tbody/tr/td[@title='Absent'][1]"));
			act.doubleClick(dropdwn).build().perform();
			Thread.sleep(4000);
			
			
			}catch(Exception e) {
				
				helper.waitFor(Wednesdaypresent);
				helper.highLightElement(driver, Wednesdaypresent);
				helper.jsCLick(Wednesdaypresent);
				helper.waitForpage();
				Actions act = new Actions(driver);
				WebElement dropdwn = driver.findElement(By.xpath("//tbody/tr/td[@title='Present'][1]"));
				act.doubleClick(dropdwn).build().perform();
				Thread.sleep(4000);	
			
				System.out.println("Present is not Clicked ");
			}
		
		helper.waitFor(Wednesday);
		helper.highLightElement(driver, Wednesday);
		Thread.sleep(3000);
		helper.jsCLick(Wednesday);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Wednesday");
		Assert.assertTrue(true, "Failed to Click on Wednesday");
		
		
		Actions act = new Actions(driver);
		WebElement dropdwn = driver.findElement(By.xpath("//tbody/tr/td[@title='Absent'][1]"));
		act.doubleClick(dropdwn).build().perform();
		Thread.sleep(4000);
		
		helper.waitFor(AttendaneOverrideDropDown);
		helper.highLightElement(driver, AttendaneOverrideDropDown);
		helper.selectDropDownValue(AttendaneOverrideDropDown, "value", "A");
		Thread.sleep(4000);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on AttendaneOverrideDropDown");
		Assert.assertTrue(true, "Failed to Click on AttendaneOverrideDropDown");
		
	

}
}


