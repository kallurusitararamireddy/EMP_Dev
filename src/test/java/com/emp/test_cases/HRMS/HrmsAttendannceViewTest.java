package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsAttendannceViewPage;


public class HrmsAttendannceViewTest extends TestBase {
	
	@Test
	public void HrmsAttendanceOverrideTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendannceViewPage HrmsAttendview = new HrmsAttendannceViewPage(getDriver());
		homePage.SkipPopup();
		HrmsAttendview.HrmsAttendannceViewPage();
	}


}
