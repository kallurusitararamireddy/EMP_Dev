package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage;


public class HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage previousEmployer = new HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage(getDriver());
		homePage.SkipPopup();
		previousEmployer.HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage();
	}

}
