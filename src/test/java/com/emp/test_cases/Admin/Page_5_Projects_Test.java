package com.emp.test_cases.Admin;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_5_Projects;

public class Page_5_Projects_Test extends TestBase {


	@Test(priority = 1)
	public void Create_New_Project() throws InterruptedException, AWTException{
		Page_5_Projects createProjectsPage=new Page_5_Projects(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ProjectsPage(); 
		createProjectsPage.Create_Project_Page();

}
	
	
	@Test(priority = 2)

	public void Project_Add_project_Details() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_5_Projects add_project_details_T = new Page_5_Projects(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.Create_Project_Page();

	} 

	@Test(priority = 3)

	public void Project_Task_Card_Progress_to_complete() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_5_Projects add_project_details_T = new Page_5_Projects(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.Task_Card_Progress_to_complete();

	}

	@Test(priority = 4)

	public void Project_Task_Card_complete_to_Hold() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Page_5_Projects add_project_details_T = new Page_5_Projects(getDriver());

		homePage.ProjectsPage();
		add_project_details_T.Task_Card_complete_to_Hold();

	}

}
