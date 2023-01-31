package com.emp.test_cases.Admin;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_8_Behaviour;

public class Page_8_Behaviour_Test extends TestBase {

	@Test(priority = 1)
	public void Alerts_Test() throws Exception{
		Page_8_Behaviour	 Alerts=new Page_8_Behaviour(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.behaviourpage();
		Alerts.Alerts_Page();

}
	
	@Test(priority = 2)
	public void Alert_Policies_Test() throws Exception{
		Page_8_Behaviour AlertPolocies=new Page_8_Behaviour(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.behaviourpage();
		AlertPolocies.Alert_Policies_Page();
 
}
	
	@Test(priority = 3)
	public void Alerts_Notifiations_Test() throws Exception{
		Page_8_Behaviour AlertNotification=new Page_8_Behaviour(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.behaviourpage();
		AlertNotification.Alerts_Notification_Page();
}
	
	@Test
	public void Behaviour_Alert_Policies_Test() throws InterruptedException{
		
		
		Page_8_Behaviour AlertPol=new Page_8_Behaviour(getDriver());
		HomePage homePage =new HomePage(getDriver());
		
		homePage.behaviourpage();
		AlertPol.Behaviour_Alert_Policies_Page();

}

	
}
