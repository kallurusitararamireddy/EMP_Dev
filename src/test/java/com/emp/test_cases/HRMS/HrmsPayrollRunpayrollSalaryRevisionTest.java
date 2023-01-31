package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunpayrollSalaryRevisionPage;


public class HrmsPayrollRunpayrollSalaryRevisionTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunpayrollSalaryRevisionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollSalaryRevisionPage SalaryRevisionPage = new HrmsPayrollRunpayrollSalaryRevisionPage(getDriver());
		homePage.SkipPopup();
		SalaryRevisionPage.HrmsPayrollRunpayrollSalaryRevisionPage();
	}


}
