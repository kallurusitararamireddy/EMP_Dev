package com.emp.qa.pages.Admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

public class Page_2__Employee extends BasePage {

	public Page_2__Employee(WebDriver driver) {
		super(driver);

	}

	public Helpers helper = new Helpers();
	DataUtility du = new DataUtility();

	/*
	 * Register-Employee Button
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//button[@id='add_btn']")
	@CacheLookup
	WebElement RegisterEmployee;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='f_name']")
	@CacheLookup
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='emp_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@id='c_passwd']")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='telephone']")
	@CacheLookup
	WebElement Mobilenumber;

	@FindBy(xpath = "//input[contains(@name,'empCode')]")
	@CacheLookup
	WebElement Employeecode;

	@FindBy(xpath = "//select[@id='locations-addEmp']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//*[@id='emp-register']/div[1]/div/div[9]/div/span[1]/span[1]/span/ul")

	@CacheLookup
	WebElement Role;

	@FindBy(xpath = "//li[@class='select2-selection__choice'][contains(.,'×Software Tester')]")
	@CacheLookup
	WebElement SoftwareTester;

	@FindBy(xpath = "//select[@id='EmpReg_departments']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//input[@id='date_joinCalender']")
	@CacheLookup
	WebElement Dateofjoining;

	@FindBy(xpath = "//select[@id='timeZoneAppend']")
	@CacheLookup
	WebElement Timezone;

	@FindBy(xpath = "//select[@id='timeZoneAppend']//option[@id='tz-opt-32']")
	@CacheLookup
	WebElement AsiaKolkata;

	@FindBy(xpath = "//input[@id='f_upload']")
	@CacheLookup
	WebElement Image_up_load;

	@FindBy(xpath = "//select[@id='Shiftfilteradd']")
	@CacheLookup
	WebElement selectshift;

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//button[@id='empReg']")
	@CacheLookup
	WebElement Register;

	@FindBy(xpath = "//li[@id='select2-role-addEmp-result-8oh9-81']")
	WebElement SoftwareDev;

	public void Register_Employee() throws InterruptedException, AWTException {
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee_Details  Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details");

		helper.waitFor(RegisterEmployee);
		helper.highLightElement(driver, RegisterEmployee);
		RegisterEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked  on Register_Employee Button");
		Assert.assertTrue(true, "Failed to Click on Register_Employee Button");

		helper.waitFor(Firstname);
		helper.highLightElement(driver, Firstname);
		Firstname.sendKeys("Automation12");
		Reporter.log(
				"<B><font color = 'blue'>Step3 .</font></B> Clicked on First_name text space & Enter Employee Frist Name");
		Assert.assertTrue(true, "Failed to Click  on First_name text space  & Enter Name");

		helper.waitFor(Lastname);
		helper.highLightElement(driver, Lastname);
		Lastname.sendKeys("CodeeeAuto");
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked  on Last_name text space & Enter Employee Last name ");
		Assert.assertTrue(true, "Failed to Click  on Lastname text space & enter name");

		Random g = new Random();
		int num = g.nextInt(100);
		String Act_g = "skabcdef";
		String Exp_g = Act_g + num;

		helper.waitFor(email);
		helper.highLightElement(driver, email);
		email.sendKeys(Exp_g + "@gmail.com");

		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on email Text space & Enter Employee  email-ID ");
		Assert.assertTrue(true, "Failed to Click on email Text space & enter email");

		helper.waitFor(password);
		helper.highLightElement(driver, password);
		password.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on password text space & Enter password ");
		Assert.assertTrue(true, "Failed to Click on password text space & enter password");

		helper.waitFor(confirmpassword);
		helper.highLightElement(driver, confirmpassword);
		confirmpassword.sendKeys("Abc@$123");
		Reporter.log(
				"<B><font color = 'blue'>Step7 .</font></B> Clicked on confirm_password text space & Enter confirm_password");
		Assert.assertTrue(true, "Failed to Click on confirm_password text space & enter confirm_password");

		helper.waitFor(Mobilenumber);
		helper.highLightElement(driver, Mobilenumber);
		Mobilenumber.sendKeys("9876543210");
		Reporter.log(
				"<B><font color = 'blue'>Step8 .</font></B> Clicked on Mobile_number text space & Enter Employee Phone number");
		Assert.assertTrue(true, "Failed to Click on Mobile_number & Enter Phone number");

		Random r = new Random();
		int num1 = r.nextInt(100);
		String Act_code = "Emp-Abzcde-12345";
		String Exp_code = Act_code + num1;

		helper.waitFor(Employeecode);
		helper.highLightElement(driver, Employeecode);
		Employeecode.sendKeys(Exp_code);
		Reporter.log(
				"<B><font color = 'blue'>Step9 .</font></B> Clicked on Employee_code text space & Enter Employee code ");
		Assert.assertTrue(true, "Failed to Click on Employee_code text space & Enter Employee code");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Location Drop down & select Any location");
		Assert.assertTrue(true, "Failed to Click on Location Drop down & select location");

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		helper.jsCLick(Role);
		helper.move_to_element(Role);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Role Drop down &  Select  Any Role ");
		Assert.assertTrue(true, "Failed to Click on Role Drop down &  Select  Role");

		helper.waitFor(Department);
		Department.click();
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "Testing");
		Reporter.log(
				"<B><font color = 'blue'>Step12.</font></B> Clicked on Department Drop down & select Any Deptment");
		Assert.assertTrue(true, "Failed to Clicked on Department Drop down & select Dept");

		helper.waitFor(Dateofjoining);
		helper.highLightElement(driver, Dateofjoining);
		Dateofjoining.sendKeys("01-03-2021");
		Dateofjoining.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Clendar Pop-Up and Selected Joining Date ");
		Assert.assertTrue(true, "Failed to Click on   Clendar Pop-Up and Selected Joining Date");

		helper.waitFor(Timezone);
		helper.highLightElement(driver, Timezone);
		Timezone.click();
		Reporter.log(
				"<B><font color = 'blue'>Step14.</font></B> Clicked on Timezone Drop down & Select Any Time zone ");
		Assert.assertTrue(true, "Failed to Timezone Drop down & Select Any Time zone");

		helper.waitFor(AsiaKolkata);
		helper.highLightElement(driver, AsiaKolkata);
		AsiaKolkata.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Selected  Asia_Kolkata  Time Zone ");
		Assert.assertTrue(true, "Failed to Click on  Asia_Kolkata");

		helper.waitFor(Image_up_load);
		helper.highLightElement(driver, Image_up_load);
		helper.jsCLick(Image_up_load);
		Thread.sleep(1000);
		helper.uploadFile("C:\\Users\\GLB-BLR-449\\Pictures\\Saved Pictures\\Automation.jpg");
		Thread.sleep(1000);
		Reporter.log(
				"<B><font color = 'blue'>Step16.</font></B> Clicked on Image_Uploaded Button and Selected  Employee Image ");
		Assert.assertTrue(true, "Failed to Click on Image_Uploaded Button  and Selected Employee Image");

		helper.waitFor(selectshift);
		helper.highLightElement(driver, selectshift);
//		helper.selectDropDownValue(selectshift, "value", "475");
		helper.move_to_element_click_target(selectshift);
		helper.robot_Second_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step17.</font></B> Clicked on select shift Drop down & select Any shift ");
		Assert.assertTrue(true, "Failed to Click on select shift Drop down & select Any shift");

		helper.waitFor(Address);
		helper.highLightElement(driver, Address);
		Address.sendKeys("Hno:123,Banglore");
		Reporter.log(
				"<B><font color = 'blue'>Step18.</font></B> Clicked on Address Text space & Enter Employee  Address");
		Assert.assertTrue(true, "Failed to Click on Address Text space & Enter Employee Address");

		helper.waitFor(Register);
		helper.highLightElement(driver, Register);
		helper.Scrollintoview(Register);
		helper.jsCLick(Register);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Clicked on Register Button ");
		Assert.assertTrue(true, "Failed to Click on  Register Button ");
		Thread.sleep(4000);

	}

	/*
	 * Activated_suspended_Employee
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement Employee_Details;

	@FindBy(css = "button#inActiveStatus")
	@CacheLookup
	WebElement SuspendedEmployeesButton;

	@FindBy(css = "input#SelectAllCheckBox")
	@CacheLookup
	WebElement SelectallSuspendedCheckbox;

	@FindBy(css = "button#Active_btn")
	@CacheLookup
	WebElement ActiveButton;

	@FindBy(css = "button#activeMod")
	@CacheLookup
	WebElement ActivateEmployee;

	public void Activated_suspended_Employee() throws InterruptedException, AWTException {

		helper.waitFor(Employee_Details);
		helper.highLightElement(driver, Employee_Details);
		Employee_Details.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected Employee Details Sub-Module  ");

		helper.waitFor(SuspendedEmployeesButton);
		helper.highLightElement(driver, SuspendedEmployeesButton);
		SuspendedEmployeesButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Suspended Employees Button");
		Assert.assertTrue(true, "Failed to click on Suspended Employees Button");

		helper.waitFor(SelectallSuspendedCheckbox);
		helper.highLightElement(driver, SelectallSuspendedCheckbox);
		SelectallSuspendedCheckbox.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Selected  All Suspended Employees  Check Box's");
		Assert.assertTrue(true, "Failed to Select All Suspended Check Box's ");

		helper.waitFor(ActiveButton);
		helper.highLightElement(driver, ActiveButton);
		ActiveButton.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Active Button");
		Assert.assertTrue(true, "Failed to click on Active Button");
		Thread.sleep(5000);

		helper.waitFor(ActivateEmployee);
		helper.highLightElement(driver, ActivateEmployee);
		ActivateEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Activated Employees and clicked on Active Button  ");
		Assert.assertTrue(true, "Failed to  Activated Employees and clicked on Active Button");
		Thread.sleep(5000);

	}

	/*
	 * Adding_Filter_Module
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee__Details;

	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExportButton;

	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement SelectAll;

	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;

	public void AddingFilterModule() throws InterruptedException, IOException {

		helper.waitFor(Employee__Details);
		helper.highLightElement(driver, Employee__Details);
		Employee__Details.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected Employee Details Sub-Module");

		helper.waitFor(ExportButton);
		helper.highLightElement(driver, ExportButton);
		ExportButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Export Button");
		Assert.assertTrue(true, "Failed to click on Export Button");

		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		SelectAll.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Select All check Box option");
		Assert.assertTrue(true, "Failed to Click on Select All check Box option");

		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Submit.click();

		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Submit button");
		Assert.assertTrue(true, "Failed to click on Submit button");
		Thread.sleep(6000);

		helper.Employees_List_Excel_data();

		Thread.sleep(6000);

	}

	/*
	 * Employee_View_Superior_Details
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_4;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller;

	@FindBy(xpath = "(//td[@class='td-action'])[1]//a[7]")
	WebElement superior_Details;

	@FindBy(xpath = "//*[@id='superiorRolesModal']/div/div/div[1]/button/span")
	WebElement Close;

	public void View_Superior_Details() throws InterruptedException, AWTException {

		helper.waitFor(Employee_Details_4);
		helper.highLightElement(driver, Employee_Details_4);
		Employee_Details_4.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 </font></B> Clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected Employee Details Sub-Module");

		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2 </font></B> Clicked on Select Any  Employee");
		Assert.assertTrue(true, "Failed to Click on Select Any  Employee");
		Thread.sleep(2000);

		helper.waitFor(superior_Details);
		helper.highLightElement(driver, superior_Details);
		helper.Scrollintoview(superior_Details);
		Thread.sleep(1000);
		helper.jsCLick(superior_Details);
		Reporter.log("<B><font color = 'blue'>Step3 </font></B> Clicked on Employee  superior_Details icon");
		Assert.assertTrue(true, "Failed to Click  on Employee superior_Details icon");
		Thread.sleep(2000);

		helper.waitFor(Close);
		helper.highLightElement(driver, Close);
		helper.jsCLick(Close);
		Reporter.log("<B><font color = 'blue'>Step4 </font></B> Clicked on Close Button");
		Assert.assertTrue(true, "Failed to Click on Close Button");

	}

	/*
	 * Employee_Assigned
	 */
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_5;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]/div")
	@CacheLookup
	WebElement Scroller_5;

	@FindBy(xpath = "(//*[@id='editedId']/i)[2]")
	WebElement EmployeeAssigned;

	@FindBy(xpath = "//select[@id='CompletRoles1']")
	WebElement SelectRole_dropdown_list;

	@FindBy(xpath = "//*[@id='CompletRoles1']/option[@id='560']")
	WebElement select_role;

	@FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[7]")
	WebElement SelectEmployee;

	@FindBy(xpath = "//*[@id='AssignButton']")
	WebElement Assign_Button;

	public void Employee_Bulk_Assigned() throws InterruptedException, AWTException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employe Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employe Module and Selected  Employee_Details Sub-Module");

		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Selcted Any Employees  ");
		Assert.assertTrue(true, "Failed to Click on Any Employees  ");

		helper.waitFor(EmployeeAssigned);
		helper.highLightElement(driver, EmployeeAssigned);
		helper.Scrollintoview(EmployeeAssigned);
		EmployeeAssigned.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on   Assign_Manger/TL  Button  ");
		Assert.assertTrue(true, "Failed to Click on  Assign_Manger/TL  Button ");

		helper.waitFor(SelectRole_dropdown_list);
		helper.highLightElement(driver, SelectRole_dropdown_list);
		helper.Scrollintoview(SelectRole_dropdown_list);
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on  Role Drop-down and Select Any Role ");
		Assert.assertTrue(true, "Failed to Click  on  Role Drop-down and Select Any Role");

		helper.waitFor(select_role);
		helper.highLightElement(driver, select_role);
		select_role.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected Any Role");
		Assert.assertTrue(true, "Failed to Select any Role ");

		helper.waitFor(SelectEmployee);
		helper.highLightElement(driver, SelectEmployee);
		SelectEmployee.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		SelectEmployee.click();
		Reporter.log(
				"<B><font color = 'blue'>Step6.</font></B> Clicked on  Select Employee  Drop-down and Select Any Employee ");
		Assert.assertTrue(true, "Failed to  Clicked on  Select Employee  Drop-down  Select Any Employee ");

		helper.waitFor(Assign_Button);
		helper.highLightElement(driver, Assign_Button);
		helper.explicitlyWait(Assign_Button);
		helper.jsCLick(Assign_Button);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Assign_Button");
		Assert.assertTrue(true, "Failed to Click on Assign_Button");

	}

	/*
	 * Employee-Attendance checking
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Attendance')]")
	@CacheLookup
	WebElement EmployeeAttendance;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Showentries;

	@FindBy(xpath = "//input[@id='EmployeedateOfjoin']")
	@CacheLookup
	WebElement Monthyear;

	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location_EA;

	@FindBy(xpath = "//select[@id='DepartementData']")
	@CacheLookup
	WebElement Department_EA;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Select_list;

	@FindBy(xpath = "//button[@id='DownloadButton']")
	@CacheLookup
	WebElement ExportExcel;

	@FindBy(xpath = "//*[@id='AttendanceListData']/tr[3]/td[1]/a")
	@CacheLookup
	WebElement Employeename;

	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;

	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets;

	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots;

	@FindBy(xpath = "//a[@id='ScreenRecordingTab']")
	@CacheLookup
	WebElement ScreenRecorder;

	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory;

	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory;

	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes;

	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/a[8]")
	@CacheLookup
	WebElement Analysis;

	public void Employee_Attendance_Checking() throws InterruptedException, IOException {

		helper.waitFor(EmployeeAttendance);
		helper.highLightElement(driver, EmployeeAttendance);
		EmployeeAttendance.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Attendance Sub-Module");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Attendance Sub-Module");

		helper.highLightElement(driver, Showentries);
		helper.selectDropDownValue(Showentries, "index", "4");
		Showentries.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Show-Entries DropDown and Selected Number");
		Assert.assertTrue(true, "Failed to Click on Show-Entries DropDown and Selected Number");

		helper.waitFor(Monthyear);
		helper.highLightElement(driver, Monthyear);
		Monthyear.clear();
		Monthyear.sendKeys("05-2021");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Month-year DropDown and Selected Date");
		Assert.assertTrue(true, "Failed to Send data to Monthyear");

		helper.waitFor(Location_EA);
		helper.highLightElement(driver, Location_EA);
		helper.selectDropDownValue(Location_EA, "value", "null");
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Location_DropDown and Select Any Location ");
		Assert.assertTrue(true, "Failed Click on Location_DropDown and Select Any Location ");

		helper.waitFor(Department_EA);
		helper.highLightElement(driver, Department_EA);
		helper.selectDropDownValue(Department_EA, "id", "null");
		Department_EA.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Department_DropDown ");
		Assert.assertTrue(true, "Failed to Click on Department_DropDown");

		helper.waitFor(Select_list);
		helper.highLightElement(driver, Select_list);
		helper.selectDropDownValue(Department_EA, "id", "null");
		Select_list.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Select_list Option (Check Box) ");
		Assert.assertTrue(true, "Failed to Click on Select_list   Option (Check Box) ");

		helper.waitFor(ExportExcel);
		helper.highLightElement(driver, ExportExcel);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='DownloadButton']"))).click();

		ExportExcel.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Export Excel_Button");
		Assert.assertTrue(true, "Failed to Click on Export Excel_Button");
		Thread.sleep(7000);

		/*
		 * Select Employee
		 */

		helper.waitFor(Employeename);
		helper.highLightElement(driver, Employeename);
		Employeename.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Click on Selected Any  Employee");
		Assert.assertTrue(true, "Failed to Click on Select Any  Employee");

		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Employee productivity_Button");
		Assert.assertTrue(true, "Failed to Click on productivity_Button");

		helper.waitFor(Timesheets);
		helper.highLightElement(driver, Timesheets);
		Timesheets.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Click on Employee Timesheets_Button");
		Assert.assertTrue(true, "Failed to Click onTimesheets_Button");

		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Employee Screenshots_Button");
		Assert.assertTrue(true, "Failed to Click Screenshots_Button");

		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Employee Webhistory_Button");
		Assert.assertTrue(true, "Failed to Click on Webhistory_Button");

		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Employee AppHistory_Button");
		Assert.assertTrue(true, "Failed to Click on AppHistory_Button");

		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Clicked on Employee  Keystrokes Button");
		Assert.assertTrue(true, "Failed to Click on Keystrokes Button");

		Thread.sleep(3000);

		helper.Employee_Attendance_sheet_Excel_data();

		Thread.sleep(6000);

	}

	/*
	 * Employee_Details_Filter
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement Employee_Details_7;

	@FindBy(css = ".add-tab-icon.fa-columns.fas")
	@CacheLookup
	WebElement EmployeeDetailsfilter;

	@FindBy(css = "li:nth-of-type(2) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterEmail;

	@FindBy(css = "li:nth-of-type(3) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterLocation;

	@FindBy(css = "li:nth-of-type(4) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterDepartment;

	@FindBy(css = "li:nth-of-type(5) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterRole;

	@FindBy(css = "li:nth-of-type(6) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterEmpcode;

	@FindBy(css = "li:nth-of-type(7) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterComputername;

	@FindBy(css = "li:nth-of-type(8) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterversion;

	public void Employee_Details_Filter() throws InterruptedException, AWTException {

		helper.waitFor(Employee_Details_7);
		helper.highLightElement(driver, Employee_Details_7);
		Employee_Details_7.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on on Employee Module and Selected  Employee_Details Sub-Module ");

		helper.waitFor(EmployeeDetailsfilter);
		helper.highLightElement(driver, EmployeeDetailsfilter);
		helper.Double_click(EmployeeDetailsfilter);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Employee Details filter");
		Assert.assertTrue(true, "Failed to Click on Employee Details filter");
		Thread.sleep(4000);

		helper.waitFor(EmployeeDetailsfilterEmail);
		helper.highLightElement(driver, EmployeeDetailsfilterEmail);
		helper.jsCLick(EmployeeDetailsfilterEmail);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Employee_Details_filter Email Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Email option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterLocation);
		helper.highLightElement(driver, EmployeeDetailsfilterLocation);
		helper.jsCLick(EmployeeDetailsfilterLocation);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Details_filter Location option");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Location option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterDepartment);
		helper.highLightElement(driver, EmployeeDetailsfilterDepartment);
		helper.jsCLick(EmployeeDetailsfilterDepartment);
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee_Details_filter Department option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Department option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterRole);
		helper.highLightElement(driver, EmployeeDetailsfilterRole);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee_Details_filter Role Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Role option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterEmpcode);
		helper.highLightElement(driver, EmployeeDetailsfilterEmpcode);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Employee_Details_filter Empcode Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Empcode Option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterComputername);
		helper.highLightElement(driver, EmployeeDetailsfilterComputername);
		helper.jsCLick(EmployeeDetailsfilterComputername);
		Reporter.log(
				"<B><font color = 'blue'>Step8 .</font></B> Clicked on Employee_Details_filter Computer-name Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter_Computer-name Option ");
		Thread.sleep(2000);

		helper.waitFor(EmployeeDetailsfilterversion);
		helper.highLightElement(driver, EmployeeDetailsfilterversion);
		helper.jsCLick(EmployeeDetailsfilterversion);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Employee_Details_filter version Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter version option ");
		Thread.sleep(2000);

	}

	/*
	 * Employee Details checking
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement Employee_Details_8;

	@FindBy(xpath = "//button[@id='activeStatus']")
	@CacheLookup
	WebElement Active;

	@FindBy(xpath = "//button[@id='inActiveStatus']")
	@CacheLookup
	WebElement Suspended;

	@FindBy(xpath = "//button[contains(text(),'Deleted Users History')]")
	@CacheLookup
	WebElement DeletedusersHistory;

	@FindBy(xpath = "//*[@id='DeletedUserList']/div/div/div[1]/button/span")
	@CacheLookup
	WebElement close;

	public void EmployeeDetails() throws InterruptedException {

		helper.waitFor(Employee_Details_8);
		helper.highLightElement(driver, Employee_Details_8);
		Employee_Details_8.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee_Details Sub-Module");

		helper.waitFor(Active);
		helper.highLightElement(driver, Active);
		Active.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Active_Button");
		Assert.assertTrue(true, "Failed to Click on Active_Button");

		helper.waitFor(Suspended);
		helper.highLightElement(driver, Suspended);
		Suspended.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Suspended_Button");
		Assert.assertTrue(true, "Failed to Click on Suspended_Button");

		helper.waitFor(DeletedusersHistory);
		helper.highLightElement(driver, DeletedusersHistory);
		DeletedusersHistory.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on DeletedusersHistory_Button");
		Assert.assertTrue(true, "Failed to Click on DeletedusersHistory_Button");

		helper.waitFor(close);
		helper.highLightElement(driver, close);
		Thread.sleep(2000);
		close.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on close_Button");
		Assert.assertTrue(true, "Failed to Click on close_Button");

	}

	/*
	 * Employee full Details Checking
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_9;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "(//tbody[@id='fetch_Details']/tr/td/a)[1]")
	@CacheLookup
	WebElement Any_Employee;

	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity_9;

	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets_Btn;

	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots_9;

	@FindBy(xpath = "//a[@id='ScreenRecordingTab']")
	@CacheLookup
	WebElement ScreenRecorder_9;

	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory_9;

	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory_9;

	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes_9;

	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/a[8]")
	@CacheLookup
	WebElement Analysis_9;

	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement Scroller_9;

	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[1]/i[1]")
	WebElement TrackuserSettings;

	@FindBy(xpath = "//select[@id='AppliedSetting']")
	WebElement SettingsAppliedTotheuser;

	@FindBy(xpath = "//input[@id='stealth']")
	WebElement Empmonitoriconhiden;

	@FindBy(xpath = "//input[@id='SS0']")
	WebElement ScreenShots_RadioButton_Disable;

	@FindBy(xpath = "//select[@id='SSFrequencySelected']")
	WebElement ScreenShotsFrequency;

	@FindBy(xpath = "//option[@id='12']")
	WebElement Twelveperhour;

	@FindBy(xpath = "//select[@id='videoQuality']")
	WebElement Videoquality_DropDown;

	@FindBy(xpath = "//option[@id='vid1080']")
	WebElement Medium;

	@FindBy(xpath = "//label[@for='autoUpdates_id'][contains(.,'Off')]")
	WebElement AgentAutomaticUpdate;

	@FindBy(xpath = "//select[@id='IdleTime']")
	WebElement idleTimeDropdown;

	@FindBy(xpath = "//option[@id='15']")
	WebElement Fifteenmins;

	@FindBy(xpath = "//button[@id='SaveButton']")
	WebElement Save_Button;

	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[3]/i[1]")
	WebElement EmployeeAssigned_9;

	@FindBy(xpath = "//select[@id='CompletRoles1']")
	WebElement SelectRole;

	@FindBy(xpath = "//select[@id='CompletRoles1']//option[@id='340']")
	WebElement ABCDEFHKK;

	@FindBy(xpath = "//select[@id='AppendManagerList']")
	WebElement SelectEmployee_9;

	@FindBy(xpath = "//li[@id='select2-AppendManagerList-result-s02g-24614']")
	WebElement TestBulk;

	@FindBy(xpath = "//button[@id='AssignButton']")
	WebElement Assign_Button_9;

	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[@id='upgrade']/i[1]")
	WebElement UpdateTheRole;

	@FindBy(xpath = "//select[@id='AllRolesAppend']")
	WebElement WhichRole;

	@FindBy(xpath = "//button[@id='UpgradeHide']")
	WebElement Yes_Button;

	public void EmployeeFullDetails() throws InterruptedException {

		helper.waitFor(Employee_Details_9);
		helper.highLightElement(driver, Employee_Details_9);
		Employee_Details_9.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-Module");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "2");
		ShowEntries.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Show-Entries Drop-down and Selected Any Value");
		Assert.assertTrue(true, "Failed to Click on Show-Entries Drop-down and Selected Any Value");

		Thread.sleep(5000);

		helper.waitFor(Any_Employee);
		helper.highLightElement(driver, Any_Employee);
		helper.explicitlyWait(Any_Employee);
		helper.jsCLick(Any_Employee);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Any Employee");
		Assert.assertTrue(true, "Failed to Click on Any Employee");
		Thread.sleep(2000);

		helper.waitFor(productivity_9);
		helper.highLightElement(driver, productivity_9);
		helper.jsCLick(productivity_9);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on productivity Button");
		Assert.assertTrue(true, "Failed to Click on productivity Button");

		helper.waitFor(Timesheets_Btn);
		helper.highLightElement(driver, Timesheets_Btn);
		Timesheets_Btn.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Timesheets_Button ");
		Assert.assertTrue(true, "Failed to Click onTimesheets_Button ");

		helper.waitFor(Screenshots_9);
		helper.highLightElement(driver, Screenshots_9);
		Screenshots_9.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Screenshots Button");
		Assert.assertTrue(true, "Failed to Clicke on Screenshots Button");

		helper.waitFor(Webhistory_9);
		helper.highLightElement(driver, Webhistory_9);
		Webhistory_9.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Web History Button");
		Assert.assertTrue(true, "Failed to Click on Web History Button");

		helper.waitFor(AppHistory_9);
		helper.highLightElement(driver, AppHistory_9);
		AppHistory_9.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on App-History Button");
		Assert.assertTrue(true, "Failed to Click on App-History Button");

		helper.waitFor(Keystrokes_9);
		helper.highLightElement(driver, Keystrokes_9);
		Keystrokes_9.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Click on Keystrokes Button");
		Assert.assertTrue(true, "Failed to Click on Keystrokes Button");
		Thread.sleep(9000);

	}

	/*
	 * Employee insights
	 */

	@FindBy(xpath = "//a[text()='Employee Insights']")
	@CacheLookup
	WebElement Employeeinsights;

	@FindBy(xpath = "//input[@id='select_date_id']")
	@CacheLookup
	WebElement SelectDateRanges;

	@FindBy(xpath = "(//table[@class='ui-datepicker-calendar']//tbody//td)[20]")
	@CacheLookup
	WebElement Date;

	@FindBy(xpath = "//span[@id='select2-roleid-container']")
	@CacheLookup
	WebElement Role_10;

	@FindBy(xpath = "//span[@id='select2-locationid-container']")
	@CacheLookup
	WebElement Location_10;

	@FindBy(xpath = "//span[@id='select2-departmentid-container']")
	@CacheLookup
	WebElement Department_10;

	@FindBy(xpath = "//span[@id='select2-employeeid-container']")
	@CacheLookup
	WebElement Employee;

	public void EmployeeInsights() throws InterruptedException, IOException, AWTException {

		helper.waitFor(Employeeinsights);
		helper.highLightElement(driver, Employeeinsights);
		Employeeinsights.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-insights Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-insights Sub-Module");

		helper.waitFor(SelectDateRanges);
		helper.highLightElement(driver, SelectDateRanges);
		SelectDateRanges.clear();
		helper.jsCLick(Date);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Month-year Calendar Pop-up");
		Assert.assertTrue(true, "Failed to Click on  Month-year Calendar Pop-up");
		Thread.sleep(2000);

		helper.waitFor(Role_10);
		helper.highLightElement(driver, Role_10);
		Role_10.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Roles Drop-down and Selected Any Role ");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected Any Role ");

		helper.waitFor(Location_10);
		helper.highLightElement(driver, Location_10);
		Location_10.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Location Drop-down and Select Any Location ");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down  any  Select Any Location ");

		helper.waitFor(Department_10);
		helper.highLightElement(driver, Department_10);
		Department_10.click();
		helper.robot_Zero_option_selectClick();
		Department_10.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5.</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-down and Selected Any Department");

		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-employeeid-container']")))
				.click();
		Employee.click();
		helper.robot_Zero_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step6.</font></B> Clicked on Employee Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-down and Selected Any Employee");

	}

	/*
	 * Employee Notifications
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Notification')]")
	@CacheLookup
	WebElement EmployeeNotification;

	@FindBy(xpath = "//select[@onchange='locChanged(this);']")
	@CacheLookup
	WebElement SelectLocation;

	@FindBy(xpath = "//select[@id='deptoption']")
	@CacheLookup
	WebElement SelectDepartment;

	@FindBy(xpath = "//select[@id='empoption']")
	@CacheLookup
	WebElement Allemployee;

	@FindBy(xpath = "//*[@id='empoption']/option[2]")
	@CacheLookup
	WebElement Allemploye;

	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement Date2;

	@FindBy(xpath = "//li[contains(text(),'Last Month')]")
	@CacheLookup
	WebElement Lastmonth;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	WebElement CSV;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	@CacheLookup
	WebElement PDF;

	public void EmployeeNotification() throws InterruptedException {
		helper.waitFor(EmployeeNotification);
		helper.highLightElement(driver, EmployeeNotification);
		EmployeeNotification.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> Clicked on Employee Module and  Employee Notification Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and  Employee Notification Sub-Module");

		helper.waitFor(SelectLocation);
		helper.highLightElement(driver, SelectLocation);
		helper.selectDropDownValue(SelectLocation, "visibletext", "Bangalore");
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed To Click on  Location Drop-down and Selected Any Location ");

		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.selectDropDownValue(SelectDepartment, "index", "2");
		SelectDepartment.click();
		Reporter.log(
				"<B><font color = 'blue'>Step3.</font></B> Clicked on Department Drop-down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on  Department Drop-down and Selected Any Department");

		helper.waitFor(Allemployee);
		helper.highLightElement(driver, Allemployee);
		Allemployee.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Employee Drop-down  ");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-down a");

		helper.waitFor(Allemploye);
		helper.highLightElement(driver, Allemploye);
		Allemploye.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Selected Any Employee");
		Assert.assertTrue(true, "Failed to Select Any Employee");

		helper.waitFor(Date2);
		helper.highLightElement(driver, Date2);
		Date2.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Calendar and Selected Day's");
		Assert.assertTrue(true, "Failed to Click  on Calendar and Selected Day's");

		helper.waitFor(Lastmonth);
		helper.highLightElement(driver, Lastmonth);
		Lastmonth.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Last-month");
		Assert.assertTrue(true, "Failed to Click on  Last-month");

		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		helper.explicitlyWait(CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");

		helper.waitFor(PDF);
		helper.highLightElement(driver, PDF);
		helper.explicitlyWait(PDF);
		PDF.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on PDF Button");
		Assert.assertTrue(true, "Failed to Click on PDF Button");
		Thread.sleep(6000);

	}

	/*
	 * bEmployee role updated
	 */

	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement Employee_Details_r;

	@FindBy(css = ".stickyCol-wrapper")
	@CacheLookup
	WebElement Scroller_r;

	@FindBy(css = "#fetch_Details tr:nth-of-type(1) [data-toggle='modal']:nth-of-type(4) [data-toggle]")
	@CacheLookup
	WebElement UpdateRoleButton;

	@FindBy(css = "(//select[@id='AllRolesAppend']/..//preceding-sibling::span)[1]")
	@CacheLookup
	WebElement UpdateRoleSearchbar;

	@FindBy(css = "button#UpgradeHide")
	@CacheLookup
	WebElement UpdateRoleSaveButton;

	@FindBy(xpath = "(//td[@class='text-center'])[1]/a")
	@CacheLookup
	WebElement EmloyeeFullDetails;

	@FindBy(xpath = "//div[@id='UnaccessModal']/following-sibling::a[text()='Edit ']")
	@CacheLookup
	WebElement EmployeeEditButton;

	@FindBy(css = "#Emp-edit [data-dismiss]")
	@CacheLookup
	WebElement ExitButton;

	public void Update_Role_Filter() throws InterruptedException, AWTException {

		helper.waitFor(Employee_Details_r);
		helper.highLightElement(driver, Employee_Details_r);
		Employee_Details_r.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-Module");

		helper.waitFor(Scroller_r);
		helper.highLightElement(driver, Scroller_r);
		Scroller_r.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Scroller ");
		Assert.assertTrue(true, "Failed to Click on Scroller");

		helper.waitFor(UpdateRoleButton);
		helper.highLightElement(driver, UpdateRoleButton);
		helper.Scrollintoview(UpdateRoleButton);
		helper.jsCLick(UpdateRoleButton);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Update-Role Button");
		Assert.assertTrue(true, "Failed to Click on Update-Role Button");

		helper.waitFor(UpdateRoleSaveButton);
		helper.highLightElement(driver, UpdateRoleSaveButton);
		UpdateRoleSaveButton.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Update_Role-SaveButton");
		Assert.assertTrue(true, "Failed to Click on UpdateRoleSaveButton");
		Thread.sleep(4000);

		helper.waitFor(EmloyeeFullDetails);
		helper.highLightElement(driver, EmloyeeFullDetails);
		EmloyeeFullDetails.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Emloyee Full-Details");
		Assert.assertTrue(true, "Failed to Click on Emloyee Full-Details");
		Thread.sleep(4000);

		helper.waitFor(EmployeeEditButton);
		helper.highLightElement(driver, EmployeeEditButton);
		helper.jsCLick(EmployeeEditButton);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee-Edit Button");
		Assert.assertTrue(true, "Failed to Click on Employee-Edit Button");
		Thread.sleep(4000);

		helper.waitFor(ExitButton);
		helper.highLightElement(driver, ExitButton);
		helper.Scrollintoview(ExitButton);
		helper.jsCLick(ExitButton);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Exit Button");
		Assert.assertTrue(true, "Failed to Click on ExitButton");
		Thread.sleep(4000);

	}

	/*
	 * Employee_Trackuser_settings
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_t;

	@FindBy(xpath = "//button[@id='add_btn']")
	@CacheLookup
	WebElement RegisterEmployee_t;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement Firstname_t;

	@FindBy(xpath = "//input[@id='f_name']")
	@CacheLookup
	WebElement Lastname_t;

	@FindBy(xpath = "//input[@id='emp_email']")
	@CacheLookup
	WebElement email_t;

	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement password_t;

	@FindBy(xpath = "//input[@id='c_passwd']")
	@CacheLookup
	WebElement confirmpassword_t;

	@FindBy(xpath = "//input[@id='telephone']")
	@CacheLookup
	WebElement Mobilenumber_t;

	@FindBy(xpath = "//input[contains(@name,'empCode')]")
	@CacheLookup
	WebElement Employeecode_t;

	@FindBy(xpath = "//select[@id='locations-addEmp']")
	@CacheLookup
	WebElement Location_t;

	@FindBy(xpath = "//*[@id=\"emp-register\"]/div[1]/div/div[9]/div/span[1]/span[1]/span/ul")
	@CacheLookup
	WebElement Role_t;

	@FindBy(xpath = "//li[@class='select2-selection__choice'][contains(.,'×Software Tester')]")
	@CacheLookup
	WebElement SoftwareTester_t;

	@FindBy(xpath = "//select[@id='EmpReg_departments']")
	@CacheLookup
	WebElement Department_t;

	@FindBy(xpath = "//input[@id='date_joinCalender']")
	@CacheLookup
	WebElement Dateofjoining_t;

	@FindBy(xpath = "//select[@id='timeZoneAppend']")
	@CacheLookup
	WebElement Timezone_t;

	@FindBy(xpath = "//select[@id='timeZoneAppend']//option[@id='tz-opt-32']")
	@CacheLookup
	WebElement AsiaKolkata_t;

	@FindBy(xpath = "//select[@id='Shiftfilteradd']")
	@CacheLookup
	WebElement selectshift_t;

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Address_t;

	@FindBy(xpath = "//button[@id='empReg']")
	@CacheLookup
	WebElement Register_t;

	@FindBy(xpath = "//li[@id='select2-role-addEmp-result-8oh9-81']")
	WebElement SoftwareDev_t;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller_t;

	/*
	 * Must be Change id number
	 */

	@FindBy(xpath = "(//td[@class='td-action']//a)[1]")
	@CacheLookup
	WebElement Any_Employee_Trackuser_settings;

	@FindBy(xpath = "//select[@id='AppliedSetting']")
	WebElement SettingsAppliedTotheuser_t;

	@FindBy(xpath = "//input[@id='stealth']")
	WebElement Empmonitoriconhiden_t;

	@FindBy(xpath = "//input[@id='SS0']")
	WebElement ScreenShots_RadioButton_Disable_t;

	@FindBy(xpath = "//select[@id='SSFrequencySelected']")
	WebElement ScreenShotsFrequency_t;

	@FindBy(xpath = "//option[@id='12']")
	WebElement Twelveperhour_t;

	@FindBy(xpath = "//select[@id='videoQuality']")
	WebElement Videoquality_DropDown_t;

	@FindBy(xpath = "//option[@id='vid1080']")
	WebElement Medium_t;

	@FindBy(xpath = "//label[@for='autoUpdates_id'][contains(.,'Off')]")
	WebElement AgentAutomaticUpdate_t;

	@FindBy(xpath = "//select[@id='IdleTime']")
	WebElement idleTimeDropdown_t;

	@FindBy(xpath = "//option[@id='15']")
	WebElement Fifteenmins_t;

	@FindBy(xpath = "//input[@id='Scenario2']")
	WebElement Fixed;

	@FindBy(xpath = "//input[@id='FixedMonday']")
	WebElement Monday;

	@FindBy(xpath = "//input[@id='MONDAYstartTime']")
	WebElement ShiftStart;

	@FindBy(xpath = "//input[@id='MONDAYendTime']")
	WebElement Shiftend;

	@FindBy(xpath = "//input[@id='FixedTuesday']")
	WebElement Tuesday;

	@FindBy(xpath = "//input[@id='TUESDAYstartTime']")
	WebElement Tuesdaystart;

	@FindBy(xpath = "//input[@id='TUESDAYendTime']")
	WebElement Tuesdayend;

	@FindBy(xpath = "//input[@id='FixedWEDNESDAY']")
	WebElement Wednesday;

	@FindBy(xpath = "//input[@id='WEDNESDAYstartTime']")
	WebElement WednesdaystartTime;

	@FindBy(xpath = "//input[@id='WEDNESDAYendTime']")
	WebElement Wednesdayend;

	@FindBy(xpath = "//input[@id='FixedTHURSDAY']")
	WebElement Thursday;

	@FindBy(xpath = "//input[@id='THURSDAYstartTime']")
	WebElement Thursdaystart;

	@FindBy(xpath = "//input[@id='THURSDAYendTime']")
	WebElement Thursdayend;

	@FindBy(xpath = "//input[@id='FixedFRIDAY']")
	WebElement Friday;

	@FindBy(xpath = "//input[@id='FRIDAYstartTime']")
	WebElement Fridaystart;

	@FindBy(xpath = "//input[@id='FRIDAYendTime']")
	WebElement Fridayend;

	@FindBy(xpath = "//input[@id='FixedSATURDAY']")
	WebElement Saturday;

	@FindBy(xpath = "//input[@id='SATURDAYstartTime']")
	WebElement Saturdaystart;

	@FindBy(xpath = "//input[@id='SATURDAYendTime']")
	WebElement Saturdayend;

	@FindBy(xpath = "//input[@id='FixedSUNDAY']")
	WebElement Sunday;

	@FindBy(xpath = "//input[@id='SUNDAYstartTime']")
	WebElement Sundaystart;

	@FindBy(xpath = "//input[@id='SUNDAYendTime']")
	WebElement Sundayend;

	@FindBy(xpath = "//button[@id='SaveButton']")
	WebElement Save_Button_t;

	public void TrackingUserSettingsPage() throws InterruptedException, AWTException {
		helper.waitFor(EmployeeDetails_t);
		helper.highLightElement(driver, EmployeeDetails_t);
		EmployeeDetails_t.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Slected Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Clicked on Employee Module and Slected Employee-Details Sub-Module");

		helper.waitFor(RegisterEmployee_t);
		helper.highLightElement(driver, RegisterEmployee_t);
		RegisterEmployee_t.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Register-Employee Button");
		Assert.assertTrue(true, "Failed to Click on Register-Employee Button");

		helper.waitFor(Firstname_t);
		helper.highLightElement(driver, Firstname_t);
		Firstname_t.sendKeys("Auto");
		Reporter.log(
				"<B><font color = 'blue'>Step3 .</font></B> Clicked on First-Name Text Field and Enter Employee First Name ");
		Assert.assertTrue(true, "Failed to Click on First-Name Text Field and Entered First Name ");

		helper.waitFor(Lastname_t);
		helper.highLightElement(driver, Lastname_t);
		Lastname_t.sendKeys("Code");
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> Clicked on Last-Name Text Field and Enter Employee  Last Name");
		Assert.assertTrue(true, "Failed to Click on Last-Name Text Field and Entered Last Name");

		helper.waitFor(email_t);
		helper.highLightElement(driver, email_t);
		email_t.sendKeys("abcdefgh@gmail.com");
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> Clicked on E-mail Text Field and Entered Employee E-mail");
		Assert.assertTrue(true, "Failed to Click on E-mail Text Field and Entered E-mail");

		helper.waitFor(password_t);
		helper.highLightElement(driver, password_t);
		password_t.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Password Text Field and Entered Password");
		Assert.assertTrue(true, "Failed to Click on Password Text Field and Entered Password");

		helper.waitFor(confirmpassword_t);
		helper.highLightElement(driver, confirmpassword_t);
		confirmpassword_t.sendKeys("Abc@$123");
		Reporter.log(
				"<B><font color = 'blue'>Step7 .</font></B> Clicked on confirm_Password Text Field and Entered confirm_Password");
		Assert.assertTrue(true, "Failed to Click on confirm_Password Text Field and Entered confirm_Password");

		helper.waitFor(Mobilenumber_t);
		helper.highLightElement(driver, Mobilenumber_t);
		Mobilenumber_t.sendKeys("9876543210");
		Reporter.log(
				"<B><font color = 'blue'>Step8 .</font></B> Clicked on Mobile_number Text Field and Entered Employee Mobile_number");
		Assert.assertTrue(true, "Failed to Click on Mobile_number Text Field and Entered Mobile_number");

		helper.waitFor(Employeecode_t);
		helper.highLightElement(driver, Employeecode_t);
		Employeecode_t.sendKeys("CODE-123");
		Reporter.log(
				"<B><font color = 'blue'>Step9 .</font></B> Clicked on Employee_Code Text Field and Entered Employee_Code");
		Assert.assertTrue(true, "Failed to Clicked on Employee_Code Text Field and Entered Employee_Code");

		helper.waitFor(Location_t);
		helper.highLightElement(driver, Location_t);
		helper.selectDropDownValue(Location_t, "visibletext", "Bangalore");
		Reporter.log(
				"<B><font color = 'blue'>Step10 .</font></B> Clicked on Location Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-down and Selected Any Location");

		helper.waitFor(Role_t);
		helper.highLightElement(driver, Role_t);
		helper.jsCLick(Role_t);
		helper.move_to_element(Role_t);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Role Drop-down and Selected Any Role ");
		Assert.assertTrue(true, "Failed to Click  on Role Drop-down and Selected Any Role");

		helper.waitFor(Department_t);
		Department_t.click();
		helper.highLightElement(driver, Department_t);
		helper.selectDropDownValue(Department_t, "value", "Testing");
		Reporter.log(
				"<B><font color = 'blue'>Step12.</font></B> Clicked on Department Drop-down and Selected Any Departement");
		Assert.assertTrue(true, "Failed to Click  on Department Drop-down and Selected Any Departement");

		helper.waitFor(Dateofjoining_t);
		helper.highLightElement(driver, Dateofjoining_t);
		Dateofjoining_t.sendKeys("01-03-2021");
		Dateofjoining_t.click();
		Reporter.log(
				"<B><font color = 'blue'>Step13.</font></B> Clicked on Calendar Drop-down and Entered Date-of-joining");
		Assert.assertTrue(true, "Failed to Click on Calendar Drop-down and Entered Date-of-joining");

		helper.waitFor(Timezone_t);
		helper.highLightElement(driver, Dateofjoining_t);
		Dateofjoining_t.click();
		Reporter.log(
				"<B><font color = 'blue'>Step14.</font></B> Clicked on Time_zone Drop-down and Selected Any Time_Zone");
		Assert.assertTrue(true, "Failed to Click on Time_zone Drop-down and Selected Any Time_Zone");

		helper.waitFor(AsiaKolkata_t);
		helper.highLightElement(driver, AsiaKolkata_t);
		AsiaKolkata_t.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on AsiaKolkata Time bnZone ");
		Assert.assertTrue(true, "Failed to Click on  AsiaKolkata Time Zone ");

		helper.waitFor(selectshift_t);
		helper.highLightElement(driver, selectshift_t);
//	helper.selectDropDownValue(selectshift, "value", "475");
		helper.robot_third_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on select_shift Drop-down and Selected Shift");
		Assert.assertTrue(true, "Failed to Click on select_shift Drop-down and Selected Shift");

		helper.waitFor(Address_t);
		helper.highLightElement(driver, Address_t);
		Address_t.sendKeys("Hno:123,Banglore");
		Reporter.log(
				"<B><font color = 'blue'>Step17.</font></B> Clicked on Address Text Field and Entered Employee Address Data");
		Assert.assertTrue(true, "Failed to Click on Address Text Field and Entered Address Data");

		helper.waitFor(Register_t);
		helper.highLightElement(driver, Register_t);
		helper.Scrollintoview(Register_t);
		helper.jsCLick(Register_t);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on Register Button");
		Assert.assertTrue(true, "Failed to Click on Register Button");
		Thread.sleep(7000);
		driver.navigate().refresh();

		helper.waitFor(Scroller_t);
		helper.highLightElement(driver, Scroller_t);
		helper.Scrollintoview(Scroller_t);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Clicked on Scroller View");
		Assert.assertTrue(true, "Failed to Click on Scroller View");

		helper.waitFor(Any_Employee_Trackuser_settings);
		helper.highLightElement(driver, Any_Employee_Trackuser_settings);
		helper.Scrollintoview(Any_Employee_Trackuser_settings);
		helper.jsCLick(Any_Employee_Trackuser_settings);
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Clicked on Employee  Track_user_settings field");
		Assert.assertTrue(true, "Failed to Click on Employee Track_user_settings field");

		helper.waitFor(SettingsAppliedTotheuser_t);
		helper.highLightElement(driver, SettingsAppliedTotheuser_t);
		helper.Scrollintoview(SettingsAppliedTotheuser_t);
		helper.selectDropDownValue(SettingsAppliedTotheuser_t, "value", "3");
		SettingsAppliedTotheuser_t.click();
		Reporter.log(
				"<B><font color = 'blue'>Step21.</font></B> Clicked on Settings_Applied_To_the_user Drop-down and Selected Any  Value");
		Assert.assertTrue(true, "Failed to Click on Settings_Applied_To_the_user Drop-down and Selected Any nValue");

		helper.waitFor(Empmonitoriconhiden_t);
		helper.highLightElement(driver, Empmonitoriconhiden_t);
		Empmonitoriconhiden_t.click();
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Clicked on Employee  Stealth Radio Button");
		Assert.assertTrue(true, "Failed to Click on  Employee Stealth Radio Button");
		Thread.sleep(5000);

		helper.waitFor(ScreenShots_RadioButton_Disable_t);
		helper.highLightElement(driver, ScreenShots_RadioButton_Disable_t);
		ScreenShots_RadioButton_Disable_t.click();
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> Clicked on Employee  Screenshots Radio Button");
		Assert.assertTrue(true, "Failed to Clcik on  Employee ScreeShots Radio Button");
		Thread.sleep(6000);

		helper.waitFor(ScreenShotsFrequency_t);
		helper.highLightElement(driver, ScreenShotsFrequency_t);
		helper.Scrollintoview(ScreenShotsFrequency_t);
//	helper.selectDropDownValue(ScreenShotsFrequency, "value", "1");
		helper.robot_Second_option_selectClick();
		ScreenShotsFrequency_t.click();
		Reporter.log(
				"<B><font color = 'blue'>Step24.</font></B> Clicked on Screenshot Frequency Drop-down and Selected Any value ");
		Assert.assertTrue(true, "Failed to Click on Screenshot Frequency Drop-down and Selected Any value");

		helper.waitFor(Twelveperhour_t);
		helper.highLightElement(driver, Twelveperhour_t);
		Twelveperhour_t.click();
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Clicked on Time Drop-down");
		Assert.assertTrue(true, "Failed to Click on Time  DropDown");

//	helper.waitFor(Videoquality_DropDown);
//	helper.highLightElement(driver, Videoquality_DropDown);
//	helper.Scrollintoview(Videoquality_DropDown);
//	helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
//	Videoquality_DropDown.click();
//	Reporter.log("<B><font color = 'blue'>Step26.</font></B> Clicked on Video-quality Drop-down and Selected Any Value ");
//	Assert.assertTrue(true, "Failed to Click on Video-quality Drop-down and Selected Any Value");

		helper.waitFor(Medium_t);
		helper.highLightElement(driver, Medium_t);
		Medium_t.click();
		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected Employee  1080xMediumQuality");
		Assert.assertTrue(true, "Failed to Select Employee 1080xMediumQuality");

		helper.waitFor(AgentAutomaticUpdate_t);
		helper.highLightElement(driver, AgentAutomaticUpdate_t);
		AgentAutomaticUpdate_t.click();
		Reporter.log("<B><font color = 'blue'>Step28.</font></B> clicked on  Enabled  Agent-Automatic-Update");
		Assert.assertTrue(true, "Failed to click on Enable  Agent-Automatic-Update");

		helper.waitFor(idleTimeDropdown_t);
		helper.highLightElement(driver, idleTimeDropdown_t);
		idleTimeDropdown_t.click();
		Reporter.log("<B><font color = 'blue'>Step29.</font></B> Clciked on  idle-Time Drop-down");
		Assert.assertTrue(true, "Failed to Click on idle-Time  Drop-down");

		helper.waitFor(Fifteenmins_t);
		helper.highLightElement(driver, Fifteenmins_t);
		Fifteenmins_t.click();
		Reporter.log("<B><font color = 'blue'>Step30.</font></B> Selected Fifteen-mins");
		Assert.assertTrue(true, "Failed to Clcick on  Fifteen-mins");

		helper.waitFor(Fixed);
		helper.highLightElement(driver, Fixed);
		Fixed.click();
		Reporter.log("<B><font color = 'blue'>Step31.</font></B> Tracking Scenario Under  Clciked on  Fixed Option");
		Assert.assertTrue(true, "Failed to Click on Fixed");

		helper.waitFor(Monday);
		helper.highLightElement(driver, Monday);
		Monday.click();
		Reporter.log("<B><font color = 'blue'>Step32.</font></B> Selected  Monday");
		Assert.assertTrue(true, "Failed to Select  Monday");

		helper.waitFor(ShiftStart);
		helper.highLightElement(driver, ShiftStart);
		ShiftStart.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step33.</font></B> clciked on  Shift-Start Text field and Entered Value ");
		Assert.assertTrue(true, "Failed to clcik on  Shift-Start Text field and Entered Value");

		helper.waitFor(Shiftend);
		helper.highLightElement(driver, Shiftend);
		Shiftend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step34.</font></B> clciked on  Shift-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Shift-End Text field and Entered Value");

		helper.waitFor(Tuesday);
		helper.highLightElement(driver, Tuesday);
		Tuesday.click();
		Reporter.log("<B><font color = 'blue'>Step35.</font></B> Selected  Tuesday");
		Assert.assertTrue(true, "Failed to Select  Tuesday");

		helper.waitFor(Tuesdaystart);
		helper.highLightElement(driver, Tuesdaystart);
		Tuesdaystart.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step36.</font></B> clciked on  Tuesday-start Text field and Entered Value  ");
		Assert.assertTrue(true, "Failed to clcik on  Tuesday-start Text field and Entered Value");

		helper.waitFor(Tuesdayend);
		helper.highLightElement(driver, Tuesdayend);
		Tuesdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step37.</font></B> clciked on  Tuesday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Tuesday-End Text field and Entered Value");

		helper.waitFor(Wednesday);
		helper.highLightElement(driver, Wednesday);
		Wednesday.click();
		Reporter.log("<B><font color = 'blue'>Step38.</font></B> Selected  Wednesday ");
		Assert.assertTrue(true, "Failed to Select  Wednesday");

		helper.waitFor(WednesdaystartTime);
		helper.highLightElement(driver, WednesdaystartTime);
		WednesdaystartTime.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step39.</font></B>  clciked on  Wednesday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Wednesday-Start Text field and Entered Value");

		helper.waitFor(Wednesdayend);
		helper.highLightElement(driver, Wednesdayend);
		Wednesdayend.sendKeys("0700");
		Reporter.log(
				"<B><font color = 'blue'>Step40.</font></B> clciked on  Wednesday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Wednesday-End Text field and Entered Value");

		helper.waitFor(Thursday);
		helper.highLightElement(driver, Thursday);
		Thursday.click();
		Reporter.log("<B><font color = 'blue'>Step41.</font></B> Selected  Thursday");
		Assert.assertTrue(true, "Failed to Select  Thursday");

		helper.waitFor(Thursdaystart);
		helper.highLightElement(driver, Thursdaystart);
		Thursdaystart.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step42.</font></B> clciked on  Thursday-start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Thursday-start Text field and Entered Value");

		helper.waitFor(Thursdayend);
		helper.highLightElement(driver, Thursdayend);
		Thursdayend.sendKeys("0700");
		Reporter.log(
				"<B><font color = 'blue'>Step43.</font></B> clciked on  Thursday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Thursday-End Text field and Entered Value");

		helper.waitFor(Friday);
		helper.highLightElement(driver, Friday);
		Friday.click();
		Reporter.log("<B><font color = 'blue'>Step44.</font></B> Selected  Friday");
		Assert.assertTrue(true, "Failed to Select  Friday");

		helper.waitFor(Fridaystart);
		helper.highLightElement(driver, Fridaystart);
		Fridaystart.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step45.</font></B> clciked on  Friday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to click  on  Friday-Start Text field and Entered Value ");

		helper.waitFor(Fridayend);
		helper.highLightElement(driver, Fridayend);
		Fridayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step46.</font></B> clciked on  Friday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Friday-End Text field and Entered Value");

		helper.waitFor(Saturday);
		helper.highLightElement(driver, Saturday);
		Saturday.click();
		Reporter.log("<B><font color = 'blue'>Step47.</font></B> Selected  Saturday");
		Assert.assertTrue(true, "Failed to Select  Saturday");

		helper.waitFor(Saturdaystart);
		helper.highLightElement(driver, Saturdaystart);
		Saturdaystart.sendKeys("1000");
		Reporter.log(
				"<B><font color = 'blue'>Step48.</font></B> clciked on  Saturday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Saturday-Start Text field and Entered Value");

		helper.waitFor(Saturdayend);
		helper.highLightElement(driver, Saturdayend);
		Saturdayend.sendKeys("0700");
		Reporter.log(
				"<B><font color = 'blue'>Step49.</font></B> clciked on  Saturday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to   clcik on  Saturday-End Text field and Entered Value");

		helper.waitFor(Save_Button_t);
		helper.highLightElement(driver, Save_Button_t);
		helper.Scrollintoview(Save_Button_t);
		Thread.sleep(3000);
		helper.jsCLick(Save_Button_t);
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step50.</font></B> Cliked on SaveButton");
		Assert.assertTrue(true, "Failed to Click on Save_Button");

	}

	/*
	 * Admin side Track_User_Settings changing
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_at;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller_at;

	@FindBy(xpath = "(//td[@class='td-action']//a)[1]")
	WebElement Trackuser_Settings_emp;

	@FindBy(xpath = "//select[@id='AppliedSetting']")
	WebElement SettingsAppliedTotheuser_at;

	@FindBy(xpath = "//input[@id='stealth']")
	WebElement Empmonitoriconhiden_at;

	@FindBy(xpath = "//input[@id='SS0']")
	WebElement ScreenShots_RadioButton_Disable_at;

	@FindBy(xpath = "//select[@id='SSFrequencySelected']")
	WebElement ScreenShotsFrequency_at;

	@FindBy(xpath = "//option[@id='12']")
	WebElement Twelveperhour_at;

	@FindBy(xpath = "//select[@id='videoQuality']")
	WebElement Videoquality_DropDown_at;

	@FindBy(xpath = "//option[@id='vid1080']")
	WebElement Medium_at;

	@FindBy(xpath = "//label[@for='autoUpdates_id'][contains(.,'Off')]")
	WebElement AgentAutomaticUpdate_at;

	@FindBy(xpath = "//select[@id='IdleTime']")
	WebElement idleTimeDropdown_at;

	@FindBy(xpath = "//option[@id='15']")
	WebElement Fifteenmins_at;

	@FindBy(xpath = "//button[@id='SaveButton']")
	WebElement Save_Button_at;

	public void TrackUserSettings() throws InterruptedException {

		helper.waitFor(EmployeeDetails_at);
		helper.highLightElement(driver, EmployeeDetails_at);
		EmployeeDetails_at.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected  Employee_Details Sub-Module ");

		helper.waitFor(Scroller_at);
		helper.highLightElement(driver, Scroller_at);
		helper.Scrollintoview(Scroller_at);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller view ");
		Assert.assertTrue(true, "Failed to click on Scroller view ");

		helper.waitFor(Trackuser_Settings_emp);
		helper.highLightElement(driver, Trackuser_Settings_emp);
		Trackuser_Settings_emp.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee Track_user_Settings field ");
		Assert.assertTrue(true, "Failed to click on Track_user_Settings field");

		helper.waitFor(SettingsAppliedTotheuser_at);
		helper.highLightElement(driver, SettingsAppliedTotheuser_at);
		helper.Scrollintoview(SettingsAppliedTotheuser_at);
		helper.selectDropDownValue(SettingsAppliedTotheuser_at, "value", "3");
		SettingsAppliedTotheuser_at.click();
		Reporter.log(
				"<B><font color = 'blue'>Step4.</font></B> clicked on Settings_Applied_To_the_user Drop-down and Selcted Any Value ");
		Assert.assertTrue(true, "Failed to click on Settings_Applied_To_the_user Drop-down and Selcted Any Value");

		helper.waitFor(Empmonitoriconhiden_at);
		helper.highLightElement(driver, Empmonitoriconhiden_at);
		Empmonitoriconhiden_at.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Employee  Stealth Button");
		Assert.assertTrue(true, "Failed to Select Employee  Stealth Radio Button");
		Thread.sleep(5000);

		helper.waitFor(ScreenShots_RadioButton_Disable_at);
		helper.highLightElement(driver, ScreenShots_RadioButton_Disable_at);
		ScreenShots_RadioButton_Disable_at.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Employee Screen-shot Radio Button");
		Assert.assertTrue(true, "Failed to click on   Scree-Shots Radio Button");
		Thread.sleep(6000);

		helper.waitFor(ScreenShotsFrequency_at);
		helper.highLightElement(driver, ScreenShotsFrequency_at);
		helper.Scrollintoview(ScreenShotsFrequency_at);
		// helper.selectDropDownValue(ScreenShotsFrequency, "value", "3");
		ScreenShotsFrequency_at.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Screenshot Frequency Drop-down");
		Assert.assertTrue(true, "Failed to click on Screenshot Frequency Drop-down");

		helper.waitFor(Twelveperhour_at);
		helper.highLightElement(driver, Twelveperhour_at);
		Twelveperhour_at.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Twelveper-hour option");
		Assert.assertTrue(true, "Failed to click on Twelveperhour option");

		helper.waitFor(Videoquality_DropDown_at);
		helper.highLightElement(driver, Videoquality_DropDown_at);
		helper.Scrollintoview(Videoquality_DropDown_at);
		// helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
		Videoquality_DropDown_at.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on Video-Quality Drop-down");
		Assert.assertTrue(true, "Failed to Select  Video-Quality Drop-down");

		helper.waitFor(Medium_at);
		helper.highLightElement(driver, Medium_at);
		Medium_at.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Selected 1080xMediumQuality");
		Assert.assertTrue(true, "Failed to Select 1080xMediumQuality");

		helper.waitFor(AgentAutomaticUpdate_at);
		helper.highLightElement(driver, AgentAutomaticUpdate_at);
		AgentAutomaticUpdate_at.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Enabled  Agent_Automatic_Update");
		Assert.assertTrue(true, "Failed to click on  Enable  Agent_Automatic_Update");

		helper.waitFor(idleTimeDropdown_at);
		helper.highLightElement(driver, idleTimeDropdown_at);
		idleTimeDropdown_at.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on idle-Time Drop-down");
		Assert.assertTrue(true, "Failed to click on  idle-Time Drop-down");

		helper.waitFor(Fifteenmins_at);
		helper.highLightElement(driver, Fifteenmins_at);
		Fifteenmins_at.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on  Fifteen-mins");
		Assert.assertTrue(true, "Failed to click on  Fifteen-mins");

		helper.waitFor(Save_Button_at);
		helper.highLightElement(driver, Save_Button_at);
		helper.Scrollintoview(Save_Button_at);
		Thread.sleep(3000);
		Save_Button_at.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Cliked on Save Button");
		Assert.assertTrue(true, "Failed to Click on Save Button");

	}

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_ur;

	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller_ur;

	@FindBy(xpath = "(//td[@class='td-action']//a)[4]")
	WebElement UpdateTheRole_ur;

	@FindBy(xpath = "//*[@id='upgradeManagerModal']/div/div/div[2]/span[1]/span[1]/span/ul")
	WebElement WhichRole_ur;

	@FindBy(xpath = "//button[@id='UpgradeHide']")
	WebElement Yes_Button_ur;

	public void Employee_Role_Update() throws InterruptedException, AWTException {

		helper.waitFor(Employee_Details_ur);
		helper.highLightElement(driver, Employee_Details_ur);
		Employee_Details_ur.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on  Employee Module and Selected  Employee-Details Sub-Module");

		helper.waitFor(Scroller_ur);
		helper.highLightElement(driver, Scroller_ur);
		helper.Scrollintoview(Scroller_ur);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Scroller view ");
		Assert.assertTrue(true, "Failed to Click on Scroller view ");

		helper.waitFor(UpdateTheRole_ur);
		Thread.sleep(1000);
		helper.jsScrollintoview(UpdateTheRole_ur);
		helper.highLightElement(driver, UpdateTheRole_ur);
		helper.jsCLick(UpdateTheRole_ur);
		Reporter.log(
				"<B><font color = 'blue'>Step3.</font></B> Selectd Any Employee and Clicked on Updated Role Drop-down");
		Assert.assertTrue(true, "Failed to Click on  Role Drop-down");

		helper.waitFor(WhichRole_ur);
		helper.highLightElement(driver, WhichRole_ur);
		Thread.sleep(1000);
		helper.jsCLick(WhichRole);
//	helper.selectDropDownValue(WhichRole, "value", "230");
		helper.robot_third_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on  Any Role");
		Assert.assertTrue(true, "Failed to Click on  role");

		helper.waitFor(Yes_Button_ur);
		helper.highLightElement(driver, Yes_Button_ur);
		helper.jsCLick(Yes_Button_ur);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Yes_Button");
		Assert.assertTrue(true, "Failed to Select YES_button");

	}

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_ed;

	@FindBy(xpath = "(//*[@id='editedId']/i)[3]")
	@CacheLookup
	WebElement EditEmployee;

	@FindBy(xpath = "//input[@id='fullName']")
	@CacheLookup
	WebElement LastName;

	@FindBy(xpath = "//textarea[@id='Employeeaddress']")
	@CacheLookup
	WebElement Address_ed;

	@FindBy(xpath = "//button[@id='emp-edit']")
	@CacheLookup
	WebElement Update_Button;

	public void Edit_and_Update_Employee() throws InterruptedException {

		helper.waitFor(EmployeeDetails_ed);
		helper.highLightElement(driver, EmployeeDetails_ed);
		EmployeeDetails_ed.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-module");
		Thread.sleep(1000);

		helper.waitFor(EditEmployee);
		helper.Scrollintoview(EditEmployee);
		helper.move_to_element(EditEmployee);
		helper.highLightElement(driver, EditEmployee);
		helper.jsCLick(EditEmployee);
		Reporter.log(
				"<B><font color = 'blue'>Step2.</font></B> Seelected Any Employee and  Clicked on Edit-Employee Option");
		Assert.assertTrue(true, "Failed to Click on Edit-Employee Option ");

		helper.waitFor(LastName);
		helper.highLightElement(driver, LastName);
		LastName.clear();
		LastName.sendKeys("CODE");
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Edit  Employee  LastName  ");
		Assert.assertTrue(true, "Failed to Edit   LastName");
		Thread.sleep(3000);

		Random d = new Random();
		int d_num = d.nextInt(10000);

		helper.waitFor(Address_ed);
		helper.highLightElement(driver, Address_ed);
		Address_ed.clear();
		Address_ed.sendKeys("HousNo:1234,Andhra" + d_num);
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Edited  Employee  Address  ");
		Assert.assertTrue(true, "Failed to Edit   Address");
		Thread.sleep(3000);

		helper.waitFor(Update_Button);
		helper.highLightElement(driver, Update_Button);
		helper.Scrollintoview(Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B>  Clicked on Update-Button");
		Assert.assertTrue(true, "Failed to Click On Update-Button");
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_B;

	@FindBy(xpath = "(//a[text()='Download'])[2]")
	@CacheLookup
	WebElement file_download;

	@FindBy(xpath = "//button[@id='editBulkRegBtn']")
	@CacheLookup
	WebElement BulkUpdate_Button;

	@FindBy(xpath = "//label[contains(text(),'Bulk Update')]")
	@CacheLookup
	WebElement Browse_Button;

	@FindBy(xpath = "//button[@id='editBulkDomainBtn']")
	@CacheLookup
	WebElement Update_Button_B;

	public void BulkUpdate() throws InterruptedException, AWTException {

		helper.waitFor(EmployeeDetails_B);
		helper.highLightElement(driver, EmployeeDetails_B);
		EmployeeDetails_B.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee-Details");
		Assert.assertTrue(true, "Failed to clickedonEmployeeDetails");

		helper.waitFor(BulkUpdate_Button);
		helper.highLightElement(driver, BulkUpdate_Button);
		BulkUpdate_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Bulk-Update Button");
		Assert.assertTrue(true, "Failed to click on Bulk-Update  Button");

		helper.waitFor(file_download);
		helper.highLightElement(driver, file_download);
		helper.jsCLick(file_download);
		Reporter.log(
				"<B><font color = 'blue'>Step4 .</font></B> clicked on Download Users list Button and Updated Data  ");
		Assert.assertTrue(true, "Failed to click on Download Users list  and Updated Data   ");
		Thread.sleep(4000);

		helper.waitFor(Browse_Button);
		helper.highLightElement(driver, Browse_Button);
		Browse_Button.click();
		Reporter.log(
				"<B><font color = 'blue'>Step5 .</font></B> clicked on Browse_Button and Enter Employee Data  File Path");
		Assert.assertTrue(true, "Failed to click on Browse_Button and Enter Employee Data  File Path ");
		helper.uploadFile("C:\\Emp-Monitor-PR\\Emp_Monitor\\screenshots\\Employee list.xlsx");
		Thread.sleep(3000);

		helper.waitFor(Update_Button_B);
		helper.highLightElement(driver, Update_Button_B);
		Update_Button_B.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to click on Update_Button");
		Thread.sleep(6000);

	}

	/*
	 * Dynamic Changes Tests
	 */

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_BU;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries_BU;

	@FindBy(xpath = "//input[@id='SelectAllCheckBox']")
	@CacheLookup
	WebElement SelectAllCheckBox;

	@FindBy(xpath = "//button[@id='delete_btn']")
	@CacheLookup
	WebElement Deletebtn;

	@FindBy(xpath = "//button[@id='deleteModal']")
	WebElement deleteModal;

	@FindBy(xpath = "//button[@id='addBulkRegBtn']")
	WebElement BulkRegisterBtn;

	@FindBy(xpath = "//label[contains(text(),'Bulk Register')]")
	WebElement Browse;

	@FindBy(xpath = "//button[@id='addBulkDomainBtn']")
	WebElement add;

	@FindBy(xpath = "/html/body/div[7]/div/div[3]/button[1]")
	WebElement Invalid_Users_List;

	@FindBy(xpath = "//select[@id='roles']")
	WebElement Roles;

	@FindBy(xpath = "//select[@id='locations']")
	WebElement Locations;

	@FindBy(id = "ExportButton")
	WebElement Exports;

	@FindBy(id = "checklocDownload")
	WebElement all_select;

	@FindBy(xpath = "//*[@value='submit']")
	WebElement submit;

	public void BulkRegister() throws AWTException, InterruptedException {

		helper.waitFor(EmployeeDetails_BU);
		helper.highLightElement(driver, EmployeeDetails_BU);
		EmployeeDetails_BU.click();
		Reporter.log(
				"<B><font color = 'blue'>Step 1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-Module ");

		helper.highLightElement(driver, ShowEntries_BU);
		helper.selectDropDownValue(ShowEntries_BU, "index", "4");
		ShowEntries_BU.click();
		Reporter.log(
				"<B><font color = 'blue'>Step 2 .</font></B> Clicked on Show-Entries Drop-down and Selected Any Value ");
		Assert.assertTrue(true, "Failed to Click on Show-Entries Drop-down and Selected Any Value");

		/*
		 * Deleted all Register Employees
		 */

//	
//	helper.waitForpage();
//	helper.waitFor(SelectAllCheckBox);
//	helper.highLightElement(driver, SelectAllCheckBox);
//	helper.jsCLick(SelectAllCheckBox);
//	Reporter.log("<B><font color = 'blue'>Step 3 .</font></B> Selected All Select Option");
//	Assert.assertTrue(true, "Failed to Select All Select Option");
//
//	helper.waitForpage(); 
//	helper.waitFor(Deletebtn);
//	helper.highLightElement(driver, Deletebtn);
//	helper.jsCLick(Deletebtn);
//	Reporter.log("<B><font color = 'blue'>Step 4 .</font></B> clicked on Delete-Button");
//	Assert.assertTrue(true, "Failed to click on Delete-Button");
//
//	helper.waitForpage();
//	helper.waitFor(deleteModal);
//	helper.highLightElement(driver, deleteModal);
//	helper.jsCLick(deleteModal);
//	Thread.sleep(5000);
//	driver.navigate().refresh();
//	Reporter.log("<B><font color = 'blue'>Step 5 .</font></B> clicked on Delete-Modal ");
//	Assert.assertTrue(true, "Failed to click on Delete-Modal");

		helper.waitFor(BulkRegisterBtn);
		helper.highLightElement(driver, BulkRegisterBtn);
		BulkRegisterBtn.click();
		Reporter.log("<B><font color = 'blue'>Step 6 .</font></B> Clicked on Bulk-Register Button");
		Assert.assertTrue(true, "Failed to Click on Bulk-Register Button ");

		helper.waitFor(Browse);
		helper.highLightElement(driver, Browse);
		Browse.click();
		Reporter.log(
				"<B><font color = 'blue'>Step 7 .</font></B> Clicked on Browse Text Field and  Enter Register Employee's Data File Path ");
		Assert.assertTrue(true, "Failed to Click on Browse Text Field and  Enter Register Employee Data File Path  ");
		helper.uploadFile("C:\\Users\\GLB-BLR-449\\Downloads\\Employee Registration.xlsx");
		Thread.sleep(3000);

		helper.waitFor(add);
		helper.highLightElement(driver, add);
		add.click();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> Clicked on Add Button");
		Assert.assertTrue(true, "Failed to Click on Add Button ");

		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
//	Browse.sendKeys("/C:/Users/Official/Desktop/200Licences.xlsx/");
//  helper.Scrollintoview(scroller);

		/**
		 * Repeated some Employee register Xml file using click option
		 * 
		 * Invalid_Users_List
		 * 
		 **/

//	Invalid_Users_List.click();

		helper.waitFor(Roles);
		helper.highLightElement(driver, Roles);
		helper.selectDropDownValue(Roles, "visibletext", "Employee");
		Reporter.log(
				"<B><font color = 'blue'>Step 9 .</font></B> Clicked on Roles Drop-down and Selected Any Employee ");
		Assert.assertTrue(true, "Failed to Click on Roles Drop-down and Selected Any Employee");
		Thread.sleep(6000);

		helper.waitFor(Locations);
		helper.highLightElement(driver, Locations);
//	helper.selectDropDownValue(Locations, "visibletext", "Bangalore");
		helper.robot_Zero_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step 10 .</font></B> Clicked on Locations Drop-down ans Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  Locations Drop-down ans Selected Any Location");
		Thread.sleep(7000);

		helper.waitFor(Exports);
		helper.highLightElement(driver, Exports);
		Actions act = new Actions(driver);
		act.moveToElement(Exports).click().build().perform();
		Reporter.log("<B><font color = 'blue'>Step 11 .</font></B> Clicked on Exports Button ");
		Assert.assertTrue(true, "Failed to Click on Exports Button");

		helper.waitFor(all_select);
		helper.highLightElement(driver, all_select);
		all_select.click();
		Reporter.log("<B><font color = 'blue'>Step 12 .</font></B> Clicked on  Select All Option ");
		Assert.assertTrue(true, "Failed to Click on click on  Select All Option ");

		helper.waitFor(submit);
		helper.highLightElement(driver, submit);
		submit.click();
		Reporter.log("<B><font color = 'blue'>Step 13 .</font></B> Clicked on submit Button ");
		Assert.assertTrue(true, "Failed to Click on submit Button ");

	}

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails_D;

	@FindBy(xpath = "//button[@id='addBulkRegBtn']")
	WebElement BulkRegisterBtn_D;

	@FindBy(xpath = "//label[contains(text(),'Bulk Register')]")
	WebElement Browse_D;

	@FindBy(xpath = "//button[@id='addBulkDomainBtn']")
	WebElement add_D;

	@FindBy(xpath = "(//*[@name='checkbox'])[1]")
	WebElement one_emp;
	@FindBy(xpath = "(//*[@name='checkbox'])[2]")
	WebElement two_emp;

	@FindBy(xpath = "//*[@id='delete_btn']")
	WebElement delete_reg_employess;

	@FindBy(xpath = "/html/body/div[1]/div/div[7]/form[3]/div/div/div/div[3]/button[2]")
	WebElement del_modal;

	@FindBy(xpath = "//*[@id='ShowEntriesList']")
	WebElement Show_entries_list;

	public void Register_employees_and_Deleted_also() throws AWTException, InterruptedException {

		helper.waitFor(EmployeeDetails_D);
		helper.highLightElement(driver, EmployeeDetails_D);
		EmployeeDetails_D.click();
		Reporter.log(
				"<B><font color = 'blue'>Step 1 .</font></B> Clicked on Employee Module  and Clicked Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Clicked on  Employee Module  and Clicked Employee Details Sub-Module ");

		helper.waitFor(BulkRegisterBtn_D);
		helper.highLightElement(driver, BulkRegisterBtn_D);
		BulkRegisterBtn_D.click();
		Reporter.log("<B><font color = 'blue'>Step 2 .</font></B> Clicked on Bulk_Register Button");
		Assert.assertTrue(true, "Failed to Clicked on Bulk_Register Button");

		helper.waitFor(Browse_D);
		helper.highLightElement(driver, Browse_D);
		Browse_D.click();
		Reporter.log(
				"<B><font color = 'blue'>Step 3 .</font></B> Clicked on Browse_option Filed and Enter Register Employee Data File Path ");
		Assert.assertTrue(true, "Failed to Clicked on Browse_option Filed and Enter Register Employee Data File Path ");
		Thread.sleep(5000);
		helper.uploadFile("C:\\Users\\GLB-BLR-449\\Downloads\\Employee Registration.xlsx");
		Thread.sleep(3000);

		helper.waitFor(add_D);
		helper.highLightElement(driver, add_D);
		add_D.click();
		Reporter.log("<B><font color = 'blue'>Step 4 .</font></B> Clicked on Add  Button ");
		Assert.assertTrue(true, "Failed to Clicked on Add Button ");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		helper.waitFor(one_emp);
		helper.move_to_element(one_emp);
		helper.highLightElement(driver, one_emp);
		helper.jsCLick(one_emp);
		Reporter.log("<B><font color = 'blue'>Step 5 .</font></B> Selected  Any Employee(Clicking check box) ");
		Assert.assertTrue(true, "Failed to Selected on one_emp");

		helper.waitFor(two_emp);
		helper.move_to_element(two_emp);
		helper.highLightElement(driver, two_emp);
		helper.jsCLick(two_emp);
		Reporter.log("<B><font color = 'blue'>Step 6 .</font></B> Selected  Any Employee (Clicking check box)");
		Assert.assertTrue(true, "Failed to Selected on two_emp");

		helper.waitFor(delete_reg_employess);
		helper.highLightElement(driver, delete_reg_employess);
		delete_reg_employess.click();
		Reporter.log("<B><font color = 'blue'>Step 7 .</font></B> Clicked on Deleted button");
		Assert.assertTrue(true, "Failed to Clicked on Deleted Button");
		Thread.sleep(1000);

		helper.waitFor(del_modal);
		helper.highLightElement(driver, del_modal);
		del_modal.click();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> Clicked on Delete  modal_button");
		Assert.assertTrue(true, "Failed to Clicked on Delete  modal_button");
		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		helper.waitFor(Show_entries_list);
		helper.highLightElement(driver, Show_entries_list);
		helper.move_to_element_click_target(Show_entries_list);
		helper.robot_third_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step 8 .</font></B> Selected Show_entries");
		Assert.assertTrue(true, "Failed to Selected  Show_entries");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600);");

		Thread.sleep(3000);

	}
	
	/*
	 * 
	 */

	@FindBy(xpath = "//span[text()='Employee']/../i[2]")
	@CacheLookup
	WebElement Employee_T;

	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement EmployeeAttendance_T;
	
	@FindBy(xpath = "//i[@title='Total Present Count']")
	@CacheLookup
	WebElement present_show_T;
	
	
	@FindBy(xpath = "//i[@title='Total Absents Count']")
	@CacheLookup
	WebElement absent_show_T;
	
	@FindBy(xpath = "//i[@title='Total Half-day Leave Count']")
	@CacheLookup
	WebElement half_day_show_T;
	
	@FindBy(xpath = "//i[@title='Total Overtime Days Count']")
	@CacheLookup
	WebElement over_time_T;
	
	
	@FindBy(xpath = "//i[@title='Total Day-Off Count']")
	@CacheLookup
	WebElement day_off_show_T;
	
	@FindBy(xpath = "//i[@title='Total Late Count']")
	@CacheLookup
	WebElement late_show_T;
	
	
	public void Tool_Tip_showing() throws InterruptedException
	{
		
		helper.waitFor(Employee_T);
		helper.highLightElement(driver, Employee_T);
		Employee_T.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module ");
		
		  
		helper.waitFor(EmployeeAttendance_T);
		helper.highLightElement(driver, EmployeeAttendance_T);
		EmployeeAttendance_T.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Employee Attendance Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Attendance Sub-Module");
		
		Thread.sleep(4000);
		helper.waitFor(present_show_T);
		helper.highLightElement(driver, present_show_T);
		helper.move_to_element(present_show_T);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Move-to on present_show");
		Assert.assertTrue(true, "Failed to Move-to on present_show");
		
		
		Thread.sleep(4000);
		helper.waitFor(absent_show_T);
		helper.highLightElement(driver, absent_show_T);
		helper.move_to_element(absent_show_T);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>  Move-to on absent_show");
		Assert.assertTrue(true, "Failed to Move-to on absent_show");
		Thread.sleep(4000);
		
		
		helper.waitFor(half_day_show_T);
		helper.highLightElement(driver, half_day_show_T);
		helper.move_to_element(half_day_show_T);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B>  Move-to on half_day_show");
		Assert.assertTrue(true, "Failed to Move-to on half_day_show");
		Thread.sleep(4000);
		
		
		helper.waitFor(over_time_T);
		helper.highLightElement(driver, over_time_T);
		helper.move_to_element(over_time_T);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> move-to on over_time");
		Assert.assertTrue(true, "Failed to move-to on over_time");
		
		Thread.sleep(4000);
		helper.waitFor(day_off_show_T);
		helper.highLightElement(driver, day_off_show_T);
		helper.move_to_element(day_off_show_T);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Move-to on day_off_show");
		Assert.assertTrue(true, "Failed to Move-to on day_off_show");
		
		Thread.sleep(4000);
		helper.waitFor(late_show_T);
		helper.highLightElement(driver, late_show_T);
		helper.move_to_element(late_show_T);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Move-to on late_show");
		Assert.assertTrue(true, "Failed to Move-to on late_show");
		
		Thread.sleep(4000);
	
		
	}

}
