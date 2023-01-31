package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeBasicDetailsBulkUpdatePage;


public class HrmsEmployeeBasicDetailsBulkUpdateTest extends TestBase {
	
	@Test
	public void HrmsEmployeeBasicDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeBasicDetailsBulkUpdatePage BasicBulk = new HrmsEmployeeBasicDetailsBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		BasicBulk.HrmsEmployeeBasicDetailsBulkUpdatePage();
	}

}
