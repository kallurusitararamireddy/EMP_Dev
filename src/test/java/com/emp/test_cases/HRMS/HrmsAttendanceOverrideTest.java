package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsAttendanceOverridePage;


public class HrmsAttendanceOverrideTest extends TestBase {
	
	@Test
	public void HrmsAttendanceOverrideTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendanceOverridePage HrmsAttendover = new HrmsAttendanceOverridePage(getDriver());
		homePage.SkipPopup();
		HrmsAttendover.HrmsAttendanceOverridePage();
	}


}
