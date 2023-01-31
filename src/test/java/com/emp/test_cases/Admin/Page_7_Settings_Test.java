package com.emp.test_cases.Admin;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_7_Settings;

public class Page_7_Settings_Test extends TestBase {

	@Test(priority = 1)
	public void Manage_Locations_And_Department() throws Exception {
		Page_7_Settings ManageLocations = new Page_7_Settings(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		ManageLocations.ManageLocationsAndDepartmentPage();
	}
	
	@Test(priority = 2)
	public void StorageTypeTest() throws Exception{
		Page_7_Settings StorageType=new Page_7_Settings(getDriver());
	HomePage homePage =new HomePage(getDriver());

	homePage.ManageLocationsAndDepartmentPage();
	StorageType.Storage_Type_Page();

}
	
	

	@Test(priority = 3)
	public void Productivity_Rules_Test() throws Exception {
		Page_7_Settings productivityrules = new Page_7_Settings(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		productivityrules.Productivity_Rules_Page();

	}
	

	@Test(priority = 4)
	public void Roles_And_Permission_Test() throws InterruptedException, AWTException{
		Page_7_Settings Rolesandpermission=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		Rolesandpermission.Roles_And_Permission_Page();

}
	
	@Test(priority = 5)
	public void Shift_Management_Test() throws InterruptedException{
		Page_7_Settings Shiftmanagement=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		Shiftmanagement.Shift_Management_Page();

}
	
	@Test(priority = 6)
	public void Localization_Test() throws Exception{
		Page_7_Settings Localization=new Page_7_Settings(getDriver());
	HomePage homePage =new HomePage(getDriver());

	
	homePage.ManageLocationsAndDepartmentPage();
	Localization.Localiation_Page();

}
	
	
	@Test(priority = 7)
	public void Locations_And_Department_Test() throws Exception{
		Page_7_Settings 	Location=new Page_7_Settings(getDriver());
	HomePage homePage =new HomePage(getDriver());
 
	homePage.ManageLocationsAndDepartmentPage();
	Location.Locations_And_Department_Page();
}
	
	
	@Test(priority = 8)
	public void Create_Shift_Test() throws InterruptedException{
		Page_7_Settings Shift=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		Shift.Create_Shift_Page();
 
}
	
	@Test(priority = 9)
	public void Roles_and_Permission_Test() throws Exception{
		Page_7_Settings Rolespermission=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		
		homePage.ManageLocationsAndDepartmentPage();
		Rolespermission.Roles_and_Permission_Page();

}
	@Test(priority = 10)
	public void MonitorControlTest() throws InterruptedException, AWTException{
		Page_7_Settings MonitorControl=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		MonitorControl.Monitor_Control_Page();
		
}
	
	@Test(priority = 11)
	public void Monitoring_Control_Test() throws Exception{
		Page_7_Settings MonitorControl=new Page_7_Settings(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		MonitorControl.Monitoring_Control_Page();
		
}
	
}
