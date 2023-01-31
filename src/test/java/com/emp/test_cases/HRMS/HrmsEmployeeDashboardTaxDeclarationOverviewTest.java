package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationOverviewPage;


public class HrmsEmployeeDashboardTaxDeclarationOverviewTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOverviewTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOverviewPage HrmsEmployeeAttendance = new HrmsEmployeeDashboardTaxDeclarationOverviewPage(getDriver());
		HrmsEmployeeAttendance.HrmsEmployeeDashboardTaxDeclarationOverviewPage();
	}
	
	

}
