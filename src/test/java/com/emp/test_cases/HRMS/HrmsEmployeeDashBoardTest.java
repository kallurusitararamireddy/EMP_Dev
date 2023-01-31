package com.emp.test_cases.HRMS;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.HRMS.HrmsEmployeeDashBoardPage;


public class HrmsEmployeeDashBoardTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashBoardTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashBoardPage HrmsEmployee = new HrmsEmployeeDashBoardPage(getDriver());
		HrmsEmployee.HrmsEmployeeDashBoardPage();
	}
	
	

}
