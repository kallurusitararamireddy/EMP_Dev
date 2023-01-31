package com.emp.test_cases.Non_Admin;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Non_Admin.Non_Admin_log_Employee_Manager_TL_Page;

public class Non_Admin_log_Employee_Manager_TL_Test extends TestBase
{
	
	// Must be changes  login credentials
	@Test(priority = 1)
	public void Employee_Non_Admin_Page_Data_Checking_features_and_modules() throws Exception {

		Non_Admin_log_Employee_Manager_TL_Page Non_page_Data=new Non_Admin_log_Employee_Manager_TL_Page(getDriver());
		Non_page_Data.non_Admin_Side_Data_Checking_Employee_Role();
		
	
	}
	
	@Test(priority = 2) 
	public void Manager_Non_Admin_Page_Data_Checking_features_and_modules() throws Exception {

		Non_Admin_log_Employee_Manager_TL_Page Non_page_Data_2=new Non_Admin_log_Employee_Manager_TL_Page(getDriver());
		Non_page_Data_2.Non_Admin_Side_Manager_Role();
		
	
	} 
	
	@Test(priority = 3)
	public void Team_Lead_Non_Admin_Page_Data_Checking_features_and_modules() throws Exception {

		Non_Admin_log_Employee_Manager_TL_Page Non_page_Data_3=new Non_Admin_log_Employee_Manager_TL_Page(getDriver());
		Non_page_Data_3.Non_Admin_Side_Team_lead_Role();
		
	
	}
	

}
