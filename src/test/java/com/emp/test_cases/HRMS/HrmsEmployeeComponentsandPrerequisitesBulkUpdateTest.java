package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage;


public class HrmsEmployeeComponentsandPrerequisitesBulkUpdateTest extends TestBase {
	@Test
	public void HrmsEmployeeComponentandPerquisitesTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage componentbulk = new HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		componentbulk.HrmsEmployeeComponentsandPrerequisitesBulkUpdatePage();
	}


}
