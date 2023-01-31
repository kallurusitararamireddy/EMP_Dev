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

public class HrmsEmployeeDashboardLeavesPage extends BasePage {

	public HrmsEmployeeDashboardLeavesPage(WebDriver driver) {
		super(driver);
		
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
		@CacheLookup
		WebElement Attendance;
		
		
		@FindBy(xpath = "//span[contains(.,'Leaves')]")
		@CacheLookup
		WebElement Leaves;
		
		@FindBy(xpath = "//a[@id='add_leave_button']")
		@CacheLookup
		WebElement addnew_Leave;
		
		@FindBy(xpath = "//select[@id='day_type']")
		@CacheLookup
		WebElement Day_Type;
		
		@FindBy(xpath = "//select[@id='leave_type']")
		@CacheLookup
		WebElement Leave_Type;
		
		@FindBy(xpath = "//input[@id='start_date']")
		@CacheLookup
		WebElement Start_Date;
		
		@FindBy(xpath = "//input[@id='end_date']")
		@CacheLookup
		WebElement End_Date;
		
		@FindBy(xpath = "//textarea[@id='reason']")
		@CacheLookup
		WebElement Reason;
		
		@FindBy(xpath = "//a[@id='create_leave']")
		@CacheLookup
		WebElement Save_Button;
		
		 public  void HrmsEmployeeDashboardLeavesPage() throws InterruptedException{
                
			 
			   helper.waitFor(Hrms);
				helper.highLightElement(driver, Hrms);
				helper.Scrollintoview(Hrms);
				helper.jsCLick(Hrms);
				Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Hrms Button");
				Assert.assertTrue(true, "Failed to click on Hrms");
				Thread.sleep(5000);
				
				Set<String> S1=driver.getWindowHandles();
				Iterator<String>it=S1.iterator();
				String parent=it.next();
				String child=it.next();
				
				driver.switchTo().window(child);
				
				helper.waitFor(Attendance);
				helper.highLightElement(driver, Attendance);
				helper.jsCLick(Attendance);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Attendance Button");
				Assert.assertTrue(true, "Failed to click on Attendance Button");
			 
				helper.waitFor(Leaves);
				helper.highLightElement(driver, Leaves);
				helper.jsCLick(Leaves);
				Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  Leaves Button");
				Assert.assertTrue(true, "Failed to click on Leaves Button");
				
				helper.waitFor(addnew_Leave);
				helper.highLightElement(driver, addnew_Leave);
				helper.jsCLick(addnew_Leave);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  addnew_Leave Button");
				Assert.assertTrue(true, "Failed to click on addnew_Leave Button");
				
				helper.waitFor(Day_Type);
				helper.highLightElement(driver, Day_Type);
				helper.selectDropDownValue(Day_Type, "value", "2");
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Selected   Day_Type DropDown");
				Assert.assertTrue(true, "Failed to Select  Day_Type DropDown");
				
				helper.waitFor(Leave_Type);
				helper.highLightElement(driver, Leave_Type);
				helper.selectDropDownValue(Leave_Type, "value", "43");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Selected   Leave_Type DropDown");
				Assert.assertTrue(true, "Failed to Select Leave_Type DropDown");
				
				helper.waitFor(Start_Date);
				helper.highLightElement(driver, Start_Date);
				Start_Date.sendKeys("16112021");
				helper.jsCLick(Start_Date);
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered Leave Start_Date");
				Assert.assertTrue(true, "Failed to Enter Leave Start_Date");
				
				helper.waitFor(End_Date);
				helper.highLightElement(driver, End_Date);
				End_Date.clear();
				Start_Date.sendKeys("17112021");
				helper.jsCLick(End_Date);
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Entered Leave  End_Date");
				Assert.assertTrue(true, "Failed to click on End_Date");
				
				helper.waitFor(Reason);
				helper.highLightElement(driver, Reason);
				Reason.sendKeys("Fever");
				helper.jsCLick(Reason);
				Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Succesfully Enterd  Reason");
				Assert.assertTrue(true, "Failed to Enter Reason");
				
				helper.waitFor(Save_Button);
				helper.highLightElement(driver, Save_Button);
				helper.jsCLick(Save_Button);
				Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on  Save_Button");
				Assert.assertTrue(true, "Failed to click on Save_Button");
				Thread.sleep(4000);
				driver.navigate().refresh();
		 }

}
