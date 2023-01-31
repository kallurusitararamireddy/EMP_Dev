package com.emp.qa.pages.Admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(TestBase.getDriver());
	}

	Helpers helper = new Helpers();



	@FindBy(css = ".introjs-tooltip-header > a[role='button']")
	WebElement SkipPopUP;

	@FindBy(xpath = "//a[contains(.,'Dashboard')]")
	@CacheLookup
	WebElement DashBoard;

	@FindBy(xpath = "//button[@id='yesterdayProEmp']")
	WebElement Yesterday;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement Employee;

	@FindBy(xpath = "//span[contains(.,'Timesheets')]")
	WebElement Timesheets;

	@FindBy(xpath = "//a[contains(.,'Time Claim')]")
	WebElement TimeClaim;

	@FindBy(xpath = "//span[contains(text(),'Projects')]")
	WebElement Projects;

	@FindBy(xpath = "(//a[@href='javascript:void(0)'])[1]")
	WebElement Reports;

	@FindBy(xpath = "//a[contains(text(),'System Activity Logs')]")
	WebElement SystemActivityLogs;

	@FindBy(xpath = "//i[@title='Settings']")
	WebElement Settings;

	@FindBy(xpath = "//span[contains(text(),'Behaviour')]")
	WebElement Behaviour;

	@FindBy(xpath = "//a[text()='Skip']")
	WebElement skip;

	public void Skip() throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Skip']"))).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	} 

	public void SkipPopup() throws InterruptedException {

		try {
			helper.waitFor(SkipPopUP);
			helper.highLightElement(driver, SkipPopUP);
			helper.Scrollintoview(SkipPopUP);

			helper.Robotclick(SkipPopUP);
			helper.click(SkipPopUP);

			Thread.sleep(7000);
			helper.jsCLick(SkipPopUP);
			helper.waitForpage();
		} catch (Exception e) {
			System.out.println("Skip pop is not Dislayed");
		}

	}

	public void clickDashboard() throws InterruptedException {

		helper.waitFor(DashBoard);
		helper.highLightElement(driver, DashBoard);
		DashBoard.click();

	}

	public void clickEmployee() throws InterruptedException {

		helper.waitForpage();
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();

	}

	public void TimeSheets() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(Timesheets);
		helper.highLightElement(driver, Timesheets);
		Timesheets.click();

	}

	public void TimeClaim() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(TimeClaim);
		helper.highLightElement(driver, TimeClaim);
		TimeClaim.click();

	}

	public void ProjectsPage() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(Projects);
		helper.highLightElement(driver, Projects);
		Projects.click();

	} 

	public void ReportsDownloadPage() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(Reports);
		helper.highLightElement(driver, Reports);
		Reports.click();

	}

	public void SystemActivityLogsPage() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(SystemActivityLogs);
		helper.highLightElement(driver, SystemActivityLogs);
		SystemActivityLogs.click();

	}

	public void ManageLocationsAndDepartmentPage() throws InterruptedException {
		helper.waitForpage();
		helper.waitFor(Settings);
		helper.highLightElement(driver, Settings);
		Settings.click();

	}

	public void behaviourpage() throws InterruptedException {

		helper.waitForpage();
		helper.waitFor(Behaviour);
		helper.highLightElement(driver, Behaviour);
		Behaviour.click();

	}

}
