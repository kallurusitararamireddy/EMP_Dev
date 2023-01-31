package com.emp.test_cases.Admin;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_4_Time_Claim;

public class Page_4_Time_Claim_Test extends TestBase {


	@Test
	public void Time_Claim() throws Exception{
		Page_4_Time_Claim Timeclaim=new Page_4_Time_Claim(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.TimeClaim();
		Timeclaim.Time_Claim_Page();
	
	

}
}
