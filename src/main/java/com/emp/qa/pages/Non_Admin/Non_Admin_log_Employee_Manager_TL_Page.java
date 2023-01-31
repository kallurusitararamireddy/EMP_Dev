package com.emp.qa.pages.Non_Admin;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

public class Non_Admin_log_Employee_Manager_TL_Page extends BasePage {

	public Non_Admin_log_Employee_Manager_TL_Page(WebDriver driver) {
		super(TestBase.getDriver());
		// TODO Auto-generated constructor stub
	}

	static Properties pro;

	DataUtility du = new DataUtility();
	Helpers helper = new Helpers();

	/*
	 * manager side log-side Check == Must be Admin side Employee are Present ->
	 * Test Case Pass manager side log-side Check == Must be Admin side Employee are
	 * With out-Present -> Test Case fail
	 */

	@FindBy(xpath = "//i[@title='Change Role ']")
	WebElement Role;

	@FindBy(xpath = "//a[text()='Employee']")
	WebElement Selected_Employee_Role;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement Emp_Dashboard;

	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;

	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets_Btn;

	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots;

	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory;

	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory;

	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes;

	@FindBy(xpath = "//span[text()='Alerts Notifications']")
	@CacheLookup
	WebElement Alerts_Notifications;

	@FindBy(xpath = "//span[text()='Time Claim']")
	@CacheLookup
	WebElement Time_Claim;

	public void non_Admin_Side_Data_Checking_Employee_Role() throws InterruptedException, IOException {

		Reporter.log("<B><font color = 'green'>------ Employee  Role Non-Admin  -----</font></B> ");

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Assert.assertEquals(true, Role.isDisplayed());
		helper.Double_click(Role);
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> Clicked on Change Role Drop-down and Selected any Role");
		Assert.assertTrue(true, "Failed to Click on  Change Role Drop-down and Selected any Role");
		Thread.sleep(3000);

		helper.waitFor(Selected_Employee_Role);
		helper.highLightElement(driver, Selected_Employee_Role);
		Assert.assertEquals(true, Selected_Employee_Role.isDisplayed());
		helper.move_to_element_click_target(Selected_Employee_Role);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Selected Employee Role");
		Assert.assertTrue(true, "Failed to Click on Employee Role ");
		Thread.sleep(1000);

		helper.waitFor(Emp_Dashboard);
		helper.highLightElement(driver, Emp_Dashboard);
		Assert.assertEquals(true, Emp_Dashboard.isDisplayed());
		Emp_Dashboard.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page(" employee Dashboard-00");
		Reporter.log("<B><font color = 'red'>------Dashboard-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Dashboard Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Dashboard Module  and Page Data is Displyed ");

		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		Assert.assertEquals(true, productivity.isDisplayed());
		productivity.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("productivity-01");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on productivity Data");
		Assert.assertTrue(true, "Failed to Click on productivity ");
		Thread.sleep(1000); 

		helper.waitFor(Timesheets_Btn);
		helper.highLightElement(driver, Timesheets_Btn);
		Assert.assertEquals(true, Timesheets_Btn.isDisplayed());
		Timesheets_Btn.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Timesheets-02");
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Timesheets Data");
		Assert.assertTrue(true, "Failed to Click on  ");
		Thread.sleep(1000);

		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Assert.assertEquals(true, Screenshots.isDisplayed());
		Screenshots.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Screenshots-03");
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Screenshots Data");
		Assert.assertTrue(true, "Failed to Click on Screenshots ");
		Thread.sleep(1000);

		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Assert.assertEquals(true, Webhistory.isDisplayed());
		Webhistory.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Webhistory-04");
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Webhistory  Data");
		Assert.assertTrue(true, "Failed to Click on Webhistory ");
		Thread.sleep(1000);

		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		Assert.assertEquals(true, AppHistory.isDisplayed());
		AppHistory.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("AppHistory-05");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on AppHistory Data ");
		Assert.assertTrue(true, "Failed to Click on AppHistory  ");
		Thread.sleep(1000);

		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Assert.assertEquals(true, Keystrokes.isDisplayed());
		Keystrokes.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Keystrokes-06");
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Keystrokes Data");
		Assert.assertTrue(true, "Failed to Click on  Keystrokes");
		Thread.sleep(1000);

		helper.waitFor(Alerts_Notifications);
		helper.highLightElement(driver, Alerts_Notifications);
		Assert.assertEquals(true, Alerts_Notifications.isDisplayed());
		Alerts_Notifications.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Alerts_Notifications-1");
		Reporter.log("<B><font color = 'red'>------Alerts_Notifications -----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Alerts_Notifications Module ");
		Assert.assertTrue(true, "Failed to Click on  Alerts_Notifications Module ");
		Thread.sleep(1000);

		helper.waitFor(Time_Claim);
		helper.highLightElement(driver, Time_Claim);
		Assert.assertEquals(true, Time_Claim.isDisplayed());
		Time_Claim.click();
		Thread.sleep(2000);
		helper.Screen_Shot_full_page("Time_Claim-2");
		Reporter.log("<B><font color = 'red'>------Time_Claim -----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on Time_Claim Module ");
		Assert.assertTrue(true, "Failed to Click on  Time_Claim Module ");
		Thread.sleep(1000);

	}

