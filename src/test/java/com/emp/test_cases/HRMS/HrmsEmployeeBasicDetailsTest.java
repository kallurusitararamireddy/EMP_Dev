package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;


public class HrmsEmployeeBasicDetailsTest extends TestBase {
	@Test
	public void HrmsEmployeeBasicDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HRMS.HrmsEmployeeBasicDetailsPage HrmsEmployeeBasicDetailsPage = new com.emp.qa.pages.HRMS.HrmsEmployeeBasicDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsEmployeeBasicDetailsPage.HrmsEmployeeBasicDetailsPage();
	}

}
