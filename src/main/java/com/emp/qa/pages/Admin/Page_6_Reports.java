package com.emp.qa.pages.Admin;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;

public class Page_6_Reports extends BasePage {

	public Page_6_Reports(WebDriver driver) {
		super(driver);

	}
	
	/*
	 * 
	 */
	
	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Productivity Reports')]")
	@CacheLookup
	WebElement ProductivityReports;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[3]/div[1]/div/div/div/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement AllLocation;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[3]/div[1]/div/div/div/div[2]/div/span/span[1]/span")
	@CacheLookup
	WebElement SelectDepartment;

	@FindBy(xpath = "//*[@id='select2-empoption-container']")
	@CacheLookup
	WebElement SelectEmployee;

	@FindBy(xpath = "//option[contains(text(),'Select Employee')]")
	@CacheLookup
	WebElement Allemployee;

	@FindBy(xpath = "//input[@id='checkAll']")
	@CacheLookup
	WebElement Allcheckbox;

	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
	@CacheLookup
	WebElement DateRanges;

	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	WebElement Last30days_p;

	@FindBy(xpath = "//button[contains(text(),'Export PDF')]")
	@CacheLookup
	WebElement ExportPDF;

	@FindBy(xpath = "//button[contains(text(),'Export CSV')]")
	@CacheLookup
	WebElement ExportCSV;

	public void Productivity_Reports_pdf() throws InterruptedException, AWTException, IOException, CsvException {

		helper.waitFor(ProductivityReports);
		helper.highLightElement(driver, ProductivityReports);
		ProductivityReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Productivity-Reports Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected  Productivity-Reports Sub-Module");

		helper.waitFor(AllLocation); 
		helper.highLightElement(driver, AllLocation); 
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and Selected Any  Location ");
		Assert.assertTrue(true, "Failed To  Click on Location Drop-down and Selected Any  Location  ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any  Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any  Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any  Employee ");
		Assert.assertTrue(true, "Failed to Clicked on Employee Drop-down and  Selected Any  Employee ");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Pop-Up and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar and Selected Day's");

		helper.waitFor(Last30days_p);
		helper.highLightElement(driver, Last30days_p);
		helper.jsCLick(Last30days_p);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		helper.waitFor(ExportPDF);
		helper.highLightElement(driver, ExportPDF);
		helper.Scrollintoview(ExportPDF);
		helper.jsCLick(ExportPDF);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Export-PDF Button ");
		Assert.assertTrue(true, "Failed to Click on  Export-PDF Button ");
		Thread.sleep(2000);
		
		helper.Productivity_Reports_pdf();
		Thread.sleep(3000);

	}

