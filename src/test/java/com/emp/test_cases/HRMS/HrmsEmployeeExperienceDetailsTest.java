package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeExperienceDetailsPage;


public class HrmsEmployeeExperienceDetailsTest extends TestBase {
	
	
		
		@Test
		public void HrmsEmployeeExperienceDetailsTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsEmployeeExperienceDetailsPage ExperienceDetails = new HrmsEmployeeExperienceDetailsPage(getDriver());
			homePage.SkipPopup();
			ExperienceDetails.HrmsEmployeeExperienceDetailsPage();
		}


}
