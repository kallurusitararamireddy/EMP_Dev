package com.emp.test_cases.Admin;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_6_Reports;
import com.opencsv.exceptions.CsvException;

public class Page_6_Reports_Test extends TestBase {

	@Test(priority = 1)
	public void Productivity_Reports_PDF() throws Exception{
		Page_6_Reports productivityR=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		productivityR.Productivity_Reports_pdf();

}
	
	@Test(priority = 2)
	public void Productivity_Reports_CSV() throws Exception{
		Page_6_Reports productivityR=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		productivityR.Productivity_Reports_CSV();

}

	@Test(priority = 3)
	public void Auto_Email_Reports_Test() throws InterruptedException{
		Page_6_Reports AutoemailR=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());
 
		homePage.ReportsDownloadPage();
		AutoemailR.Auto_Email_Reports_Page();
	
	
}
	
	@Test(priority = 4)
	public void Web_site_and_Applicaton_Test() throws Exception{
		Page_6_Reports WebApp=new Page_6_Reports(getDriver());
	HomePage homePage =new HomePage(getDriver());

	homePage.ReportsDownloadPage();
	WebApp.Website_and_Application_Page();

}
	
	/*
	 *  System_Activity_Logs_Test Disable  not working 
	 */
	
//	@Test(priority = 5)     
//	public void System_Activity_Logs_Test() throws Exception{
//		Page_6_Reports Systemactivity=new Page_6_Reports(getDriver());
//		HomePage homePage =new HomePage(getDriver());
//
//		homePage.ReportsDownloadPage();
//		Systemactivity.System_Activity_Logs_Page();
//}
	
	@Test(priority = 6)
	public void Use_Of_Websites_Test() throws InterruptedException, AWTException, IOException, CsvException {
		Page_6_Reports APP = new Page_6_Reports(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		APP.Use_Of_The_WebApplication_Page();

	}
	
	@Test(priority = 7)
	public void Use_Of_The_WebApplication_Test() throws InterruptedException, AWTException, IOException, CsvException{
		Page_6_Reports Useofweb=new Page_6_Reports(getDriver());
	HomePage homePage =new HomePage(getDriver());

	homePage.ReportsDownloadPage();
	Useofweb.Use_Of_Application_Page();

}
	
	@Test(priority = 8)
	public void ReportsDownloadTest() throws InterruptedException, AWTException{
		Page_6_Reports ReportD=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		ReportD.Reports_Download_Page();

}
	
	@Test(priority = 9)
	public void Applicatons_Used_Test() throws InterruptedException{
		Page_6_Reports App=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		App.Applications_Used_Page();
		

}
	
	@Test(priority = 10)
	public void BrowserHistoryTest() throws Exception{
		Page_6_Reports Browser=new Page_6_Reports(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.Skip();
		homePage.ReportsDownloadPage();
		Browser.Browser_History_Page();

		
		
}

	
}
