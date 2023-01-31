package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsHolidaysPage;

public class HrmsHolidaysTest extends TestBase {
	
	@Test
	public void HrmsHolidaysTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsHolidaysPage HolidaysPage = new HrmsHolidaysPage(getDriver());
		homePage.SkipPopup();
		HolidaysPage.HrmsHolidaysPage();
	}



}
