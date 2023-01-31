package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsAttendanceSettingsPage;

public class HrmsAttendanceSettingsTest extends TestBase {
	
	@Test
	public void HrmsAttendanceSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendanceSettingsPage SettingsPage = new HrmsAttendanceSettingsPage(getDriver());
		homePage.SkipPopup();
		SettingsPage.HrmsAttendanceSettingsPage();
	}


}
