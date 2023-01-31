package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;

public class HrmsEmployeeQualificationDetailsTest extends TestBase {
	

	@Test
	public void HrmsEmployeeQualificationDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HRMS.HrmsEmployeeQualificationDetailsPage QualificationDetails = new com.emp.qa.pages.HRMS.HrmsEmployeeQualificationDetailsPage(getDriver());
		homePage.SkipPopup();
		QualificationDetails.HrmsEmployeeQualificationDetailsPage();
	}

}
