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

public class HrmsEmployeeBasicDetailsPage extends BasePage {

	public HrmsEmployeeBasicDetailsPage(WebDriver driver) {
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
	WebElement SearchField;
	
	@FindBy(xpath = "//button[@id='SearchButton']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(xpath = "//a[contains(text(),'Auto code')]")
	@CacheLookup
	WebElement EditBasicDetails;
	
	@FindBy(xpath = "//select[@id='marital_status']")
	@CacheLookup
	WebElement MaritialStatus;
	
	@FindBy(xpath = "//select[@id='typeOfEmployee']")
	@CacheLookup
	WebElement Type;
	
	@FindBy(xpath = "//input[@id='phone']")
	@CacheLookup
	WebElement Phonenumber;
	
	@FindBy(xpath = "//input[@id='personal_email']")
	@CacheLookup
	WebElement PersonalEmail;
	
	
	
	@FindBy(xpath = "//textarea[@id='c_address']")
	@CacheLookup
	WebElement CurrentAdress;
	
	@FindBy(xpath = "//input[@id='same_as']")
	@CacheLookup
	WebElement SameasCurrentAdress;
	
	
	@FindBy(xpath = "//a[contains(.,'Save')]")
	@CacheLookup
	WebElement BasicDetailsSave_Button;
	
public  void HrmsEmployeeBasicDetailsPage() throws InterruptedException{
		

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
		
		
		helper.waitFor(SearchField);
		helper.highLightElement(driver, SearchField);
		SearchField.sendKeys("Auto Code");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Entered Data into SearchField");
		Assert.assertTrue(true, "Failed to Enter Data Into Searchfield");
		
		helper.waitFor(SearchButton);
		helper.highLightElement(driver, SearchButton);
		helper.jsCLick(SearchButton);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SearchButton");
		Assert.assertTrue(true, "Failed to click on SearchButton");
		
		
		helper.waitFor(EditBasicDetails);
		helper.highLightElement(driver, EditBasicDetails);
		helper.Scrollintoview(EditBasicDetails);
		helper.jsCLick(EditBasicDetails);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on EditBasicDetails");
		Assert.assertTrue(true, "Failed to click on EditBasicDetails");
		
		helper.waitFor(MaritialStatus);
		helper.highLightElement(driver, MaritialStatus);
		helper.Scrollintoview(MaritialStatus);
		helper.selectDropDownValue(MaritialStatus,"value", "1");
		//helper.jsCLick(MaritialStatus);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on MaritialStatus");
		Assert.assertTrue(true, "Failed to click on MaritialStatus");
		
		helper.waitFor(Type);
		helper.highLightElement(driver, Type);
		helper.Scrollintoview(Type);
		helper.selectDropDownValue(Type,"value", "2");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Type");
		Assert.assertTrue(true, "Failed to click on Type");
		
		helper.waitFor(Phonenumber);
		helper.highLightElement(driver, Phonenumber);
		helper.Scrollintoview(Phonenumber);
		Phonenumber.clear();
		Phonenumber.sendKeys("9876543210");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Phonenumber");
		Assert.assertTrue(true, "Failed to click on Phonenumber");
		
		helper.waitFor(PersonalEmail);
		helper.highLightElement(driver, PersonalEmail);
		helper.Scrollintoview(PersonalEmail);
		PersonalEmail.clear();
		PersonalEmail.sendKeys("abcedfghi@gmail.com");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on PersonalEmail");
		Assert.assertTrue(true, "Failed to click on PersonalEmail");
		
		
		helper.waitFor(CurrentAdress);
		helper.highLightElement(driver, CurrentAdress);
		helper.Scrollintoview(CurrentAdress);
		CurrentAdress.clear();
		CurrentAdress.sendKeys("Houseno:12-1,Roadno:12b,Banglore");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on CurrentAdress");
		Assert.assertTrue(true, "Failed to click on CurrentAdress");
		
		helper.waitFor(SameasCurrentAdress);
		helper.highLightElement(driver, SameasCurrentAdress);
		helper.Scrollintoview(SameasCurrentAdress);
		SameasCurrentAdress.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on SameasCurrentAdress");
		Assert.assertTrue(true, "Failed to click on SameasCurrentAdress");
		
		helper.waitFor(BasicDetailsSave_Button);
		helper.highLightElement(driver, BasicDetailsSave_Button);
		helper.Scrollintoview(BasicDetailsSave_Button);
		BasicDetailsSave_Button.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on BasicDetailsSave_Button");
		Assert.assertTrue(true, "Failed to click on BasicDetailsSave_Button");
		Thread.sleep(7000);
}

}
