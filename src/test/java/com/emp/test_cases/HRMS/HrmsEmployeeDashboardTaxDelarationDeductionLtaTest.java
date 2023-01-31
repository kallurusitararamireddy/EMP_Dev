package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDelarationDeductionLtaPage;

public class HrmsEmployeeDashboardTaxDelarationDeductionLtaTest extends TestBase {
	
		
	@Test
	public void HrmsEmployeeDashboardTaxDelarationDeductionLtaTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDelarationDeductionLtaPage HrmsEmployeeSection80 = new HrmsEmployeeDashboardTaxDelarationDeductionLtaPage(getDriver());
		HrmsEmployeeSection80.HrmsEmployeeDashboardTaxDelarationDeductionLtaPage();
	}
	

}
