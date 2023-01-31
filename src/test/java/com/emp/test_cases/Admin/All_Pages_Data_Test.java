package com.emp.test_cases.Admin;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.All_Pages_Data_Page;
import com.emp.qa.pages.Admin.HomePage;
import com.opencsv.exceptions.CsvException;

public class All_Pages_Data_Test extends TestBase {

	@Test(priority = 1)
	public void Pages_and_Modules_Test() throws Exception {

		All_Pages_Data_Page page_Data=new All_Pages_Data_Page(getDriver());
		page_Data.Pages_Data_Info_demo();
		
	
	}
	@Test(priority = 2)
	public void Calendar_Eye_Icon_Message_Checking_Test() throws InterruptedException, AWTException, IOException, CsvException{
		All_Pages_Data_Page eye_icon_Test=new All_Pages_Data_Page(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.clickEmployee();
		eye_icon_Test.Calendar_Eye_Icon_1();
		
		
		
} 

}