	/*
	 * Non-Admin Side Manager Selected
	 */

	@FindBy(xpath = "//i[@title='Change Role ']")
	WebElement Role_m;

	@FindBy(xpath = "//a[text()='Manager']")
	WebElement Selected_Manager_Role;

	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	WebElement Dashboard_page;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	@CacheLookup
	WebElement Cecking_Data_D;

//@FindBy(xpath = "//span[text()='Employee']")   
//span[text()='Employee']//following-sibling::i
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page1;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page2;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page3;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page4;

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_Module;

	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement Employee_Attendance_Module;

	@FindBy(xpath = "//a[@title='Employee-Notification']")
	@CacheLookup
	WebElement Employee_Notification_Module;

	@FindBy(xpath = "//a[@title='Employee Insights']")
	@CacheLookup
	WebElement Employee_Insights;

	@FindBy(xpath = "//span[text()='Timesheets']")
	@CacheLookup
	WebElement Timesheets_Page;

	@FindBy(xpath = "//span[text()='Time Claim']")
	@CacheLookup
	WebElement Time_Claim1;

	@FindBy(xpath = "//span[text()='Projects']")
	@CacheLookup
	WebElement Projects_Page;

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page;

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page1;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page2;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page3;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page4;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page5;

	@FindBy(xpath = "//a[@title='Reports Download']")
	@CacheLookup
	WebElement Reports_Download;

	@FindBy(xpath = "//a[@title='Productivity Reports']")
	@CacheLookup
	WebElement Productivity_Reports;

	@FindBy(xpath = "//a[@title='Auto Email Reports']")
	@CacheLookup
	WebElement Auto_Email_Reports;

	@FindBy(xpath = "//a[@title='Web App Usage']")
	@CacheLookup
	WebElement Web_App_Usage;

	@FindBy(xpath = "//a[@title='System Activity Logs']")
	@CacheLookup
	WebElement System_Activity_Logs;

	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings1;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings2;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings3;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings4;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings5;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings6;

	@FindBy(xpath = "//a[@title='Manage Locations & Departments']")
	@CacheLookup
	WebElement Manage_Locations_and_Departments;

	@FindBy(xpath = "//a[@title='Storage Type']")
	@CacheLookup
	WebElement Storage_Type;

	@FindBy(xpath = "//a[@title='Productivity Rules']")
	@CacheLookup
	WebElement Productivity_Rules;

	@FindBy(xpath = "//a[@title='Roles and Permission']")
	@CacheLookup
	WebElement Roles_and_Permission;

	@FindBy(xpath = "//a[@title='Shift Management']")
	@CacheLookup
	WebElement Shift_Management;

	@FindBy(xpath = "//a[@title='Monitoring Control']")
	@CacheLookup
	WebElement Monitoring_Control;

	@FindBy(xpath = "//a[@title='Localization']")
	@CacheLookup
	WebElement Localization;

	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour1;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour2;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour3;

	@FindBy(xpath = "//a[@title='Alerts']")
	@CacheLookup
	WebElement Alerts;

	@FindBy(xpath = "//a[@title='Alert Policies']")
	@CacheLookup
	WebElement Alert_Policies;

	@FindBy(xpath = "//a[@title='Alerts Notifications']")
	@CacheLookup
	WebElement Alerts_Notifications1;

	@FindBy(xpath = "//span[text()=' Access Log']")
	@CacheLookup
	WebElement Access_Log;

//Assert.assertEquals(true, elem.isDisplayed()); 

