package com.emp.test_cases.Admin;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_2__Employee;

public class Page_2_Employee_Test extends TestBase {

	/***************************
	 * Employee Details Module *
	 ***************************/

	@Test(priority = 1)
	public void Register_Employee() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Reg_Emp = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		Reg_Emp.Register_Employee();
	}

	@Test(priority = 2)
	public void Activated_suspended_Employee() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee activate_suspend = new Page_2__Employee(getDriver());
		homePage.clickEmployee();
		activate_suspend.Activated_suspended_Employee();
	}

	@Test(priority = 3)
	public void Adding_Filter_Module() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Adding_Filter = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		Adding_Filter.AddingFilterModule();

	}

	@Test(priority = 4)
	public void Employee_Role_Update_() throws InterruptedException, AWTException {

		/*
		 * NOTE:- must be Change or find UpdateTheRole id=---?
		 */

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Updaterollpage = new Page_2__Employee(getDriver());
		// homePage.SkipPopup();
		homePage.clickEmployee();
		Updaterollpage.Employee_Role_Update();

	}

	@Test(priority = 5)
	public void Employee_Assigned() throws InterruptedException, AWTException {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee EMPAssigned = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		EMPAssigned.Employee_Bulk_Assigned();

	}

	@Test(priority = 6)
	public void Employee_Details_Filter() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee empDetailspage = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		empDetailspage.Employee_Details_Filter();
	}

	@Test(priority = 7)
	public void Employees_Details() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee empDpage = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		empDpage.EmployeeDetails();

	}

	@Test(priority = 8)
	public void Employee_Full_Details() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Fulldetailspage = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		Fulldetailspage.EmployeeFullDetails();

	}

	@Test(priority = 9)
	public void Employee_Role_Update() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee emproleupdate = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		emproleupdate.Update_Role_Filter();
	}

	@Test(priority = 10)
	public void Register_employee_and_Tracking_User_Settings() throws InterruptedException, AWTException {

		/*
		 * NOTE:- must be find TrackingUserSettings id=---?
		 */
		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Tracking = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		Tracking.TrackingUserSettingsPage();

	}

	@Test(priority = 11)
	public void Track_User_Settings_Any_Employee() throws InterruptedException {

		/*
		 * NOTE:- must be Change or find TrackingUserSettings id=---?
		 */

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Trackuser = new Page_2__Employee(getDriver());
		homePage.clickEmployee();
		Trackuser.TrackUserSettings();

	}

	@Test(priority = 12)
	public void Register_Employees_and_Deleted() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee add_deleted = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		add_deleted.Register_employees_and_Deleted_also();

	}

	@Test(priority = 13)
	public void Edit_and_Update_Employee() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee EditEmployee = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		EditEmployee.Edit_and_Update_Employee();

	}

	@Test(priority = 14)
	public void Bulk_Update_Users_list() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee Bulk = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		Bulk.BulkUpdate();

	}

	@Test(priority = 15)
	public void Employees_Bulk_Registe() throws Exception {
		/*
		 * Checking ones Bulk Register data file
		 */
		Page_2__Employee Employee = new Page_2__Employee(getDriver());
		HomePage hp = new HomePage(getDriver());

		hp.clickEmployee();
		Employee.BulkRegister();

	}

	@Test(priority = 16)
	public void Employee_View_Superior_Details() throws InterruptedException, AWTException {

		/*
		 * NOTE:- must be Change or find Superior_Details eye icon id=---?
		 */

		HomePage homePage = new HomePage(getDriver());
		Page_2__Employee View_Superior_Details = new Page_2__Employee(getDriver());

		homePage.clickEmployee();
		View_Superior_Details.View_Superior_Details();

	}

	/*********************************
	 * ** Employee Attendance Module *
	 ***************************************/

	@Test(priority = 17)
	public void Employee_Attendance() throws Exception {
		Page_2__Employee EmployeeAttendance = new Page_2__Employee(getDriver());
		HomePage hp = new HomePage(getDriver());

		hp.clickEmployee();
		EmployeeAttendance.Employee_Attendance_Checking();

	}
	

	@Test(priority = 18)
	public void Attendance_Tool_tip_Showing() throws InterruptedException
	{
		Page_2__Employee tool=new Page_2__Employee(getDriver());
		tool.Tool_Tip_showing(); 
	}

	/***********************************
	 * ** Employee Notification Module *
	 ***************************************/

	@Test(priority = 19)
	public void Employee_Notification() throws InterruptedException, AWTException {
		/*
		 * Employee Notifications currently no Any Data .
		 */
		Page_2__Employee Empn = new Page_2__Employee(getDriver());
		HomePage hp = new HomePage(getDriver());

		hp.clickEmployee();
		Empn.EmployeeNotification();

	}

	/******************************
	 * ** Employee Insights Module *
	 ********************************/

	@Test(priority = 20)
	public void Employee_Insights() throws InterruptedException, AWTException, IOException {
		Page_2__Employee EmployeeInsights = new Page_2__Employee(getDriver());
		HomePage hp = new HomePage(getDriver());

		hp.clickEmployee();
		EmployeeInsights.EmployeeInsights();

	}

}
