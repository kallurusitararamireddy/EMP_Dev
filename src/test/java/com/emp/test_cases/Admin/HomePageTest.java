package com.emp.test_cases.Admin;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;

public class HomePageTest extends TestBase{
	
	@Test
	public void HomepageDisplaytest() throws InterruptedException{		
		HomePage homePage =new HomePage(getDriver());
		homePage.clickDashboard();

}
}




