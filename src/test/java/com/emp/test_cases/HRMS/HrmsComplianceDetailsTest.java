package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsComplianceDetailsPage;


public class HrmsComplianceDetailsTest extends TestBase {
	@Test
	public void HrmsComplianceDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsComplianceDetailsPage ComplianceDetailsPage = new HrmsComplianceDetailsPage(getDriver());
		homePage.SkipPopup();
		ComplianceDetailsPage.HrmsComplianceDetailsPage();
	}

}
