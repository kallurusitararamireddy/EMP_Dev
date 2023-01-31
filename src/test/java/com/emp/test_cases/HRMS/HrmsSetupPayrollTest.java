package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsSetupPayrollPage;


public class HrmsSetupPayrollTest extends TestBase {
	@Test
	public void HrmsSetupPayrollTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollPage SetupPayroll = new HrmsSetupPayrollPage(getDriver());
		homePage.SkipPopup();
		SetupPayroll.HrmsSetupPayrollPage();
		
	

	}
	}
