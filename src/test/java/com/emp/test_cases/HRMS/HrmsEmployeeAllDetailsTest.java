package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeAllDetailsPage;


public class HrmsEmployeeAllDetailsTest extends TestBase {
	@Test
	public void HrmsEmployeeAllDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeAllDetailsPage PayoutPage = new HrmsEmployeeAllDetailsPage(getDriver());
		homePage.SkipPopup();
		PayoutPage.HrmsEmployeeAllDetailsPage();
	}


}