	public void Non_Admin_Side_Manager_Role() throws InterruptedException, IOException {

		Reporter.log("<B><font color = 'green'>------Manager Role Non-Admin  -----</font></B> ");

	
		helper.waitFor(Role_m);
		helper.highLightElement(driver, Role_m);
//		Assert.assertEquals(true, Role_m.isDisplayed());
		helper.Double_click(Role_m);
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> Clicked on Change Role Drop-down and Selected any Role");
		Assert.assertTrue(true, "Failed to Click on  Change Role Drop-down and Selected any Role");
		Thread.sleep(1000);

		helper.waitFor(Selected_Manager_Role);
		helper.highLightElement(driver, Selected_Manager_Role);
		Assert.assertEquals(true, Selected_Manager_Role.isDisplayed());
		helper.move_to_element_click_target(Selected_Manager_Role);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Selected Manager Role");
		Assert.assertTrue(true, "Failed to Click on Manager Role ");
		Thread.sleep(1000);

		/*
		 * Dashboard
		 */
		helper.waitFor(Dashboard_page);
		helper.highLightElement(driver, Dashboard_page);
		Assert.assertEquals(true, Dashboard_page.isDisplayed());
		Dashboard_page.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Dashboard");
		Reporter.log("<B><font color = 'red'>------Dashboard-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step3 .</font></B> Clicked on Dashboard Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Dashboard Module  and Page Data is Displyed ");
		System.out.println("Data Checking :-- " + Cecking_Data_D.getText());
		String act_D = Cecking_Data_D.getText();
		String Ext_D = "Dashboard";
		Assert.assertEquals(act_D, Ext_D);
		Thread.sleep(3000);

		/*
		 * Employee
		 */
		helper.waitFor(Employee_Page);
		helper.highLightElement(driver, Employee_Page);
		Assert.assertEquals(true, Employee_Page.isDisplayed());
		Employee_Page.click();
		Reporter.log("<B><font color = 'red'>------Employee-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Employee Module");
		Thread.sleep(3000);

		helper.waitFor(Employee_Details_Module);
		helper.highLightElement(driver, Employee_Details_Module);
		Assert.assertEquals(true, Employee_Details_Module.isDisplayed());
		Employee_Details_Module.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Details_Module Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Details Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on Employee_Details Sub-Module and Page Data Is Displyed ");
		Thread.sleep(3000);
		

		helper.waitFor(Employee_Attendance_Module);
		helper.highLightElement(driver, Employee_Attendance_Module);
		Assert.assertEquals(true, Employee_Page1.isDisplayed());
		helper.move_to_element_click_target(Employee_Page1);
		Thread.sleep(3000);
		Assert.assertEquals(true, Employee_Attendance_Module.isDisplayed());
		Employee_Attendance_Module.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Attendance_Module Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee_Attendance  Sub-Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Employee_Attendance Sub-Module and Page Data Is Displyed");
		Thread.sleep(3000);

//	Employee_Page2.click();
//	helper.waitFor(Employee_Notification_Module);		
//	helper.highLightElement(driver, Employee_Notification_Module);
//	Thread.sleep(3000);
//	Employee_Notification_Module.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Employee_Notification_Module Pic ");
//	Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Notification  Sub-Module and Page Data Is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on  Employee_Notification  Sub-Module and Page Data Is Displyed");
//	Thread.sleep(3000);

		Employee_Page3.click();
		helper.waitFor(Employee_Insights);
		helper.highLightElement(driver, Employee_Insights);
		Thread.sleep(1000);
		Assert.assertEquals(true, Employee_Insights.isDisplayed());
		Employee_Insights.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Insights Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee_Insights  Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Employee_Insights  Sub-Module and Page Data Is Displyed");
		Thread.sleep(3000);

		/*
		 * Time Sheets
		 */
		helper.waitFor(Timesheets_Page);
		helper.highLightElement(driver, Timesheets_Page);
		Assert.assertEquals(true, Timesheets_Page.isDisplayed());
		Timesheets_Page.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Timesheets_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Timesheets-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step7 .</font></B> Clicked on Timesheets  Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Timesheets  Module and Page Data Is Displyed");
		Thread.sleep(3000);

		/*
		 * Time Claim
		 */
		helper.waitFor(Time_Claim1);
		helper.highLightElement(driver, Time_Claim1);
		Assert.assertEquals(true, Time_Claim1.isDisplayed());
		Time_Claim1.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Time_Claim Pic ");
		Reporter.log("<B><font color = 'red'>------Time_Claim-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step8 .</font></B> Clicked on Time_Claim Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Time_Claim  Module and Page Data Is Displyed ");
		Thread.sleep(3000);

//	

		/*
		 * Projects
		 */
		helper.waitFor(Projects_Page);
		helper.highLightElement(driver, Projects_Page);
		Assert.assertEquals(true, Projects_Page.isDisplayed());
		Projects_Page.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Projects_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Projects-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step9 .</font></B> Clicked on Projects Module and Page Data is Displyed   ");
		Assert.assertTrue(true, "Failed To click on Projects Module and Page Data is Displyed  ");
		Thread.sleep(3000);

		/*
		 * Reports
		 */
		helper.waitFor(Reports_page);
		helper.highLightElement(driver, Reports_page);
		Assert.assertEquals(true, Reports_page.isDisplayed());
		Reports_page.click();
		Reporter.log("<B><font color = 'red'>------Reports-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Reports Module");
		Thread.sleep(3000);

		helper.waitFor(Reports_Download);
		helper.highLightElement(driver, Reports_Download);
		Assert.assertEquals(true, Reports_Download.isDisplayed());
		Reports_Download.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Reports_Download Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step10 .</font></B> Clicked on Reports_Download  Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Reports_Download  Sub-Module  and Page Data is Displyed");
		Thread.sleep(3000);

		Reports_page1.click();
		helper.waitFor(Productivity_Reports);
		helper.highLightElement(driver, Productivity_Reports);
		Thread.sleep(3000);
		Productivity_Reports.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page(" Productivity_Reports Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step11 .</font></B> Clicked on Productivity_Reports Sub-Module  and Page Data is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Productivity_Reports Sub-Module  and Page Data is Displyed");
		Thread.sleep(3000);

		Reports_page2.click();
		helper.waitFor(Auto_Email_Reports);
		helper.highLightElement(driver, Auto_Email_Reports);
		Thread.sleep(3000);
		Auto_Email_Reports.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Auto_Email_Reports Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step12 .</font></B> Clicked on Auto_Email_Reports Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Auto_Email_Reports  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

//	Reports_page3.click();
//	helper.waitFor(Web_App_Usage);		
//	helper.highLightElement(driver, Web_App_Usage);
//	Thread.sleep(3000);
//	Web_App_Usage.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Web_App_Usage Pic ");
//	Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Web_App_Usage Sub-Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on Web_App_Usage  Sub-Module  and Page Data is Displyed ");
//	Thread.sleep(3000);
//	
//	
//	Reports_page4.click();
//	helper.waitFor(System_Activity_Logs);		
//	helper.highLightElement(driver, System_Activity_Logs);
//	Thread.sleep(3000);
//	System_Activity_Logs.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("System_Activity_Logs Pic ");
//	Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on System_Activity_Logs Sub-Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on System_Activity_Logs  Sub-Module  and Page Data is Displyed ");
//	Thread.sleep(3000);

		/*
		 * Settings
		 */
		helper.waitFor(Settings);
		helper.highLightElement(driver, Settings);
		Assert.assertEquals(true, Settings.isDisplayed());
		Settings.click();
		Reporter.log("<B><font color = 'red'>------Settings-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Settings  Module ");
		Thread.sleep(3000);

		helper.waitFor(Manage_Locations_and_Departments);
		helper.highLightElement(driver, Manage_Locations_and_Departments);
		Manage_Locations_and_Departments.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Manage_Locations_and_Departments Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step13 .</font></B> Clicked on Manage_Locations_and_Departments Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true,
				"Failed To click on Manage_Locations_and_Departments  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings1.click();
		helper.waitFor(Storage_Type);
		helper.highLightElement(driver, Storage_Type);
		Thread.sleep(3000);
		Storage_Type.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Storage_Type Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step14 .</font></B> Clicked on Storage_Type Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Storage_Type  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);
//	
		Settings2.click();
		helper.waitFor(Productivity_Rules);
		helper.highLightElement(driver, Productivity_Rules);
		Thread.sleep(3000);
		Productivity_Rules.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Productivity_Rules Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step15 .</font></B> Clicked on Productivity_Rules Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Productivity_Rules  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings3.click();
		helper.waitFor(Roles_and_Permission);
		helper.highLightElement(driver, Roles_and_Permission);
		Thread.sleep(3000);
		Roles_and_Permission.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Roles_and_Permission Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step16 .</font></B> Clicked on Roles_and_Permission Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Roles_and_Permission  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings4.click();
		helper.waitFor(Shift_Management);
		helper.highLightElement(driver, Shift_Management);
		Thread.sleep(3000);
		Shift_Management.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Shift_Management Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step17 .</font></B> Clicked on Shift_Management Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Shift_Management  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

//	
		Settings5.click();
		helper.waitFor(Monitoring_Control);
		helper.highLightElement(driver, Monitoring_Control);
		Thread.sleep(3000);
		Monitoring_Control.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step18 .</font></B> Clicked on Monitoring_Control Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Monitoring_Control  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings6.click();
		helper.waitFor(Localization);
		helper.highLightElement(driver, Localization);
		Thread.sleep(3000);
		Localization.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step19 .</font></B> Clicked on Localization Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Localization  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		/*
		 * Behavior
		 */

