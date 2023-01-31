package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunpayrollOverviewPage;


public class HrmsPayrollRunpayrollOverviewTest extends TestBase {
	
		@Test
		public void HrmsPayrollRunpayrollOverviewTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsPayrollRunpayrollOverviewPage overviewPage = new HrmsPayrollRunpayrollOverviewPage(getDriver());
			homePage.SkipPopup();
			overviewPage.HrmsPayrollRunpayrollOverviewPage();
		}


}
