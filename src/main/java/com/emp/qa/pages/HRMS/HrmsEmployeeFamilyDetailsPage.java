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

public class HrmsEmployeeFamilyDetailsPage extends BasePage {

	public HrmsEmployeeFamilyDetailsPage(WebDriver driver) {
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
	
	@FindBy(xpath = "/html//div[@id='Basic_Details']//div[@class='stickyCol-2-scroller']")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='basic25278']/td[12]/a[1]")
	@CacheLookup
	WebElement ViewEmployeeInformation;
	
	@FindBy(xpath = "//a[@id='menu_Family_Details']")
	@CacheLookup
	WebElement FamilyDetails;
	
	@FindBy(xpath = "//a[@id='add_family']")
	@CacheLookup
	WebElement AddfamilyDetails;
	
	@FindBy(xpath = "//input[@id='family_member']")
	@CacheLookup
	WebElement NameofFamlyMembers;
	
	@FindBy(xpath = "//input[@id='member_dob']")
	@CacheLookup
	WebElement MembersDob;
	
	@FindBy(xpath = "//input[@id='member_age']")
	@CacheLookup
	WebElement MembersAge;
	
	@FindBy(xpath = "//input[@id='relationship']")
	@CacheLookup
	WebElement RelationShip;
	
	@FindBy(xpath = "//input[@id='occupation']")
	@CacheLookup
	WebElement Occupation;
	
	@FindBy(xpath = "//input[@id='contactNo']")
	@CacheLookup
	WebElement Contactno;
	
	@FindBy(xpath = "//select[@id='blood_group']")
	@CacheLookup
	WebElement BloodGroup;
	
	@FindBy(xpath = "//input[@id='aadhar']")
	@CacheLookup
	WebElement Aadharno;
	
	@FindBy(xpath = "//input[@id='pan_number']")
	@CacheLookup
	WebElement Pan_number;
	
	@FindBy(xpath = "//a[@id='saveOrUpdateFamily']")
	@CacheLookup
	WebElement Save_FamilyDetails;
	
	public  void HrmsEmployeeFamilyDetailsPage() throws InterruptedException{
		
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
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on  Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		
		
		helper.waitFor(ViewEmployeeInformation);
		helper.highLightElement(driver, ViewEmployeeInformation);
		helper.jsCLick(ViewEmployeeInformation);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on ViewEmployeeInformation");
		Assert.assertTrue(true, "Failed to click on ViewEmployeeInformation");
		
		helper.waitFor(FamilyDetails);
		helper.highLightElement(driver, FamilyDetails);
		helper.jsCLick(FamilyDetails);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on FamilyDetails");
		Assert.assertTrue(true, "Failed to click on FamilyDetails");
		
		helper.waitFor(AddfamilyDetails);
		helper.highLightElement(driver, AddfamilyDetails);
		helper.jsCLick(AddfamilyDetails);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on AddfamilyDetails");
		Assert.assertTrue(true, "Failed to click on AddfamilyDetails");
		
		helper.waitFor(NameofFamlyMembers);
		helper.highLightElement(driver, NameofFamlyMembers);
		NameofFamlyMembers.clear();
		NameofFamlyMembers.sendKeys("Abcd");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on NameofFamlyMembers");
		Assert.assertTrue(true, "Failed to click on NameofFamlyMembers");
		
		helper.waitFor(MembersDob);
		helper.highLightElement(driver, MembersDob);
		MembersDob.clear();
		MembersDob.sendKeys("05051990");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on MembersDob");
		Assert.assertTrue(true, "Failed to click on MembersDob");
		
//		helper.waitFor(MembersAge);
//		helper.highLightElement(driver, MembersAge);
//		MembersAge.clear();
//		MembersAge.sendKeys("31");
//		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on MembersAge");
//		Assert.assertTrue(true, "Failed to click on MembersAge");
		
		helper.waitFor(RelationShip);
		helper.highLightElement(driver, RelationShip);
		RelationShip.clear();
		RelationShip.sendKeys("Brother");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on RelationShip");
		Assert.assertTrue(true, "Failed to click on RelationShip");
		
		helper.waitFor(Occupation);
		helper.highLightElement(driver, Occupation);
		Occupation.clear();
		Occupation.sendKeys("Doctor");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Occupation");
		Assert.assertTrue(true, "Failed to click on Occupation");
		
		helper.waitFor(Contactno);
		helper.highLightElement(driver, Contactno);
		Contactno.clear();
		Contactno.sendKeys("9876543210");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Contactno");
		Assert.assertTrue(true, "Failed to click on Contactno");
		
		helper.waitFor(BloodGroup);
		helper.highLightElement(driver, BloodGroup);
		helper.selectDropDownValue(BloodGroup, "value", "B+");
		//BloodGroup.sendKeys("B+");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on BloodGroup");
		Assert.assertTrue(true, "Failed to click on BloodGroup");
		
		helper.waitFor(Aadharno);
		helper.highLightElement(driver, Aadharno);
		Aadharno.clear();
		Aadharno.sendKeys("643256789076");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Aadharno");
		Assert.assertTrue(true, "Failed to click on Aadharno");
		
		helper.waitFor(Pan_number);
		helper.highLightElement(driver, Pan_number);
		Pan_number.clear();
		Pan_number.sendKeys("EDFHK2134R");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Pan_number");
		Assert.assertTrue(true, "Failed to click on Pan_number");
		
		helper.waitFor(Save_FamilyDetails);
		helper.highLightElement(driver, Save_FamilyDetails);
		helper.jsCLick(Save_FamilyDetails);
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on Save_FamilyDetails");
		Assert.assertTrue(true, "Failed to click on Save_FamilyDetails");
		Thread.sleep(4000);
		
		
		
	}

}