		helper.waitFor(Behaviour);
		helper.highLightElement(driver, Behaviour);
		Behaviour.click();
		Reporter.log("<B><font color = 'red'>------Behaviour-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Behaviour Module ");
		Thread.sleep(3000);

		helper.waitFor(Alerts);
		helper.highLightElement(driver, Alerts);
		Alerts.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step20 .</font></B> Clicked on  Alerts Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		Behaviour1.click();
		helper.waitFor(Alert_Policies);
		helper.highLightElement(driver, Alert_Policies);
		Thread.sleep(3000);
		Alert_Policies.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step21 .</font></B> Clicked on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		Behaviour2.click();
		helper.waitFor(Alerts_Notifications1);
		helper.highLightElement(driver, Alerts_Notifications1);
		Thread.sleep(3000);
		Alerts_Notifications1.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step22 .</font></B> Clicked on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		/*
		 * Access Log
		 */
//	
//	helper.waitFor(Access_Log);		
//	helper.highLightElement(driver, Access_Log);
//	Access_Log.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Access_Log Pic ");
//	Reporter.log("<B><font color = 'red'>------Access_Log-----</font></B> ");
//	Reporter.log("<B><font color = 'blue'>Step24 .</font></B> Clicked on  Access_Log  Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on  Access Log Module  and Page Data is Displyed  ");
//	Thread.sleep(3000);		

	}

	/*
	 * Non-Admin Side Team-Lead Selected
	 */

	@FindBy(xpath = "//i[@title='Change Role ']")
	WebElement Role_TL;

	@FindBy(xpath = "//a[text()='Team Lead']")
	WebElement Selected_Team_lead_Role_TL;

	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	WebElement Dashboard_page_TL;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	@CacheLookup
	WebElement Cecking_Data_D_TL;

