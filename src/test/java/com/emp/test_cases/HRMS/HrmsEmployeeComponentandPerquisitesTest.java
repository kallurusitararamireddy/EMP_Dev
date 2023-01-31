package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeComponentandPerquisitesPage;

public class HrmsEmployeeComponentandPerquisitesTest extends TestBase {
	
	@Test
	public void HrmsEmployeeComponentandPerquisitesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeComponentandPerquisitesPage component = new HrmsEmployeeComponentandPerquisitesPage(getDriver());
		homePage.SkipPopup();
		component.HrmsEmployeeComponentandPerquisitesPage();
	}


}
