package com.emp.qa.pages.Admin;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Page_5_Projects extends BasePage {

	public Page_5_Projects(WebDriver driver) {
		super(driver);

	}

	public Helpers helper = new Helpers();

	@FindBy(id = "addProjectButton")
	@CacheLookup
	WebElement add_project_Details_button;

	@FindBy(css = "[class='btn btn-secondary nextForm']")
	@CacheLookup
	WebElement Next_button;

	@FindBy(css = "#createProject")
	@CacheLookup
	WebElement project_name;

	@FindBy(xpath = "//*[@id='pro_detail']/div[2]/div[2]/div[1]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_manager;

	@FindBy(xpath = "//*[@id=\"pro_detail\"]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_members;

	@FindBy(xpath = "//*[@id='createProjectStartDate']")
	@CacheLookup
	WebElement create_Project_StartDate;

	@FindBy(xpath = "//*[@id='createProjectEndDate']")
	@CacheLookup
	WebElement create_Project_EndDate;

	@FindBy(xpath = "//*[@id='nextButtton']")
	@CacheLookup
	WebElement Next_buttom_project;

	/*
	 * Add Module Details
	 */

	@FindBy(xpath = "//*[@id='moduleProjectName']")
	@CacheLookup
	WebElement module_project_name;

	@FindBy(xpath = "//*[@id='moduleStartDate']")
	@CacheLookup
	WebElement module_StartDate;

	@FindBy(xpath = "//*[@id='moduleEndDate']")
	@CacheLookup
	WebElement module_EndDate;

	@FindBy(xpath = "//*[@id='moduleNextButtton']")
	@CacheLookup
	WebElement Next_Button_Module;

	/*
	 * Add task
	 */

	@FindBy(xpath = "//*[@id='taskName']")
	@CacheLookup
	WebElement task_name;

	@FindBy(xpath = "//*[@id='taskPriority']")
	@CacheLookup
	WebElement Priority;

	@FindBy(xpath = "//*[@id='taskStartDate']")
	@CacheLookup
	WebElement Task_start_Date;

	@FindBy(xpath = "//*[@id='taskEndDate']")
	@CacheLookup
	WebElement task_Enddate;

	@FindBy(xpath = "//*[@id='pro_task']/div[3]/div[2]/button[1]")
	@CacheLookup
	WebElement Save_project_button;

	@FindBy(xpath = "//input[@id='createProject']")
	@CacheLookup
	WebElement Projectname;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "//select[@id='filterStatusList']")
	@CacheLookup
	WebElement SelectStatus;

	@FindBy(xpath = "//b[contains(text(),'testing4')]")
	@CacheLookup
	WebElement ProjectName;

	@FindBy(xpath = "//a[@id='myBtn1']")
	@CacheLookup
	WebElement ShowMore;

	@FindBy(xpath = "//a[contains(text(),'Add Module')]")
	@CacheLookup
	WebElement AddModule;

	@FindBy(xpath = "//button[@id='addModuleButton']")
	@CacheLookup
	WebElement AddModule_Button;

	@FindBy(xpath = "//select[@id='projectsList']")
	@CacheLookup
	WebElement projectname;

	@FindBy(xpath = "//input[@id='createModuleName']")
	@CacheLookup
	WebElement ModuleName;

	@FindBy(xpath = "//input[@id='createModuleStartDate']")
	@CacheLookup
	WebElement StartDate;

	@FindBy(xpath = "//input[@id='createModuleEndDate']")
	@CacheLookup
	WebElement EndDate;

	@FindBy(xpath = "//*[@id=\"newModule\"]/div/div/div[3]/button")
	@CacheLookup
	WebElement Save;

	public void Create_Project_Page() throws InterruptedException, AWTException {

		Reporter.log("<B><font color = 'blue'>Step1.</font></B> Clicked on Projects Module  ");

		helper.highLightElement(driver, add_project_Details_button);
		add_project_Details_button.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Add_project button ");
		Assert.assertTrue(true, "Failed to Click on add_project button");

		helper.highLightElement(driver, Next_button);
		Next_button.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Next_Button");
		Assert.assertTrue(true, "Failed to Click on Next_button");

		Random g = new Random();
		int num = g.nextInt(1000);
		String Actactual_Name = "Test dev Emp project ";
		String expected_name = Actactual_Name + num;

		helper.highLightElement(driver, project_name);
		project_name.click();
		project_name.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Entered  Project Name ");
		Assert.assertTrue(true, "Failed to Enter project Name ");

		helper.highLightElement(driver, select_manager);
		select_manager.click();
		helper.robot_frist_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step5.</font></B> Clicked on Manager Drop-Down and  Selected any manager");
		Assert.assertTrue(true, "Failed to Select Any manager");

		helper.highLightElement(driver, select_members);
		select_members.click();
		helper.robot_frist_option_selectClick();
		Reporter.log(
				"<B><font color = 'blue'>Step6.</font></B> Clicked on Member Drop-down and  Selected any Employees");
		Assert.assertTrue(true, "Failed to select Any member");

		helper.highLightElement(driver, create_Project_StartDate);
		create_Project_StartDate.click();
		create_Project_StartDate.clear();
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
//		 LocalDate timeStamp = LocalDate.now();
//		 LocalDate timeStamp1 = timeStamp.plusMonths(2);

		create_Project_StartDate.sendKeys(timeStamp);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Calendar Pop-Up  and  Enter Start-Date");
		Assert.assertTrue(true, "Failed to Enter Start-Date");

		helper.highLightElement(driver, create_Project_EndDate);
		create_Project_EndDate.click();
		create_Project_EndDate.sendKeys("01122024");
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Calendar Pop-Up  and Enter End-Date");
		Assert.assertTrue(true, "Failed to Enter  End-Date");

		helper.highLightElement(driver, Next_buttom_project);
		Next_buttom_project.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on next_button");
		Assert.assertTrue(true, "Failed to Click on next_button");
		Thread.sleep(2000);

		/*
		 * Add module
		 */

		Random r1 = new Random();
		int num1 = r1.nextInt(1000);
		String Actactual_Name1 = "dev emp module  ";
		String expected_name1 = Actactual_Name1 + num1;

		helper.highLightElement(driver, module_project_name);
		module_project_name.click();
		module_project_name.sendKeys(expected_name1);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Enter module name");
		Assert.assertTrue(true, "Failed to Enter module name ");

		helper.highLightElement(driver, module_StartDate);
		module_StartDate.click();
		module_StartDate.clear();
		String timeStampm = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		module_StartDate.sendKeys(timeStampm);
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Calendar Pop-Up  and Start-Date");
		Assert.assertTrue(true, "Failed to Enter  Start-Date");

		helper.highLightElement(driver, module_EndDate);
		module_EndDate.click();
		Thread.sleep(1000);
		module_EndDate.sendKeys("27112023");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Calendar Pop-Up  and End-Date");
		Assert.assertTrue(true, "Failed to Enter  End-Date");

		helper.highLightElement(driver, Next_Button_Module);
		Next_Button_Module.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Next_button");
		Assert.assertTrue(true, "Failed to Click on Next_button");
		Thread.sleep(1000);

		/*
		 * Add Task
		 */

		Random r2 = new Random();
		int num2 = r2.nextInt(1000);
		String Actactual_Name2 = "dev emp task  ";
		String expected_name2 = Actactual_Name2 + num2;

		helper.highLightElement(driver, task_name);
		task_name.click();
		task_name.sendKeys(expected_name2);
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Enter Task name ");
		Assert.assertTrue(true, "Failed to Enter Task name ");

		helper.highLightElement(driver, Priority);
		helper.selectDropDownValue(Priority, "value", "3");
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked Priority Drop--Down and Select Any Priority ");
		Assert.assertTrue(true, "Failed to Click on  Priority Drop--Down and Select Any Priority ");
		Thread.sleep(1000);

		helper.highLightElement(driver, Task_start_Date);
		Task_start_Date.click();
		Task_start_Date.click();
		String timeStampt = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		Task_start_Date.sendKeys(timeStampt);
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on Calendar Pop-Up  and Start-Date");
		Assert.assertTrue(true, "Failed to Enter  Start-Date");

		helper.highLightElement(driver, task_Enddate);
		task_Enddate.click();
		task_Enddate.sendKeys("24122022");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Clicked on Calendar Pop-Up  and End-Date");
		Assert.assertTrue(true, "Failed to Enter  End-Date");

		helper.highLightElement(driver, Save_project_button);
		helper.jsCLick(Save_project_button);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on save Button");
		Assert.assertTrue(true, "Failed to Click on save_Button");
		Thread.sleep(5000);
		driver.navigate().refresh();

		Thread.sleep(8000);

	}

	/*
	 * 
	 */

	@FindBy(id = "addProjectButton")
	@CacheLookup
	WebElement add_project_Details_button_UP;

	@FindBy(css = "[class='btn btn-secondary nextForm']")
	@CacheLookup
	WebElement Next_button_UP;

	@FindBy(css = "#createProject")
	@CacheLookup
	WebElement project_name_UP;

	@FindBy(xpath = "//*[@id='pro_detail']/div[2]/div[2]/div[1]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_manager_UP;

	@FindBy(xpath = "//*[@id=\"pro_detail\"]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_members_UP;

	@FindBy(xpath = "//*[@id='createProjectStartDate']")
	@CacheLookup
	WebElement create_Project_StartDate_UP;

	@FindBy(xpath = "//*[@id='createProjectEndDate']")
	@CacheLookup
	WebElement create_Project_EndDate_UP;

	@FindBy(xpath = "//*[@id='nextButtton']")
	@CacheLookup
	WebElement Next_buttom_project_UP;

	/*
	 * Add Module Details
	 */

	@FindBy(xpath = "//*[@id='moduleProjectName']")
	@CacheLookup
	WebElement module_project_name_UP;

	@FindBy(xpath = "//*[@id='moduleStartDate']")
	@CacheLookup
	WebElement module_StartDate_UP;

	@FindBy(xpath = "//*[@id='moduleEndDate']")
	@CacheLookup
	WebElement module_EndDate_UP;

	@FindBy(xpath = "//*[@id='moduleNextButtton']")
	@CacheLookup
	WebElement Next_Button_Module_UP;

	/*
	 * Add task
	 */

	@FindBy(xpath = "//*[@id='taskName']")
	@CacheLookup
	WebElement task_name_UP;

	@FindBy(xpath = "//*[@id='taskPriority']")
	@CacheLookup
	WebElement Priority_UP;

	@FindBy(xpath = "//*[@id='taskStartDate']")
	@CacheLookup
	WebElement Task_start_Date_UP;

	@FindBy(xpath = "//*[@id='taskEndDate']")
	@CacheLookup
	WebElement task_Enddate_UP;

	@FindBy(xpath = "//*[@id='pro_task']/div[3]/div[2]/button[1]")
	@CacheLookup
	WebElement Save_project_button_UP;

	@FindBy(xpath = "//tbody[@id='projectsList']/tr[1]//b[.='1  Tasks']")
	@CacheLookup
	WebElement ClickOnTask_UP;

	@FindBy(xpath = "//*[@class='editTask']/i")
	@CacheLookup
	WebElement ClickOnTaskEditButton_UP;

	@FindBy(xpath = "//*[@id='taskUpdateStatus']")
	@CacheLookup
	WebElement TaskStatus_UP;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	@CacheLookup
	WebElement Update_Button_UP;

	public void Add_project_Details() throws InterruptedException, AWTException {

		helper.highLightElement(driver, add_project_Details_button_UP);
		add_project_Details_button_UP.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1.</font></B> Clicked on Project Module and clicked on  add_project_button ");
		Assert.assertTrue(true, "Failed to Click on add_project_button");

		helper.highLightElement(driver, Next_button_UP);
		Next_button_UP.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Next_button");
		Assert.assertTrue(true, "Failed to Click on Next_button");

		Random g = new Random();
		int num = g.nextInt(1000);
		String Actactual_Name = "Test dev Emp project ";
		String expected_name = Actactual_Name + num;

		helper.highLightElement(driver, project_name_UP);
		project_name_UP.click();
		project_name_UP.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Text Field and Entered Project Name ");
		Assert.assertTrue(true, "Failed to Click on Text Field and Entered Project Name");

		helper.highLightElement(driver, select_manager_UP);
		select_manager_UP.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on manager Drop-down and Select Any  Manager");
		Assert.assertTrue(true, "Failed to Click on manager Drop-down and Slect Any  Managerr");

		helper.highLightElement(driver, select_members_UP);
		select_members_UP.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Member  Drop-down and Select Any  Members ");
		Assert.assertTrue(true, "Failed to Click on Member  Drop-down and Select Any  Members");

		helper.highLightElement(driver, create_Project_StartDate_UP);
		create_Project_StartDate_UP.click();
		create_Project_StartDate_UP.clear();
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		create_Project_StartDate_UP.sendKeys(timeStamp);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Calendar Pop-up and Enter Start-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Entered Start-Date");

		helper.highLightElement(driver, create_Project_EndDate_UP);
		create_Project_EndDate_UP.click();
		create_Project_EndDate_UP.sendKeys("01122024");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Calendar Pop-up and Enter End-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Enter End-Date");

		helper.highLightElement(driver, Next_buttom_project_UP);
		Next_buttom_project_UP.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Next_button");
		Assert.assertTrue(true, "Failed to Click on Next_button");
		Thread.sleep(2000);

		/*
		 * Add module
		 */

		Random r1 = new Random();
		int num1 = r1.nextInt(1000);
		String Actactual_Name1 = "dev emp module  ";
		String expected_name1 = Actactual_Name1 + num1;

		helper.highLightElement(driver, module_project_name_UP);
		module_project_name_UP.click();
		module_project_name_UP.sendKeys(expected_name1);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Module Text Field and Enter Module Name ");
		Assert.assertTrue(true, "Failed to Click on Module Text Field and Enter Module Name ");

		helper.highLightElement(driver, module_StartDate_UP);
		module_StartDate_UP.click();
		module_StartDate_UP.clear();
		String timeStampm = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		module_StartDate_UP.sendKeys(timeStampm);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on Calendar Pop[-up and Enter Start-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Enter Start-Date");

		helper.highLightElement(driver, module_EndDate_UP);
		module_EndDate_UP.click();
		Thread.sleep(1000);
		module_EndDate_UP.sendKeys("27112023");
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Calendar Pop-Up and Enter End-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Enter End-Date");

		helper.highLightElement(driver, Next_Button_Module_UP);
		Next_Button_Module_UP.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Next_button");
		Assert.assertTrue(true, "Failed to Click on Next_button");
		Thread.sleep(1000);

		/*
		 * Add Task
		 */

		Random r2 = new Random();
		int num2 = r2.nextInt(1000);
		String Actactual_Name2 = "dev emp task  ";
		String expected_name2 = Actactual_Name2 + num2;

		helper.highLightElement(driver, task_name_UP);
		task_name_UP.click();
		task_name_UP.sendKeys(expected_name2);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Task Text Field and Enter Task Name  ");
		Assert.assertTrue(true, "Failed to Click on Task Text Field and Enter Task Name  ");

		helper.highLightElement(driver, Priority_UP);
		helper.selectDropDownValue(Priority_UP, "value", "3");
		Reporter.log(
				"<B><font color = 'blue'>Step14.</font></B> Clicked on Priority Drop-down and Selected Any Value  ");
		Assert.assertTrue(true, "Failed to  Click on Priority Drop-down and Selected Any Value ");
		Thread.sleep(1000);

		helper.highLightElement(driver, Task_start_Date_UP);
		Task_start_Date_UP.click();
		Task_start_Date_UP.click();
		String timeStampt = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		Task_start_Date_UP.sendKeys(timeStampt);
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on Calendar Pop-up and Enter Start-Date");
		Assert.assertTrue(true, "Failed to click on Calendar Pop-up and Enter Start-Date");

		helper.highLightElement(driver, task_Enddate_UP);
		task_Enddate_UP.click();
		task_Enddate_UP.sendKeys("24122022");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on Calendar Pop- Up and Enter End-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Enter End-Date");

		helper.highLightElement(driver, Save_project_button_UP);
		helper.jsCLick(Save_project_button_UP);
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Clicked on save Button");
		Assert.assertTrue(true, "Failed to Click on save Button");
		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(1000);

		helper.highLightElement(driver, ClickOnTask_UP);
		helper.jsCLick(ClickOnTask_UP);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on Task");
		Assert.assertTrue(true, "Failed to Task");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton_UP);
		helper.move_to_element_click_target(ClickOnTaskEditButton_UP);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Clicked On  Task-Edit Button");
		Assert.assertTrue(true, "Failed to Click On Task-Edit Button");

		helper.highLightElement(driver, TaskStatus_UP);
		helper.selectDropDownValue(TaskStatus_UP, "value", "1");
		Reporter.log(
				"<B><font color = 'blue'>Step20.</font></B> Clicked on  Task-Status Drop-down and Selected Status ");
		Assert.assertTrue(true, "Failed to Click on Task-Status Drop-down and Selected Status");

		helper.highLightElement(driver, Update_Button_UP);
		helper.jsCLick(Update_Button_UP);
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> Clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Clicked On Update_Button");
		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(2000);

	}

	public void Task_Card_Progress_to_complete() throws InterruptedException, AWTException {

		helper.highLightElement(driver, ClickOnTask_UP);
		helper.jsCLick(ClickOnTask_UP);
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Clicked on Task");
		Assert.assertTrue(true, "Failed to Click on Task");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton_UP);
		helper.move_to_element_click_target(ClickOnTaskEditButton_UP);
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> Clicked On Task_Edit Button  ");
		Assert.assertTrue(true, "Failed to Click On Task_Edit Button ");
		Thread.sleep(1000);

		helper.highLightElement(driver, TaskStatus_UP);
		helper.move_to_element(TaskStatus_UP);
		helper.selectDropDownValue(TaskStatus_UP, "value", "2");
		Reporter.log(
				"<B><font color = 'blue'>Step22.</font></B> Clicked on  Task-Status Drop-down and Selected Status");
		Assert.assertTrue(true, "Failed to Click on  Task-Status Drop-down and Selected Status");

		helper.highLightElement(driver, Update_Button_UP);
		helper.jsCLick(Update_Button_UP);
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Click on  Update_Button");
		Thread.sleep(3000);

	}

	public void Task_Card_complete_to_Hold() throws InterruptedException, AWTException {

		helper.highLightElement(driver, ClickOnTask_UP);
		helper.jsCLick(ClickOnTask_UP);
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Clicked on Task");
		Assert.assertTrue(true, "Failed to Click on Task");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton_UP);
		helper.move_to_element_click_target(ClickOnTaskEditButton_UP);
		Reporter.log("<B><font color = 'blue'>Step26.</font></B> Clicked  On Task_Edit Button ");
		Assert.assertTrue(true, "Failed to Click  On Task_Edit Button ");
		Thread.sleep(1000);

		helper.highLightElement(driver, TaskStatus_UP);
		helper.selectDropDownValue(TaskStatus_UP, "value", "0");
		Reporter.log(
				"<B><font color = 'blue'>Step27.</font></B> Clicked on  Task-Status Drop-down and Selected Status");
		Assert.assertTrue(true, "Failed to Click on  Task-Status Drop-down and Selected Status)");

		helper.highLightElement(driver, Update_Button_UP);
		helper.jsCLick(Update_Button_UP);
		Reporter.log("<B><font color = 'blue'>Step28.</font></B> Clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Click On Update_Button");
		Thread.sleep(8000);

	}

}