	public void Productivity_Reports_CSV() throws InterruptedException, AWTException, IOException, CsvException {

		helper.waitFor(ProductivityReports);
		helper.highLightElement(driver, ProductivityReports);
		ProductivityReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Productivity-Reports Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected  Productivity-Reports Sub-Module");

		helper.waitFor(AllLocation);
		helper.highLightElement(driver, AllLocation);
		helper.move_to_element_click_target(AllLocation);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and  Selected Any Location ");
		Assert.assertTrue(true, "Failed To  Click on Location Drop-down and  Selected Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.move_to_element_click_target(SelectDepartment);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any  Department");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		helper.move_to_element_click_target(SelectEmployee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any Employee ");
		Assert.assertTrue(true, "Failed to Clicked on Employee Drop-down and  Selected Employee");

		helper.waitFor(DateRanges);
		helper.highLightElement(driver, DateRanges);
		DateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Pop-Upand Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar and Selected Day's");

		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		helper.jsCLick(Last30days);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");

		

		helper.waitFor(ExportCSV);
		helper.highLightElement(driver, ExportCSV);
		helper.jsScrollintoview(ExportCSV);
		helper.jsCLick(ExportCSV);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Export-CSV Button ");
		Assert.assertTrue(true, "Failed to Click on  Export-CSV Button");
		Thread.sleep(5000);
		
		helper.Productivity_Reports_CSV_Dot_files();
		Thread.sleep(3000);

	}

	@SuppressWarnings("unused")
	private Select select(WebElement s) {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * 
	 */
	
	
	@FindBy(xpath = "//a[@title='Auto Email Reports']")
	@CacheLookup
	WebElement AutoemailReports;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Reports')]")
	@CacheLookup
	WebElement SelectNewReport;
	
	@FindBy(xpath = "//input[@id='usr']")
	@CacheLookup
	WebElement ReportsTitle;
	
	@FindBy(xpath = "//input[@id='daily']")
	@CacheLookup
	WebElement Frequency_Daily_RadioButton;
	
	@FindBy(xpath = "//input[@id='emailReq']")
	@CacheLookup
	WebElement Recipients_Email;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement I_want_to_recieve_email_checkBox;
	

	@FindBy(xpath = "//input[@id='productivity']")
	@CacheLookup
	WebElement Productivity_checkBox;
	
	@FindBy(xpath = "//input[@id='pdf_id']")
	@CacheLookup
	WebElement PDF_checkBox;
	
	@FindBy(xpath = "//input[@id='csv_id']")
	@CacheLookup
	WebElement CSV_CheckBox;
	
	@FindBy(xpath = "//input[@id='org']")
	@CacheLookup
	WebElement organzation_chekBox;
	
	@FindBy(xpath = "//input[@id='emp8925']")
	@CacheLookup
	WebElement Employee_checkBox;
	
	@FindBy(xpath = "//button[@id='testmail']")
	@CacheLookup
	WebElement Send_Testmail;
	
	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	@CacheLookup
	WebElement OK_Button;
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement OK;
	
	public void Auto_Email_Reports_Page()throws InterruptedException{
		
		
		helper.waitFor(AutoemailReports);
		helper.highLightElement(driver, AutoemailReports);
		AutoemailReports.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Autoemail-Reports Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected  Autoemail-Reports Sub-Module");
		 
		helper.waitFor(ShowEntries); 
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Show-Entries Drop-Down and Selected Any Value ");
		Assert.assertTrue(true, "Failed to Click on Show-Entries Drop-Down Selected Any Value");
		
		helper.waitFor(SelectNewReport);
		helper.highLightElement(driver,SelectNewReport);
		SelectNewReport.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Select-New-Report Button");
		Assert.assertTrue(true, "Failed to Click on Select-New-Report Button ");
		
		  
		Random r=new Random();
		int num=r.nextInt(100);
		String Act_name="AutomationCode";
		String Exp_name=Act_name+num;
		
		helper.waitFor(ReportsTitle);
		helper.highLightElement(driver,ReportsTitle);
		ReportsTitle.sendKeys(Exp_name);
		ReportsTitle.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B>  Clecked on Report Name Text Field and  Entered Report Name ");
		Assert.assertTrue(true, "Failed to Cleck on Reports Name Text Field and  Entered Report Nam");
		
		helper.waitFor(Frequency_Daily_RadioButton);
		helper.highLightElement(driver, Frequency_Daily_RadioButton);
		Frequency_Daily_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on  Frequency_Daily_Radio Button");
		Assert.assertTrue(true, "Failed to Click on  Frequency_Daily_Radio Button");
		
		helper.waitFor(Recipients_Email);
		helper.highLightElement(driver,Recipients_Email);
		Recipients_Email.sendKeys("abhishekfourtf@mail.com");
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on E-mail Text filed and  Entered E-mail ID ");
		Assert.assertTrue(true, "Failed to Click on E-mail Text filed and  Entered E-mail ID");
		
		
		helper.waitFor( I_want_to_recieve_email_checkBox);
		helper.highLightElement(driver, I_want_to_recieve_email_checkBox);
		I_want_to_recieve_email_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on  I_want_to_recieve_email Option checkBox");
		Assert.assertTrue(true, "Failed to Click on  I_want_to_recieve_email Option checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(Productivity_checkBox);
		helper.highLightElement(driver,Productivity_checkBox);
		Productivity_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Productivity Option checkBox");
		Assert.assertTrue(true, "Failed to Click on  Productivity Option checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(PDF_checkBox);
		helper.highLightElement(driver, PDF_checkBox);
		PDF_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on  PDF Option check-Box");
		Assert.assertTrue(true, "Failed to Click on  PDF Option checkBox");
		Thread.sleep(2000);
		
		helper.waitFor(CSV_CheckBox);
		helper.highLightElement(driver, CSV_CheckBox);
		CSV_CheckBox.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on  CSV Option Check-Box");
		Assert.assertTrue(true, "Failed to Click on  CSV Option Check-Box");
		Thread.sleep(2000);
		
		helper.waitFor(organzation_chekBox);
		helper.highLightElement(driver,organzation_chekBox);
		organzation_chekBox.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on organzation Option chek-Box");
		Assert.assertTrue(true, "Failed to Click on  organzation Option chek-Box");
		Thread.sleep(2000);
		
	
		
		helper.waitFor(Send_Testmail);
		helper.highLightElement(driver, Send_Testmail);
		Send_Testmail.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Send_Test-mail Button ");
		Assert.assertTrue(true, "Failed to Click on  Send_Test-mail Button ");
		Thread.sleep(2000);
		
		helper.waitFor(OK_Button);
		helper.highLightElement(driver, OK_Button);
		helper.Scrollintoview(OK_Button);
		OK_Button.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on OK_Button");
		Assert.assertTrue(true, "Failed to Click on OK_Button");
		Thread.sleep(2000);
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.Scrollintoview(Save_Button);
		helper.jsCLick(Save_Button);
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Clicked on  Save_Button");
		Assert.assertTrue(true, "Failed to Click on  Save_Button");
		Thread.sleep(2000);
		
		
		helper.waitFor(OK);
		helper.highLightElement(driver, OK);
		OK.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on  OK Conformation Button  ");
		Assert.assertTrue(true, "Failed to Click on  OK Conformation Button ");
		Thread.sleep(2000);
}
	
	/*
	 * 
	 */
	@FindBy(xpath = "//a[contains(text(),'Web App Usage')]")
	@CacheLookup
	WebElement WebAPPusage;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department;
	
	
	@FindBy(xpath = "//span[@id='select2-EmployeeData-container']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//option[contains(text(),'See All Employee')]")
	@CacheLookup
	WebElement All_Employee;
	
	
	@FindBy(xpath = "//div[@id='reportrange']//i[1]")
	@CacheLookup
	WebElement reportrange;
	
	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	WebElement Last30days;
	
	
	@FindBy(xpath = "//button[@id='BothButton']")
	@CacheLookup
	WebElement Both_Button;
	
	@FindBy(xpath = "//button[@id='WebButton']")
	@CacheLookup
	WebElement Website_Button;
	

	@FindBy(xpath = "//button[@id='AppButton']")
	@CacheLookup
	WebElement Aplication_Button;
	
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExceltButton;
	
	@FindBy(xpath = "//button[@id='PDFButton']")
	@CacheLookup
	WebElement PDFButton;
	

	@FindBy(xpath = "//select[@name='EmployeeReportTable_length']")
	@CacheLookup
	WebElement Show_entries_Dropdown;
	

	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement web_and_app_Export_Excel;
	
	

	@FindBy(xpath = "//button[@id='exportReport']")
	@CacheLookup
	WebElement full_details_Export_Excel;
	
	
	public void Website_and_Application_Page() throws InterruptedException, AWTException, IOException{
		
		
		helper.waitFor(WebAPPusage);
		helper.highLightElement(driver, WebAPPusage);
		WebAPPusage.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected  Web-APP-usage Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Reports Module and Selected  Web-APP-usage Sub-Module");
 
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "See All Location");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and  Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and Selected Any  Location ");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "visibletext", "See All Department");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selected Any Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
	    helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and Selected Any Employee ");
		Assert.assertTrue(true, "Failed to  Click on Employee Drop-down and Selected Any Employee");
	
		helper.waitFor(reportrange);
		helper.highLightElement(driver, reportrange);
		helper.jsCLick(reportrange);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's");
		
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Click on  Last-30-days");
		Thread.sleep(2000);
		
		helper.waitFor(Both_Button);
		helper.highLightElement(driver, Both_Button);
		Both_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Both_Button");
		Assert.assertTrue(true, "Failed to Click on  Both_Button");
		Thread.sleep(2000); 
		
		helper.waitFor(web_and_app_Export_Excel);
		helper.highLightElement(driver, web_and_app_Export_Excel);
		helper.Scrollintoview(web_and_app_Export_Excel);
		web_and_app_Export_Excel.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Excel Button ");
		Assert.assertTrue(true, "Failed to Click on Excel Button");
		Thread.sleep(3000);
		
        helper.Both_web_app__button();
		
		Thread.sleep(4000);
		
		System.out.print("                                      ");
		
		helper.waitFor(full_details_Export_Excel);
		helper.highLightElement(driver, full_details_Export_Excel);
		helper.Scrollintoview(full_details_Export_Excel);
		full_details_Export_Excel.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on full_details_Export Button ");
		Assert.assertTrue(true, "Failed to Click on full_details_Export Button");
		Thread.sleep(3000);
		
		 helper.Cumulative_Report_Sheet_button();
			
	     Thread.sleep(6000);
		
				
}
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'System Activity Logs')]")
	@CacheLookup
	WebElement SystemActivityLogs_s;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location_s;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department_s;
	
	
	@FindBy(xpath = "//select[@id='EmployeeData']")
	@CacheLookup
	WebElement Employee_s;
	
	
	@FindBy(xpath = "//option[contains(text(),'All Employees')]")
	@CacheLookup
	WebElement Select_All_Employee_s;
	
	
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement DateRange_s;
	
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last_30Days_s;
	
	@FindBy(xpath = "//button[@id='ExcelButton']")
	@CacheLookup
	WebElement Excel_Button_s;
	
	@FindBy(xpath = "//i[contains(text(),'PDF')]")
	@CacheLookup
	WebElement Pdf_Button_s;
	
	@FindBy(xpath = "//li[contains(text(),'This Month')]")
	@CacheLookup
	WebElement This_month_s;
	
	@FindBy(xpath = "//button[@id='ExcelButton']")
	@CacheLookup
	WebElement Excel_Button_1_s;
	
	@FindBy(xpath = "//i[contains(text(),'PDF')]")
	@CacheLookup
	WebElement Pdf_Button_1_s;
	
	
	
	
	
	public void System_Activity_Logs_Page()throws InterruptedException, AWTException{
	
		helper.waitFor(SystemActivityLogs_s);		
		helper.highLightElement(driver, SystemActivityLogs_s);
		SystemActivityLogs_s.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected System-Activity-Logs Button ");
		Assert.assertTrue(true, "Failed To Click  on Reports Module and Selected System-Activity-Logs Button");
		
		helper.waitFor(Location_s);
		helper.highLightElement(driver, Location_s);
		helper.move_to_element_click_target(Location_s);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and  Selected Location ");
		Assert.assertTrue(true, "Failed To Click  Location Drop-down and Selected Location");
		
		helper.waitFor(Department_s);
		helper.highLightElement(driver, Department_s); 
		helper.move_to_element_click_target(Department_s);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department Drop-down and Selected Department ");
		Assert.assertTrue(true, "Failed To Click on Department Drop-down and Selected Department");
		
		helper.waitFor(Employee_s);
		helper.highLightElement(driver, Employee_s);
//		helper.explicitlyWait(Employee);
		helper.selectDropDownValue(Employee_s, "visibletext", "See All Employee");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed To Click on Employee Drop-down and Selected Any Employee");
		
		
		helper.waitFor(DateRange_s);
		helper.highLightElement(driver, DateRange_s);
		DateRange_s.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed To Click  on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last_30Days_s);
		helper.highLightElement(driver,Last_30Days_s);
		Last_30Days_s.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Last-30-Days");
		Assert.assertTrue(true, "Failed To Click on  Last-30-Days");
		Thread.sleep(3000);
		
		 
		helper.waitFor(Excel_Button_1_s);
		helper.highLightElement(driver, Excel_Button_1_s);
		Excel_Button_1_s.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Excel-Button");
		Assert.assertTrue(true, "Failed To Click on  Excel-Button");
		Thread.sleep(5000);
	
		
		helper.waitFor(Pdf_Button_1_s);
		helper.highLightElement(driver, Pdf_Button_1_s);
		Pdf_Button_1_s.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Pdf-Button");
		Assert.assertTrue(true, "Failed To  Click on  Pdf-Button");
		Thread.sleep(5000);
	
		
	
	
		
}
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Web App Usage')]")
	@CacheLookup
	WebElement WebAPPusage_UA;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location_UA;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department_UA;
	
	
	@FindBy(xpath = "//span[@role='presentation']")
	@CacheLookup
	WebElement Employee_UA;
	
