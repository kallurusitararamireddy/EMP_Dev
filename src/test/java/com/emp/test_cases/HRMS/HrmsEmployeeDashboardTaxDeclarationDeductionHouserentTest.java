package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage;


public class HrmsEmployeeDashboardTaxDeclarationDeductionHouserentTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationDeductionHouserentTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage HrmsEmployeeHouserent = new HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage(getDriver());
		HrmsEmployeeHouserent.HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage();
	}
	

}
