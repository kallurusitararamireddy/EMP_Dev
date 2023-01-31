package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsLeavesPage;


public class HrmsLeavesTest extends TestBase {
	
	
	@Test
	public void HrmsLeavesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsLeavesPage HrmsLeaves = new HrmsLeavesPage(getDriver());
		homePage.SkipPopup();
		HrmsLeaves.HrmsLeavesPage();
	}


}
