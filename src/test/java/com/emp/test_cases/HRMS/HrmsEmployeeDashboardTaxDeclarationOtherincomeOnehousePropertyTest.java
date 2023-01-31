package com.emp.test_cases.HRMS;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage;


public class HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyTest extends TestBase{
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage HrmsEmployeeonehouseproperty = new HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage(getDriver());
		HrmsEmployeeonehouseproperty.HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage();
	}

}
