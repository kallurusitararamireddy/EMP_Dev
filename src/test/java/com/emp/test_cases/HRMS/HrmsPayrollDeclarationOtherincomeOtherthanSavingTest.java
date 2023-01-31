package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage;


public class HrmsPayrollDeclarationOtherincomeOtherthanSavingTest extends TestBase{
	
	@Test
	public void HrmsPayrollDeclarationOtherincomeOtherthanSavingTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomeOtherthanSavingPage otherthan = new HrmsPayrollDeclarationOtherincomeOtherthanSavingPage(getDriver());
		homePage.SkipPopup();
		otherthan.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage();
	}

}
