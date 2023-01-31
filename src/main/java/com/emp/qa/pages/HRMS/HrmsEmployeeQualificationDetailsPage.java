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

public class HrmsEmployeeQualificationDetailsPage extends BasePage {

	public HrmsEmployeeQualificationDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Hrms')]")
	@CacheLookup
	WebElement Hrms;
	
	@FindBy(xpath = "//span[@class='menu-text'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//input[@id='SearchTextField']")
	@CacheLookup
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchBarButtoon;
	
	@FindBy(xpath = "//*[@id=\"Basic_Details\"]/div/div[3]/div")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='basic25278']/td[12]/a[1]")
	@CacheLookup
	WebElement ViewEmployeeInformation;
	
	@FindBy(xpath = "//a[@id='menu_Qualification_Details']")
	@CacheLookup
	WebElement Qualification_Details;
	
	@FindBy(xpath = "//a[@id='add_qualification']")
	@CacheLookup
	WebElement AddQualification_Details;
	
	@FindBy(xpath = "//input[@id='qualification']")
	@CacheLookup
	WebElement Qualification;
	
	@FindBy(xpath = "//input[@id='institution']")
	@CacheLookup
	WebElement Institution;
	
	@FindBy(xpath ="//input[@id='university']")
	@CacheLookup
	WebElement University;
	
	@FindBy(xpath = "//input[@id='year']")
	@CacheLookup
	WebElement YearofPassing;
	
	@FindBy(xpath = "//input[@id='percentage']")
	@CacheLookup
	WebElement Percentage;
	
	@FindBy(xpath = "//a[@id='saveOrUpdateQualification']")
	@CacheLookup
	WebElement Save_Button;
	
	
	
public  void HrmsEmployeeQualificationDetailsPage() throws InterruptedException{
		
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
		
		helper.waitFor(SearchBar);
		helper.highLightElement(driver, SearchBar);
		SearchBar.sendKeys("Auto code");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Etered Data into  SearchBar");
		Assert.assertTrue(true, "Failed to Enter Data into  SearchBar");
		
		helper.waitFor(SearchBarButtoon);
		helper.highLightElement(driver, SearchBarButtoon);
		helper.jsCLick(SearchBarButtoon);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SearchBarButtoon");
		Assert.assertTrue(true, "Failed to click on SearchBarButtoon");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		helper.jsCLick(Scroller);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(ViewEmployeeInformation);
		helper.highLightElement(driver, ViewEmployeeInformation);
		helper.jsCLick(ViewEmployeeInformation);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ViewEmployeeInformation");
		Assert.assertTrue(true, "Failed to click on ViewEmployeeInformation");
		
		helper.waitFor(Qualification_Details);
		helper.highLightElement(driver, Qualification_Details);
		helper.jsCLick(Qualification_Details);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Qualification_Details");
		Assert.assertTrue(true, "Failed to click on Qualification_Details");
		
		helper.waitFor(AddQualification_Details);
		helper.highLightElement(driver, AddQualification_Details);
		helper.jsCLick(AddQualification_Details);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on AddQualification_Details");
		Assert.assertTrue(true, "Failed to click on AddQualification_Details");
		
		
		helper.waitFor(Qualification);
		helper.highLightElement(driver, Qualification);
		Qualification.sendKeys("BTECH");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Qualification");
		Assert.assertTrue(true, "Failed to click on Qualification");
		
		helper.waitFor(Institution);
		helper.highLightElement(driver, Institution);
		Institution.sendKeys("BITS");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Institution");
		Assert.assertTrue(true, "Failed to click on Institution");
		
		helper.waitFor(University);
		helper.highLightElement(driver, University);
		University.sendKeys("BITS");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on University");
		Assert.assertTrue(true, "Failed to click on University");
		
		helper.waitFor(YearofPassing);
		helper.highLightElement(driver, YearofPassing);
		YearofPassing.sendKeys("2017");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on YearofPassing");
		Assert.assertTrue(true, "Failed to click on YearofPassing");
		
		helper.waitFor(Percentage);
		helper.highLightElement(driver, Percentage);
		Percentage.sendKeys("80");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Percentage");
		Assert.assertTrue(true, "Failed to click on Percentage");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed to click on Save_Button");
		Thread.sleep(4000);
		
		
		
		
}

}
