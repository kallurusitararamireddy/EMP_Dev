package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsAttendancePage;


public class HrmsAttendanceTest extends TestBase {
	
	@Test
	public void HrmsAttendanceTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendancePage HrmsAttend = new HrmsAttendancePage(getDriver());
		homePage.SkipPopup();
		HrmsAttend.HrmsAttendancePage();
	}

}
