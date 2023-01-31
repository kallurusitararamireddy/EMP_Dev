package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsEsiSettingsPage;


public class HrmsPayrollAdvancedSettingsEsiSettingsTest extends TestBase{
	@Test
	public void HrmsPayrollAdvancedSettingsEsiSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsEsiSettingsPage Esi = new HrmsPayrollAdvancedSettingsEsiSettingsPage(getDriver());
		homePage.SkipPopup();
		Esi.HrmsPayrollAdvancedSettingsEsiSettingsPage();
	}

}
