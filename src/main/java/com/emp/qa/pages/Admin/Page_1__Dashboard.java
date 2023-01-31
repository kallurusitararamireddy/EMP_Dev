package com.emp.qa.pages.Admin;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Page_1__Dashboard extends BasePage {

	public Page_1__Dashboard(WebDriver driver) {
		super(driver);

	}

	public  Helpers helper = new Helpers();

	/* 
	 * Total Enrollments
	 */

	@FindBy(xpath = "//h3[@id='registered-employees']")
	@CacheLookup
	WebElement TotalEnrollments;

	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@CacheLookup
	WebElement TotalEnrollments_csvButton;

	@FindBy(xpath = "//button[@class='close float-right']")
	@CacheLookup
	WebElement TotalEnrollments_CloseButtton;

	@FindBy(xpath = "(//h3)[1]")
	@CacheLookup
	WebElement TotalEnrollments_displayed_number;

	@FindBy(xpath = "//*[@id='common-table_info']")
	@CacheLookup
	WebElement TotalEnrollments_After_clickbutton;

	/*
	 * CurrentlyACtive
	 */

	@FindBy(xpath = "(//h3)[2]")
	@CacheLookup
	WebElement Currently_ACtive_displayed_number;

	@FindBy(xpath = "//*[@id='online_users_datatable_info']")
	@CacheLookup
	WebElement CurrentlyACtive_After_click_button;

	@FindBy(xpath = "//h3[@id='online-employees']")
	@CacheLookup
	WebElement CurrentlyACtive;

	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@CacheLookup
	WebElement CurrentlyACtive_CsvButton;

	@FindBy(xpath = "//*[@id='Online_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement CurrentlyACtive_Close_Button;

	/*
	 * CurrentlyIdle
	 */

	@FindBy(xpath = "(//h3)[3]")
	@CacheLookup
	WebElement Currently_Idle_displayed_number;

	@FindBy(xpath = "//*[@id='emp-ofline_info']")
	@CacheLookup
	WebElement Currently_Idle_After_click_button;

	@FindBy(xpath = "//h3[@id='offline-employees']")
	@CacheLookup
	WebElement CurrentlyIdle;

//	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@FindBy(xpath = "//*[@id='Offline_count']/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement CurrentlyIdle_csv_Button;

	@FindBy(xpath = "//*[@id='Offline_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement CurrentlyIdle_close_Button;

	/*
	 * Currently_Offline
	 */
	@FindBy(xpath = "(//h3)[4]")
	@CacheLookup
	WebElement Currently_Offline_displayed_number;

	@FindBy(xpath = "//*[@id=\"emp-currently-ofline_info\"]")
	@CacheLookup
	WebElement Currently_Offline_After_click_button;

	@FindBy(xpath = "//h3[@id='currently-offline-employees']")
	@CacheLookup
	WebElement Currently_Offline;

	@FindBy(xpath = "//*[@id='Currently_Offline_count']/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Currently_offline_csv_Button;

	@FindBy(xpath = "//*[@id='Currently_Offline_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Currentlyoffline_close_Button;

	/*
	 * Absent_Users
	 */

	@FindBy(xpath = "(//h3)[5]")
	@CacheLookup
	WebElement Absent_Users_displayed_number;

	@FindBy(xpath = "//*[@id='absent_users_datatable_info']")
	@CacheLookup
	WebElement Absent_Users_After_click_button;

	@FindBy(xpath = "//h3[@id='idle-employees']")
	@CacheLookup
	WebElement Absent_Users;

	@FindBy(xpath = "//*[@id=\"Absent_count\"]/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Absent_Users_Generate_csvButton;

	@FindBy(xpath = "//*[@id=\"Absent_count\"]/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Absent_Users_closeButton;

	/*
	 * Suspended_Users 
	 */

	@FindBy(xpath = "(//h3)[6]")
	@CacheLookup
	WebElement Suspended_Users_displayed_number;

	@FindBy(xpath = "//*[@id=\"suspended_users_datatable_info\"]")
	@CacheLookup
	WebElement Suspended_Users_After_click_button;

	@FindBy(xpath = "//h3[@id='suspended-employees']")
	@CacheLookup
	WebElement Suspended_Users;

	@FindBy(xpath = "//*[@id=\"suspended_count\"]/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Suspended_Users_csvButton;

	@FindBy(xpath = "//*[@id='suspended_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Suspende_Users_closeButton;
	
	
	
	

	/*
	 * Top10ProductiveEmployees_Locations
	 */

	
	@FindBy(xpath = "//*[@id=\"productive_location\"]")

	@CacheLookup
	WebElement Top10ProductiveEmployees_Locations;

	@FindBy(xpath = "//select[@id='productive_department']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Departments;

	@FindBy(xpath = "//button[@id='todayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesToday;

	@FindBy(xpath = "//button[@id='yesterdayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesyesterday;

	@FindBy(xpath = "//button[@id='weekProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th[1])[1]")
	@CacheLookup
	WebElement header_1;
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th[2])[1]")
	@CacheLookup
	WebElement header_2;
	
	@FindBy(xpath = "//tbody[@id='productive_employees_data']/tr/td/a")
	@CacheLookup
	WebElement Data;

	@FindBy(xpath = "//tbody[@id='productive_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2;
	
	
	
	/*
	 * Top10 Non-ProductiveEmployees_Locations
	 */

	@FindBy(xpath = "//select[@id='slacking_location']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Location;

	@FindBy(xpath = "//select[@id='slacking_department']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Department;

	@FindBy(xpath = "//button[@id='todayUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Today;

	@FindBy(xpath = "//button[@id='yesterdayUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Yesterday;

	@FindBy(xpath = "//button[@id='weekUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[1]")
	@CacheLookup
	WebElement header_11;
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[2]")
	@CacheLookup
	WebElement header_21;
	
	@FindBy(xpath = "//tbody[@id='unproductive_employees_data']/tr/td/a")
	@CacheLookup
	WebElement Data1;

	@FindBy(xpath = "//tbody[@id='unproductive_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data21;
	
	
	
	/*
	 * Top10ActiveEmployees
	 */
	
	
	@FindBy(xpath = "//select[@id='active_location']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Location;

	@FindBy(xpath = "//select[@id='active_department']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Department;

	@FindBy(xpath = "//button[@id='todayActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Today;

	@FindBy(xpath = "//button[@id='yesterdayActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Yesterday;

	@FindBy(xpath = "//button[@id='weekActiveEmp']")
	@CacheLookup
	WebElement Top10ActiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[1]")
	@CacheLookup
	WebElement header_111;
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[2]")
	@CacheLookup
	WebElement header_211;
	
	@FindBy(xpath = "//tbody[@id='active_employees_data']/tr/td[1]")
	@CacheLookup
	WebElement Data11;

	@FindBy(xpath = "//tbody[@id='active_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data211;
	
	
	/*
	 * Top10 Non-ActiveEmployees
	 */
	
	
	@FindBy(xpath = "//select[@id='unactive_location']")
	@CacheLookup
	WebElement Top10unActiveEmployees_Location;

	@FindBy(xpath = "//select[@id='unactive_department']")
	@CacheLookup
	WebElement Top10unActiveEmployees_Department;

	@FindBy(xpath = "//button[@id='todayUnActiveEmp']")
	@CacheLookup
	WebElement Top10unActiveEmployees_Today;

	@FindBy(xpath = "//button[@id='yesterdayUnActiveEmp']")
	@CacheLookup
	WebElement Top10unActiveEmployees_Yesterday;

	@FindBy(xpath = "//button[@id='weekUnActiveEmp']")
	@CacheLookup
	WebElement Top10unActiveEmployees_Thisweek;
	
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[1]")
	@CacheLookup
	WebElement header_1111;
	
	@FindBy(xpath = "(//tr[@class='bg-success']/th)[2]")
	@CacheLookup
	WebElement header_2111;
	
	@FindBy(xpath = "//tbody[@id='unactive_employees_data']/tr/td[1]")
	@CacheLookup
	WebElement Data111;

	@FindBy(xpath = "//tbody[@id='unactive_employees_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2111;
	
	
	
	
	
	/*
	 * Location_Performance_Productive
	 */


	@FindBy(xpath = "//select[@id='location_option']")
	@CacheLookup
	WebElement Location_Performance_Productive;
	

	@FindBy(xpath = "//button[@id='todayPerformance']")
	@CacheLookup
	WebElement Location_Performance_Today;
	

	@FindBy(xpath = "//button[@id='yesterdayPerformance']")
	@CacheLookup
	WebElement Location_Performance_Yesterday;

	@FindBy(xpath = "//button[@id='weekPerformance']")
	@CacheLookup
	WebElement Location_Performance_Thisweek;

	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[1]")
	@CacheLookup
	WebElement header_11111;
	
	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[2]")
	@CacheLookup
	WebElement header_21111;
	
	@FindBy(xpath = "//tbody[@id='location_option_data']/tr/td[1]")
	@CacheLookup
	WebElement Data1111;

	@FindBy(xpath = "//tbody[@id='location_option_data']/tr/td[2]")
	@CacheLookup
	WebElement Data21111;
	
	
	/*
	 * Department_Performance_Productive
	 */


	@FindBy(xpath = "//select[@id='department_option']")
	@CacheLookup
	WebElement Department_Performance_Productive;

	@FindBy(xpath = "//button[@id='todayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Today;
	

	@FindBy(xpath = "//button[@id='yesterdayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Yesterday;

	@FindBy(xpath = "//button[@id='weekDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Thisweek;

	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[1]")
	@CacheLookup
	WebElement header_d1;
	
	@FindBy(xpath = "(//tr[@class='bg-success'])[3]//th[2]")
	@CacheLookup
	WebElement header_d2;
	
	@FindBy(xpath = "//tbody[@id='department_option_data']/tr/td[1]")
	@CacheLookup
	WebElement Data_d;

	@FindBy(xpath = "//tbody[@id='department_option_data']/tr/td[2]")
	@CacheLookup
	WebElement Data2_d;
	
	
	
	
	
	/*
	 * Top10Websitesusages
	 */
	

	@FindBy(xpath = "//button[@id='todayTopWebs']")
	@CacheLookup
	WebElement Top10Websitesusages_Today;

	@FindBy(xpath = "//*[@id=\"yesterdayTopWebs\"]")
	@CacheLookup
	WebElement Top10Websitesusages_Yesterday;

	@FindBy(xpath = "//button[@id='weekTopWebs']")
	@CacheLookup
	WebElement Top10Websitesusages_Thisweek;

	@FindBy(xpath = "//button[@id='viewDetialButton3']")
	@CacheLookup
	WebElement Top10Websitesusages_Viewdetails;

	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
	@CacheLookup
	WebElement Viewdetails_CloseButton;
	
	
	/*
	 * Top10_Application_Usage
	 */

	@FindBy(xpath = "//button[@id='todayTopApps']")
	@CacheLookup
	WebElement Top10_Application_Usage_Today;

	@FindBy(xpath = "//*[@id=\"yesterdayTopApps\"]")
	@CacheLookup
	WebElement Top10_Application_Usage_Yesterday;

	@FindBy(xpath = "//*[@id=\"weekTopApps\"]")
	@CacheLookup
	WebElement Top10_Application_Usage_Thisweek;

	@FindBy(xpath = "//button[@id='viewDetialButton4']")
	@CacheLookup
	WebElement Top10_Application_Usage_viewdetails;

	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
	@CacheLookup
	WebElement Top10_Application_Usage_view_details_closebutton;

	@SuppressWarnings("unused")
	public void TotalEnrollments_1() throws InterruptedException, IOException {

		helper.waitFor(TotalEnrollments);
		helper.highLightElement(driver, TotalEnrollments);
		TotalEnrollments.click();
		Reporter.log("<B><font color = 'blue'> Step1 .</font> Clicked on Total_Enrollments  option ");
		Assert.assertTrue(true, "Failed to Click on Total Total_Enrollments  option");

		Thread.sleep(4000);

		System.out.println("Total_Enrollments Register Employes in main page Displayed = "
				+ TotalEnrollments_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font> Total_Enrollments Register Employes (Displayed)=  "
				+ TotalEnrollments_displayed_number.getText());
		Thread.sleep(4000);

		helper.Scrollintoview(TotalEnrollments_After_clickbutton);
		helper.highLightElement(driver, TotalEnrollments_After_clickbutton);

		System.out.println(
				"Total Enrollments in modal page displayed  = " + TotalEnrollments_After_clickbutton.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font> Total Enrollments modal page displayed = "
				+ TotalEnrollments_After_clickbutton.getText());

		String TotalEnrollments_main_page = TotalEnrollments_displayed_number.getText(); // 51
		String TotalEnrollments_Modal_page = TotalEnrollments_After_clickbutton.getText(); // Showing 1 to 10 of
																							// 51

		String[] split_String = TotalEnrollments_Modal_page.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5];

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(TotalEnrollments_main_page, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font> actual TotalEnrollments_main_page = " + " " + TotalEnrollments_main_page
					+ " equal " + " expected TotalEnrollments_modal_page =  " + expected_data_value);
			break;
		} 

		helper.waitFor(TotalEnrollments_csvButton);
		helper.highLightElement(driver, TotalEnrollments_csvButton);
		Thread.sleep(7000);
		TotalEnrollments_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Total_Enrollments csv Button ");
		Assert.assertTrue(true, "Failed to Click on Total Total_Enrollments csv Button");
		Thread.sleep(7000);

		helper.waitFor(TotalEnrollments_CloseButtton);
		helper.highLightElement(driver, TotalEnrollments_CloseButtton);
		TotalEnrollments_CloseButtton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on TotalEnrollments Close Buttton ");
		Assert.assertTrue(true, "Failed to Click on Total TotalEnrollments  Close Buttton");
		Thread.sleep(4000);

		helper.Total_Enrollments_Excel_data();

		Thread.sleep(2000);

	}

	@SuppressWarnings("unused")
	public void CurrentlyACtive_2() throws InterruptedException, IOException {

		helper.waitFor(CurrentlyACtive);
		helper.highLightElement(driver, CurrentlyACtive);
		Thread.sleep(4000);
		CurrentlyACtive.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Currently_ACtive option");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive option ");

		Thread.sleep(4000);

		System.out.println(
				" currently Active  Employes  in main page Displayed = " + Currently_ACtive_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font> Total_Enrollments Register Employes (Displayed)=  "
				+ Currently_ACtive_displayed_number.getText());
		Thread.sleep(4000);

		helper.Scrollintoview(CurrentlyACtive_After_click_button);
		helper.highLightElement(driver, CurrentlyACtive_After_click_button); 

		System.out.println(
				"CurrentlyACtive employess in modal page displayed  = " + CurrentlyACtive_After_click_button.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font> Total Enrollments modal page displayed => "
				+ CurrentlyACtive_After_click_button.getText());

		String main_page_displayed_users_value = Currently_ACtive_displayed_number.getText();
		String Modal_page_displayed_users_value = CurrentlyACtive_After_click_button.getText();

		String[] split_String = Modal_page_displayed_users_value.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5];

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(main_page_displayed_users_value, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font> Actual Currently_ACtive users value = " + " "
					+ main_page_displayed_users_value + " equal " + " Expected Users  =  " + expected_data_value);
			break;
		}

		helper.waitFor(CurrentlyACtive_CsvButton);
		helper.highLightElement(driver, CurrentlyACtive_CsvButton);
		helper.jsCLick(CurrentlyACtive_CsvButton);
		Thread.sleep(7000);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Currently_ACtive Csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive Csv Button");

		helper.waitFor(CurrentlyACtive_Close_Button);
		helper.highLightElement(driver, CurrentlyACtive_Close_Button);
		CurrentlyACtive_Close_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Currently_ACtive Close Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive Close Button");
		Thread.sleep(4000);

		helper.Currently_Active_Xsxl_Data_Complete_Print_ALL();

		Thread.sleep(2000);
 
	}

	@SuppressWarnings("unused")
	public void CurrentlyIdle_3() throws InterruptedException, IOException {

		helper.waitFor(CurrentlyIdle);
		helper.highLightElement(driver, CurrentlyIdle);
		CurrentlyIdle.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Currently_Idle option");
		Assert.assertTrue(true, "Failed to Click on  Currently_Idle option");

		Thread.sleep(4000);

		System.out.println(
				" Currently_Idle  Employes  in main page Displayed = " + Currently_Idle_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font></B> Currently_Idle Employes in main page Displayed=  "
				+ Currently_Idle_displayed_number.getText());
		Thread.sleep(4000);
 
		helper.Scrollintoview(Currently_Idle_After_click_button);
		helper.highLightElement(driver, Currently_Idle_After_click_button);
 
		System.out.println(
				"Currently_Idle employess in modal page displayed  = " + Currently_Idle_After_click_button.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font></B> Currently_Idle modal page displayed => "
				+ Currently_Idle_After_click_button.getText());

		String main_page_displayed_users_value = Currently_Idle_displayed_number.getText();
		String Modal_page_displayed_users_value = Currently_Idle_After_click_button.getText();

		String[] split_String = Modal_page_displayed_users_value.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5];

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(main_page_displayed_users_value, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font></B> Actual Currently_Idle users value = " + " "
					+ main_page_displayed_users_value + " equal " + " Expected Users  =  " + expected_data_value);
			break;
		}

		helper.waitFor(CurrentlyIdle_csv_Button);
		helper.highLightElement(driver, CurrentlyIdle_csv_Button);
		helper.jsCLick(CurrentlyIdle_csv_Button);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B></B> Clicked on Currently_Idle csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_Idle csv Button");
		Thread.sleep(5000);

		helper.waitFor(CurrentlyIdle_close_Button);
		helper.highLightElement(driver, CurrentlyIdle_close_Button);
		CurrentlyIdle_close_Button.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on CurrentlyIdle close Button ");
		Assert.assertTrue(true, "Failed to Click on  CurrentlyIdle close Button");
		
		Thread.sleep(4000);

		helper.Currently_Idle_Xsxl_Data_Complete_Print_ALL();

		Thread.sleep(2000);
	}

	@SuppressWarnings("unused")
	public void Currently_Offline_4() throws InterruptedException, IOException {

		helper.waitFor(Currently_Offline);
		helper.highLightElement(driver, Currently_Offline);
		Currently_Offline.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Currently_Offline option");
		Assert.assertTrue(true, "Failed to Click on  Currently_Offline option");

		Thread.sleep(4000);

		System.out.println(" Currently_Offline Employes  in main page Displayed = "
				+ Currently_Offline_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font></B> Currently_Offline Employes in main page Displayed=  "
				+ Currently_Offline_displayed_number.getText());
		Thread.sleep(4000);

		helper.Scrollintoview(Currently_Offline_After_click_button);
		helper.highLightElement(driver, Currently_Offline_After_click_button);

		System.out.println("Currently_Offline employess in modal page displayed  = "
				+ Currently_Offline_After_click_button.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font></B> Currently_Offline modal page displayed => "
				+ Currently_Offline_After_click_button.getText());

		String main_page_displayed_users_value = Currently_Offline_displayed_number.getText();
		String Modal_page_displayed_users_value = Currently_Offline_After_click_button.getText();

		String[] split_String = Modal_page_displayed_users_value.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5]; 

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(main_page_displayed_users_value, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font></B> Actual Currently_Offline users value = " + " "
					+ main_page_displayed_users_value + " equal " + " Expected Users  =  " + expected_data_value);
			break;
		}

		helper.waitFor(Currently_offline_csv_Button);
		helper.highLightElement(driver, Currently_offline_csv_Button);
		Currently_offline_csv_Button.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B></B> Clicked on Currently_offline csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_offline csv_Button");
		Thread.sleep(5000);

		helper.waitFor(Currentlyoffline_close_Button);
		helper.highLightElement(driver, Currentlyoffline_close_Button);
		Thread.sleep(5000);
		Currentlyoffline_close_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B></B> Clicked on Currently_offline close Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_offline close Button");
		Thread.sleep(5000);
		Thread.sleep(4000);

		helper.Currently_offline_Xsxl_Data_Complete_Print_ALL();

		Thread.sleep(2000);
	}

	@SuppressWarnings("unused")
	public void Absent_Users_5() throws InterruptedException, IOException {

		helper.waitFor(Absent_Users);
		helper.highLightElement(driver, Absent_Users);
		Absent_Users.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B></B> Clicked on Absent_Users option");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users  option ");

		Thread.sleep(4000);

		System.out
				.println(" Absent_Users Employes  in main page Displayed = " + Absent_Users_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font></B> Absent_Users Employes in main page Displayed=  "
				+ Absent_Users_displayed_number.getText());
		Thread.sleep(4000);

		helper.Scrollintoview(Absent_Users_After_click_button);
		helper.highLightElement(driver, Absent_Users_After_click_button);

		System.out.println(
				"Absent_Users employess in modal page displayed  = " + Absent_Users_After_click_button.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font></B> Absent_Users modal page displayed => "
				+ Absent_Users_After_click_button.getText());

		String main_page_displayed_users_value = Absent_Users_displayed_number.getText();
		String Modal_page_displayed_users_value = Absent_Users_After_click_button.getText();

		String[] split_String = Modal_page_displayed_users_value.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5];

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(main_page_displayed_users_value, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font></B> Actual Absent_Users users value = " + " "
					+ main_page_displayed_users_value + " equal " + " Expected Users  =  " + expected_data_value);
			break;
		}

		helper.waitFor(Absent_Users_Generate_csvButton);
		helper.highLightElement(driver, Absent_Users_Generate_csvButton);
		Absent_Users_Generate_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Absent_Users_Generate csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users_Generate_csvButton");
		Thread.sleep(5000);

		helper.waitFor(Absent_Users_closeButton);
		helper.highLightElement(driver, Absent_Users_closeButton);
		Thread.sleep(5000);
		Absent_Users_closeButton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Absent_Users close Button ");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users close Button");
		Thread.sleep(4000);

		helper.Absent_Users_Xsxl_Data_Complete_Print_ALL();

		Thread.sleep(2000);
	}

	@SuppressWarnings("unused")
	public void Suspended_Users_6() throws InterruptedException, IOException {

		helper.waitFor(Suspended_Users);
		helper.highLightElement(driver, Suspended_Users);
		Suspended_Users.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Suspended_Users option");
		Assert.assertTrue(true, "Failed to Click on  Suspended_Users option ");

		Thread.sleep(4000);

		System.out.println(
				" Suspended_Users Employes  in main page Displayed = " + Suspended_Users_displayed_number.getText());
		Reporter.log("<B><font color = 'blue'> Step2 .</font></B> Suspended_Users Employes in main page Displayed=  "
				+ Suspended_Users_displayed_number.getText());
		Thread.sleep(4000);

		helper.Scrollintoview(Suspended_Users_After_click_button);
		helper.highLightElement(driver, Suspended_Users_After_click_button);

		System.out.println(
				"Suspended_Users employess in modal page displayed  = " + Suspended_Users_After_click_button.getText());
		Reporter.log("<B><font color = 'blue'> Step3 .</font></B> Suspended_Users modal page displayed => "
				+ Suspended_Users_After_click_button.getText());

		String main_page_displayed_users_value = Suspended_Users_displayed_number.getText();
		String Modal_page_displayed_users_value = Suspended_Users_After_click_button.getText();

		String[] split_String = Modal_page_displayed_users_value.split(" ");
		for (int i = 0; i < split_String.length; i++) {
			System.out.println("Length of String " + split_String.length);
			String expected_data_value = split_String[i + 5];

			System.out.println("exp data: " + expected_data_value);
			Assert.assertEquals(main_page_displayed_users_value, expected_data_value);
			Reporter.log("<B><font color = 'blue'> Step4 .</font></B> Actual Suspended_Users users value = " + " "
					+ main_page_displayed_users_value + " equal " + " Expected Users  =  " + expected_data_value);
			break;
		}

		helper.waitFor(Suspended_Users_csvButton); 
		helper.highLightElement(driver, Suspended_Users_csvButton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"suspended_count\"]/div/div/div[3]/button[1]"))).click();

		Suspended_Users_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Suspended_Users csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Suspended_Users csv Button");
		Thread.sleep(5000);

		helper.waitFor(Suspende_Users_closeButton);
		helper.highLightElement(driver, Suspende_Users_closeButton);
		Thread.sleep(5000);
		Suspende_Users_closeButton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Suspende_Users close Button ");
		Assert.assertTrue(true, "Failed to Click on  Suspende_Users close Button");
		
		Thread.sleep(4000);

		helper.Suspended_Users_Xsxl_Data_Complete_Print_ALL();
 
		Thread.sleep(2000);
	}

	public void Top10ProductiveEmployees_Locations_7() throws InterruptedException, IOException {

		helper.waitFor(Top10ProductiveEmployees_Locations);
		helper.highLightElement(driver, Top10ProductiveEmployees_Locations);
		helper.Scrollintoview(Top10ProductiveEmployees_Locations);
		helper.selectDropDownValue(Top10ProductiveEmployees_Locations, "value", "0");
		Top10ProductiveEmployees_Locations.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on  Top_10_Productive_Employees_Locations Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Productive_Employees_Locations Drop-down and Selected Any Location");

		helper.waitFor(Top10ProductiveEmployees_Departments);
		helper.highLightElement(driver, Top10ProductiveEmployees_Departments);
		helper.Scrollintoview(Top10ProductiveEmployees_Departments);
		helper.selectDropDownValue(Top10ProductiveEmployees_Departments, "value", "null");
		Top10ProductiveEmployees_Departments.click();
		Reporter.log( 
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top10ProductiveEmployees_Departments Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployees_Departments Drop-down and Selected Any Department");
 
		helper.waitFor(Top10ProductiveEmployeesToday);
		helper.highLightElement(driver, Top10ProductiveEmployeesToday);
		helper.Scrollintoview(Top10ProductiveEmployeesToday);
		Top10ProductiveEmployeesToday.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top10ProductiveEmployeesToday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployeesToday");
		Thread.sleep(2000);
		 
		 
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>    ");
		Reporter.log("<B><font color = 'green'> Today Top-10-Productive-Employees  </font></B>    ");
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11.getText() +"--"+  header_21.getText());
		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td/a"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{  
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);	
		Reporter.log("<B><font color = 'blue'>    </font></B>    " + s3);
		}
		
		
		
		
		
		

		helper.waitFor(Top10ProductiveEmployeesyesterday); 
		helper.highLightElement(driver, Top10ProductiveEmployeesyesterday);
		helper.Scrollintoview(Top10ProductiveEmployeesyesterday);
		Top10ProductiveEmployeesyesterday.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Top_10_Productive_Employees-yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployeesyesterday");
		Thread.sleep(2000);
		
		
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>    ");
		Reporter.log("<B><font color = 'green'> yesterday Top-10-Productive-Employees </font></B>    ");
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11.getText() +"--"+  header_21.getText());
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td/a"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td[2]"));

		String s1 = null;
		String s2 = null; 
		for(WebElement d1:l )
		{  
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);	
		Reporter.log("<B><font color = 'blue'>    </font></B>    " + s3);
		}
		
		
		
		
		
		

		helper.waitFor(Top10ProductiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10ProductiveEmployees_Thisweek);
		helper.Scrollintoview(Top10ProductiveEmployees_Thisweek);
		Top10ProductiveEmployees_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Top10ProductiveEmployees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployees_Thisweek");
		Thread.sleep(2000);
		
		
		
 
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>    ");
		Reporter.log("<B><font color = 'green'> This Week Top-10-Productive-Employees  </font></B>    ");
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11.getText() +"--"+  header_21.getText());
		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td/a"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='productive_employees_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{  
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);	
		Reporter.log("<B><font color = 'blue'>    </font></B>    " + s3);
		}
		

	}

	public void Top10NonProductiveEmployees_Location_8() throws InterruptedException, IOException {

		helper.waitFor(Top10NonProductiveEmployees_Location);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Location);
		helper.Scrollintoview(Top10NonProductiveEmployees_Location);
		helper.selectDropDownValue(Top10NonProductiveEmployees_Location, "value", "0");
		Top10NonProductiveEmployees_Location.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Top-10-Non_Productive_Employees Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Non_Productive_Employees Location Drop-down and Selected Any Location");
		helper.waitFor(Top10NonProductiveEmployees_Department);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Department);
		helper.Scrollintoview(Top10NonProductiveEmployees_Department);
		Thread.sleep(1000); 
		helper.selectDropDownValue(Top10NonProductiveEmployees_Department, "value", "null");
		Top10NonProductiveEmployees_Department.click(); 
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top-10-Non_Productive_Employees Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Non_Productive_Employees Department Drop-down and Selected Any Department");
 
		helper.waitFor(Top10NonProductiveEmployees_Today);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Today);
		helper.Scrollintoview(Top10NonProductiveEmployees_Today);
		Top10NonProductiveEmployees_Today.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top10NonProductiveEmployees_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top10NonProductiveEmployees_Today");
		Thread.sleep(2000);
		
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'>  Today  unproductive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11.getText() +"--"+  header_21.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td/a"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td[2]"));

		String s1 = null;
		String s2 = null;
		for(WebElement d1:l )
		{
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		
		
		
		Thread.sleep(2000);

		helper.waitFor(Top10NonProductiveEmployees_Yesterday);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Yesterday);
		helper.Scrollintoview(Top10NonProductiveEmployees_Yesterday);
		Top10NonProductiveEmployees_Yesterday.click();
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Top10NonProductiveEmployees_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10NonProductiveEmployees_Yesterday");
		Thread.sleep(2000);
		
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'> Yesterday  unproductive Employees Data </font></B>   " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_11.getText() +"--"+  header_21.getText());

		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td/a"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		Thread.sleep(2000);
 
		helper.waitFor(Top10NonProductiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Thisweek); 
		helper.Scrollintoview(Top10NonProductiveEmployees_Thisweek);
		Top10NonProductiveEmployees_Thisweek.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Top10NonProductiveEmployees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top10NonProductiveEmployees_Thisweek");
		Thread.sleep(2000);
		
		
		System.out.println(header_11.getText() + " --  " + header_21.getText());
		Reporter.log("<B><font color = 'blue'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'>  This Week  unproductive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_11.getText() +"--"+  header_21.getText());

		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td/a"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='unproductive_employees_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{ 
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}

	}

	public void Location_Performance_Productive_9() throws InterruptedException, IOException {

		/* 
		 *  Checking Today
		 */
		helper.waitFor(Location_Performance_Today);
		helper.highLightElement(driver, Location_Performance_Today);
		helper.Scrollintoview(Location_Performance_Today);
		Location_Performance_Today.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Location_Performance_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Today");
		Thread.sleep(2000);
		 
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "pro");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String s1 = null; 
		String s2 = null;
		for(WebElement d1:l )
		{
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "non");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "neu");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
		
 
		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		/*
		 *  Checking Yesterday
		 */
		

		helper.waitFor(Location_Performance_Yesterday);
		helper.highLightElement(driver, Location_Performance_Yesterday);
		helper.Scrollintoview(Location_Performance_Yesterday);
		Location_Performance_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location_Performance_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Yesterday");
		Thread.sleep(2000);
		
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "pro");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> un=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> un2=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String uns1 = null; 
		String uns2 = null;
		for(WebElement d1:un )
		{
			uns2=d1.getText(); 
		for(WebElement d2:un2 )
		{
			uns1=d2.getText(); 
		}
		String s3=uns2+"--" +uns1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "non");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
		
 
		List<WebElement> lp1=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> lp2=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String sp11 = null;
		String sp21 = null;
		for(WebElement d1:lp1 )
		{
			sp21=d1.getText(); 
		for(WebElement d2:lp2 )
		{
			sp11=d2.getText(); 
		}
		String s3=sp21+"--" +sp11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "neu");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> lp11=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> lp211=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String sp111 = null;
		String sp211 = null;
		for(WebElement d1:lp11 )
		{
			 sp211=d1.getText(); 
		for(WebElement d2:lp211 )
		{
			sp111=d2.getText(); 
		}
		String s3=sp211+"--" +sp111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		/*
		 *  Checking This week
		 */

		helper.waitFor(Location_Performance_Thisweek);
		helper.highLightElement(driver, Location_Performance_Thisweek);
		helper.Scrollintoview(Location_Performance_Thisweek);
		Location_Performance_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Location_Performance_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Thisweek");
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "pro");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> un1=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> un21=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String uns11 = null; 
		String uns21 = null;
		for(WebElement d1:un1 )
		{
			uns21=d1.getText(); 
		for(WebElement d2:un21 )
		{
			uns11=d2.getText(); 
		}
		String s3=uns21+"--" +uns11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "non");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> lp111=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> lp21=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String sp1111 = null;
		String sp2111 = null;
		for(WebElement d1:lp111 )
		{
			sp2111=d1.getText(); 
		for(WebElement d2:lp21 )
		{
			sp1111=d2.getText(); 
		}
		String s3=sp2111+"--" +sp1111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "neu");
		Location_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_11111.getText() + " --  " + header_21111.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_11111.getText() +"--"+  header_21111.getText());
 
		List<WebElement> lp1111=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[1]"));
		List<WebElement> lp2111=driver.findElements(By.xpath("//tbody[@id='location_option_data']/tr/td[2]"));

		String sp11111 = null;
		String sp21111 = null;
		for(WebElement d1:lp1111 )
		{
			 sp21111=d1.getText(); 
		for(WebElement d2:lp2111 )
		{
			sp11111=d2.getText(); 
		}
		String s3=sp21111+"--" +sp11111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		


	}

	public void Department_Performance_Productive_10() throws InterruptedException, IOException {

		/*
		 *  Checking Today
		 */
		helper.waitFor(Department_Performance_Today);
		helper.highLightElement(driver, Department_Performance_Today);
		helper.Scrollintoview(Department_Performance_Today);
		Department_Performance_Today.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Department_Performance_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Today");
		Thread.sleep(2000);
		 
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String s1 = null; 
		String s2 = null;
		for(WebElement d1:l )
		{
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
		
 
		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		/*
		 *  Checking Yesterday
		 */
		

		helper.waitFor(Department_Performance_Yesterday);
		helper.highLightElement(driver, Department_Performance_Yesterday);
		helper.Scrollintoview(Department_Performance_Yesterday);
		Department_Performance_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Department_Performance_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Yesterday");
		Thread.sleep(2000);
		
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> un=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> un2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String uns1 = null; 
		String uns2 = null;
		for(WebElement d1:un )
		{
			uns2=d1.getText(); 
		for(WebElement d2:un2 )
		{
			uns1=d2.getText(); 
		}
		String s3=uns2+"--" +uns1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
		
 
		List<WebElement> lp1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp2=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp11 = null;
		String sp21 = null;
		for(WebElement d1:lp1 )
		{
			sp21=d1.getText(); 
		for(WebElement d2:lp2 )
		{
			sp11=d2.getText(); 
		}
		String s3=sp21+"--" +sp11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> lp11=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp211=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp111 = null;
		String sp211 = null;
		for(WebElement d1:lp11 )
		{
			 sp211=d1.getText(); 
		for(WebElement d2:lp211 )
		{
			sp111=d2.getText(); 
		}
		String s3=sp211+"--" +sp111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		/*
		 *  Checking This week
		 */

		helper.waitFor(Department_Performance_Thisweek);
		helper.highLightElement(driver, Department_Performance_Thisweek);
		helper.Scrollintoview(Department_Performance_Thisweek);
		Department_Performance_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department_Performance_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Thisweek");
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'green'> (a).Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> un1=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> un21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String uns11 = null; 
		String uns21 = null;
		for(WebElement d1:un1 )
		{
			uns21=d1.getText(); 
		for(WebElement d2:un21 )
		{
			uns11=d2.getText(); 
		}
		String s3=uns21+"--" +uns11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "non");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'red'> (b).Un-Productive Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> lp111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp21=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp1111 = null;
		String sp2111 = null;
		for(WebElement d1:lp111 )
		{
			sp2111=d1.getText(); 
		for(WebElement d2:lp21 )
		{
			sp1111=d2.getText(); 
		}
		String s3=sp2111+"--" +sp1111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		}
		Thread.sleep(2000);
		
		
		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "neu");
		Department_Performance_Productive.click();
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");
		Thread.sleep(2000);
		System.out.println(header_d1.getText() + " --  " + header_d2.getText());
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );
		Reporter.log("<B><font color = 'orange'> (c).Neutral Department_Performance Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_d1.getText() +"--"+  header_d2.getText());
 
		List<WebElement> lp1111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[1]"));
		List<WebElement> lp2111=driver.findElements(By.xpath("//tbody[@id='department_option_data']/tr/td[2]"));

		String sp11111 = null;
		String sp21111 = null;
		for(WebElement d1:lp1111 )
		{
			 sp21111=d1.getText(); 
		for(WebElement d2:lp2111 )
		{
			sp11111=d2.getText(); 
		}
		String s3=sp21111+"--" +sp11111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		Reporter.log("<B><font color = 'blue'>                    </font></B>  " );

		}
		Thread.sleep(2000);
	}

	public void Top10Websitesusages_Today_11() throws InterruptedException, IOException {

		helper.waitFor(Top10Websitesusages_Today);
		helper.highLightElement(driver, Top10Websitesusages_Today);
		helper.Scrollintoview(Top10Websitesusages_Today);
		Top10Websitesusages_Today.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Top10Websitesusages_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top10Websitesusages_Today");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Yesterday);
		helper.highLightElement(driver, Top10Websitesusages_Yesterday);
		helper.Scrollintoview(Top10Websitesusages_Yesterday);
		Top10Websitesusages_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Top10Websitesusages_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10Websitesusages_Yesterday");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Thisweek);
		helper.highLightElement(driver, Top10Websitesusages_Thisweek);
		helper.Scrollintoview(Top10Websitesusages_Thisweek);
		Top10Websitesusages_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top10Websitesusages_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top10Websitesusages_Thisweek");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Viewdetails);
		helper.highLightElement(driver, Top10Websitesusages_Viewdetails);
		helper.Scrollintoview(Top10Websitesusages_Viewdetails);
		helper.jsCLick(Top10Websitesusages_Viewdetails);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Top10Websitesusages_Viewdetails Button");
		Assert.assertTrue(true, "Failed to Click on  Top10Websitesusages_Viewdetails");
		Thread.sleep(2000);

		helper.waitFor(Viewdetails_CloseButton);
		helper.highLightElement(driver, Viewdetails_CloseButton);
		helper.Scrollintoview(Viewdetails_CloseButton);
		helper.jsCLick(Viewdetails_CloseButton);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Viewdetails Close_Button ");
		Assert.assertTrue(true, "Failed to Click on  Viewdetails_CloseButton");
	}

	public void Top10_Application_Usage_Today_12() throws InterruptedException, IOException {

		helper.waitFor(Top10_Application_Usage_Today);
		helper.highLightElement(driver, Top10_Application_Usage_Today);
		helper.Scrollintoview(Top10_Application_Usage_Today);
		helper.jsCLick(Top10_Application_Usage_Today);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Top10_Application_Usage_Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Today");

		helper.waitFor(Top10_Application_Usage_Yesterday);
		helper.highLightElement(driver, Top10_Application_Usage_Yesterday);
		helper.Scrollintoview(Top10_Application_Usage_Yesterday);
		helper.move_to_element_click(Top10Websitesusages_Yesterday);
//		Top10_Application_Usage_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Top10_Application_Usage_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Yesterday");

		helper.waitFor(Top10_Application_Usage_Thisweek);
		helper.highLightElement(driver, Top10_Application_Usage_Thisweek);
		helper.Scrollintoview(Top10_Application_Usage_Thisweek);
		helper.move_to_element_click(Top10_Application_Usage_Thisweek);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top10_Application_Usage_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Thisweek");

		helper.waitFor(Top10_Application_Usage_viewdetails);
		helper.highLightElement(driver, Top10_Application_Usage_viewdetails);
		helper.Scrollintoview(Top10_Application_Usage_viewdetails);
		helper.jsCLick(Top10_Application_Usage_viewdetails);
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Top10_Application_Usage_viewdetails Button");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_viewdetails");
		Thread.sleep(2000);

		helper.waitFor(Top10_Application_Usage_view_details_closebutton);
		helper.highLightElement(driver, Top10_Application_Usage_view_details_closebutton);
		helper.Scrollintoview(Top10_Application_Usage_view_details_closebutton);
		helper.jsCLick(Top10_Application_Usage_view_details_closebutton);
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Top10_Application_Usage_view_details close_button ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_view_details close_button");
		Thread.sleep(2000);

	}
	
	
	public void Top_10_Active_Employee_13() throws InterruptedException, IOException {
		 
		helper.waitFor(Top10ActiveEmployees_Location);
		helper.highLightElement(driver, Top10ActiveEmployees_Location);
		helper.Scrollintoview(Top10ActiveEmployees_Location);
		helper.selectDropDownValue(Top10ActiveEmployees_Location, "value", "0");
		Top10ActiveEmployees_Location.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Top-10-Active-Employees-Employees_Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active-Employees-Employees_Location  Drop-down and Selected Any Location ");
		helper.waitFor(Top10ActiveEmployees_Department);
		helper.highLightElement(driver, Top10ActiveEmployees_Department);
		helper.Scrollintoview(Top10ActiveEmployees_Department);
		Thread.sleep(1000); 
		helper.selectDropDownValue(Top10ActiveEmployees_Department, "value", "null");
		Top10ActiveEmployees_Department.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top-10-Active Employees_Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Top10NonProductiveEmployees_Department");
 
		helper.waitFor(Top10ActiveEmployees_Today);
		helper.highLightElement(driver, Top10ActiveEmployees_Today);
		helper.Scrollintoview(Top10ActiveEmployees_Today);
		Top10ActiveEmployees_Today.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top-10-Active Employees Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Today");
		Thread.sleep(2000); 
		
		System.out.println(header_111.getText() + " --  " + header_211.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'>  Today  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_111.getText() +"--"+  header_211.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

		String s1 = null;
		String s2 = null;
		for(WebElement d1:l )
		{
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		
		
		
		Thread.sleep(2000);

		helper.waitFor(Top10ActiveEmployees_Yesterday);
		helper.highLightElement(driver, Top10ActiveEmployees_Yesterday);
		helper.Scrollintoview(Top10ActiveEmployees_Yesterday);
		Top10ActiveEmployees_Yesterday.click();
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Top-10-Active Employees_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Yesterday");
		Thread.sleep(2000);
		
		System.out.println(header_111.getText() + " --  " + header_211.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'> Yesterday  Active  Employees Data </font></B>   " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_111.getText() +"--"+  header_211.getText());

		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		Thread.sleep(2000);
 
		helper.waitFor(Top10ActiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10ActiveEmployees_Thisweek); 
		helper.Scrollintoview(Top10ActiveEmployees_Thisweek);
		Top10ActiveEmployees_Thisweek.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Top-10-Active Employees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active Employees_Thisweek");
		Thread.sleep(2000);
		
		
		System.out.println(header_111.getText() + " --  " + header_211.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'green'>  This Week  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_111.getText() +"--"+  header_211.getText());

		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='active_employees_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{ 
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		

	}
	
	

	public void Top_10_Non__Active_Employee_14() throws InterruptedException, IOException {

		helper.waitFor(Top10unActiveEmployees_Location);
		helper.highLightElement(driver, Top10unActiveEmployees_Location);
		helper.Scrollintoview(Top10unActiveEmployees_Location);
		helper.selectDropDownValue(Top10unActiveEmployees_Location, "value", "0");
		Top10unActiveEmployees_Location.click();
		Reporter.log( 
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Top-10-un_Active-Employees-Employees_Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Top-10-Active-Employees-un_Employees_Location  Drop-down and Selected Any Location ");
		helper.waitFor(Top10unActiveEmployees_Department);
		helper.highLightElement(driver, Top10unActiveEmployees_Department);
		helper.Scrollintoview(Top10unActiveEmployees_Department);
		Thread.sleep(1000);  
		helper.selectDropDownValue(Top10unActiveEmployees_Department, "value", "null");
		Top10unActiveEmployees_Department.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Top-10-un_Active Employees_Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Top-10-un_Active Employees_Department Drop-down and Selected Any Department");
 
		helper.waitFor(Top10unActiveEmployees_Today);
		helper.highLightElement(driver, Top10unActiveEmployees_Today);
		helper.Scrollintoview(Top10unActiveEmployees_Today);
		Top10unActiveEmployees_Today.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Top-10-un_Active Employees Today Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-un_Active Employees Today Button");
		Thread.sleep(2000);
		 
		System.out.println(header_1111.getText() + " --  " + header_2111.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'>  Today  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + header_1111.getText() +"--"+  header_2111.getText());
 
		List<WebElement> l=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[1]"));
		List<WebElement> l2=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[2]"));

		String s1 = null;
		String s2 = null;
		for(WebElement d1:l )
		{
			 s2=d1.getText(); 
		for(WebElement d2:l2 )
		{
			s1=d2.getText(); 
		}
		String s3=s2+"--" +s1;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		
		
		
		Thread.sleep(2000);

		helper.waitFor(Top10unActiveEmployees_Yesterday);
		helper.highLightElement(driver, Top10unActiveEmployees_Yesterday);
		helper.Scrollintoview(Top10unActiveEmployees_Yesterday);
		Top10unActiveEmployees_Yesterday.click();
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Top-10-un_Active Employees_Yesterday Button");
		Assert.assertTrue(true, "Failed to Click on  Top-10-un_Active Employees_Yesterday Button");
		Thread.sleep(2000);
		
		System.out.println(header_1111.getText() + " --  " + header_2111.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'> Yesterday  Active  Employees Data </font></B>   " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_1111.getText() +"--"+  header_2111.getText());

		List<WebElement> l1=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[1]"));
		List<WebElement> l21=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[2]"));

		String s11 = null;
		String s21 = null;
		for(WebElement d1:l1 )
		{
			 s21=d1.getText(); 
		for(WebElement d2:l21 )
		{
			s11=d2.getText(); 
		}
		String s3=s21+"--" +s11;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);
		}
		
		Thread.sleep(2000);
 
		helper.waitFor(Top10unActiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10unActiveEmployees_Thisweek); 
		helper.Scrollintoview(Top10unActiveEmployees_Thisweek);
		Top10unActiveEmployees_Thisweek.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Top-10-un_Active Employees_Thisweek Button");
		Assert.assertTrue(true, "Failed to Click on Top-10-un_Active Employees_Thisweek Button");
		Thread.sleep(2000);
		
		
		System.out.println(header_1.getText() + " --  " + header_2.getText());
		Reporter.log("<B><font color = 'green'>  </font></B>  " );
		Reporter.log("<B><font color = 'red'>  This Week  Active Employees Data </font></B>  " );
		Reporter.log("<B><font color = 'blue'> </font></B>    " + header_1.getText() +"--"+  header_2.getText());

		List<WebElement> l11=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[1]"));
		List<WebElement> l211=driver.findElements(By.xpath("//tbody[@id='unactive_employees_data']/tr/td[2]"));

		String s111 = null;
		String s211 = null;
		for(WebElement d1:l11 )
		{ 
			 s211=d1.getText(); 
		for(WebElement d2:l211 )
		{
			s111=d2.getText(); 
		}
		String s3=s211+"--" +s111;
		System.out.println(s3);
		Reporter.log("<B><font color = 'blue'>  </font></B>    " + s3);

		} 
		

	}


}
