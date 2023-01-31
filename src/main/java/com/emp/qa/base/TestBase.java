package com.emp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.emp.qa.pages.Admin.LoginPage;
import com.emp.qa.util.Chrome_Prefs;
import com.emp.qa.util.DataUtility;
import com.emp.qa.util.DeleteFilesInDirectory;
import com.emp.qa.util.Helpers;
import com.emp.qa.util.ReadConfig;
import com.emp.qa.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class TestBase {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static Properties prop;
	public static ReadConfig readconfig = new ReadConfig();
	public static LoginPage loginPage;
	static Helpers helpers;
	public Chrome_Prefs c = new Chrome_Prefs();
	public DataUtility DU = new DataUtility();
	public ExtentTest extentTest;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter EMP = new ExtentSparkReporter("test-output/emp/EmpMonitor.html");

	/*
	 * Deleting Screenshots from previous run
	 */  

	private static String TargetFile = System.getProperty("user.dir") + "/screenshots/";
	private static String TargetReports = System.getProperty("user.dir") + "/test-output/";
	private static String TargetSurefire = System.getProperty("user.dir") + "/target/surefire-reports/";
	DeleteFilesInDirectory df = new DeleteFilesInDirectory();

	@BeforeSuite
	public void beforeSuite() {
		df.deleteFilesInScreenshots(TargetFile);
		df.deleteFilesInScreenshots(TargetReports);
		df.deleteFilesInScreenshots(TargetSurefire);

	} 

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/emp" + "/qa/config/config.properties");
			prop.load(ip); /// EmpCloud/src/main/java/com/cloud/qa/config/config.properties
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@BeforeMethod
	public void initialization() throws InterruptedException {
		String browserName = prop.getProperty("Browser");

		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", System.getProperty("user.dir") + "\\screenshots\\");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			System.setProperty("webdriver.chrome.silentOutput", "true");
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver(options));
			Dimension dimension = new Dimension(450, 600);
			getDriver().manage().window().setSize(dimension);
			options.setCapability("timeouts", "{implicit: 30000, pageLoad: 300000, script: 90000}");
			System.out.println("TIMEOUTS FOR CHROME ARE :" + options.getCapability("timeouts"));
			DesiredCapabilities chrome = new DesiredCapabilities();
			chrome.setCapability("timeouts", "{implicit: 30000, pageLoad: 300000, script: 90000}");
			chrome.merge(options);
			System.out.println("Desired Capabilities are: " + chrome.getCapability("timeouts"));

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());

		} else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", readconfig.getOperapath());
			WebDriverManager.operadriver().setup();
			driver.set(new OperaDriver());

		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());

		} else {
			Assert.assertTrue(false, "No Browser type sent or Browser not Mention in this Method");
		}
 
		System.out.println("Browser setup by Thread " + Thread.currentThread().getId() + " and Driver reference is : "
				+ getDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		/*
		 * URL
		 */
		getDriver().get(readconfig.getApplicationURL("Dev"));

		/*
		 * Login -
		 */
		loginPage = new LoginPage(getDriver());
		loginPage.login(readconfig.getUserName(), readconfig.getPassword());
		
		
		
		/*
		 *  Admin Side 
		 */
		
//		getDriver().get(readconfig.Non_ApplicationURL("manager_url"));
//		
//		loginPage = new LoginPage(getDriver());
//		loginPage.login(readconfig.Non_getUserName(), readconfig.Non_getPassword());

	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			// extentTest.log(Status.FAIL, (Markup)
			// extentTest.addScreenCaptureFromPath(TargetFile));
			Screenshot.captureScreenshot(result.getName());
			takeScreenShot(result);
		}
//		 //extent.flush();
		closeBrowser();

	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void closeBrowser() {
		driver.get().quit();
		driver.remove();
	}

	private void takeScreenShot(ITestResult result) {
		// TODO Auto-generated method stub

	}
}
