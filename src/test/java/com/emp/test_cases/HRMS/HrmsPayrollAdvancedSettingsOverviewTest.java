package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsOverviewPage;

public class HrmsPayrollAdvancedSettingsOverviewTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvancedSettingsOverviewTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsOverviewPage overview = new HrmsPayrollAdvancedSettingsOverviewPage(getDriver());
		homePage.SkipPopup();
		overview.HrmsPayrollAdvancedSettingsOverviewPage();
	}

}
