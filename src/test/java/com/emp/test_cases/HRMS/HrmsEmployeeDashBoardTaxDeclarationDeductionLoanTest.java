package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage;


public class HrmsEmployeeDashBoardTaxDeclarationDeductionLoanTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashBoardTaxDeclarationDeductionLoanTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage HrmsEmployeeLoans = new HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage(getDriver());
		HrmsEmployeeLoans.HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage();
	}

}
