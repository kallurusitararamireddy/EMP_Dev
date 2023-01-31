package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardLeavesPage;


public class HrmsEmployeeDashboardLeavesTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardLeavesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardLeavesPage HrmsEmployeeLeaves = new HrmsEmployeeDashboardLeavesPage(getDriver());
		HrmsEmployeeLeaves.HrmsEmployeeDashboardLeavesPage();
	}

}