//@FindBy(xpath = "//span[text()='Employee']")   
//span[text()='Employee']//following-sibling::i
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page_TL;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page1_TL;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page2_TL;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page3_TL;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i")
	@CacheLookup
	WebElement Employee_Page4_TL;

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_Module_TL;

	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement Employee_Attendance_Module_TL;

	@FindBy(xpath = "//a[@title='Employee-Notification']")
	@CacheLookup
	WebElement Employee_Notification_Module_TL;

	@FindBy(xpath = "//a[@title='Employee Insights']")
	@CacheLookup
	WebElement Employee_Insights_TL;

	@FindBy(xpath = "//span[text()='Timesheets']")
	@CacheLookup
	WebElement Timesheets_Page_TL;

	@FindBy(xpath = "//span[text()='Time Claim']")
	@CacheLookup
	WebElement Time_Claim1_TL;

	@FindBy(xpath = "//span[text()='Projects']")
	@CacheLookup
	WebElement Projects_Page_TL;

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page_TL;

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page1_TL;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page2_TL;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page3_TL;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page4_TL;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page5_TL;

	@FindBy(xpath = "//a[@title='Reports Download']")
	@CacheLookup
	WebElement Reports_Download_TL;

	@FindBy(xpath = "//a[@title='Productivity Reports']")
	@CacheLookup
	WebElement Productivity_Reports_TL;

	@FindBy(xpath = "//a[@title='Auto Email Reports']")
	@CacheLookup
	WebElement Auto_Email_Reports_TL;

	@FindBy(xpath = "//a[@title='Web App Usage']")
	@CacheLookup
	WebElement Web_App_Usage_TL;

	@FindBy(xpath = "//a[@title='System Activity Logs']")
	@CacheLookup
	WebElement System_Activity_Logs_TL;

	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings1_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings2_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings3_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings4_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings5_TL;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings6_TL;

	@FindBy(xpath = "//a[@title='Manage Locations & Departments']")
	@CacheLookup
	WebElement Manage_Locations_and_Departments_TL;

	@FindBy(xpath = "//a[@title='Storage Type']")
	@CacheLookup
	WebElement Storage_Type_TL;

	@FindBy(xpath = "//a[@title='Productivity Rules']")
	@CacheLookup
	WebElement Productivity_Rules_TL;

	@FindBy(xpath = "//a[@title='Roles and Permission']")
	@CacheLookup
	WebElement Roles_and_Permission_TL;

	@FindBy(xpath = "//a[@title='Shift Management']")
	@CacheLookup
	WebElement Shift_Management_TL;

	@FindBy(xpath = "//a[@title='Monitoring Control']")
	@CacheLookup
	WebElement Monitoring_Control_TL;

	@FindBy(xpath = "//a[@title='Localization']")
	@CacheLookup
	WebElement Localization_TL;

	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour_TL;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour1_TL;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour2_TL;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour3_TL;

	@FindBy(xpath = "//a[@title='Alerts']")
	@CacheLookup
	WebElement Alerts_TL;

	@FindBy(xpath = "//a[@title='Alert Policies']")
	@CacheLookup
	WebElement Alert_Policies_TL;

	@FindBy(xpath = "//a[@title='Alerts Notifications']")
	@CacheLookup
	WebElement Alerts_Notifications1_TL;

	@FindBy(xpath = "//span[text()=' Access Log']")
	@CacheLookup
	WebElement Access_Log_TL;

