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

public class HrmsResignationsPage extends BasePage {

	public HrmsResignationsPage(WebDriver driver) {
		super(driver);
		
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Resignations')]")
	@CacheLookup
	WebElement Resignations;
	
	@FindBy(xpath = "//a[contains(@href,'Resignation')]")
	@CacheLookup
	WebElement AddResignations;
	

	@FindBy(xpath = "//input[@id='notice_date']")
	@CacheLookup
	WebElement NoticeDate;
	
	@FindBy(xpath = "//input[@id='termination_date']")
	@CacheLookup
	WebElement TerminationDate;
	
	@FindBy(xpath = "//textarea[@id='description']")
	@CacheLookup
	WebElement Description;
	
	@FindBy(xpath = "//a[@id='create_button']")
	@CacheLookup
	WebElement create_button;
	
	@FindBy(xpath = "//tbody/tr[@id='termination56']/td[6]/a[2]")
	@CacheLookup
	WebElement Delete_button;
	
	public  void HrmsResignationsPage() throws InterruptedException{
		
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
		
		helper.waitFor(Resignations);
		helper.highLightElement(driver, Resignations);
		helper.jsCLick(Resignations);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Resignations");
		Assert.assertTrue(true, "Failed to click on Resignations");
		
		helper.waitFor(AddResignations);
		helper.highLightElement(driver, AddResignations);
		helper.jsCLick(AddResignations);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on AddResignations");
		Assert.assertTrue(true, "Failed to click on AddResignations");
		
		helper.waitFor(NoticeDate);
		helper.highLightElement(driver, NoticeDate);
		NoticeDate.sendKeys("05072021");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on NoticeDate");
		Assert.assertTrue(true, "Failed to click on NoticeDate");
		
		helper.waitFor(TerminationDate);
		helper.highLightElement(driver, TerminationDate);
		TerminationDate.sendKeys("05082021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on TerminationDate");
		Assert.assertTrue(true, "Failed to click on TerminationDate");
		
		helper.waitFor(Description);
		helper.highLightElement(driver, Description);
		Description.sendKeys("Abcdef");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Description");
		Assert.assertTrue(true, "Failed to click on Description");
		
		helper.waitFor(create_button);
		helper.highLightElement(driver, create_button);
		create_button.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on create_button");
		Assert.assertTrue(true, "Failed to click on create_button");
		driver.navigate().back();
		
		helper.waitFor(Delete_button);
		helper.highLightElement(driver, Delete_button);
		helper.jsCLick(Delete_button);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Delete_button");
		Assert.assertTrue(true, "Failed to click on Delete_button");
		
		
		
		
	}

}
