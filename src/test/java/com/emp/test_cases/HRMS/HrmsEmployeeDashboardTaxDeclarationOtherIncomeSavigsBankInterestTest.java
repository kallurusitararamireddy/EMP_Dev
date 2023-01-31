package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage;


public class HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestTest extends TestBase {
	
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage HrmsEmployeeSavings = new HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage(getDriver());
		HrmsEmployeeSavings.HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage();
	}

}
