package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollDeclarationTaxSchemePage;


public class HrmsPayrollDeclarationTaxSchemeTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationTaxSchemeTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationTaxSchemePage Taxscheme = new HrmsPayrollDeclarationTaxSchemePage(getDriver());
		homePage.SkipPopup();
		Taxscheme.HrmsPayrollDeclarationTaxSchemePage();
	}

}