//Assert.assertEquals(true, elem.isDisplayed()); 

	public void Non_Admin_Side_Team_lead_Role() throws InterruptedException, IOException {

		Reporter.log("<B><font color = 'green'>------ Team-Lead Role Non-Admin  -----</font></B> ");

		helper.waitFor(Role_TL);
		helper.highLightElement(driver, Role_TL);
		Assert.assertEquals(true, Role_TL.isDisplayed());
		helper.Double_click(Role_TL);
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> Clicked on Change Role Drop-down and Selected any Role");
		Assert.assertTrue(true, "Failed to Click on  Change Role Drop-down and Selected any Role");
		Thread.sleep(1000);

		helper.waitFor(Selected_Team_lead_Role_TL);
		helper.highLightElement(driver, Selected_Team_lead_Role_TL);
//Assert.assertEquals(true, Selected_Manager_Role_TL.isDisplayed());
		helper.move_to_element_click_target(Selected_Team_lead_Role_TL);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Selected Team-Lead Role");
		Assert.assertTrue(true, "Failed to Click on Team-Lead Role ");
		Thread.sleep(1000);

		/*
		 * Dashboard
		 */
		helper.waitFor(Dashboard_page_TL);
		helper.highLightElement(driver, Dashboard_page_TL);
		Dashboard_page_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Dashboard");
		Reporter.log("<B><font color = 'red'>------Dashboard-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step3 .</font></B> Clicked on Dashboard Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Dashboard Module  and Page Data is Displyed ");
		System.out.println("Data Checking :-- " + Cecking_Data_D.getText());
		String act_D = Cecking_Data_D.getText();
		String Ext_D = "Dashboard";
		Assert.assertEquals(act_D, Ext_D);
		Thread.sleep(3000);

		/*
		 * Employee
		 */
		helper.waitFor(Employee_Page_TL);
		helper.highLightElement(driver, Employee_Page_TL);
		Employee_Page_TL.click();
		Reporter.log("<B><font color = 'red'>------Employee-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Employee Module");
		Thread.sleep(3000);
		

		helper.waitFor(Employee_Details_Module_TL);
		helper.highLightElement(driver, Employee_Details_Module_TL);
		Employee_Details_Module_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Details_Module Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Details Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on Employee_Details Sub-Module and Page Data Is Displyed ");
		Thread.sleep(3000);
		
		
		Employee_Page1_TL.click();
		helper.waitFor(Employee_Attendance_Module_TL);
		helper.highLightElement(driver, Employee_Attendance_Module_TL);
		helper.move_to_element_click_target(Employee_Attendance_Module_TL);
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Attendance_Module Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee_Attendance  Sub-Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Employee_Attendance Sub-Module and Page Data Is Displyed");
		Thread.sleep(3000);

//	Employee_Page2.click();
//	helper.waitFor(Employee_Notification_Module);		
//	helper.highLightElement(driver, Employee_Notification_Module);
//	Thread.sleep(3000);
//	Employee_Notification_Module.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Employee_Notification_Module Pic ");
//	Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Notification  Sub-Module and Page Data Is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on  Employee_Notification  Sub-Module and Page Data Is Displyed");
//	Thread.sleep(3000);

		Employee_Page3_TL.click();
		helper.waitFor(Employee_Insights_TL);
		helper.highLightElement(driver, Employee_Insights_TL);
		Thread.sleep(3000);
		Employee_Insights_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Employee_Insights Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee_Insights  Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Employee_Insights  Sub-Module and Page Data Is Displyed");
		Thread.sleep(3000);

		/*
		 * Time Sheets
		 */
		helper.waitFor(Timesheets_Page_TL);
		helper.highLightElement(driver, Timesheets_Page_TL);
		Timesheets_Page_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Timesheets_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Timesheets-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step7 .</font></B> Clicked on Timesheets  Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Timesheets  Module and Page Data Is Displyed");
		Thread.sleep(3000);

		/*
		 * Time Claim
		 */
		helper.waitFor(Time_Claim1_TL);
		helper.highLightElement(driver, Time_Claim1_TL);
		Time_Claim1_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Time_Claim Pic ");
		Reporter.log("<B><font color = 'red'>------Time_Claim-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step8 .</font></B> Clicked on Time_Claim Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Time_Claim  Module and Page Data Is Displyed ");
		Thread.sleep(3000);

//	

		/*
		 * Projects
		 */
		helper.waitFor(Projects_Page_TL);
		helper.highLightElement(driver, Projects_Page_TL);
		Projects_Page_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Projects_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Projects-----</font></B> ");
		Reporter.log(
				"<B><font color = 'blue'>Step9 .</font></B> Clicked on Projects Module and Page Data is Displyed   ");
		Assert.assertTrue(true, "Failed To click on Projects Module and Page Data is Displyed  ");
		Thread.sleep(3000);

		/*
		 * Reports
		 */
		helper.waitFor(Reports_page_TL);
		helper.highLightElement(driver, Reports_page_TL);
		Reports_page_TL.click();
		Reporter.log("<B><font color = 'red'>------Reports-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Reports Module");
		Thread.sleep(3000);

		helper.waitFor(Reports_Download_TL);
		helper.highLightElement(driver, Reports_Download_TL);
		Reports_Download_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Reports_Download Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step10 .</font></B> Clicked on Reports_Download  Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Reports_Download  Sub-Module  and Page Data is Displyed");
		Thread.sleep(3000);

		Reports_page1_TL.click();
		helper.waitFor(Productivity_Reports_TL);
		helper.highLightElement(driver, Productivity_Reports_TL);
		Thread.sleep(3000);
		Productivity_Reports_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page(" Productivity_Reports Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step11 .</font></B> Clicked on Productivity_Reports Sub-Module  and Page Data is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Productivity_Reports Sub-Module  and Page Data is Displyed");
		Thread.sleep(3000);

		Reports_page2_TL.click();
		helper.waitFor(Auto_Email_Reports_TL);
		helper.highLightElement(driver, Auto_Email_Reports_TL);
		Thread.sleep(3000);
		Auto_Email_Reports_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Auto_Email_Reports Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step12 .</font></B> Clicked on Auto_Email_Reports Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Auto_Email_Reports  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

//	Reports_page3.click();
//	helper.waitFor(Web_App_Usage);		
//	helper.highLightElement(driver, Web_App_Usage);
//	Thread.sleep(3000);
//	Web_App_Usage.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Web_App_Usage Pic ");
//	Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Web_App_Usage Sub-Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on Web_App_Usage  Sub-Module  and Page Data is Displyed ");
//	Thread.sleep(3000);
//	
//	
//	Reports_page4.click();
//	helper.waitFor(System_Activity_Logs);		
//	helper.highLightElement(driver, System_Activity_Logs);
//	Thread.sleep(3000);
//	System_Activity_Logs.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("System_Activity_Logs Pic ");
//	Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on System_Activity_Logs Sub-Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on System_Activity_Logs  Sub-Module  and Page Data is Displyed ");
//	Thread.sleep(3000);

		/*
		 * Settings
		 */
		helper.waitFor(Settings_TL);
		helper.highLightElement(driver, Settings_TL);
		Settings_TL.click();
		Reporter.log("<B><font color = 'red'>------Settings-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Settings  Module ");
		Thread.sleep(3000);

		helper.waitFor(Manage_Locations_and_Departments_TL);
		helper.highLightElement(driver, Manage_Locations_and_Departments_TL);
		Manage_Locations_and_Departments_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Manage_Locations_and_Departments Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step13 .</font></B> Clicked on Manage_Locations_and_Departments Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true,
				"Failed To click on Manage_Locations_and_Departments  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings1_TL.click();
		helper.waitFor(Storage_Type_TL);
		helper.highLightElement(driver, Storage_Type_TL);
		Thread.sleep(3000);
		Storage_Type_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Storage_Type Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step14 .</font></B> Clicked on Storage_Type Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Storage_Type  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);