	@FindBy(xpath = "//option[contains(text(),'See All Employee')]")
	@CacheLookup
	WebElement All_Employee_UA;
	
	
	@FindBy(xpath = "//div[@id='reportrange']//i[1]")
	@CacheLookup
	WebElement reportrange_UA;
	
	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	WebElement Last30days_UA;
	
	
	@FindBy(xpath = "//button[@id='BothButton']")
	@CacheLookup
	WebElement Both_Button_UA;
	
	@FindBy(xpath = "//button[@id='WebButton']")
	@CacheLookup
	WebElement Website_Button_UA;
	

	@FindBy(xpath = "//button[@id='AppButton']")
	@CacheLookup
	WebElement Aplication_Button_UA;
	
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExceltButton_UA;
	
	@FindBy(xpath = "//button[@id='PDFButton']")
	@CacheLookup
	WebElement PDFButton_UA;
	

	@FindBy(xpath = "//select[@name='EmployeeReportTable_length']")
	@CacheLookup
	WebElement Show_entries_Dropdown_UA;
	

	@FindBy(xpath = "//button[@id='exportReport']")
	@CacheLookup
	WebElement Export_Excel_UA;
	
	
	public void Use_Of_Application_Page()throws InterruptedException, AWTException{
		
		
		helper.waitFor(WebAPPusage_UA);
		helper.highLightElement(driver, WebAPPusage_UA);
		WebAPPusage_UA.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selcted Web_APP_usage Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Reports Module and Selcted Web_APP_usage Sub-Module ");

		helper.waitFor(Location_UA);
		helper.highLightElement(driver, Location_UA);
		helper.move_to_element_click_target(Location_UA);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on Location Drop-down and Selected Any Location ");
		
		helper.waitFor(Department_UA);
		helper.highLightElement(driver, Department_UA);
		helper.move_to_element_click_target(Department_UA);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and  Selected Any Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and  Selected Any Department ");
		
		helper.waitFor(Employee_UA);
		helper.highLightElement(driver, Employee_UA);
//		helper.selectDropDownValue(Employee, "visibletext", "See All Employee");
		Employee_UA.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any Employee");
		Assert.assertTrue(true, "Failed to  Click on Employee Drop-down and  Selected Any Employee");
		

		
		
		helper.waitFor(reportrange_UA);
		helper.highLightElement(driver, reportrange_UA);
		helper.jsCLick(reportrange_UA);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selcted Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selcted Day's");
		
		helper.waitFor(Last30days_UA);
		helper.highLightElement(driver, Last30days_UA);
		Last30days_UA.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last30days");
		Assert.assertTrue(true, "Failed to Select Last30days");
        Thread.sleep(2000);
		
		
		helper.waitFor(Aplication_Button_UA);
		helper.highLightElement(driver, Aplication_Button_UA);
		Aplication_Button_UA.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Aplication_Button");
		Assert.assertTrue(true, "Failed to Click on  Aplication_Button");
        Thread.sleep(2000);

		helper.waitFor(ExceltButton_UA);
		helper.highLightElement(driver, ExceltButton_UA);
		helper.Scrollintoview(ExceltButton_UA);
		ExceltButton_UA.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Excel Button ");
		Assert.assertTrue(true, "Failed to Click on Excel Button");
		Thread.sleep(5000);
		
				

		
}
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Web App Usage')]")
	@CacheLookup
	WebElement WebAPPusage_UW;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location_UW;
	
	
	@FindBy(xpath = "//*[@id='LocationData']/option[1]")
	@CacheLookup
	WebElement Location_All;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department_UW;
	
	
	@FindBy(xpath = "//span[@role='presentation']")
	@CacheLookup
	WebElement Employee_UW;
	
