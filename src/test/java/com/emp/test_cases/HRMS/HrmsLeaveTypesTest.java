package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsLeaveTypesPage;


public class HrmsLeaveTypesTest extends TestBase {
	
	

	@Test
	public void HrmsLeaveTypesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsLeaveTypesPage HrmsLeaveType = new HrmsLeaveTypesPage(getDriver());
		homePage.SkipPopup();
		HrmsLeaveType.HrmsLeaveTypesPage();
	}


}
