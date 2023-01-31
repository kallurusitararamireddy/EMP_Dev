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

public class HrmsTerminationPage extends BasePage{

	public HrmsTerminationPage(WebDriver driver) {
		super(driver);
		
	}
	
	Helpers helper=new Helpers();
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//span[contains(text(),'Termination')]")
	@CacheLookup
	WebElement Termination;
	
	@FindBy(xpath = "//a[@href='#Add_New_Resignation']")
	@CacheLookup
	WebElement Resignation;
	
	@FindBy(xpath = "//input[@id='termination_type']")
	@CacheLookup
	WebElement TerminationType;
	
	@FindBy(xpath = "//input[@id='notice_date']")
	@CacheLookup
	WebElement NoticeDate;
	
	@FindBy(xpath = "//input[@id='termination_date']")
	@CacheLookup
	WebElement TerminationDate;
	
	@FindBy(xpath = "//textarea[@id='description']")
	@CacheLookup
	WebElement Desription;
	
	@FindBy(xpath = "//a[@id='create_button']")
	@CacheLookup
	WebElement CreateButton;
	
	@FindBy(xpath = "//tbody/tr[@id='termination69']/td[7]/a[2]/i[1]")
	@CacheLookup
	WebElement Delete_Termination;
	
	public  void HrmsTerminationPage() throws InterruptedException{
		
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
		
		helper.waitFor(Termination);
		helper.highLightElement(driver, Termination);
		helper.jsCLick(Termination);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Termination");
		Assert.assertTrue(true, "Failed to click on Termination");	
		
		helper.waitFor(Resignation);
		helper.highLightElement(driver, Resignation);
		helper.jsCLick(Resignation);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Resignation");
		Assert.assertTrue(true, "Failed to click on Resignation");	
		
		helper.waitFor(TerminationType);
		helper.highLightElement(driver, TerminationType);
		TerminationType.sendKeys("Normal");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on TerminationType");
		Assert.assertTrue(true, "Failed to click on TerminationType");	
		
		helper.waitFor(NoticeDate);
		helper.highLightElement(driver, NoticeDate);
		NoticeDate.sendKeys("05072021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on NoticeDate");
		Assert.assertTrue(true, "Failed to click on NoticeDate");	
		
		helper.waitFor(TerminationDate);
		helper.highLightElement(driver, TerminationDate);
		TerminationDate.sendKeys("06082021");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on TerminationDate");
		Assert.assertTrue(true, "Failed to click on TerminationDate");	
		
		helper.waitFor(Desription);
		helper.highLightElement(driver, Desription);
		Desription.sendKeys("ASDFGH");
		helper.jsCLick(Desription);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Desription");
		Assert.assertTrue(true, "Failed to click on Desription");
		
		helper.waitFor(CreateButton);
		helper.highLightElement(driver, CreateButton);
		helper.jsCLick(CreateButton);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on CreateButton");
		Assert.assertTrue(true, "Failed to click on CreateButton");
		Thread.sleep(5000);
		//driver.navigate().back();
		
		helper.waitFor(Delete_Termination);
		helper.highLightElement(driver, Delete_Termination);
		helper.jsCLick(Delete_Termination);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Delete_Termination");
		Assert.assertTrue(true, "Failed to click on Delete_Termination");
		Thread.sleep(5000);
		
		
		
		
		
	}

}
