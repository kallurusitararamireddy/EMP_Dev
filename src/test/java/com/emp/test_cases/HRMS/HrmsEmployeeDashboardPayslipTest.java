package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardPayslipPage;


public class HrmsEmployeeDashboardPayslipTest extends TestBase {
	@Test
	public void HrmsEmployeeDashboardPayslipTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardPayslipPage HrmsEmployeePayslip = new HrmsEmployeeDashboardPayslipPage(getDriver());
		HrmsEmployeePayslip.HrmsEmployeeDashboardPayslipPage();
	

}

}
