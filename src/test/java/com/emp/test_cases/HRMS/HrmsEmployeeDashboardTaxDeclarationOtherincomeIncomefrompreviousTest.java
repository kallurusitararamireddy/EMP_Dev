package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage;


public class HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage HrmsEmployeeincomefrom = new HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage(getDriver());
		HrmsEmployeeincomefrom.HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage();
	

}
}
