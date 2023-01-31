package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeRequestDetailsPage;


public class HrmsEmployeeRequestDetailsTest extends TestBase {
	
	@Test
	public void HrmsEmployeeRequestDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeRequestDetailsPage HrmsAttend = new HrmsEmployeeRequestDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsAttend.HrmsEmployeeRequestDetailsPage();
	}


}
