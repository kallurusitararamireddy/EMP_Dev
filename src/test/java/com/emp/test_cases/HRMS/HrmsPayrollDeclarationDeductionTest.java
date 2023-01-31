package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollDeclarationDeductionPage;


public class HrmsPayrollDeclarationDeductionTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationDeductionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationDeductionPage Deduction = new HrmsPayrollDeclarationDeductionPage(getDriver());
		homePage.SkipPopup();
		Deduction.HrmsPayrollDeclarationDeductionPage();
	}


}
