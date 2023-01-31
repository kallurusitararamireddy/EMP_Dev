package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage extends BasePage {

	public HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage(WebDriver driver) {
		super(driver);
		
	}
	
    Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//div[@id='kt_aside_menu']/ul//a[@href='basic-detail']/i")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Component and Perquisites')]")
	@CacheLookup
	WebElement ComponentandPerquisites;
	
	@FindBy(xpath = "//button[@id='bankBulkUpdateBtn']")
	@CacheLookup
	WebElement BulkUpdate;
	
	@FindBy(xpath = "//input[@id='custom_bulk_update']")
	@CacheLookup
	WebElement BrowseButton;
	
	@FindBy(xpath = "//button[@id='bulkBulkUpdateId']")
	@CacheLookup
	WebElement UpdateButton;
	
	
	public  void HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage() throws InterruptedException, AWTException{
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
		
		helper.waitFor(ComponentandPerquisites);
		helper.highLightElement(driver, ComponentandPerquisites);
		helper.jsCLick(ComponentandPerquisites);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on ComponentandPerquisites");
		Assert.assertTrue(true, "Failed to click on ComponentandPerquisites");
		
		helper.waitFor(BulkUpdate);
		helper.highLightElement(driver, BulkUpdate);
		helper.jsCLick(BulkUpdate);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on BulkUpdate Button");
		Assert.assertTrue(true, "Failed to click on BulkUpdate Button");
		
		helper.waitFor(BrowseButton);
		helper.highLightElement(driver, BrowseButton);
		BrowseButton.sendKeys("C:\\Users\\Official\\Downloads\\Custom Salary Details (21).xlsx");
		
		/*
		 * helper.jsCLick(BrowseButton); Robot robot = new Robot(); robot.delay(250);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Reporter.
		 * log("<B><font color = 'blue'>Step5 .</font></B> clicked on Browse_Button");
		 * Assert.assertTrue(true, "Failed to click on Browse_Button"); helper.
		 * uploadfile("C:\\Users\\Official\\Downloads\\Custom Salary Details (21).xlsx"
		 * );
		 */
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on BrowseButton Button");
		Assert.assertTrue(true, "Failed to upload file");
		Thread.sleep(3000);
		
		helper.waitFor(UpdateButton);
		helper.highLightElement(driver, UpdateButton);
		helper.jsCLick(UpdateButton);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to click on Update_Button");
		Thread.sleep(10000);
		driver.navigate().refresh();

}
}
