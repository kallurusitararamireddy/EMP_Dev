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

public class HrmsEmployeeBasicDetailsBulkUpdatePage extends BasePage {

	public HrmsEmployeeBasicDetailsBulkUpdatePage(WebDriver driver) {
		super(driver);
		
	}
	

	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
		@CacheLookup
		WebElement Employee;
		
		@FindBy(xpath = "//span[contains(text(),'Basic Details')]")
		@CacheLookup
		WebElement Basic_Details;
		

		@FindBy(xpath = "//button[@id='basicBulkUpdateBtn']")
		@CacheLookup
		WebElement Bulkupdate_Button;
		
		@FindBy(xpath = "//label[contains(text(),'Bulk Update')]")
		@CacheLookup
		WebElement Browse_Button;
		
		@FindBy(xpath = "//button[@id='basicBulkUpdateId']")
		@CacheLookup
		WebElement Update_Button;
		
		
		
		public  void HrmsEmployeeBasicDetailsBulkUpdatePage() throws InterruptedException, AWTException{
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
			
			helper.waitFor(Basic_Details);
			helper.highLightElement(driver, Basic_Details);
			helper.jsCLick(Basic_Details);
			Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Basic_Details");
			Assert.assertTrue(true, "Failed to click on Basic_Details");
			
			helper.waitFor(Bulkupdate_Button);
			helper.highLightElement(driver, Bulkupdate_Button);
			helper.jsCLick(Bulkupdate_Button);
			Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Bulkupdate_Button");
			Assert.assertTrue(true, "Failed to click on Bulkupdate_Button");
			
			helper.waitFor(Browse_Button);
			helper.highLightElement(driver, Browse_Button);
			helper.jsCLick(Browse_Button);
			 Robot robot = new Robot();
			 robot.delay(250);
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
		
			Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Browse_Button");
			Assert.assertTrue(true, "Failed to click on Browse_Button");
			helper.uploadFile("C:\\Users\\Official\\Downloads\\basicDetails (6).xlsx");
			Assert.assertTrue(true, "Failed to upload file");
			Thread.sleep(6000);
			
			helper.waitFor(Update_Button);
			helper.highLightElement(driver, Update_Button);
			helper.jsCLick(Update_Button);
			Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Update_Button");
			Assert.assertTrue(true, "Failed to click on Update_Button");
			Thread.sleep(8000);
			driver.navigate().refresh();
			
			
		}

}
