package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardAttedancePage;


public class HrmsEmployeeDashboardAttedanceTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardAttedanceTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardAttedancePage HrmsEmployeeAttendance = new HrmsEmployeeDashboardAttedancePage(getDriver());
		HrmsEmployeeAttendance.HrmsEmployeeDashboardAttedancePage();
	}
	

}
