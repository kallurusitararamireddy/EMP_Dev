package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeComlianceDetailsBulkUpdatePage;


public class HrmsEmployeeComlianceDetailsBulkUpdateTest extends TestBase {
	
	
		@Test
		public void HrmsEmployeeComlianceDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsEmployeeComlianceDetailsBulkUpdatePage CompBulk = new HrmsEmployeeComlianceDetailsBulkUpdatePage(getDriver());
			homePage.SkipPopup();
			CompBulk.HrmsEmployeeComlianceDetailsBulkUpdatePage();
		}


}