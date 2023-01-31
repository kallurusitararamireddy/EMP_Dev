package com.emp.qa.pages.Admin;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;

public class Page_3_Time_Sheets extends BasePage {

	public Page_3_Time_Sheets(WebDriver driver) {
		super(driver);

	}

	public Helpers helper = new Helpers();

	
	/*
	 * Absent_Option
	 */
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets;

	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employee;

	@FindBy(xpath = "//div[@id='reportranges']")
	@CacheLookup
	WebElement selectdateranges;

	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;

	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days;

	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV;

	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall;

	@FindBy(xpath = "//*[@id='Absent_employeeCheckbox']")
	@CacheLookup
	WebElement Absent_option;

	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;

	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF;

	public void Absent_Option_To_Time_sheets_Page() throws InterruptedException, IOException, AWTException, CsvException {

		
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		
		
		helper.waitFor(Location_TM);
		helper.highLightElement(driver, Location_TM);
		helper.selectDropDownValue(Location_TM, "visibletext", " See All");
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked  on Location  Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click  on Location  Drop-down and  Selected Any Location");

		helper.waitFor(Department_TM);
		helper.highLightElement(driver, Department_TM);
		helper.selectDropDownValue(Department_TM, "value", "0");
		Reporter.log(
				"<B><font color = 'blue'>Step3.</font></B> Clicked  on Department Drop-down and  Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department drop-down & Selected Any  Department");

		helper.waitFor(Employee_TM);
		helper.highLightElement(driver, Employee_TM);
		helper.move_to_element_click_target(Employee_TM);
		helper.robot_Zero_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee dropdown and  Selected Any  Employee ");

		helper.waitFor(selectdateranges_TM);
		helper.highLightElement(driver, selectdateranges_TM);
		selectdateranges_TM.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calender Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on  select-date-Ranges and Selected Day's");

		helper.waitFor(Last30days_TM);
		helper.highLightElement(driver, Last30days_TM);
		Last30days_TM.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Selected  on Last-30-days ");
		Assert.assertTrue(true, "Failed to Select on  Last-30-days");

		helper.waitFor(CSV_TM);
		helper.highLightElement(driver, CSV_TM);
		CSV_TM.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");

		helper.waitFor(Absent_option);
		helper.highLightElement(driver, Absent_option);
		helper.Scrollintoview(Absent_option);
		Absent_option.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Time-in-total check-Box option");
		Assert.assertTrue(true, "Failed to Click on Time-in-total Check-Box option ");

		helper.waitFor(Submit_TM);
		helper.highLightElement(driver, Submit_TM);
		helper.Scrollintoview(Submit_TM);
		Thread.sleep(3000);
		helper.jsCLick(Submit_TM);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(5000);

		helper.Time_Sheets_CSV_Dot_files();

		Thread.sleep(2000);

	}
	
	/*
	 * Time_In_Minutes
	 */
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets_TM;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location_TM;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department_TM;
	
	@FindBy(xpath = "//*[@id='select2-employee-container']")
	@CacheLookup
	WebElement Employee_TM;
	
	@FindBy(xpath = "//div[@id='reportranges']")
	@CacheLookup
	WebElement selectdateranges_TM;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_TM;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days_TM;
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV_TM;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall_TM;
	
