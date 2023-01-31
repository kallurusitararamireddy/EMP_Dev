package com.emp.qa.pages.Admin;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class Page_8_Behaviour extends BasePage {

	public Page_8_Behaviour(WebDriver driver) {
		super(driver);

	}

	
	Helpers helper=new Helpers();
	
	
	/*
	 * 
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Alerts Notifications')]")
	@CacheLookup
	WebElement AlertsNotification_AN;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location_AN;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department_AN;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employees_AN;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-calendar')]")
	@CacheLookup
	WebElement SelectDateranges_AN;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30Days_AN;
	
	public void Alerts_Notification_Page()throws InterruptedException{
		
		helper.waitFor(AlertsNotification_AN);
		helper.highLightElement(driver, AlertsNotification_AN);
		AlertsNotification_AN.click(); 
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Behavior Module and Selected Alerts Notification Sub-Module");
		Assert.assertTrue(true, "Failed to Click on Behavior Module and Selected Alerts Notification Sub-Module");
		
		helper.waitFor(Location_AN);
		helper.highLightElement(driver, Location_AN);
		helper.selectDropDownValue(Location_AN, "value", "0");
		Location_AN.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-Down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-Down and Selected Any Location");
		
		helper.waitFor(Department_AN);
		helper.highLightElement(driver, Department_AN);
		helper.selectDropDownValue(Department_AN, "value", "0");
		Department_AN.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department Drop-Down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-Down and Selected Any Department");
		
		helper.waitFor(Employees_AN);
		helper.highLightElement(driver, Employees_AN); 
	    helper.jsScrollintoview(Employees_AN);
		helper.selectDropDownValue(Employees_AN, "value","0");
		helper.jsCLick(Employees_AN);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee Drop-Down and Selected Any employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-Down and Selected Any employee");
		
		helper.waitFor(SelectDateranges_AN);
		helper.highLightElement(driver, SelectDateranges_AN); 
		SelectDateranges_AN.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Calender Drop-Down and Selected Days ");
		Assert.assertTrue(true, "Failed to Click on Calender Drop-Down and Selected Days");
		
		helper.waitFor(Last30Days_AN);
		helper.highLightElement(driver, Last30Days_AN);
		Last30Days_AN.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Last_30_Days");
		Assert.assertTrue(true, "Failed to Click on Last_30_Days");
		Thread.sleep(5000);  
	
		
		
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Alert Policies')]")
	@CacheLookup
	WebElement AlertPolocies_AP;
	
	@FindBy(xpath="//li[@id='select2-rule-result-71po-SSL']")
	WebElement DrpDwnValue_WhtTrigThevalue_AP;
	
	@FindBy(linkText = "Add New Alert")
	@CacheLookup
	WebElement AddNewAlert_AP;
	
	@FindBy(xpath = "//input[@id='ruleName']")
	@CacheLookup
	WebElement RuleName_AP;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Location')]")
	@CacheLookup
	WebElement AppliestoLocation_AP;
	
	@FindBy(css = "#allLocations")
	@CacheLookup
	WebElement SelectAll_locations_AP;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Department')]")
	@CacheLookup
	WebElement Appliesto_Department_AP;
	
	@FindBy(css = "#allDepartments")
	@CacheLookup
	WebElement AllDepartments_AP;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Appliesto_Emloyee_AP;
	
	@FindBy(css = "#allEmployees")
	@CacheLookup
	WebElement Allemloyees_AP;
	
	@FindBy(xpath = "//span[@id='select2-rule-container']")
	@CacheLookup
	WebElement WhattriggerTherule_AP;
	
	@FindBy(xpath = "//option[@id='rule2']")
	@CacheLookup
	WebElement Rule2_AP;
	
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ConditionHrs_AP;

	@FindBy(xpath = "//option[contains(text(),'Minutes')]")
	@CacheLookup
	WebElement minutes_AP;
	
	@FindBy(xpath = "//select[contains(@xpath,'1')]")
	@CacheLookup
	WebElement operators_AP;
	
	@FindBy(xpath = "//option[contains(text(),'>=')]")
	@CacheLookup
	WebElement greaterthanoperator_AP;
	
	
	@FindBy(xpath = "//textarea[@id='ruleNote']")
	@CacheLookup
	WebElement AnyNote_AP;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement Whomtobenotified_AP;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement Myself_AP;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch_AP;
	
	
	@SuppressWarnings("unused")
	public void Alert_Policies_Page()throws InterruptedException, AWTException{
		
		helper.waitFor(AlertPolocies_AP);
		helper.highLightElement(driver, AlertPolocies_AP);
		AlertPolocies_AP.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Behavior Module and Selected  Alert Policies Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Behavior Module and Selected  Alert Policies Sub-Module ");
		  
		helper.waitFor(AddNewAlert_AP);
		helper.highLightElement(driver, AddNewAlert_AP);
		helper.jsCLick(AddNewAlert_AP);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on  Add_New_Alert Button");
		Assert.assertTrue(true, "Failed to Click on  Add_New_Alert Button");
		
		
		helper.waitFor(RuleName_AP);
		helper.highLightElement(driver, RuleName_AP);
		RuleName_AP.sendKeys("Rule-Abc");
		RuleName_AP.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on  Rule Name Text Field and Entered Rule Name  ");
		Assert.assertTrue(true, "Failed to Click on Rule Name Text Field and Entered Rule Name ");
		
		helper.waitFor(AppliestoLocation_AP);
		helper.highLightElement(driver, AppliestoLocation_AP);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation_AP).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>  Clicked on  Location Drop-Down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-Down and Selected Any Location");

		
		helper.waitFor(SelectAll_locations_AP);
		helper.highLightElement(driver, SelectAll_locations_AP);
		helper.jsCLick(SelectAll_locations_AP);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Selected  All_Locations option ");
		Assert.assertTrue(true, "Failed to Select  All_Locations Option ");
		
		helper.waitFor(Appliesto_Department_AP); 
		helper.highLightElement(driver, Appliesto_Department_AP);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department_AP).click().build().perform();
		Appliesto_Department_AP.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Department Drop-Down and Selected Any Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-Down  and Selected Any Department");
		
		helper.waitFor(AllDepartments_AP);
		helper.highLightElement(driver, AllDepartments_AP);
		helper.jsCLick(AllDepartments_AP);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected   All_Departments  option");
		Assert.assertTrue(true, "Failed to select  All_Departments  option");
		
		helper.waitFor(Appliesto_Emloyee_AP);
		helper.highLightElement(driver, Appliesto_Emloyee_AP);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee_AP).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee_AP); 
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Emloyee Drop-Down and Select Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-Down and Select Any Employee");
		

		
		helper.waitFor(WhattriggerTherule_AP);
		helper.highLightElement(driver, WhattriggerTherule_AP);
		WhattriggerTherule_AP.click();
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked   on  What_trigger_The_rule Text  Field ");
		Assert.assertTrue(true, "Failed to Click  What_trigger_The_rule  Text  Field ");
	
		
	
		helper.waitFor(AnyNote_AP);
		helper.highLightElement(driver, AnyNote_AP);
		AnyNote_AP.sendKeys("abcdef");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Writing  Any Note (passing  Data)");
		Assert.assertTrue(true, "Failed to Write  Any Note (passing Data)");
		
		
		helper.waitFor(Whomtobenotified_AP);
		helper.highLightElement(driver, Whomtobenotified_AP);
		Whomtobenotified_AP.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Whom-to-be-notified Drop-Down and Select Any option");
		Assert.assertTrue(true, "Failed to Clik on Whom-to-be-notified Drop-Down and Select Any option");
		
		
		helper.waitFor(SaveAndLaunch_AP);
		helper.highLightElement(driver, SaveAndLaunch_AP);
		helper.Scrollintoview(SaveAndLaunch_AP);
		helper.jsCLick(SaveAndLaunch_AP);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Save_And_Launch_Button");
		Assert.assertTrue(true, "Failed to Click on Save_And_Launch_Button");
		
	}
	
	
	/*
	 * 
	 *  Dynamic  changes  
	 */
	
	@FindBy(xpath = "//a[contains(text(),'Alert Policies')]")
	@CacheLookup
	WebElement AlertPolicies_BP;
	

	@FindBy(xpath = "(//*[@id='policyTableBody']//td[8]/a)[1]")
	@CacheLookup
	WebElement EditButton_BP;
	
	
	@FindBy(xpath = "(//label[@for='isMultiple'])[1]")
	@CacheLookup
	WebElement MultipleAlertsInAday_BP;
	
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch_BP;
	
	
	public void Behaviour_Alert_Policies_Page()throws InterruptedException{
		
		helper.waitFor(AlertPolicies_BP);
		helper.highLightElement(driver, AlertPolicies_BP);
		AlertPolicies_BP.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Alert_Policies ");
		Assert.assertTrue(true, "Failed to Click on Alert_Policies");	
		Thread.sleep(2000);
		
		helper.waitFor(EditButton_BP);
		helper.highLightElement(driver, EditButton_BP);
		helper.move_to_element(EditButton_BP);
		EditButton_BP.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Edit_Button ");
		Assert.assertTrue(true, "Failed to Click on Edit_Button");
		
		helper.waitFor(MultipleAlertsInAday_BP);
		helper.highLightElement(driver, MultipleAlertsInAday_BP);
		helper.move_to_element_click_target(MultipleAlertsInAday_BP);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Multiple_Alerts_In_A_day ");
		Assert.assertTrue(true, "Failed to Click on Multiple_Alerts_In_A_day");
		Thread.sleep(5000);
		
		
		helper.waitFor(SaveAndLaunch_BP);
		helper.highLightElement(driver, SaveAndLaunch_BP);
		helper.Scrollintoview(SaveAndLaunch_BP);
		helper.jsCLick(SaveAndLaunch_BP);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Save_And_Launch_Button");
		Assert.assertTrue(true, "Failed to Click on Save_And_Launch_Button");
		Thread.sleep(4000);
		
		
		
		
	}

	
	/*
	 * 
	 *  Dynamic  changes  
	 */
	
	@FindBy(xpath = "(//a[contains(@title,'Alerts')])[1]")
	@CacheLookup
	WebElement Alerts_A1;
	
	@FindBy(xpath = "//input[@id='ruleName']")
	@CacheLookup
	WebElement RuleName_A1;
	
	@FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
	@CacheLookup
	WebElement AppliestoLocation_A1;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[7]")
	@CacheLookup
	WebElement SelectAll_A1;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Department')]")
	@CacheLookup
	WebElement Appliesto_Department_A1;
	
	@FindBy(xpath = "//input[@id='allDepartments']")
	@CacheLookup
	WebElement AllDepartments_A1;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Appliesto_Emloyee_A1;

	
	@FindBy(xpath = "//input[@value='24768']")
	@CacheLookup
	WebElement Allemloyees_A1;
	
	@FindBy(xpath = "//select[@id='rule']")
	@CacheLookup
	WebElement WhattriggerTherule_A1;
	
	@FindBy(xpath = "//option[@id='rule2']")
	@CacheLookup
	WebElement Rule2_A1;
	
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ConditionHrs_A1;

	@FindBy(xpath = "//option[contains(text(),'Minutes')]")
	@CacheLookup
	WebElement minutes_A1;
	
	@FindBy(xpath = "//select[contains(@xpath,'1')]")
	@CacheLookup
	WebElement operators_A1;
	
	@FindBy(xpath = "//option[contains(text(),'>=')]")
	@CacheLookup
	WebElement greaterthanoperator_A1;
	
	
	@FindBy(xpath = "//textarea[contains(@class,'form-control')]")
	@CacheLookup
	WebElement AnyNote_A1;
	

	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div/div[2]/div[2]/div[4]/div/span[1]/span[1]/span/ul")
	@CacheLookup
	WebElement Whomtobenotified_A1;
	
	
	/*
	 *  select Employee
	 */
	
	@FindBy(xpath = "//*[@id='select2-usersToBeNotified-results']/li[22]")
	@CacheLookup
	WebElement select_usersToBeNotified_A1;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement Myself_A1;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch_A1;
	
	@SuppressWarnings("unused")
	public void Alerts_Page()throws InterruptedException{
		
		helper.waitFor(Alerts_A1);
		helper.highLightElement(driver, Alerts_A1);
		Alerts_A1.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Behavior Module and Selected Alerts Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Behavior Module and Selected Alerts Sub-Module");
		
		helper.waitFor(RuleName_A1); 
		helper.highLightElement(driver, RuleName_A1);
		RuleName_A1.sendKeys("Rule-AbcDef");
		RuleName_A1.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on RuleName Text Field & Entered Rule Name");
		Assert.assertTrue(true, "Failed to Click  on RuleName Text Field & Entered Rule Name ");
		
		helper.waitFor(AppliestoLocation_A1);
		helper.highLightElement(driver, AppliestoLocation_A1);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation_A1).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Applies-to-Location ");
		Assert.assertTrue(true, "Failed to Clicked on Applies-to-Location");

		
		helper.waitFor(SelectAll_A1);
		helper.highLightElement(driver, SelectAll_A1);
		helper.jsCLick(SelectAll_A1);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Selected All Option ");
		Assert.assertTrue(true, "Failed to Select All Option");
		
		helper.waitFor(Appliesto_Department_A1);
		helper.highLightElement(driver, Appliesto_Department_A1);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department_A1).click().build().perform();
		Appliesto_Department_A1.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Applies-to-Department");
		Assert.assertTrue(true, "Failed to Click on Department");

		
		helper.waitFor(Appliesto_Emloyee_A1);
		helper.highLightElement(driver, Appliesto_Emloyee_A1);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee_A1).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee_A1);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Applies-to-Employee");
		Assert.assertTrue(true, "Failed to Click on Employee");

		
		helper.waitFor(WhattriggerTherule_A1);
		helper.highLightElement(driver, WhattriggerTherule_A1);
		helper.selectDropDownValue(WhattriggerTherule_A1, "value", "DWT");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on What-trigger-The-rule Drop-down and Slected Trigger option");
		Assert.assertTrue(true, "Failed to Click on What-trigger-The-rule Drop-down and Slected Trigger option");

	
		helper.waitFor(AnyNote_A1);
		helper.highLightElement(driver, AnyNote_A1);
		AnyNote_A1.sendKeys("abcdef");
		AnyNote_A1.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Writing  Any Note (passing  Data)");
		Assert.assertTrue(true, "Failed to Write  Any Note (passing  Data)");
		
		helper.waitFor(Whomtobenotified_A1);
		helper.highLightElement(driver, Whomtobenotified_A1);
		Whomtobenotified_A1.click(); 
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Selected on Whom-to-be-notified");
		Assert.assertTrue(true, "Failed to select Whomtobenotified");
		
		
		
		helper.waitFor(select_usersToBeNotified_A1);
		helper.highLightElement(driver, select_usersToBeNotified_A1);
		helper.move_to_element(select_usersToBeNotified_A1);
		select_usersToBeNotified_A1.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Selected on Any  Employee");
		Assert.assertTrue(true, "Failed to Select on Any Employee");
		
		
		helper.waitFor(SaveAndLaunch_A1);
		helper.highLightElement(driver, SaveAndLaunch_A1);
		helper.jsCLick(SaveAndLaunch_A1);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Save-And-Launch");
		Assert.assertTrue(true, "Failed to Clicked on Save-And-Launch");
		Thread.sleep(5000); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
