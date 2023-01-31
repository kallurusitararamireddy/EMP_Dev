package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsPayrollDelarationOtherincomeOneHousepropertyPage;


public class HrmsPayrollDelarationOtherincomeOneHousepropertyTest extends TestBase{
	
	@Test
	public void HrmsPayrollDelarationOtherincomeOneHousepropertyTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDelarationOtherincomeOneHousepropertyPage onehouseproperty = new HrmsPayrollDelarationOtherincomeOneHousepropertyPage(getDriver());
		homePage.SkipPopup();
		onehouseproperty.HrmsPayrollDelarationOtherincomeOneHousepropertyPage();
	}


}