	@FindBy(xpath = "//option[contains(text(),'See All Employee')]")
	@CacheLookup
	WebElement All_Employee_UW;
	
	
	@FindBy(xpath = "//div[@id='reportrange']//i[1]")
	@CacheLookup
	WebElement reportrange_UW;
	
	@FindBy(xpath = "//li[text()='Last 30 Days']")
	@CacheLookup
	WebElement Last30days_UW;
	
	
	@FindBy(xpath = "//button[@id='BothButton']")
	@CacheLookup
	WebElement Both_Button_UW;
	
	@FindBy(xpath = "//button[@id='WebButton']")
	@CacheLookup
	WebElement Website_Button_UW;
	

	@FindBy(xpath = "//button[@id='AppButton']")
	@CacheLookup
	WebElement Aplication_Button_UW;
	
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExceltButton_UW;
	
	@FindBy(xpath = "//button[@id='PDFButton']")
	@CacheLookup
	WebElement PDFButton_UW;
	

	@FindBy(xpath = "//select[@name='EmployeeReportTable_length']")
	@CacheLookup
	WebElement Show_entries_Dropdown_UW;
	

	@FindBy(xpath = "//button[@id='exportReport']")
	@CacheLookup
	WebElement Export_Excel_UW;
	
	
	public void Use_Of_The_WebApplication_Page()throws InterruptedException, AWTException, IOException, CsvException{
		
		
		helper.waitFor(WebAPPusage_UW);
		helper.highLightElement(driver, WebAPPusage_UW);
		WebAPPusage_UW.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selcted Web-APP-usage Sub-Module ");
		Assert.assertTrue(true, "Failed To  Clicked on Reports Module and Selcted Web-APP-usage Sub-Module");

		helper.waitFor(Location_UW);
		helper.highLightElement(driver, Location_UW);
		helper.move_to_element_click_target(Location_UW);
//		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Location Drop-down and  Selected LOcation ");
		Assert.assertTrue(true, "Failed To Click on Location DropDown and Selected Any Location  ");
		
		helper.waitFor(Department_UW);
		helper.highLightElement(driver, Department_UW);
		helper.move_to_element_click_target(Department_UW);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and Selected Any  Department ");
		Assert.assertTrue(true, "Failed to Click on  Department Drop-down and  Selected Any  Department");
		
		helper.waitFor(Employee_UW);
		helper.highLightElement(driver, Employee_UW);
//		helper.selectDropDownValue(Employee, "visibletext", "See All Employee");
		Employee_UW.click();
//		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down and  Selected Any  Employee");
		Assert.assertTrue(true, "Failed Click  Employee Drop-down & Selected Any Employee");
		
		
		helper.waitFor(reportrange_UW);
		helper.highLightElement(driver, reportrange_UW);
		helper.jsCLick(reportrange_UW);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Calendar Drop-down and Selcted Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selcted Day's");
		
		helper.waitFor(Last30days_UW);
		helper.highLightElement(driver, Last30days_UW);
		Last30days_UW.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Click on  Last-30-days");
		
		helper.waitFor(Both_Button_UW);
		helper.highLightElement(driver, Both_Button_UW);
		Both_Button_UW.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Both_Button");
		Assert.assertTrue(true, "Failed to Select Both_Button");
		
		helper.waitFor(Website_Button_UW);
		helper.highLightElement(driver, Website_Button_UW);
		Website_Button_UW.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Website_Button");
		Assert.assertTrue(true, "Failed to Select Website_Button");
		
//		helper.waitFor(Aplication_Button);
//		helper.highLightElement(driver, Aplication_Button);
//		Aplication_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on Aplication_Button");
//		Assert.assertTrue(true, "Failed to Select Aplication_Button");
		
		helper.waitFor(ExceltButton_UW);
		helper.highLightElement(driver, ExceltButton_UW);
		helper.Scrollintoview(ExceltButton_UW);
		ExceltButton_UW.click();	
		Thread.sleep(3000);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on Excelt Button ");
		Assert.assertTrue(true, "Failed to Click on Excel Button");
		Thread.sleep(5000);
		
				
		helper.waitFor(PDFButton_UW);
		helper.highLightElement(driver, PDFButton_UW);
		helper.Scrollintoview(PDFButton_UW);
		PDFButton_UW.click();
		Thread.sleep(3000);
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on PDF Button");
		Assert.assertTrue(true, "Failed to Click on PDF Button");
		Thread.sleep(6000);
		
		
		helper.waitFor(Show_entries_Dropdown_UW);
		helper.highLightElement(driver,Show_entries_Dropdown_UW);
		helper.selectDropDownValue(Show_entries_Dropdown_UW, "index", "4");
		Show_entries_Dropdown_UW.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on ShowEntries Drop-down and Selected Any Value ");
		Assert.assertTrue(true, "Failed to Click on ShowEntries Drop-down and Selected Any Value ");
		
		
		helper.waitFor(Export_Excel_UW);
		helper.highLightElement(driver, Export_Excel_UW);
		Export_Excel_UW.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on  Export_Excel Button");
		Assert.assertTrue(true, "Failed to Click on  Export_Excel Button ");
		Thread.sleep(6000);
		
		helper.Web_and_App_PDF_Reader();
		Thread.sleep(4000);
		helper.Web_site_sheet_Excel_data();
		
		Thread.sleep(4000);
}
	
	
	@FindBy(xpath = "//a[contains(text(),'Reports Download')]")
	@CacheLookup
	WebElement ReportsDownload;
	
