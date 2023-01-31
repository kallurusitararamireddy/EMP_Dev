package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollRunpayrollAttendanceandLeavePage;


public class HrmsPayrollRunpayrollAttendanceandLeaveTest extends TestBase {
	

		
		@Test
		public void HrmsPayrollRunpayrollAttendanceandLeaveTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsPayrollRunpayrollAttendanceandLeavePage overviewPage = new HrmsPayrollRunpayrollAttendanceandLeavePage(getDriver());
			homePage.SkipPopup();
			overviewPage.HrmsPayrollRunpayrollAttendanceandLeavePage();
		}



	}