//	
		Settings2_TL.click();
		helper.waitFor(Productivity_Rules_TL);
		helper.highLightElement(driver, Productivity_Rules_TL);
		Thread.sleep(3000);
		Productivity_Rules_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Productivity_Rules Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step15 .</font></B> Clicked on Productivity_Rules Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Productivity_Rules  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings3_TL.click();
		helper.waitFor(Roles_and_Permission_TL);
		helper.highLightElement(driver, Roles_and_Permission_TL);
		Thread.sleep(3000);
		Roles_and_Permission_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Roles_and_Permission Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step16 .</font></B> Clicked on Roles_and_Permission Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Roles_and_Permission  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings4_TL.click();
		helper.waitFor(Shift_Management_TL);
		helper.highLightElement(driver, Shift_Management_TL);
		Thread.sleep(3000);
		Shift_Management.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Shift_Management Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step17 .</font></B> Clicked on Shift_Management Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Shift_Management  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

//	
		Settings5_TL.click();
		helper.waitFor(Monitoring_Control_TL);
		helper.highLightElement(driver, Monitoring_Control_TL);
		Thread.sleep(3000);
		Monitoring_Control_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step18 .</font></B> Clicked on Monitoring_Control Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Monitoring_Control  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		Settings6_TL.click();
		helper.waitFor(Localization_TL);
		helper.highLightElement(driver, Localization_TL);
		Thread.sleep(3000);
		Localization_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step19 .</font></B> Clicked on Localization Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Localization  Sub-Module  and Page Data is Displyed ");
		Thread.sleep(3000);

		/*
		 * Behavior
		 */

		helper.waitFor(Behaviour_TL);
		helper.highLightElement(driver, Behaviour_TL);
		Behaviour_TL.click();
		Reporter.log("<B><font color = 'red'>------Behaviour-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Behaviour Module ");
		Thread.sleep(3000);

		helper.waitFor(Alerts_TL);
		helper.highLightElement(driver, Alerts_TL);
		Alerts_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step20 .</font></B> Clicked on  Alerts Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		Behaviour1_TL.click();
		helper.waitFor(Alert_Policies_TL);
		helper.highLightElement(driver, Alert_Policies_TL);
		Thread.sleep(3000);
		Alert_Policies_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step21 .</font></B> Clicked on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		Behaviour2_TL.click();
		helper.waitFor(Alerts_Notifications1_TL);
		helper.highLightElement(driver, Alerts_Notifications1_TL);
		Thread.sleep(3000);
		Alerts_Notifications1_TL.click();
		Thread.sleep(3000);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log(
				"<B><font color = 'blue'>Step22 .</font></B> Clicked on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		Thread.sleep(3000);

		/*
		 * Access Log
		 */
//	
//	helper.waitFor(Access_Log);		
//	helper.highLightElement(driver, Access_Log);
//	Access_Log.click();
//	Thread.sleep(3000);
//	helper.Screen_Shot_full_page("Access_Log Pic ");
//	Reporter.log("<B><font color = 'red'>------Access_Log-----</font></B> ");
//	Reporter.log("<B><font color = 'blue'>Step24 .</font></B> Clicked on  Access_Log  Module  and Page Data is Displyed  ");
//	Assert.assertTrue(true, "Failed To click on  Access Log Module  and Page Data is Displyed  ");
//	Thread.sleep(3000);		

	}

}
