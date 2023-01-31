package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsTerminationPage;


public class HrmsTerminationTest extends TestBase {
	
	@Test
	public void HrmsResignationsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsTerminationPage TerminationPage = new HrmsTerminationPage(getDriver());
		homePage.SkipPopup();
		TerminationPage.HrmsTerminationPage();
	}


}
