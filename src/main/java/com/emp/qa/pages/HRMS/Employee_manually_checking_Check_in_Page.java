package com.emp.qa.pages.HRMS;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.apache.cassandra.cli.CliParser.keyspace_return;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.BasePage;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.util.DataUtility;
import com.emp.qa.util.Helpers;

public class Employee_manually_checking_Check_in_Page extends BasePage {

	public Employee_manually_checking_Check_in_Page(WebDriver driver) {
		super(driver);
		
	}
	
	/*
	 *  HRMS Checking 
	 */

	DataUtility du = new DataUtility();
	Helpers helper = new Helpers();

	/* Admin side Changes Manual Clock In and Clock Out Enable or Disabled */

	@FindBy(xpath = "//span[text()='Employee']/../i[2]")
	@CacheLookup
	WebElement Employee;

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	/* Change with employee Id */

	@FindBy(xpath = "(//tbody[@id='fetch_Details']/tr[1]//a)[1]")
	@CacheLookup
	WebElement employee_select;


	@FindBy(xpath = "(//a[contains(text(),'Settings')])[2]")
	@CacheLookup
	WebElement settings;

	@FindBy(xpath = "//*[@id='manual_clock_in']")
	@CacheLookup
	WebElement enable;

	@FindBy(xpath = "//*[@id='SaveButton']")
	@CacheLookup
	WebElement save;

	/*
	 * manager side login Check
	 */

	@FindBy(xpath = "//*[@id='email']")
	WebElement user;
	@FindBy(xpath = "//*[@id='password']")
	WebElement pwd;

	@FindBy(xpath = "//*[@id='login-form']/button")
	WebElement login_button;

	@FindBy(xpath = "//i[@title='Change Role ']")
	WebElement role_change;

	// Select Role option
	@FindBy(xpath = "//a[text()='HOD-Bangalore']")
	WebElement HOD_Bangalore_click;
	@FindBy(xpath = "//a[text()='Employee']")
	WebElement employee;
	@FindBy(xpath = "//a[text()='Manager']")
	WebElement Manager;

	@FindBy(xpath = "//a[text()='Hrms']")
	WebElement hrm;

	@FindBy(xpath = "//*[@id='kt_aside_menu']/ul/li[2]/a/span")
	WebElement Attendance;


	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
	WebElement checkin_button;

	public void EmployeeFullDetails() throws InterruptedException {
		
	} 

	public void Employeecheckin() throws InterruptedException, AWTException {


		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module ");
        Thread.sleep(1000);
        
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		helper.jsCLick(EmployeeDetails);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Details Sub-Module ");

		helper.highLightElement(driver, ShowEntries);
		ShowEntries.click();
        helper.robot_fourth_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Show-Entries");
		Assert.assertTrue(true, "Failed to Clicked on Show-Entries");

		Thread.sleep(6000);

		helper.waitFor(employee_select);
		helper.highLightElement(driver, employee_select);
		helper.Scrollintoview(employee_select);
		employee_select.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Any Employee Selected");
		Assert.assertTrue(true, "Failed to Click on Any Employee selected");

		Thread.sleep(2000); 
	
		

		helper.waitFor(settings);
		helper.highLightElement(driver, settings);
		helper.move_to_element_click_target(settings);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on settings Option ");
		Assert.assertTrue(true, "Failed to Click on settings Option ");

		Thread.sleep(3000);

		helper.waitFor(enable);
		helper.highLightElement(driver, enable);
		helper.Scrollintoview(enable);
		enable.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Enable Option");
		Assert.assertTrue(true, "Failed to click on Enable Option");

		Thread.sleep(1000);

		helper.waitFor(save);
		helper.highLightElement(driver, save);
		save.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on save-button");
		Assert.assertTrue(true, "Failed to Click on save-button");



		Thread.sleep(3000);
		
	
		

	}

	/*
	 * Login Manager TL Employee log side Check out
	 */

	public void _Employee_log_side_HRM_Check_in() throws Exception

	{

		HomePage s1 = new HomePage(driver);

		driver.switchTo().newWindow(WindowType.TAB);

		Reporter.log("<B><font color = 'blue'>Step8.</font></B>  Switch to New TAB - Login With Manager");
		Assert.assertTrue(true, "Switch to New TAB - Login With Manager");

		driver.get(du.Data_info("manager_TL_Employee_URL"));
		Reporter.log("<B><font color = 'blue'>Step9.</font></B>  Manager-TL-Employee - log-page-URL ");
		Assert.assertTrue(true, "Switch to New TAB - Manager-TL-Employee - log-page");

		helper.waitFor(user);
		helper.highLightElement(driver, user);
//		user.sendKeys(du.Data_info("manager_TL_Employee_User"));
		user.sendKeys(Keys.CONTROL,"v");
		
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Entered Manager-TL-Employee User-name");
		Assert.assertTrue(true, "Failed to Enter Manager-TL-Employee User-name");

		helper.waitFor(pwd);
		helper.highLightElement(driver, pwd);
		pwd.sendKeys(du.Data_info("manager_TL_Employee_password"));
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Entered Manager-TL-Employee password");
		Assert.assertTrue(true, "Failed to Enter Manager-TL-Employee password");

		helper.waitFor(login_button);
		helper.highLightElement(driver, login_button);
		login_button.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on login_button");
		Assert.assertTrue(true, "Failed to Clicked on  login_button");

		helper.waitFor(role_change);
		helper.highLightElement(driver, role_change);
		role_change.click();
		role_change.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on  role change-button");
		Assert.assertTrue(true, "Failed to Clicked on  role change-button");

		Thread.sleep(1000);
		helper.waitFor(employee);
		helper.highLightElement(driver, employee);
		employee.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Selected  Employee");
		Assert.assertTrue(true, "Failed to Select Employee");

		s1.Skip();
		Thread.sleep(2000);

		helper.waitFor(hrm);
		helper.highLightElement(driver, hrm);
		hrm.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Clicked on HRMS");
		Assert.assertTrue(true, "Failed to Click on HRMS");

		/*
		 * Open New Tab - Display HRM
		 */

		/* selected particular TAB Selection **/

		// store parent window value in string
		String parentWindow = driver.getWindowHandle();

		// store the set of all windows
		Set<String> allwindows = driver.getWindowHandles();

		for (String childWindow : allwindows) {
			driver.switchTo().window(childWindow);
			String title = driver.getTitle();
			System.out.println(title);

			if (!title.contains("HRMS | My Profile")) {
				driver.close();
			}
		} 

		Thread.sleep(2000);

		helper.waitFor(Attendance);
		helper.highLightElement(driver, Attendance);
		Attendance.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> Clicked on  Attendance Module ");
		Assert.assertTrue(true, "Failed to Click on Attendance Module ");


		Thread.sleep(5000);		



		
//		helper.waitFor(checkin_button);
//		helper.highLightElement(driver, checkin_button);
//		checkin_button.click();
//		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on checkin_button");
//		Assert.assertTrue(true, "Failed to click on checkin_button");
		
         /*
          *  Check in
          */
		
		helper.waitFor(checkin_button);
		helper.highLightElement(driver, checkin_button);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-danger float-right']"))).click();
		checkin_button.click();
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Clicked on checkin_button");
		Assert.assertTrue(true, "Failed to Click on checkin_button");
		
		
		
		/*
         *  Check out
         */
		
		helper.waitFor(checkin_button);
		helper.highLightElement(driver, checkin_button);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-danger float-right']"))).click();
		checkin_button.click();
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Clicked on checkOUT_button");
		Assert.assertTrue(true, "Failed to Click on checkOUT_button");

		 

	} 

}