	@FindBy(xpath = "//*[@id='mytimesheetdataDownload']/li[2]/input")
	@CacheLookup
	WebElement TimeInMinutes_TM;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit_TM;
	
	
	public void  Time_In_Minutes() throws InterruptedException, IOException, AWTException, CsvException{
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		
		helper.waitFor(Location_TM);
		helper.highLightElement(driver, Location_TM);
		helper.selectDropDownValue(Location_TM, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  loction Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  loction Drop-down and Selected Any Location");
		
 
		helper.waitFor(Department_TM);
		helper.highLightElement(driver, Department_TM);
		helper.selectDropDownValue(Department_TM, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down & Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Department Drop-down & Selected Any Department");
		
		helper.waitFor(Employee_TM);
		helper.highLightElement(driver, Employee_TM);
		helper.move_to_element_click_target(Employee_TM);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down &  Selected Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-down &  Selected Employee");
		
		helper.waitFor(selectdateranges_TM);
		helper.highLightElement(driver, selectdateranges_TM);
		selectdateranges_TM.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Select Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Select Day's");
		
		helper.waitFor(Last30days_TM);
		helper.highLightElement(driver, Last30days_TM);
		Last30days_TM.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last_30_days");
		Assert.assertTrue(true, "Failed to Click on  Last_30_days");
		
		
		
		helper.waitFor(CSV_TM);
		helper.highLightElement(driver, CSV_TM);
		CSV_TM.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(TimeInMinutes_TM);
		helper.highLightElement(driver, TimeInMinutes_TM);
		helper.Scrollintoview(TimeInMinutes_TM);
		TimeInMinutes_TM.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Time_In_Minutes  check_Box");
		Assert.assertTrue(true, "Failed to Click on Time_In_Minutes Chek_Box");
		
		
		helper.waitFor(Submit_TM);
		helper.highLightElement(driver, Submit_TM);
		helper.Scrollintoview(Submit_TM);
		Thread.sleep(3000);
		helper.jsCLick(Submit_TM);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to Click on Submit Button");
		Thread.sleep(4000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	/*
	 * Assigned_List option
	 */
	
	
	

	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets_AL;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location_AL;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department_AL;
	
	@FindBy(xpath = "//*[@id='select2-employee-container']")
	@CacheLookup
	WebElement Employee_AL;
	
	@FindBy(xpath = "//div[@id='reportranges']/i")
	@CacheLookup
	WebElement selectdateranges_AL;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_AL;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days_AL;
	
	
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV_AL;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall_AL;
	
	@FindBy(xpath = "//*[@id='Manager_List_Id']/input")
	@CacheLookup
	WebElement AssignedList_AL;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit_AL;
	
	public  void Assigned_List() throws InterruptedException, IOException, AWTException, CsvException {
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		helper.waitFor(Location_AL);
		helper.highLightElement(driver, Location_AL);
		helper.selectDropDownValue(Location_AL, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down and Selected Any Location");
		  

		helper.waitFor(Department_AL);
		helper.highLightElement(driver, Department_AL);
		helper.selectDropDownValue(Department_AL, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department dropdown & Select Any Department");
		Assert.assertTrue(true, "Failed to Click on Department dropdown & Select Any Department");
		
		helper.waitFor(Employee_AL);
		helper.highLightElement(driver, Employee_AL);
		helper.move_to_element_click_target(Employee_AL);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee dropdown & Select Any  Employee");
		Assert.assertTrue(true, "Failed to Click on Employee dropdown & Select Any  Employee ");
		
		helper.waitFor(selectdateranges_AL);
		helper.highLightElement(driver, selectdateranges_AL);
		selectdateranges_AL.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on  Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last30days_AL);
		helper.highLightElement(driver, Last30days_AL);
		Last30days_AL.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Selected   Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");
		
		
		
		helper.waitFor(CSV_AL);
		helper.highLightElement(driver, CSV_AL);
		CSV_AL.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(AssignedList_AL);
		helper.highLightElement(driver, AssignedList_AL);
		helper.Scrollintoview(AssignedList_AL);
		AssignedList_AL.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Selected  Assigned-List  (check-Box click)");
		Assert.assertTrue(true, "Failed to Select  Assigned-List  (check-Box click)");
		
		helper.waitFor(Submit_AL);
		helper.highLightElement(driver, Submit_AL);
		helper.Scrollintoview(Submit_AL);
		Thread.sleep(3000);
		helper.jsCLick(Submit_AL);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit-Button");
		Assert.assertTrue(true, "Failed to Click on Submit-Button");
		Thread.sleep(3000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(3000);

		
	}
	
	/*
	 * TotalOptionToTimesheets
	 */

	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets_TT;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location_TT;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department_TT;
	
	@FindBy(xpath = "//*[@id='select2-employee-container']")
	@CacheLookup
	WebElement Employee_TT;
	
	@FindBy(xpath = "//div[@id='reportranges']")
	@CacheLookup
	WebElement selectdateranges_TT;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_TT;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days_TT;
	
	
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV_TT;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall_TT;
	
	@FindBy(xpath = "//*[@id='Average_employeeCheckbox']")
	@CacheLookup
	WebElement Timeintotal;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit_TT;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF_TT;
	
	public void  TotalOptionToTimesheets() throws InterruptedException, IOException, AWTException, CsvException{
		
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		
		helper.waitFor(Location_TT);
		helper.highLightElement(driver, Location_TT);
		helper.selectDropDownValue(Location_TT, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Loction Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on  Loction Drop-down and Selected Any Location");
		 

		helper.waitFor(Department_TT);
		helper.highLightElement(driver, Department_TT);
		helper.selectDropDownValue(Department_TT, "value", "0");
		Department_TT.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down & Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down & Selected Any Department");
		
		helper.waitFor(Employee_TT);
		helper.highLightElement(driver, Employee_TT);
		helper.move_to_element_click_target(Employee_TT);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down & Selected Any  Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-down & Selected Any  Employee");
		
		helper.waitFor(selectdateranges_TT);
		helper.highLightElement(driver, selectdateranges_TT);
		selectdateranges_TT.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last30days_TT);
		helper.highLightElement(driver, Last30days_TT);
		Last30days_TT.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last_30_days");
		Assert.assertTrue(true, "Failed to Click on  Last_30_days");
		
		
		helper.waitFor(CSV_TT);
		helper.highLightElement(driver, CSV_TT);
		CSV_TT.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(Timeintotal);
		helper.highLightElement(driver, Timeintotal);
		helper.Scrollintoview(Timeintotal);
		Timeintotal.click();
		Thread.sleep(2000);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Time_in_total check-Box");
		Assert.assertTrue(true, "Failed to Click on Time_in_total Chek-Box");
	
		helper.waitFor(Submit_TT);
		helper.highLightElement(driver, Submit_TT);
		helper.Scrollintoview(Submit_TT);
		Thread.sleep(3000);
		helper.jsCLick(Submit_TT);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to Click on Submit Button");
		Thread.sleep(6000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(6000);

		
}
	
	
	/*
	 * Split-sheet
	 */
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets_SS;
	
	@FindBy(xpath = "//*[@id='locationdept']")
	@CacheLookup
	WebElement Location_SS;
	
	@FindBy(xpath = "//*[@id='getDepartments']")
	@CacheLookup
	WebElement Department_SS;
	
	@FindBy(xpath = "//*[@id='employee']")
	@CacheLookup
	WebElement Employee_SS;
	
	@FindBy(xpath = "//*[@id='reportranges']")
	@CacheLookup
	WebElement selectdateranges_SS;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_SS;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days_SS;
	
	
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV_SS;
	
	
	@FindBy(xpath = "//*[@id='Split_Excel_ListCheckbox']")
	@CacheLookup
	WebElement Splitsheet_SS;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit_SS;
	
	
	
	
	public void SplitSheetPage()throws InterruptedException, IOException, AWTException, CsvException{
		
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		helper.waitFor(Location_SS);
		helper.highLightElement(driver, Location_SS);
		helper.selectDropDownValue(Location_SS, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down and Selected Any Location");
		 

		helper.waitFor(Department_SS);
		helper.highLightElement(driver, Department_SS);
		helper.selectDropDownValue(Department_SS, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Department");
		
		helper.waitFor(Employee_SS);
		helper.highLightElement(driver, Employee_SS);
		helper.move_to_element_click_target(Employee_SS);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Employee");
		Assert.assertTrue(true, "Failed to Click on  Employee and Selected Employee ");
		
		helper.waitFor(selectdateranges_SS);
		helper.highLightElement(driver, selectdateranges_SS);
		selectdateranges_SS.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Slected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Slected Day's");
		
		helper.waitFor(Last30days_SS);
		helper.highLightElement(driver, Last30days_SS);
		Last30days_SS.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Click on  Last-30-days");
		
		
		 
		helper.waitFor(CSV_SS);
		helper.highLightElement(driver, CSV_SS);
		CSV_SS.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(Splitsheet_SS);
		helper.highLightElement(driver, Splitsheet_SS);
		helper.Scrollintoview(Splitsheet_SS);
		Splitsheet_SS.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Split-sheet checkBox option ");
		Assert.assertTrue(true, "Failed to Click on Splitsheet ChekBox option ");
		Thread.sleep(2000);
		
		helper.waitFor(Submit_SS);
		helper.highLightElement(driver, Submit_SS);
		helper.Scrollintoview(Submit_SS);
		Thread.sleep(3000);
		helper.jsCLick(Submit_SS);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to Click on Submit Button");
		Thread.sleep(4000);
		
//		helper.Time_Sheets_CSV_Dot_files();
		helper.Attendance_History_sheet_Excel_data();
		
		Thread.sleep(4000);
		
	}
	
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets_T;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location_T;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department_T;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employee_T;
	
	@FindBy(css = "div#reportranges > .fa.fa-calendar")
	@CacheLookup
	WebElement selectdateranges_T;
	
	@FindBy(css = ".daterangepicker.ltr.show-ranges  ul > li:nth-of-type(4)")
	@CacheLookup
	WebElement Last30days_T;
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSVDownload_T;
	
	@FindBy(xpath = "(//a[@title='View Full Details'][contains(.,'GLB-110-PC - GLB-110')])[1]")
	@CacheLookup
	WebElement Name_T;
	
	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity_T;
	
	
	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets_Btn_T;
	
	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots_T;
	
	@FindBy(xpath = "//a[@id='ScreenRecordingTab']")
	@CacheLookup
	WebElement ScreenRecorder_T;
	
	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory_T;
	
	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory_T;
	
	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes_T;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/a[8]")
	@CacheLookup
	WebElement Analysis_T;
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV_T;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall_T;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit_T;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF_T;
	
	
	

	
	public void Time_Sheets_Page_CSV_File()throws InterruptedException, IOException, CsvException, AWTException{
		
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		
		helper.waitFor(Location_T);
		helper.highLightElement(driver, Location_T);
		helper.selectDropDownValue(Location_T, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Loction Drop-down and Selcted Any Location");
		Assert.assertTrue(true, "Failed to Click on  Loction Drop-down and Selcted Any Location");
		 

		helper.waitFor(Department_T);
		helper.highLightElement(driver, Department_T);
		helper.selectDropDownValue(Department_T, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Department");
		
		helper.waitFor(Employee_T);
		helper.highLightElement(driver, Employee_T);
		helper.move_to_element_click_target(Employee_T);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed to Select Employee and  Selected Any  Employee ");
		
		helper.waitFor(selectdateranges_T);
		helper.highLightElement(driver, selectdateranges_T);
		selectdateranges_T.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last30days_T);
		helper.highLightElement(driver, Last30days_T);
		Last30days_T.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to select Last-30-days");
		
		 
		
		helper.waitFor(CSV_T);
		helper.highLightElement(driver, CSV_T);
		CSV_T.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(selectall_T);
		helper.highLightElement(driver, selectall_T);
		selectall_T.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Select-All check Box");
		Assert.assertTrue(true, "Failed to Click on select-All Check Box");
		
		helper.waitFor(Submit_T);
		helper.highLightElement(driver, Submit_T);
		helper.Scrollintoview(Submit_T);
		Thread.sleep(3000);
		helper.jsCLick(Submit_T);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to Click on Submit Button");
		Thread.sleep(5000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(5000);
	
		
		
	}
public void Time_Sheets_Page_PDF_File()throws InterruptedException, IOException, CsvException, AWTException{
		
	Reporter.log(
			"<B><font color = 'blue'>Step1 .</font></B> Clicked  on Time-Sheets  Module ");
		
	helper.waitFor(Location_T);
	helper.highLightElement(driver, Location_T);
	helper.selectDropDownValue(Location_T, "visibletext", " See All");
	Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  loction Drop-down and Selected Any Location");
	Assert.assertTrue(true, "Failed to Click on  loction Drop-down and Selected Any Location");
	 

	helper.waitFor(Department_T);
	helper.highLightElement(driver, Department_T);
	helper.selectDropDownValue(Department_T, "value", "0");
	Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any  Department");
	Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any  Department");
	
	helper.waitFor(Employee_T);
	helper.highLightElement(driver, Employee_T);
	helper.move_to_element_click_target(Employee_T);
	helper.robot_Zero_option_selectClick();
	Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any Employee");
	Assert.assertTrue(true, "Failed to Click on Employee Drop-down and  Selected Any Employee ");
	
	helper.waitFor(selectdateranges_T);
	helper.highLightElement(driver, selectdateranges_T);
	selectdateranges_T.click();
	Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selected Day's");
	Assert.assertTrue(true, "Failed to Click on  Calendar Drop-down and Selected Day's");
	
	helper.waitFor(Last30days_T);
	helper.highLightElement(driver, Last30days_T);
	Last30days_T.click();
	Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
	Assert.assertTrue(true, "Failed to Select Last-30-days");

		/*
		 * pdf
		 */
		

		helper.waitFor( PDF_T);
		helper.highLightElement(driver,  PDF_T);
		helper.Scrollintoview(PDF_T);
		helper.jsCLick(PDF_T);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on PDF Button");
		Assert.assertTrue(true, "Failed to Click on PDF Button");
		
		helper.waitFor(selectall_T);
		helper.highLightElement(driver, selectall_T);
		helper.jsCLick(selectall_T);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on select-All Check Box ");
		Assert.assertTrue(true, "Failed to Click on select-All Check Box");
		 
		helper.waitFor(Submit_T);
		helper.Scrollintoview(Submit_T);
		helper.highLightElement(driver, Submit_T);
		helper.jsCLick(Submit_T);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to Click on Submit Button");
		Thread.sleep(5000);
		
		helper.Time_sheet_PDF_Reader();
		
		Thread.sleep(3000);
}
	
	
	
	
}
