package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
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

public class HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage extends BasePage{

	public HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage(WebDriver driver) {
		super(driver);
		
	}
	
	 Helpers helper=new Helpers();
		
		@FindBy(xpath = "//a[contains(text(),'Hrms')]")
		@CacheLookup
		WebElement Hrms;
		
		@FindBy(xpath = "(//span[@class='menu-text'][contains(.,'Attendance')])[1]")
		@CacheLookup
		WebElement Attendance;
		
		@FindBy(xpath = "//span[contains(text(),'Tax Declaration')]")
		@CacheLookup
		WebElement TaxDeclaration;
		
		@FindBy(xpath = "//a[contains(.,'Other Income')]")
		@CacheLookup
		WebElement OtherIncome;
		
		@FindBy(xpath = "//span[contains(.,'One House Property')]")
		@CacheLookup
		WebElement OneHouseProperty;
		
		@FindBy(xpath = "//button[contains(.,'Add House Property')]")
		@CacheLookup
		WebElement AddHouseproperty;
		
		@FindBy(xpath = "//select[@id='empHouseTypeIds']")
		@CacheLookup
		WebElement PropertyType;
		
		@FindBy(xpath = "//input[contains(@id,'empHouseValueId')]")
		@CacheLookup
		WebElement PropertyValue;
		
		@FindBy(xpath = "//button[@id='empAddHousePropertyDetailsId']")
		@CacheLookup
		WebElement Save_Button;
		
		
		  public  void HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage() throws InterruptedException, AWTException{
	          
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
				
				helper.waitFor(TaxDeclaration);
				helper.highLightElement(driver, TaxDeclaration);
				helper.jsCLick(TaxDeclaration);
				Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  TaxDeclaration Button");
				Assert.assertTrue(true, "Failed to click on TaxDeclaration Button"); 
				
				helper.waitFor(OtherIncome);
				helper.highLightElement(driver, OtherIncome);
				helper.jsCLick(OtherIncome);
				Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on  OtherIncome Button");
				Assert.assertTrue(true, "Failed to click on OtherIncome Button"); 
				
				helper.waitFor(OneHouseProperty);
				helper.highLightElement(driver, OneHouseProperty);
				helper.jsCLick(OneHouseProperty);
				Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on  OneHouseProperty Button");
				Assert.assertTrue(true, "Failed to click on OneHouseProperty Button");
				
				helper.waitFor(AddHouseproperty);
				helper.highLightElement(driver, AddHouseproperty);
				helper.jsCLick(AddHouseproperty);
				Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  AddHouseproperty Button");
				Assert.assertTrue(true, "Failed to click on AddHouseproperty Button");
				
				helper.waitFor(PropertyType);
				helper.highLightElement(driver, PropertyType);
				helper.selectDropDownValue(PropertyType, "value", "house");
				Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Selected PropertyType Dropdown ");
				Assert.assertTrue(true, "Failed to Select PropertyType");
				
				helper.waitFor(PropertyValue);
				helper.highLightElement(driver, PropertyValue);
				PropertyValue.sendKeys("10000");
				Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Entered  PropertyValue ");
				Assert.assertTrue(true, "Failed to Enter PropertyValue ");
				
				helper.waitFor(Save_Button);
				helper.highLightElement(driver, Save_Button);
				helper.jsCLick(Save_Button);
				Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on  Save_Button ");
				Assert.assertTrue(true, "Failed to click on Save_Button ");
				Thread.sleep(3000);




}
}
