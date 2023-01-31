package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeFamilyDetailsPage;


public class HrmsEmployeeFamilyDetailsTest extends TestBase {
	
	@Test
	public void HrmsEmployeeFamilyDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeFamilyDetailsPage FamilyDetails = new HrmsEmployeeFamilyDetailsPage(getDriver());
		homePage.SkipPopup();
		FamilyDetails.HrmsEmployeeFamilyDetailsPage();
	}


}
