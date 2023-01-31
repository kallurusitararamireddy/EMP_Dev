package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsPage;


public class HrmsPayrollAdvancedSettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvancedSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPage AdvancedSettings = new HrmsPayrollAdvancedSettingsPage(getDriver());
		homePage.SkipPopup();
		AdvancedSettings.HrmsPayrollAdvancedSettingsPage();
	}

}
