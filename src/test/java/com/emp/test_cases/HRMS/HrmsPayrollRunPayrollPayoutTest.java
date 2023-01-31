package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunPayrollPayoutPage;


public class HrmsPayrollRunPayrollPayoutTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunPayrollPayoutTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunPayrollPayoutPage PayoutPage = new HrmsPayrollRunPayrollPayoutPage(getDriver());
		homePage.SkipPopup();
		PayoutPage.HrmsPayrollRunPayrollPayoutPage();
	}


}
