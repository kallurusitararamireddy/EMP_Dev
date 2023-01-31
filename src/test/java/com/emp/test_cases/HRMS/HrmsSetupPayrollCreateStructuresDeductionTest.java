package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsSetupPayrollCreateStructuresDeductionPage;


public class HrmsSetupPayrollCreateStructuresDeductionTest extends TestBase {
	
	@Test
	public void HrmsSetupPayrollCreateStructuresDeductionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollCreateStructuresDeductionPage CreatestructureDeductions = new HrmsSetupPayrollCreateStructuresDeductionPage(getDriver());
		homePage.SkipPopup();
		CreatestructureDeductions.HrmsSetupPayrollCreateStructuresDeductionPage();
		
	

	}

}
