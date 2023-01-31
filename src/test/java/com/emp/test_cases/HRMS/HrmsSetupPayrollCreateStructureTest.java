package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsSetupPayrollCreateStructurePage;


public class HrmsSetupPayrollCreateStructureTest extends TestBase {
	
	@Test
	public void HrmsSetupPayrollCreateStructureTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollCreateStructurePage Createstructure = new HrmsSetupPayrollCreateStructurePage(getDriver());
		homePage.SkipPopup();
		Createstructure.HrmsSetupPayrollCreateStructurePage();
		
	

	}

}
