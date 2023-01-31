package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsSetupPayrollAssignStructurePage;


public class HrmsSetupPayrollAssignStructureTest extends TestBase {
	
	@Test
	public void HrmsSetupPayrollAssignStructureTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollAssignStructurePage Assignstructure = new HrmsSetupPayrollAssignStructurePage(getDriver());
		homePage.SkipPopup();
		Assignstructure.HrmsSetupPayrollAssignStructurePage();
		
	

	}

}
