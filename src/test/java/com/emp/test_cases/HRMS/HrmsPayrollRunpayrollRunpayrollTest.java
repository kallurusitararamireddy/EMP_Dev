package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunpayrollRunpayrollPage;


public class HrmsPayrollRunpayrollRunpayrollTest extends TestBase {
	@Test
	public void HrmsPayrollRunpayrollRunpayrollTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollRunpayrollPage runpayrollPage = new HrmsPayrollRunpayrollRunpayrollPage(getDriver());
		homePage.SkipPopup();
		runpayrollPage.HrmsPayrollRunpayrollRunpayrollPage();
	}


}


