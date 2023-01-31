package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunpayrollPayregisterPage;


public class HrmsPayrollRunpayrollPayregisterTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunpayrollPayregisterTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollPayregisterPage PayregisterPage = new HrmsPayrollRunpayrollPayregisterPage(getDriver());
		homePage.SkipPopup();
		PayregisterPage.HrmsPayrollRunpayrollPayregisterPage();
	}


}
