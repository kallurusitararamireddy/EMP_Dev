package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsPtsettingsOverviewPage;

public class HrmsPayrollAdvancedSettingsPtsettingsOverviewTest extends TestBase {
	
	
	@Test
	public void HrmsPayrollAdvancedSettingsPtsettingsOverviewTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPtsettingsOverviewPage PTsettigs = new HrmsPayrollAdvancedSettingsPtsettingsOverviewPage(getDriver());
		homePage.SkipPopup();
		PTsettigs.HrmsPayrollAdvancedSettingsPtsettingsOverviewPage();
	}

}
