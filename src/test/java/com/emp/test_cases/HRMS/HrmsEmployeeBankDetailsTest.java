package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;

public class HrmsEmployeeBankDetailsTest extends TestBase{
	
	@Test
	public void HrmsEmployeeBankDetailsPage() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		com.emp.qa.pages.HRMS.HrmsEmployeeBankDetailsPage HrmsEmployeeBankDetailsPage = new com.emp.qa.pages.HRMS.HrmsEmployeeBankDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsEmployeeBankDetailsPage.HrmsEmployeeBankDetailsPage();

}
}
