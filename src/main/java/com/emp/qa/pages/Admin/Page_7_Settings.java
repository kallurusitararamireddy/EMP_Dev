package com.emp.qa.pages.Admin;

import java.awt.AWTException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Page_7_Settings extends BasePage {

	public Page_7_Settings(WebDriver driver) {
		super(driver);

	}

	/*
	 * Manage Locations And_Departmets
	 */
	@FindBy(xpath = "//a[contains(text(),'Manage Locations & Departments')]")
	@CacheLookup
	WebElement ManageLocationsAnd_Departmets;

	@FindBy(xpath = "//button[contains(text(),'Add Location & Departments')]")
	@CacheLookup
	WebElement AddLocationsandDepartments;

	@FindBy(xpath = "//select[@id='TimeZoneID']")
	@CacheLookup
	WebElement SelectTimezone;

	@FindBy(xpath = "//input[@id='locatinName']")
	@CacheLookup
	WebElement Type_Location;

	@FindBy(xpath = "//*[@id='addLocationModal']/div/div/div[2]/div[1]/div[3]/span[1]/span[1]/span/ul/li/input")
	@CacheLookup
	WebElement EnterDepartments;

	@FindBy(xpath = "//li[@id='select2-addLocGetDepartments-result-h204-1']")
	@CacheLookup
	WebElement Nodejs;

	@FindBy(xpath = "//button[@id='addLocId']")
	@CacheLookup
	WebElement AddLocation_Button;

	public void ManageLocationsAndDepartmentPage() throws InterruptedException, AWTException {

		helper.highLightElement(driver, ManageLocationsAnd_Departmets);
		ManageLocationsAnd_Departmets.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> clicked on Settings Module ans Selected  Manage-Locations-And-Departmets Sub-Module ");
		Assert.assertTrue(true,
				"Failed to click on Settings Module ans Selected  Manage-Locations-And-Departmets Sub-Module ");

		helper.waitFor(AddLocationsandDepartments);
		helper.highLightElement(driver, AddLocationsandDepartments);
		AddLocationsandDepartments.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Add Locations-and-Departments Button");
		Assert.assertTrue(true, "Failed to Click on Add Locations-and-Departments Button ");

		helper.waitFor(SelectTimezone);
		helper.highLightElement(driver, SelectTimezone);
		helper.selectDropDownValue(SelectTimezone, "value", "AsiaKolkata");
		SelectTimezone.click();
		Reporter.log(
				"<B><font color = 'blue'>Step3.</font></B> Clicked on Timezone Drop-down and  Selected Any  Time Zone");
		Assert.assertTrue(true, "Failed to Click on Timezone Drop-down and  Selected Any Time Zone");

		helper.waitFor(Type_Location);
		helper.highLightElement(driver, Type_Location);
		Type_Location.sendKeys("Vizag");
		Reporter.log(
				"<B><font color = 'blue'>Step4.</font></B> Clicked on Location Text field and Entered Location name  ");
		Assert.assertTrue(true, "Failed to Click on Location Text field and Entered Location name ");

		helper.waitFor(EnterDepartments);
		helper.highLightElement(driver, EnterDepartments);
		helper.move_to_element_click_target(EnterDepartments);
		helper.robot_Second_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step5.</font></B> Clicked on Departments Drop-Down and  Selected Department ");
		Assert.assertTrue(true, "Failed to  Click on Departments Drop-Down and  Selected Department");

		helper.waitFor(AddLocation_Button);
		helper.highLightElement(driver, AddLocation_Button);
		helper.jsCLick(AddLocation_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Add-Location Button ");
		Assert.assertTrue(true, "Failed to Click on Add-Location Button");
		Thread.sleep(5000);

	}

	/*
	 * 
	 */
	@FindBy(xpath = "//a[contains(text(),'Storage Type')]")
	@CacheLookup
	WebElement StorageType;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Add Storage')]")
	@CacheLookup
	WebElement Add_Storage_Button;

	@FindBy(xpath = "//select[@id='stroageTypes']")
	@CacheLookup
	WebElement Select_Storagetype_Dropdown;

	public void Storage_Type_Page() throws InterruptedException {

		helper.waitFor(StorageType);
		helper.highLightElement(driver, StorageType);
		StorageType.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected StorageType Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Settings Module and Selected StorageType Sub-Module");

		helper.waitFor(Add_Storage_Button);
		helper.highLightElement(driver, Add_Storage_Button);
		Add_Storage_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Add_Storage Button ");
		Assert.assertTrue(true, "Failed to Click on   Add_Storage Button");

		helper.waitFor(Select_Storagetype_Dropdown);
		helper.highLightElement(driver, Select_Storagetype_Dropdown);
		helper.selectDropDownValue(Select_Storagetype_Dropdown, "visibletext", "Google Drive");
		Reporter.log(
				"<B><font color = 'blue'>Step3 .</font></B> Clicked on  Storage-Type_Dropdown and  Selected Strorage Type");
		Assert.assertTrue(true, "Failed to Click on  Storage-Type_Dropdown and Selected Strorage Type");
		Thread.sleep(5000);

	}

	/*
	 * 
	 */

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Productivity Rules')]")
	@CacheLookup
	WebElement ProductivityRules;

	@FindBy(xpath = "//button[@id='ActivityID']")
	@CacheLookup
	WebElement Activity_Button;

	@FindBy(xpath = "//button[@id='CategoryID']")
	@CacheLookup
	WebElement Category_Button;

	@FindBy(xpath = "//button[@id='All']")
	@CacheLookup
	WebElement SeeAll_Button;

	@FindBy(xpath = "//button[@id='Global']")
	@CacheLookup
	WebElement Global_Button;

	@FindBy(xpath = "//button[@id='Custom']")
	@CacheLookup
	WebElement Custom_Button;

	@FindBy(xpath = "//button[@id='New']")
	@CacheLookup
	WebElement New_Button;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Website')]")
	@CacheLookup
	WebElement Website_Button;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Application')]")
	@CacheLookup
	WebElement Application_Button;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowentriesDropDown;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Add New Domain')]")
	@CacheLookup
	WebElement Addnew_Domain;

	@FindBy(xpath = "//input[@id='DomainURL']")
	@CacheLookup
	WebElement Add_Domain_Link;

	@FindBy(xpath = "//button[@id='NewURLSave']")
	@CacheLookup
	WebElement Save_Button;

	@FindBy(xpath = "//input[@id='searchByname']")
	@CacheLookup
	WebElement SearchBar;

	@FindBy(xpath = "//button[@id='ExportBtn']")
	@CacheLookup
	WebElement Export_Button;

	public void Productivity_Rules_Page() throws InterruptedException {

		helper.waitFor(ProductivityRules);
		helper.highLightElement(driver, ProductivityRules);
		ProductivityRules.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Productivity-Rules Sub-Module ");
		Assert.assertTrue(true, "Failed To Settings Module and Selected  Productivity-Rules Sub-Module");

		helper.waitFor(Activity_Button);
		helper.highLightElement(driver, Activity_Button);
		Activity_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Activity_Button");
		Assert.assertTrue(true, "Failed To Click on  Activity_Button");

		helper.waitFor(Category_Button);
		helper.highLightElement(driver, Category_Button);
		Category_Button.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Category_Button");
		Assert.assertTrue(true, "Failed To Click on  Category_Button");
		Thread.sleep(5000);

		helper.waitFor(SeeAll_Button);
		helper.highLightElement(driver, SeeAll_Button);
		SeeAll_Button.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on SeeAll_Button");
		Assert.assertTrue(true, "Failed To Click on  SeeAll_Button");
		Thread.sleep(5000);

		helper.waitFor(Global_Button);
		helper.highLightElement(driver, Global_Button);
		Global_Button.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Global_Button");
		Assert.assertTrue(true, "Failed To Click on  Global_Button");
		Thread.sleep(5000);

		helper.waitFor(Custom_Button);
		helper.highLightElement(driver, Custom_Button);
		Custom_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Custom_Button");
		Assert.assertTrue(true, "Failed To Click on  Custom_Button");
		Thread.sleep(5000);

		helper.waitFor(New_Button);
		helper.highLightElement(driver, New_Button);
		New_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on New_Button");
		Assert.assertTrue(true, "Failed To Click on  New_Button");
		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		helper.waitFor(Addnew_Domain);
		helper.highLightElement(driver, Addnew_Domain);
		Addnew_Domain.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Addnew_Domain");
		Assert.assertTrue(true, "Failed To Click on  Addnew_Domain");

		Random l = new Random();
		int num = l.nextInt(100000000);
		String act_l = "https://www.selenium";
		String exp_l = act_l + num;

		helper.waitFor(Add_Domain_Link);
		helper.highLightElement(driver, Add_Domain_Link);
		Add_Domain_Link.sendKeys(exp_l + ".de");
		Add_Domain_Link.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Entered URL Link  ");
		Assert.assertTrue(true, "Failed To Enter URL Link");
		Thread.sleep(4000);

		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		Save_Button.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Click on Save_Button");
		Thread.sleep(5000);

		helper.waitFor(Export_Button);
		helper.highLightElement(driver, Export_Button);
		Export_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Export_Button");
		Assert.assertTrue(true, "Failed To Click on Export_Button");
		Thread.sleep(5000);

	}
	
	/*
	 * 
	 */
	@FindBy(xpath = "//a[contains(text(),'Roles and Permission')]")
	@CacheLookup
	WebElement RolesAndPermission;
	
	@FindBy(xpath = "//a[@href='#'][contains(.,'Add New Role')]")
	@CacheLookup
	WebElement Addnewrole_Button;
	
	@FindBy(xpath = "//input[@id='roleNameInput']")
	@CacheLookup
	WebElement Rolename;
	
	@FindBy(xpath = "//*[@id='inputFormRow']/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	@CacheLookup
	WebElement Department;
	
	
	
	@FindBy(xpath = "//button[@id='addeditRole']")
	@CacheLookup
	WebElement Save_Button_RP;
	
	
	public void Roles_And_Permission_Page()throws InterruptedException, AWTException{
		 
		helper.waitFor(RolesAndPermission);		 
		helper.highLightElement(driver, RolesAndPermission);
		RolesAndPermission.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Roles-And-Permission Sub-module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Roles-And-Permission Sub-module");
		
		helper.waitFor(Addnewrole_Button);		
		helper.highLightElement(driver, Addnewrole_Button);
		Addnewrole_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Add New-Role Button");
		Assert.assertTrue(true, "Failed To Click on Add New-Role Button");
		
		Random g=new Random();
		int num=g.nextInt(100);
		String Act_g="AutomationCode";
		String Exp_g=Act_g+num;
		
		helper.waitFor(Rolename);		
		helper.highLightElement(driver,Rolename);
		Rolename.sendKeys(Exp_g);
		Rolename.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Role-name Text Field and  Entered Role Name ");
		Assert.assertTrue(true, "Failed To Click on Role-name Text Field and  Entered Role Name");
		
		helper.waitFor(Location);		
		helper.highLightElement(driver,Location);
		helper.move_to_element_click_target(Location);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and  Selected Any  Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and  Selected Any Location");
		
		
		helper.waitFor(Department);		
		helper.highLightElement(driver,Department);
		helper.move_to_element_click_target(Department);
		Thread.sleep(1000);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Department Drop-down and  Selected Any Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Any Department");
		
		 
		helper.waitFor(Save_Button_RP);		
		helper.highLightElement(driver,Save_Button_RP);
		helper.move_to_element_click_target(Save_Button_RP);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Save Button");
		Assert.assertTrue(true, "Failed To Clik on save Button");
	
}
	
	
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Shift Management')]")
	@CacheLookup
	WebElement ShiftManagemet;
	
	@FindBy(xpath = "//a[contains(text(),'Create Shift')]")
	@CacheLookup
	WebElement CreateShift;
	
	@FindBy(xpath = "//input[@id='shiftname']")
	@CacheLookup
	WebElement ShiftName;
	
	@FindBy(xpath = "//*[@id='monStart']")
	@CacheLookup
	WebElement LateLogin;
	
	@FindBy(xpath = "//*[@id='monEnd']")
	@CacheLookup
	WebElement EarlyLogin;
	
	@FindBy(xpath = "//input[@id='red']")
	@CacheLookup
	WebElement Selectcolor_RadioButton;
	
	@FindBy(xpath = "//input[@id='mon']")
	@CacheLookup
	WebElement mon_checkBox;
	
	@FindBy(xpath = "//input[@id='monStart']")
	@CacheLookup
	WebElement Monday_StartTime;
	
	@FindBy(xpath = "//input[@id='monEnd']")
	@CacheLookup
	WebElement Monday_EndTime;
	
	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button_s;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement OK_Button;
	
	
	public void Shift_Management_Page()throws InterruptedException{
		
		helper.waitFor(ShiftManagemet);		
		helper.highLightElement(driver, ShiftManagemet);
		ShiftManagemet.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Shift-Managemet Sub-Module ");
		Assert.assertTrue(true, "Failed To  Click on Settings Module and Selected  Shift-Managemet Sub-Module");
		
		
		helper.waitFor(CreateShift);		
		helper.highLightElement(driver, CreateShift);
		CreateShift.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create-Shift Button ");
		Assert.assertTrue(true, "Failed To Click on Create-Shift Button");
		
		Random r=new Random();
		int num=r.nextInt(100);
		String act_sn="AutomationCode";
		String exp_sn=act_sn+num;
		
		helper.waitFor(ShiftName);		
		helper.highLightElement(driver, ShiftName);
		ShiftName.sendKeys(exp_sn);
		ShiftName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Shift-Name Text field and Entered Shift Name ");
		Assert.assertTrue(true, "Failed To Click on Shift-Name Text field and Entered Shift Name ");
		
		helper.waitFor(LateLogin);		
		helper.highLightElement(driver, LateLogin);
		LateLogin.sendKeys("10-05");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Late-Login Time Set");
		Assert.assertTrue(true, "Failed To Click on  Late-Login Time Set");
		
		
		helper.waitFor(EarlyLogin);		
		helper.highLightElement(driver,EarlyLogin);
		EarlyLogin.sendKeys("09-50");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Early-Login Time Set ");
		Assert.assertTrue(true, "Failed To Click on  Early-Login Time Set");
		
		
		helper.waitFor(Selectcolor_RadioButton);		
		helper.highLightElement(driver,Selectcolor_RadioButton);
		Selectcolor_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Select-color Radio Button");
		Assert.assertTrue(true, "Failed To Click on  Select-color Radio Button");
		
		
		helper.waitFor(mon_checkBox);		
		helper.highLightElement(driver,mon_checkBox);
//		EarlyLogin.sendKeys("09-50");
		mon_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on monday check Box option");
		Assert.assertTrue(true, "Failed To Click on  monday check Box option ");
		
		helper.waitFor(Monday_StartTime);		
		helper.highLightElement(driver,Monday_StartTime);
//		Monday_StartTime.sendKeys("10-00");
		Monday_StartTime.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Monday Start-Time");
		Assert.assertTrue(true, "Failed To Click on Monday Start-Time");
		
		helper.waitFor(Monday_EndTime);		
		helper.highLightElement(driver,Monday_EndTime);
		Monday_EndTime.sendKeys("07-00");
		Monday_EndTime.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Monday End-Time");
		Assert.assertTrue(true, "Failed To Click on Monday End-Time");
		
		helper.waitFor(Save_Button_s);		
		helper.highLightElement(driver,Save_Button_s);
		helper.Scrollintoview(Save_Button_s);
		helper.jsCLick(Save_Button_s);
		Thread.sleep(3000);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Save Button");
		Assert.assertTrue(true, "Failed To Click on  Save Button");
		Thread.sleep(2000);
		
		helper.waitFor(OK_Button);		
		helper.highLightElement(driver,OK_Button);
		OK_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on ok_button");
		Assert.assertTrue(true, "Failed To Click on ok_button");
		
		
	}
	
	
	/*
	 * 
	 */
	
	
	@FindBy(xpath = "//a[contains(text(),'Localization')]")
	@CacheLookup
	WebElement Localiation;
	
	@FindBy(xpath = "//select[@id='localeTimezones']")
	@CacheLookup
	WebElement SelectTimezone_l;
	
	@FindBy(xpath = "//select[contains(@name,'language')]")
	@CacheLookup
	WebElement SelectLanguage;
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	WebElement Save_Button_l;
	
	public void Localiation_Page()throws InterruptedException{
		
		helper.waitFor(Localiation);		
		helper.highLightElement(driver, Localiation);
		Localiation.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Localiation Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Localiation Sub-Module");
		
		Thread.sleep(2000);
		helper.waitFor(SelectTimezone_l);		
		helper.highLightElement(driver, SelectTimezone_l); 
		helper.selectDropDownValue(SelectTimezone_l, "id", "Asia/Kolkata");
		SelectTimezone_l.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Time-Zone Drop-down  and Selected Any Time Zone");
		Assert.assertTrue(true, "Failed To Click on  Time-Zone Drop-down and Selected Time Zone");
		
		Thread.sleep(2000);
		helper.waitFor(Save_Button_l);		
		helper.highLightElement(driver, Save_Button_l);
	    Save_Button_l.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Click on  Save_Button");
		
 
}
	
	
	
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Manage Locations & Departments')]")
	@CacheLookup
	WebElement ManageLocationsAnd_Departmets_ld;

	@FindBy(xpath = "//button[contains(text(),'Add Location & Departments')]")
	@CacheLookup
	WebElement AddLocationsandDepartments_ld;

	@FindBy(xpath = "//select[@id='TimeZoneID']")
	@CacheLookup
	WebElement SelectTimezone_ld;

	@FindBy(xpath = "//input[@id='locatinName']")
	@CacheLookup
	WebElement Type_Location_ld;

	@FindBy(xpath = "//*[@id='addLocationModal']/div/div/div[2]/div[1]/div[3]/span[1]/span[1]/span/ul/li/input")
	@CacheLookup
	WebElement EnterDepartments_ld;

	@FindBy(xpath = "//li[@id='select2-addLocGetDepartments-result-h204-1']")
	@CacheLookup
	WebElement Nodejs_ld;

	@FindBy(xpath = "//button[@id='addLocId']")
	@CacheLookup
	WebElement Add_Location_Button;

	@SuppressWarnings("static-access")
	public void Locations_And_Department_Page() throws InterruptedException, AWTException {

		helper.highLightElement(driver,ManageLocationsAnd_Departmets_ld);
		ManageLocationsAnd_Departmets_ld.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> Clicked on Settings Module and Selected  ManageLocations-And-Departmets Sub-Module");
		Assert.assertTrue(true, "Failed to Click on  Settings Module and Selected  ManageLocations-And-Departmets Sub-Module");
		
		helper.waitFor(AddLocationsandDepartments_ld);
		helper.highLightElement(driver,AddLocationsandDepartments_ld);
		AddLocationsandDepartments_ld.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Add-Locations and Departments Button");
		Assert.assertTrue(true, "Failed to Click on Add-Locations and Departments Button");
		
		 
		helper.waitFor(SelectTimezone_ld);
		helper.highLightElement(driver,SelectTimezone_ld);
		helper.selectDropDownValue(SelectTimezone_ld, "value", "AsiaKolkata");
		SelectTimezone_ld.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Timezone Drop-down and Select Any Time Zone ");
		Assert.assertTrue(true, "Failed to Click on Timezone Drop-down and Select Time Zone");
		
		/*
		 *  Checking with  Location name  or  Change the location name
		 */
	
		
		
		helper.waitFor(Type_Location_ld);
		helper.highLightElement(driver,Type_Location_ld);
		Type_Location_ld.sendKeys("mumbai"+helper.randomChar());
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Location Drop-doown and  Selected Any  Location");
		Assert.assertTrue(true, "Failed to Click on on Location Drop-doown and  Selected Any  Location");
		
		
		helper.waitFor(EnterDepartments_ld);
		helper.highLightElement(driver,EnterDepartments_ld);
		helper.move_to_element_click_target(EnterDepartments_ld);
		helper.robot_fourth_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Departments Drop-down and  Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Departments Drop-down and  Selected Any Department");
		
		helper.waitFor(Add_Location_Button);
		helper.highLightElement(driver,Add_Location_Button);
		helper.jsCLick(Add_Location_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Add-Location Button ");
		Assert.assertTrue(true, "Failed to Click on Add-Location Button");
		Thread.sleep(5000);
	
        return;

 
	}
	
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Shift Management')]")
	@CacheLookup
	WebElement ShiftManagemet_c;

	@FindBy(xpath = "//a[contains(text(),'Create Shift')]")
	@CacheLookup
	WebElement CreateShift_c;

	@FindBy(xpath = "//input[@id='shiftname']")
	@CacheLookup
	WebElement ShiftName_c;

	@FindBy(xpath = "//input[@id='lateLogin']")
	@CacheLookup
	WebElement LateLogin_c;

	@FindBy(xpath = "//input[@id='earlyLoginAndLogout']")
	@CacheLookup
	WebElement EarlyLogin_c;

	@FindBy(xpath = "//input[@id='red']")
	@CacheLookup
	WebElement Selectcolor_RadioButton_c;

	@FindBy(xpath = "//input[@id='mon']")
	@CacheLookup
	WebElement mon_checkBox_c;

	@FindBy(xpath = "//*[@id='monStart']")
	@CacheLookup
	WebElement Monday_StartTime_c;

	@FindBy(xpath = "//*[@id='monEnd']")
	@CacheLookup
	WebElement Monday_EndTime_c;
	
	@FindBy(xpath = "//button[contains(text(),'Apply to all')]")
	@CacheLookup
	WebElement Applytoall_c;

	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button_c;



	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement Done_Save;

	public void Create_Shift_Page() throws InterruptedException {

		helper.waitFor(ShiftManagemet_c);		
		helper.highLightElement(driver, ShiftManagemet_c);
		ShiftManagemet_c.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings and Selected Shift Managemet Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings and Selected Shift Managemet Sub-Module");
		
		
		helper.waitFor(CreateShift_c);		 
		helper.highLightElement(driver, CreateShift_c);
		CreateShift_c.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create Shift Button");
		Assert.assertTrue(true, "Failed To Click on  Create Shift Button");
		
		Random r=new Random();
		int num=r.nextInt(1000);
		String actual_name="AutomationCode";
		String expected_name=actual_name+num;
		helper.waitFor(ShiftName_c);		
		helper.highLightElement(driver, ShiftName_c);
		ShiftName_c.click();
		ShiftName_c.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Shift-Name Text Field and Entered Shift Name ");
		Assert.assertTrue(true, "Failed To Select Shift-Name Text Field and Entered Shift Name");
		

		
		helper.waitFor(Selectcolor_RadioButton_c);		
		helper.highLightElement(driver,Selectcolor_RadioButton_c);
		Selectcolor_RadioButton_c.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on color Radio Button");
		Assert.assertTrue(true, "Failed To Click on  color_Radio Button");
		
		
		helper.waitFor(mon_checkBox_c);		
		helper.highLightElement(driver,mon_checkBox_c);
		mon_checkBox_c.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on monday check-Box");
		Assert.assertTrue(true, "Failed To Select monday check-Box");
		
		helper.waitFor(Monday_StartTime_c);		
		helper.highLightElement(driver,Monday_StartTime_c);
		Monday_StartTime_c.sendKeys("10-00");
		Monday_StartTime_c.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Monday Start-Time and Entered Time ");
		Assert.assertTrue(true, "Failed To Click on Monday Start-Time and Entered Time");
		
		helper.waitFor(Monday_EndTime_c);		
		helper.highLightElement(driver,Monday_EndTime_c);
		Monday_EndTime_c.sendKeys("07-00");
		Monday_EndTime_c.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Monday End-Time and Entered Time ");
		Assert.assertTrue(true, "Failed To Click on Monday End-Time and Entered Time");
		
		
		helper.waitFor(Applytoall_c);		
		helper.highLightElement(driver,Applytoall_c);
		Applytoall_c.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Apply-to-all Button ");
		Assert.assertTrue(true, "Failed To Select Apply-to-all Button ");
		
		helper.waitFor(Save_Button_c);		
		helper.highLightElement(driver,Save_Button_c);
		Save_Button_c.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Select Save_Button");
		
		
		helper.waitFor(Done_Save);		
		helper.highLightElement(driver,Done_Save);
		Done_Save.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Done_save");
		Assert.assertTrue(true, "Failed To Select Done_save");
		

	}
	
	
	/*
	 * 
	 * Change Dynamic changes 
	 */
	
	
	@FindBy(xpath = "//a[contains(text(),'Roles and Permission')]")
	@CacheLookup
	WebElement RolesAndPermission_R;

	@FindBy(xpath = "//a[@href='#'][contains(.,'Add New Role')]")
	@CacheLookup
	WebElement Addnewrole_Button_R;

	@FindBy(xpath = "//input[@id='roleNameInput']")
	@CacheLookup
	WebElement Rolename_R;

	@FindBy(xpath = "//*[@id='inputFormRow']/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement Location_R;

	@FindBy(xpath = "//body/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement Department_R;

	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]")
	@CacheLookup
	WebElement Nodejs_R;

	@FindBy(xpath = "//button[@id='addeditRole']")
	@CacheLookup
	WebElement Save_Button_R;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Showentries_R;

	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	WebElement LastpageButton_R;

	@FindBy(xpath = "//input[@id='writeC']")
	@CacheLookup
	WebElement write_CheckBox_R;

	@FindBy(xpath = "//input[@id='deleteC']")
	@CacheLookup
	WebElement Delete_CheckBox_R;

	
	/*
	 *  Change  X-Path  
	 */

	@FindBy(xpath = "//tbody[@id='roletablebody']//tr[@id='role832']")
	@CacheLookup
	WebElement Settings_R;

	@FindBy(xpath = "//div[@id='EmployeeWebUsageSettings']/a/i")
	@CacheLookup
	WebElement EmployeeWebsiteusage_R;

	@FindBy(xpath = "//input[@id='check-EmployeeWebUsageView-1']")
	@CacheLookup
	WebElement checkbox_R;

	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement save_R;

	public void Roles_and_Permission_Page() throws InterruptedException, AWTException {


		helper.waitFor(RolesAndPermission_R);
		helper.highLightElement(driver, RolesAndPermission_R); 
		RolesAndPermission_R.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Sttings Module and Selected  Roles-And-Permission Sub-module ");
		Assert.assertTrue(true, "Failed To Click on  Sttings Module and Selected  Roles-And-Permission Sub-module");

		helper.waitFor(Addnewrole_Button_R);
		helper.highLightElement(driver, Addnewrole_Button_R);
		Addnewrole_Button_R.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Add New-Role Button");
		Assert.assertTrue(true, "Failed To Select Add New-Role Button");

		Random g=new Random();
		int num=g.nextInt(100);
		String Act_g="AutomationCode";
		String Exp_g=Act_g+num;
		
		helper.waitFor(Rolename_R);		
		helper.highLightElement(driver,Rolename_R);
		Rolename_R.sendKeys(Exp_g);
		Rolename_R.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Role-name Test field and  Entered Role Name ");
		Assert.assertTrue(true, "Failed To Click on Role-name Test field and  Entered Role Name");
		
		helper.waitFor(Location_R);		
		helper.highLightElement(driver,Location_R);
		helper.move_to_element_click_target(Location_R);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and  Selected Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-Down & Select Location");
		
		
		helper.waitFor(Department_R);		
		helper.highLightElement(driver,Department_R);
		helper.move_to_element_click(Department_R);
		Thread.sleep(1000);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Department Drop-down and  Select Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and  Select Department");
		
		
		helper.waitFor(Save_Button_R);		
		helper.highLightElement(driver,Save_Button_R);
		Thread.sleep(5000);
		helper.jsCLick(Save_Button_R);
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on save Button");
		Assert.assertTrue(true, "Failed To Clik on save Button");
		
		driver.navigate().refresh();

		Thread.sleep(2000);


		helper.highLightElement(driver, LastpageButton_R);
		helper.Scrollintoview(LastpageButton_R);
        helper.move_to_element_click(LastpageButton_R);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on  Last-page Button");
		Assert.assertTrue(true, "Failed to Click on Last-page Button");
		Thread.sleep(3000);

		helper.highLightElement(driver, write_CheckBox_R);
		helper.Scrollintoview(write_CheckBox_R);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked write_CheckBox");
		Assert.assertTrue(true, "Failed to Click write_CheckBox");

		helper.highLightElement(driver, Delete_CheckBox_R);
		helper.Scrollintoview(Delete_CheckBox_R);

		List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@id='deleteC']"));

		int size = AllCheckboxes.size();

		System.out.println(size);

		for (int i = 0; i < size; i++) {

			AllCheckboxes.get(i).click();

		}

		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on  Delete Check Box");
		Assert.assertTrue(true, "Failed to Click on Delete Check-Box");
		helper.highLightElement(driver, Settings_R);
		helper.Scrollintoview(Settings_R);
		helper.jsCLick(Settings_R);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on  Settings");
		Assert.assertTrue(true, "Failed To Click on  Settings");
		Thread.sleep(2000); 

		helper.waitFor(EmployeeWebsiteusage_R);
		helper.highLightElement(driver, EmployeeWebsiteusage_R);
		EmployeeWebsiteusage_R.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on  Employee-Website-usage Button ");
		Assert.assertTrue(true, "Failed To Click on  Employee-Website-usage Button");

		helper.waitFor(checkbox_R);
		helper.highLightElement(driver, checkbox_R);
		helper.jsCLick(checkbox_R);
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Selected All option (check-box )");
		Assert.assertTrue(true, "Failed To Select All option (check-box )");

		helper.waitFor(save_R);
		helper.highLightElement(driver, save_R);
		helper.jsCLick(save_R);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on  save Button");
		Assert.assertTrue(true, "Failed To Click on  save Button ");

	}
	
	
	
	/*
	 *  Dynamic Changes
	 */
	
	
	@FindBy(xpath = "//a[contains(text(),'Monitoring Control')]")
	@CacheLookup
	WebElement MonitoringControl_1;
	
	@FindBy(xpath = "//a[contains(text(),'Create Group')]")
	@CacheLookup
	WebElement Create_Group_1;
	
	@FindBy(xpath = "//input[@id='groupsName']")
	@CacheLookup 
	WebElement Group_Name_1;
	
	@FindBy(xpath = "//*[@id='select2-role0-container']")
	@CacheLookup
	WebElement Role_1;
	
	@FindBy(xpath = "//*[@id='select2-locationdept0-container']")
	@CacheLookup
	WebElement Location_1;
	
	@FindBy(xpath = "//span[@id='select2-role0-container']")
	@CacheLookup
	WebElement Employee_1;

	
	@FindBy(xpath = "//*[@id=\"select2-getDepartments0-container\"]")
	@CacheLookup
	WebElement Department_1;
	
	@FindBy(xpath = "//*[@id=\"hide_Div\"]/div[4]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement Employees_1;
	
	@FindBy(xpath = "//option[contains(text(),'GLB-158-PC - GLB-158')]")
	@CacheLookup
	WebElement GLB;
	
	@FindBy(xpath = "//button[@id='addGroups']")
	@CacheLookup
	WebElement CreateGroup_Button_1;
	
	
	@FindBy(xpath = "/html/body/div[5]/div/div[3]/button[1]")
	@CacheLookup
	WebElement Assign_ok_button_1;
	
	@FindBy(xpath = "//iframe[@id='fc_push']")
	@CacheLookup
	WebElement Ok_Button;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	WebElement LastPageButton_1;
	
	/*
	 *  Change with X-path 
	 */
	
	@FindBy(xpath = "//tbody/tr[@id='726']/td[6]/a[3]/i")
	@CacheLookup
	WebElement GroupSettings_1;
	
	@FindBy(xpath = "//a[contains(@data-target,'#TrackingFeatures')]")
	@CacheLookup     
	WebElement TrackingFeatures_1;
	
	@FindBy(xpath = "//button[contains(text(),'Advanced Settings')]")
	@CacheLookup
	WebElement AdvanceSettings_1;
	
	
	@FindBy(xpath = "//select[@id='websiteMonitorWebsite']")
	@CacheLookup
	WebElement MonitorOnlyThis_1;
	
	@FindBy(xpath = "//*[@id='Websites_adv']/div/div/div[4]/a[1]")
	@CacheLookup
	WebElement Save_Website_1;
	
	@FindBy(xpath = "//button[@id='save_id_button']")
	@CacheLookup
	WebElement Save_Button_1;
	
	public void Monitor_Control_Page()throws InterruptedException, AWTException{
		
		helper.waitFor(MonitoringControl_1);		
		helper.highLightElement(driver, MonitoringControl_1);
		MonitoringControl_1.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Monitoring-Control Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Monitoring-Control Sub-Module");
		
		helper.waitFor(Create_Group_1);		
		helper.highLightElement(driver, Create_Group_1);
		Create_Group_1.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create_Group Button");
		Assert.assertTrue(true, "Failed To Click on  Create_Group Button ");
		
		
		Random r=new Random();
		int num=r.nextInt(1000);
		String act_name="Automation code";
		String exp_name=act_name+num;
		
		helper.waitFor(Group_Name_1);		
		helper.highLightElement(driver, Group_Name_1);
		Group_Name_1.sendKeys(exp_name);
		Group_Name_1.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Group_Name Text field and Entered Group Name ");
		Assert.assertTrue(true, "Failed To Click on Group_Name Text field and Entered Group Name ");
		
		helper.waitFor(Role_1);		
		helper.highLightElement(driver, Role_1);
	    helper.move_to_element_click_target(Role_1);  
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Role Drop-down and Selected Any Role ");
		Assert.assertTrue(true, "Failed To Click on Role Drop-down and Selected Any Role ");
		
		
		
		helper.waitFor(Location_1);		
		helper.highLightElement(driver, Location_1);
	    helper.move_to_element_click_target(Location_1);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and Selected Any Location");
		

		helper.waitFor(Department_1);		
		helper.highLightElement(driver, Department_1);
	    helper.move_to_element_click_target(Department_1);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Any Department");
		
		helper.waitFor(Employee_1);		
		helper.highLightElement(driver,Employee_1);
	    helper.move_to_element_click_target(Employee_1);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Employees Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed To Clicked on Employees Drop-down and Selected Any Employee");
		

		
		helper.waitFor(CreateGroup_Button_1);		
		helper.highLightElement(driver, CreateGroup_Button_1);
		helper.Scrollintoview(CreateGroup_Button_1);
		helper.jsCLick(CreateGroup_Button_1);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Create-Group Button");
		Assert.assertTrue(true, "Failed To Select Create-Group Button");
		Thread.sleep(2000); 
		
		helper.waitFor(LastPageButton_1);		
		helper.highLightElement(driver, LastPageButton_1);
		helper.Scrollintoview(LastPageButton_1);
		helper.jsCLick(LastPageButton_1);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Last-Page Button");
		Assert.assertTrue(true, "Failed To Click on  Last-Page Button");
		Thread.sleep(2000);
		
		helper.waitFor(GroupSettings_1);		
		helper.highLightElement(driver, GroupSettings_1);
		helper.Scrollintoview(GroupSettings_1);
		helper.jsCLick(GroupSettings_1);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Group-Settings  ");
		Assert.assertTrue(true, "Failed To Click on  Group-Settings");
		
		helper.waitFor(TrackingFeatures_1);		
		helper.highLightElement(driver, TrackingFeatures_1);
		helper.Scrollintoview(TrackingFeatures_1);
		helper.jsCLick(TrackingFeatures_1);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Tracking-Features option ");
		Assert.assertTrue(true, "Failed To Click on  Tracking-Features option ");
		
		
		helper.waitFor(AdvanceSettings_1);		 
		helper.highLightElement(driver, AdvanceSettings_1);
		helper.Scrollintoview(AdvanceSettings_1);
		helper.jsCLick(AdvanceSettings_1);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Advance Settings");
		Assert.assertTrue(true, "Failed To Click on  Advance Settings");
		
		 
		helper.waitFor(MonitorOnlyThis_1);		
		helper.highLightElement(driver, MonitorOnlyThis_1);
		helper.Scrollintoview(MonitorOnlyThis_1);
		helper.jsCLick(MonitorOnlyThis_1);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on Monitor Only_This ");
		Assert.assertTrue(true, "Failed To Click on  Monitor Only_This");
		
		helper.waitFor(Save_Website_1);		
		helper.highLightElement(driver, Save_Website_1);
		helper.jsCLick(Save_Website_1);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Save_Website");
		Assert.assertTrue(true, "Failed To Click on  Save_Website");
		
		helper.waitFor(Save_Button_1);		
		helper.highLightElement(driver, Save_Button_1);
		helper.jsCLick(Save_Button_1);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Click on Save_Button");
		
		
	}
	
	/*
	 * 
	 * Dynamic Changes
	 */
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Monitoring Control')]")
	@CacheLookup
	WebElement MonitoringControl_m2;
	
	@FindBy(xpath = "//a[contains(text(),'Create Group')]")
	@CacheLookup
	WebElement Create_Group_m2;
	
	@FindBy(xpath = "//input[@id='groupsName']")
	@CacheLookup
	WebElement Group_Name_m2;
	
	@FindBy(xpath = "//select[@id='role0']")
	@CacheLookup
	WebElement Role_m2;
	
	@FindBy(xpath = "//span[@id='select2-role0-container']")
	@CacheLookup
	WebElement Employee_m2;
	
	@FindBy(xpath = "//select[@id='locationdept0']")
	@CacheLookup
	WebElement Location_m2;
	
	@FindBy(xpath = "//span[@title='Bangalore']")
	@CacheLookup
	WebElement Banglore_m2;
	
	
	@FindBy(xpath = "//select[@id='getDepartments0']")
	@CacheLookup
	WebElement Department_m2;
	
	@FindBy(xpath = "//option[contains(text(),'Node JS Team')]")
	@CacheLookup
	WebElement NodeJs_m2;
	
	@FindBy(xpath = "//select[@id='employee0']")
	@CacheLookup
	WebElement Employees_m2;
	
	@FindBy(xpath = "//option[contains(text(),'GLB-158-PC - GLB-158')]")
	@CacheLookup
	WebElement GLB_m2;
	
	@FindBy(xpath = "//button[@id='addGroups']")
	@CacheLookup
	WebElement CreateGroup_Button_m2;
	
	
	public void Monitoring_Control_Page()throws InterruptedException{
		
		helper.waitFor(MonitoringControl_m2);		
		helper.highLightElement(driver, MonitoringControl_m2);
		MonitoringControl_m2.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Monitoring_Control Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Monitoring_Control Sub-Module");
		
		helper.waitFor(Create_Group_m2);		
		helper.highLightElement(driver, Create_Group_m2);
		Create_Group_m2.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create_Group Button ");
		Assert.assertTrue(true, "Failed To Click on  Create_Group Button ");
		
		helper.waitFor(Group_Name_m2);		 
		helper.highLightElement(driver, Group_Name_m2);
		Group_Name_m2.sendKeys("Automation code");
		Group_Name_m2.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Group_Name Text Field and Entered Grop name ");
		Assert.assertTrue(true, "Failed To Click on Group_Name Text Field and Entered Grop name");
		
		helper.waitFor(Role_m2);		
		helper.highLightElement(driver, Role_m2);
		helper.selectDropDownValue(Role_m2, "value","roles+2");
		helper.jsCLick(Role_m2);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Role Drop-down and Selected Any role ");
		Assert.assertTrue(true, "Failed To Click on Role Drop-down and Selected Any role");
			
		
		helper.waitFor(Location_m2);		
		helper.highLightElement(driver, Location_m2);
		helper.selectDropDownValue(Location_m2, "value", "location+2");
		helper.jsCLick(Location_m2);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and Selected Any Location");
		

		
		helper.waitFor(Department_m2);		
		helper.highLightElement(driver, Department_m2);
		helper.selectDropDownValue(Department_m2, "value", "285");
		helper.jsCLick(Department_m2);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Any Department");

		helper.waitFor(Employee_m2);		
		helper.highLightElement(driver,Employee_m2);
		helper.selectDropDownValue(Employee_m2, "values", "9342");
		helper.jsCLick(Employee_m2);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Employees Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed To Click on Employees Drop-down and Selected Any Employee");
		

		
		helper.waitFor(CreateGroup_Button_m2);		
		helper.highLightElement(driver, CreateGroup_Button_m2);
		helper.Scrollintoview(CreateGroup_Button_m2);
		helper.jsCLick(CreateGroup_Button_m2);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Create-Group Button");
		Assert.assertTrue(true, "Failed To Click on  Create-Group Button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
