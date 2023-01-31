package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage;


public class HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage HrmsEmployeepension = new HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage(getDriver());
		HrmsEmployeepension.HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage();
	}

}
