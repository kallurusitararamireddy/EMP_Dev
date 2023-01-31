package com.emp.test_cases.Admin;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_3_Time_Sheets;
import com.opencsv.exceptions.CsvException;

public class Page_3_Time_Sheets_Test extends TestBase {

	@Test(priority = 1)
	public void Time_Sheets_CSV_Download() throws InterruptedException, IOException, CsvException, AWTException {
		Page_3_Time_Sheets Times = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		Times.Time_Sheets_Page_CSV_File();

	}

	@Test(priority = 2)
	public void Time_Sheets_PDF_Download() throws InterruptedException, IOException, CsvException, AWTException {
		Page_3_Time_Sheets Times = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		Times.Time_Sheets_Page_PDF_File();

	}

	@Test(priority = 3)
	public void Absent_Option_To_Time_sheets() throws InterruptedException, IOException, AWTException, CsvException {
		Page_3_Time_Sheets Absent = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		Absent.Absent_Option_To_Time_sheets_Page();

	}

	@Test(priority = 4)
	public void Time_In_Minutes_option() throws InterruptedException, IOException, AWTException, CsvException {
		Page_3_Time_Sheets Total = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		Total.Time_In_Minutes();

	}

	@Test(priority = 5)
	public void Assigned_List_option() throws InterruptedException, IOException, AWTException, CsvException {

		HomePage homePage = new HomePage(getDriver());
		Page_3_Time_Sheets AssignedList = new Page_3_Time_Sheets(getDriver());

		homePage.TimeSheets();
		AssignedList.Assigned_List();

	}

	@Test(priority = 6)
	public void Total_Option_To_Time_sheetsPage() throws Exception {
		Page_3_Time_Sheets Total = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		Total.TotalOptionToTimesheets();

	}

	@Test(priority = 7)
	public void Split_Sheet() throws Exception {
		Page_3_Time_Sheets split = new Page_3_Time_Sheets(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.TimeSheets();
		split.SplitSheetPage();
	}

}