	@FindBy(xpath = "//select[@id='role']")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id='role']/option[1]")
	@CacheLookup
	WebElement SelectAll;
	
	
	@FindBy(xpath = "//*[@id='locations']/option[1]")
	@CacheLookup
	WebElement Location_DL;
	
	@FindBy(xpath = "//*[@id='departmentAppend']")
	@CacheLookup
	WebElement Department_DL;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
	@CacheLookup
	WebElement SelectDateRanges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_DL;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOption;
	
	@FindBy(xpath = "//option[contains(text(),'Application Used')]")
	@CacheLookup
	WebElement AppliationsUsed;
	
	@FindBy(xpath = "//option[contains(text(),'Browser History')]")
	@CacheLookup
	WebElement BrowserHistory;
	
	@FindBy(xpath = "//button[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF;
	
	@FindBy(xpath = "//div[@id='csvDropdown']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//input[@id='checkAllCheckboxes']")
	@CacheLookup
	WebElement Select_All_checkBox;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button;
	
	@FindBy(xpath = "//*[@id='li_1']/a")
	@CacheLookup
	WebElement ApplicationsUsageReport;
	
	@FindBy(xpath = "(//tbody[@id='append_users']//td[7]//button)[1]")
	@CacheLookup
	WebElement ViewReport;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOptions;
	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/button[1]")
	@CacheLookup
	WebElement IndividualPdfButton;
	
	@FindBy(css = ".pt-3 > button[title='Download CSV File']")
	@CacheLookup
	WebElement IndividuaCSVButton;

	
	
	
	public void Reports_Download_Page()throws InterruptedException, AWTException{
		
		helper.waitFor(ReportsDownload);
		helper.highLightElement(driver, ReportsDownload);
		ReportsDownload.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Reports Module and Selected Reports-Download Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected Reports-Download Sub-Module");
		
	
		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Role Drop-down ");
		Assert.assertTrue(true, "Failed to Click on Role Drop-down");
		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Select-All option ");
		Assert.assertTrue(true, "Failed to Click on Select-All option ");
		
		helper.waitFor(Location_DL);
		helper.highLightElement(driver, Location_DL);
		//helper.selectDropDownValue(Location, "value", "0");
		Location_DL.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down ans Slected Any Location  ");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down ans Slected Any Location");
		
		helper.waitFor(Department_DL);
		helper.highLightElement(driver, Department_DL);
		helper.selectDropDownValue(Department_DL, "id", "0");
		Department_DL.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selected Any Department");
		
		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.click();
		//SelectDateRanges.sendKeys("26-05-2021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Click on Calendar Drop-down and Slected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Slected Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");
		
		helper.waitFor(DownloadOption);
		helper.highLightElement(driver, DownloadOption);
		DownloadOption.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Download-Option");
		Assert.assertTrue(true, "Failed to Click on  Download-Option");
		
		helper.waitFor(AppliationsUsed);
		helper.highLightElement(driver, AppliationsUsed);
		AppliationsUsed.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Appliations-Used");
		Assert.assertTrue(true, "Failed to Click on  Appliations-Used");
		
		
//		helper.waitFor(PDF);
//		helper.highLightElement(driver,PDF);
//		PDF.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on PDF Button ");
//		Assert.assertTrue(true, "Failed to click on  PDF Button ");
//		Thread.sleep(3000);
	
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on CSV Button ");
		Assert.assertTrue(true, "Failed to Click on  CSV Button ");
		
		
		helper.waitFor(Select_All_checkBox);
		helper.highLightElement(driver, Select_All_checkBox);
		//helper.jsCLick(Select_All_checkBox);
		helper.jsScrollintoview(Select_All_checkBox);
		helper.jsCLick(Select_All_checkBox);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Select-All option  (check Box click)");
		Assert.assertTrue(true, "Failed to Click on Select-All option  (check Box click)");
		
		
		helper.waitFor(Submit_Button);
		helper.highLightElement(driver, Submit_Button);
		helper.Scrollintoview(Submit_Button);
		Actions act=new Actions(driver);
		act.moveToElement(Submit_Button).click().build().perform();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on Submit-Button");
		Assert.assertTrue(true, "Failed to Click Submit-Button");
		Thread.sleep(4000);

		
	
}
	
	
	/*
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Reports Download')]")
	@CacheLookup
	WebElement ReportsDownload_AU;
	
	@FindBy(xpath = "//select[@id='role']")
	@CacheLookup
	WebElement Role_AU;
	
	@FindBy(xpath = "//*[@id=\"role\"]/option[1]")
	@CacheLookup
	WebElement SelectAll_AU;
	
	
	@FindBy(xpath = "//select[@id='locations']")
	@CacheLookup
	WebElement Location_AU;
	
	@FindBy(xpath = "//select[@id='departmentAppend']")
	@CacheLookup
	WebElement Department_AU;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
	@CacheLookup
	WebElement SelectDateRanges_AU;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_AU;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOption_AU;
	
	@FindBy(xpath = "//option[contains(text(),'Application Used')]")
	@CacheLookup
	WebElement AppliationsUsed_AU;
	
	@FindBy(xpath = "//option[contains(text(),'Browser History')]")
	@CacheLookup
	WebElement BrowserHistory_AU;
	
	@FindBy(xpath = "//*[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF_AU;
	
	@FindBy(xpath = "//*[@id='csvReportsDownload']/div/a/i")
	@CacheLookup
	WebElement CSV_AU;
	
	
	@FindBy(xpath = "//li[@id='li_1']/a/i")
	@CacheLookup
	WebElement CSV_Drop_down_AU;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/ul[1]/li[16]/input[1]")
	@CacheLookup
	WebElement ApplicationsUsed_AU;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button_AU;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button_AU;
	
	@FindBy(xpath = "//*[@id=\"li_1\"]/a")
	@CacheLookup
	WebElement ApplicationsUsageReport_AU;

	
	
	
	public void Applications_Used_Page()throws InterruptedException{
		
		helper.waitFor(ReportsDownload_AU);
		helper.highLightElement(driver, ReportsDownload_AU);
		ReportsDownload_AU.click();
		Reporter.log("<B><font color = 'blue'>SteP1 .</font></B> Clicked on Reports Module and Selected Reports Download Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Reports Module and Selected Reports Download Sub-Module");
		
		
		helper.waitFor(Role_AU);
		helper.highLightElement(driver, Role_AU);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Roles Drop-down and Selected any Role ");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected any Role");
		
		helper.waitFor(SelectAll_AU);
		helper.highLightElement(driver, SelectAll_AU);
		SelectAll_AU.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Slected   Select All option ");
		Assert.assertTrue(true, "Failed to Select on Select All");
		
		helper.waitFor(Location_AU);
		helper.highLightElement(driver, Location_AU);
		helper.selectDropDownValue(Location_AU, "value", "2");
		Location_AU.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and Select Any Location ");
		Assert.assertTrue(true, "Failed Click on Location Drop-down and Select Any Location");
		
		helper.waitFor(Department_AU);
		helper.highLightElement(driver, Department_AU);
		helper.selectDropDownValue(Department_AU, "value", "1");
		
		Department_AU.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Slected Any Department");
		Assert.assertTrue(true, "Failed to Click  on Department Drop-down and Slected Any Department");
		
		helper.waitFor(SelectDateRanges_AU);
		helper.highLightElement(driver, SelectDateRanges_AU);
		SelectDateRanges_AU.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Calender Drop-down and Slected Day's");
		Assert.assertTrue(true, "Failed to Click on Calender Drop-down and Slected Day's");
		
		helper.waitFor(Last30days_AU);
		helper.highLightElement(driver, Last30days_AU);
		Last30days_AU.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected  on Last30days");
		Assert.assertTrue(true, "Failed to Select Last30days");
		
		helper.waitFor(DownloadOption_AU);
		helper.highLightElement(driver, DownloadOption_AU);
		DownloadOption_AU.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Download-Option Drop-down ");
		Assert.assertTrue(true, "Failed to Select DownloadOption");
		
		helper.waitFor(AppliationsUsed_AU);
		helper.highLightElement(driver, AppliationsUsed_AU);
		AppliationsUsed_AU.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Selected  Appliations-Used (Check Box Clicked ) ");
		Assert.assertTrue(true, "Failed to Select Appliations-Used  (Check Box Clicked )");
		Thread.sleep(2000);
		
		
		
		helper.waitFor(CSV_AU);
		helper.highLightElement(driver, CSV_AU);
		helper.Double_click(CSV_AU);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV-Button");
		Assert.assertTrue(true, "Failed to Click on  CSV-Button");
		Thread.sleep(2000);
		
		
		helper.waitFor(CSV_Drop_down_AU);
		helper.highLightElement(driver, CSV_Drop_down_AU);
		helper.Double_click(CSV_Drop_down_AU);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV_Drop_down");
		Assert.assertTrue(true, "Failed to Click on  CSV_Drop_down");
		Thread.sleep(4000); 
	
	}
	
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Reports Download')]")
	@CacheLookup
	WebElement ReportsDownload_B;
	
	@FindBy(xpath = "//*[@id='role']")
	@CacheLookup
	WebElement Role_B;
	
	@FindBy(xpath = "//*[@id='role']/option[1]")
	@CacheLookup
	WebElement SelectAll_B;
	
	
	@FindBy(xpath = "//*[@id='locations']")
	@CacheLookup
	WebElement Location_B;
	
	@FindBy(xpath = "//*[@id='departmentAppend']")
	@CacheLookup
	WebElement Department_B;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/i[1]")
	@CacheLookup
	WebElement SelectDateRanges_B;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days_B;
	
	@FindBy(xpath = "//select[@id='download']")
	@CacheLookup
	WebElement DownloadOption_B;
	
//	@FindBy(xpath = "//option[contains(text(),'Application Used')]")
//	@CacheLookup
//	WebElement AppliationsUsed;
	
	@FindBy(xpath = "//option[contains(text(),'Browser History')]")
	@CacheLookup
	WebElement BrowserHistory_B;
	
	@FindBy(xpath = "//button[@id='pdfReportsDownload']")
	@CacheLookup
	WebElement PDF_B;
	
	@FindBy(xpath = "//div[@id='csvDropdown']")
	@CacheLookup
	WebElement CSV_B;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[16]/input")
	@CacheLookup
	WebElement Domain_B;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[17]/input")
	@CacheLookup
	WebElement Browser_B;
	
	@FindBy(xpath = "//*[@id=\"mytimesheetdataDownload\"]/li[18]/input")
	@CacheLookup
	WebElement URL_B;
	
	@FindBy(xpath = "//input[@id='optionsView']")
	@CacheLookup
	WebElement Submit_Button_B;
	
	@FindBy(xpath = "//a[contains(@class,'btn dropdown-toggle text-white')]")
	@CacheLookup
	WebElement DownloadFiles_Button_B;
	
	@FindBy(xpath = "//*[@id=\"li_1\"]/a")
	@CacheLookup
	WebElement ApplicationsUsageReport_B;

	
	
	
	public void Browser_History_Page()throws InterruptedException, AWTException{
		
		helper.waitFor(ReportsDownload_B);
		helper.highLightElement(driver, ReportsDownload_B);
		ReportsDownload_B.click();
		Reporter.log("<B><font color = 'blue'>SteP1 .</font></B> Clicked on ReportsDownload");
		Assert.assertTrue(true, "Failed to Click on ReportsDownload");
		
		
		helper.waitFor(Role_B);
		helper.highLightElement(driver, Role_B);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Roles Drop-down and Selected Any Role");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected Any Role");
		
		helper.waitFor(SelectAll_B);
		helper.highLightElement(driver, SelectAll_B);
		SelectAll_B.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on  Select-All");
		Assert.assertTrue(true, "Failed to Click on Select-All");
		
		helper.waitFor(Location_B);
		helper.highLightElement(driver, Location_B);
		helper.robot_Zero_option_selectClick();
		Location_B.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location Drop-down and Slected Any Location");
		Assert.assertTrue(true, "Failed clicke on Location Drop-down and Slected Any Location");
		
		helper.waitFor(Department_B);
		helper.highLightElement(driver, Department_B);
		helper.robot_Zero_option_selectClick();
		Department_B.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Selcted Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selcted Any Department");
		
		helper.waitFor(SelectDateRanges_B);
		helper.highLightElement(driver, SelectDateRanges_B);
		SelectDateRanges_B.click();
		//SelectDateRanges.sendKeys("26-05-2021");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Click on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Selected Day's");
		
		helper.waitFor(Last30days_B);
		helper.highLightElement(driver, Last30days_B);
		Last30days_B.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected  on Last-30-days");
		Assert.assertTrue(true, "Failed to Select Last-30-days");
		
		helper.waitFor(DownloadOption_B);
		helper.highLightElement(driver, DownloadOption_B);
		DownloadOption_B.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Download-Option");
		Assert.assertTrue(true, "Failed to Click on Download-Option");
		
		helper.waitFor(Browser_B);
		helper.highLightElement(driver, Browser_B);
		Browser_B.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Browser-History");
		Assert.assertTrue(true, "Failed to Click on Browser-History");
		
		 
		
		helper.waitFor(CSV_B);
		helper.highLightElement(driver, CSV_B);
		CSV_B.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on CSV-Button");
		Assert.assertTrue(true, "Failed to  Click on CSV-Button");
		
		
		helper.waitFor(Domain_B);
		helper.highLightElement(driver, Domain_B);
		helper.jsScrollintoview(Domain_B);
		helper.jsCLick(Domain_B);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Domain");
		Assert.assertTrue(true, "Failed to click on Domain");
		
		
		helper.waitFor(Browser_B);
		helper.highLightElement(driver, Browser_B);
		helper.jsScrollintoview(Browser_B);
		helper.jsCLick(Browser_B);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Browser");
		Assert.assertTrue(true, "Failed to Click on Browser");
		
		
		helper.waitFor(URL_B);
		helper.highLightElement(driver, URL_B);
		helper.jsScrollintoview(URL_B);
		helper.jsCLick(URL_B);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on URL");
		Assert.assertTrue(true, "Failed to click on URL");
		
		
		
		helper.waitFor(Submit_Button_B);
		helper.highLightElement(driver, Submit_Button_B);
		helper.Scrollintoview(Submit_Button_B);
		Submit_Button_B.click();
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Submit_Button");
		Assert.assertTrue(true, "Failed to Click Submit_Button");
		
		driver.navigate().refresh();
		
		helper.waitFor(DownloadFiles_Button_B);
		helper.highLightElement(driver, DownloadFiles_Button_B);
		helper.jsCLick(DownloadFiles_Button_B);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on DownloadFiles_Button");
		Assert.assertTrue(true, "Failed to Click on DownloadFiles_Button");
		//driver.navigate().refresh();
		
		helper.waitFor(ApplicationsUsageReport_B);
		helper.highLightElement(driver, ApplicationsUsageReport_B);
		helper.jsCLick(ApplicationsUsageReport_B);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Applications-Usage-Report");
		Assert.assertTrue(true, "Failed to Click on Applications-Usage-Report");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
	


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
