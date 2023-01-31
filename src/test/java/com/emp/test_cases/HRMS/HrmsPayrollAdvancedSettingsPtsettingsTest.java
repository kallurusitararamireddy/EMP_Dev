package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsPtsettingsPage;


public class HrmsPayrollAdvancedSettingsPtsettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvancedSettingsPtsettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPtsettingsPage PTsettigs = new HrmsPayrollAdvancedSettingsPtsettingsPage(getDriver());
		homePage.SkipPopup();
		PTsettigs.HrmsPayrollAdvancedSettingsPtsettingsPage();
	}

}
