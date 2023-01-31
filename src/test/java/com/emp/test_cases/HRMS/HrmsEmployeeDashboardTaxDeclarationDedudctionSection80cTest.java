package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage;


public class HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cTest extends TestBase {
	

		
		@Test
		public void HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cTest() throws InterruptedException, IOException, AWTException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage HrmsEmployeeSection80 = new HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage(getDriver());
			HrmsEmployeeSection80.HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage();
		}
		

	}
