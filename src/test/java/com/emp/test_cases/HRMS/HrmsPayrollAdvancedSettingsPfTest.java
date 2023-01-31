package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollAdvancedSettingsPfPage;


public class HrmsPayrollAdvancedSettingsPfTest extends TestBase{
	
	@Test
	public void HrmsPayrollAdvancedSettingsPfTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPfPage Pf = new HrmsPayrollAdvancedSettingsPfPage(getDriver());
		homePage.SkipPopup();
		Pf.HrmsPayrollAdvancedSettingsPfPage();
	}

}
