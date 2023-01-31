package com.emp.qa.util;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

/**
 * 
 * @author Skalluru
 *
 */

@SuppressWarnings("unused")
public class Helpers extends TestBase {
	@SuppressWarnings("unused")
	private static final long TimeOut = 0;
	/**
	 * Takes a ScreenShot
	 * 
	 * @param result
	 */

//	public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	/**
	 * This Method switches to a Alert if present any
	 * 
	 * @return
	 */
	public void isAlertPresent() {
		try {
			getDriver().switchTo().alert();
		} catch (NoAlertPresentException ex) {
		}
	}

	public void AlertAccept() {
		try {
			getDriver().switchTo().alert().accept();
		} catch (NoAlertPresentException ex) {
		}
	}

	public void waitFor(WebElement ele) {
		// waitForPageToLoad();
		// log("Waiting 60 seconds for element :" + ele + " to be visible");
		try {
			new WebDriverWait((WebDriver) driver, Duration.ofSeconds(2000)).until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
		}
	}

	public void waitForElementToBeClickable(WebElement ele) {
		// waitForPageToLoad();
		// log("Waiting 60 seconds for element :" + ele + " to be visible");
		try {
			new WebDriverWait((WebDriver) driver, Duration.ofSeconds(2000))
					.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {

		}

	} 

	public void waitFor(WebElement ele, int time) {
		waitForPageToLoad();
		try {
			new WebDriverWait((WebDriver) driver, Duration.ofSeconds(2000)).until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
		}
	}

	public void waitForPageToLoad() {
		waitForpage();
		try {
			waitFor(ExpectedConditions
					.invisibilityOfAllElements(getDriver().findElements(By.cssSelector(".preloader"))));
		} catch (Exception e) {
		}
		waitForpage();
	}

	public void waitFor(ExpectedCondition<Boolean> invisibilityOfAllElements) throws InterruptedException {

		Thread.sleep(2000);
	}

	public void waitForpage() {
		try {

			Thread.sleep(5000);
		} catch (Exception e) {

		} 
	}

	public void jsCLick(WebElement ele) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	public void jsScrollintoview(WebElement Element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
 
	public void jsXYCoordinates() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0,937.6)");
	}

	public void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: Cinnamon; border: 2px solid red;');",
				element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
  
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

	@SuppressWarnings("deprecation")
	public boolean explicitlyWait(WebElement element) {

		try {

			new WebDriverWait(getDriver(), Duration.ofSeconds(2000)).until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (NoSuchElementException e)

		{
			return false;
		}
	}

	/**
	 * This Method can be used to send input as text to input fields
	 * 
	 * @param element
	 * @param arg
	 * @return
	 */
	public boolean enterText(WebElement element, String arg) {

		try {

			element.sendKeys(arg);
			return true;
		} catch (NoSuchElementException e)

		{
			return false;
		}
	}

	public boolean containsAKeyword(String myString, String[] linkText) {
		for (String keyword : linkText) {
			if (myString.contains(keyword)) {
				return true;
			}
		}
		return false; // Never found match.

	}

	public void Scrollintoview(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		/*
		 * This will scroll the page till the element is found
		 */
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public boolean selectDropDownValue(WebElement element, String type, String value) {

		try {

			Select select = new Select(element);

			switch (type) {
			case "index":
				select.selectByIndex(Integer.parseInt(value));
				break;
			case "value":
				select.selectByValue(value);
				break;
			case "visibletext":
				select.selectByVisibleText(value);
				break;

			default:
				System.out.println("please pass the correct selection criteria...");
				break;
			}
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void SwitchtoFrame(WebElement elememt) {
		try {
			getDriver().switchTo().frame(elememt);
		} catch (NoSuchFrameException e) {
			System.out.println(e.getMessage());
		}
	}

	public void SwitchOutOf_iFrame() {
		try { 
			getDriver().switchTo().defaultContent();
		} catch (NoSuchFrameException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectFilterValue(List<WebElement> list, String value) {
		try {
			for (WebElement element : list) {
				if (element.getAttribute("innerText").contains(value)) {
					element.click();
				}
			}
		} catch (NoSuchElementException e) {
		}
	}

	public boolean uploadFile(String fileLocation) throws InterruptedException, AWTException {
		try {
			Thread.sleep(1000);
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);

			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	

	public void click(WebElement ele) {
//			highLightElement( driver, ele);
		ele.click();
		waitForPageToLoad();
	}

	public void RightClick(WebElement element) throws InterruptedException {
		Actions act = new Actions(getDriver());
		act.contextClick(element).build().perform();
		Thread.sleep(2000);
	}

	public void CntrlAll() throws InterruptedException, AWTException {
		Robot robot1 = new Robot();

		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000); 
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot1.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	}
	

	public void robot_Zero_option_selectClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public void robot_frist_option_selectClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void robot1_SelectSecondValuefromRightClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}

	public void robot_Second_option_selectClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void robot_third_option_selectClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void robot_fourth_option_selectClick() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void Robotclick(WebElement Element) throws AWTException, InterruptedException {
		Robot robot = new Robot(); // Robot class throws AWT Exception
		Thread.sleep(2000); // Thread.sleep throws InterruptedException
		robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of keyboard to navigate and select Save radio button

		Thread.sleep(2000); // sleep has only been used to show case each event separately
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		// press enter key of keyboard to perform above selected action
	}

	public void SelectDropdownValue(WebElement element, String string) {

		Select status = new Select(element);
		status.selectByVisibleText(string);
	}

	public void waitFor(String textToBeDisplayedOnPage) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			new WebDriverWait((WebDriver) driver, Duration.ofSeconds(2000)).until(ExpectedConditions
					.textToBePresentInElement(driver.get().findElement(By.xpath("//body")), textToBeDisplayedOnPage));
		} catch (Exception e) {
			System.out.println("TEXT WAS NOT FOUND IN THE CURRENT PAGE");
		}

	}

//	public void explicitlyWait(WebElement element, String string)
//	{
//		  WebDriverWait wait=new WebDriverWait((WebDriver) driver, Duration.ofSeconds(20));
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Skip']"))).click();
//		
//					
//	}

	public void SelectDropdownValue1(WebElement element, String string) {

		Select status = new Select(element);
		status.selectByVisibleText(string);
	}

	public void waitFor1(String textToBeDisplayedOnPage) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			new WebDriverWait((WebDriver) driver, Duration.ofSeconds(2000)).until(ExpectedConditions
					.textToBePresentInElement(driver.get().findElement(By.xpath("//body")), textToBeDisplayedOnPage));
		} catch (Exception e) {
			System.out.println("TEXT WAS NOT FOUND IN THE CURRENT PAGE");
		}

	}

	/*
	 * BY Using Actions and mouse over
	 */

	public void move_to_element(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.moveToElement(Element).perform();

	}

	public void move_to_element_click(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.moveToElement(Element).click().build().perform();

	}

	public void move_to_element_click_target(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.moveToElement(Element).click(Element).build().perform();

	}

	public void Double_click(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.doubleClick(Element).perform();

	}

	public void Double_click_target(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.doubleClick(Element).build().perform();

	}

	public void contextClick(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.contextClick(Element).perform();

	}

	public void contextClick_target(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.contextClick(Element).build().perform();

	}

	public void drag_And_Drop(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.dragAndDrop(Element, Element).build().perform();

	}

	public void drag_And_Drop_BY(WebElement Element, WebElement xOffset_vaule, WebElement yOffset_vaule) {
		Actions act = new Actions(getDriver());
		act.dragAndDropBy(Element, 0, 0).build().perform();

	}

	public void clickAndHold(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.release(Element).perform();

	}

	public void clickAndHold_target(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.release(Element).perform();

	}

	public void release(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.release(Element).perform();

	}

	public void release_target(WebElement Element) {
		Actions act = new Actions(getDriver());
		act.release(Element).build().perform();

	}

	/*
	 * Select Class using
	 */

	public void Select_All_Check_boxs(WebElement Element) {
		Select s_All = new Select(Element);
		List<WebElement> select_options = s_All.getAllSelectedOptions();
		int size = select_options.size();

		for (int i = 0; i < size; i++) {

			select_options.get(i).click();

		}
	}

	public void Select(WebElement Element) {
		Select s_All = new Select(Element);
		s_All.getFirstSelectedOption();

	}

	/*
	 * X-path Write in String format
	 */
	public void expility_Wait_2(String X_path_full) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(X_path_full))).click();

	}

	/*
	 * Alert-Pop-up
	 */

	public void Alert_Accept() {
		Alert alt = (Alert) getDriver().switchTo().alert();
		alt.accept();

	}

	public void Alert_Dismiss() {
		Alert alt = (Alert) getDriver().switchTo().alert();
		alt.dismiss();

	}

	public void Alert_getText() {
		Alert alt = (Alert) getDriver().switchTo().alert();
		alt.getText();

	}

	public void Alert_Send_Keys(String message) {
		Alert alt = (Alert) getDriver().switchTo().alert();
		alt.sendKeys(message);

	}

	/*
	 * Open New Window
	 */

	public void open_new_Window() {
		getDriver().switchTo().newWindow(WindowType.WINDOW);

	}

	/*
	 * Open New Tab
	 */

	public void open_new_Tab() {
		getDriver().switchTo().newWindow(WindowType.TAB);

	}

	/*
	 * Take Screen Shot full page
	 */

	public boolean Screen_Shot_full_page(String Screenshot_page_name) throws IOException {

		try {

			TakesScreenshot ts = (TakesScreenshot) getDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("./" + "\\Emp-Screen-shots\\" + Screenshot_page_name + ".png");
			FileUtils.copyFile(source, target);
			return true; 
		} catch (NoSuchElementException e) {
			return false;
		} 
 
	}

	public String getRandomString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
	
	
	public static  char randomChar() {
		Random r = new Random();
		return (char)(r.nextInt(26) + 'A');
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * Excel ,CSV and PDF Files Validating Code
	 */

	/*******
	 * DashBoard Module 
	 *******/
	
	/*
	 * DashBoard Currently_Active
	 */

	@SuppressWarnings("resource")
	public void Total_Enrollments_Excel_data() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Total_Enrollments");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

	/*
	 * DashBoard Currently_Active
	 */

	@SuppressWarnings("resource")
	public void Currently_Active_Xsxl_Data_Complete_Print_ALL() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Dashboard_Currently_active_Users");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

	/*
	 * DashBoard Currently_Idle
	 */

	@SuppressWarnings("resource")
	public void Currently_Idle_Xsxl_Data_Complete_Print_ALL() throws IOException, InterruptedException {
		String excel_File_path = DU.Data_info("Currently_idle");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

	/*
	 * DashBoard Currently_offline
	 */

	@SuppressWarnings("resource")
	public void Currently_offline_Xsxl_Data_Complete_Print_ALL() throws IOException, InterruptedException {
		String excel_File_path = DU.Data_info("Currently_offline");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

	/*
	 * DashBoard Absent_Users
	 */

	@SuppressWarnings("resource")
	public void Absent_Users_Xsxl_Data_Complete_Print_ALL() throws IOException, InterruptedException {
		String excel_File_path = DU.Data_info("Absent_Users");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}

	/*
	 * DashBoard Suspended_Users
	 */

	@SuppressWarnings("resource")
	public void Suspended_Users_Xsxl_Data_Complete_Print_ALL() throws IOException, InterruptedException {
		String excel_File_path = DU.Data_info("Suspended_Users");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}
  
	}
	
	
	
	
	/************************************************************
	 * Employees Module  
	 *************************************************************/
	

	@SuppressWarnings("resource")
	public void Employees_List_Excel_data() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Employees_List");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}
	
	
	
	
	@SuppressWarnings("resource")
	public void Employee_Attendance_sheet_Excel_data() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Employee_Attendance_sheet");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  -" + data);

				System.out.print(data + " || ");
			}
			System.out.println(); 
		} 

	}
	
	
	
	
	

	/************************************************************
	 * Time Sheets  Module  
	 *************************************************************/
	
	
	/*
	 *   this is CSV reader code 
	 */

	@SuppressWarnings("resource")
public void Time_Sheets_CSV_Dot_files() throws IOException, CsvException {
		
		
		/*
		 *  This Code Only to Accept Excel sheets but  in Path End  .CSV  files only read the data
		 *  ex:- "C:\Users\Official\Downloads\Tasks List (Sep 28, 2022).csv"
		 */
		/*
		 *   Complete Data Read   
		 */
		
		CSVReader reader = new CSVReader(
				new FileReader(DU.Data_info("Time_Sheets_data")));

		List<String[]> list = reader.readAll();
		System.out.println("Total rows which we have is " + list.size());

		// create Iterator reference
		Iterator<String[]> iterator = list.iterator();

		// Iterate all values
		while (iterator.hasNext()) {

			String[] str = iterator.next();

			System.out.print(" - ");

			for (int i = 0; i < str.length; i++) {

				System.out.print(" " + str[i]);
				Reporter.log("<B><font color = 'blue'> .</font></B>  -" + str[i]);
 
			}
			System.out.println("||");  

		}
	}
	
	
	
	
	@SuppressWarnings("resource")
	public void Attendance_History_sheet_Excel_data() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Attendance_History");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  -" + data);

				System.out.print(data + " || ");
			}
			System.out.println(); 
		} 

	}
	
	
	
	
	
	
	

	
	
	/*
	 *  this is PDF reader code 
	 */
	
	public void Time_sheet_PDF_Reader() throws IOException, CsvException, InterruptedException {


		File f = new File(DU.Data_info("Time_Sheets_data_PDF_file"));

		PDDocument pd;
		pd = PDDocument.load(f);
		System.out.println("Total Number Of pages :" + pd.getNumberOfPages());
		PDFTextStripper pdf1 = new PDFTextStripper();
		System.out.print(pdf1.getText(pd));
		Reporter.log("<B><font color = 'orange'> </font>  " + pdf1.getText(pd));
		Thread.sleep(2000);
		f.deleteOnExit();

	} 
	
	
	
	
	
	
	/************************************************************
	 * Reports Module  
	 *************************************************************/
	

	@SuppressWarnings("resource")
	public void Both_web_app__button() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Both_button");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}
	
	
	
	
	@SuppressWarnings("resource")
	public void Cumulative_Report_Sheet_button() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("CumulativeReportSheet");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  " + data);

				System.out.print(data + " || ");
			}
			System.out.println();
		}

	}
	
	
	public void Web_and_App_PDF_Reader() throws IOException, CsvException, InterruptedException {


		File f = new File(DU.Data_info("pdf_web_and_app"));

		PDDocument pd;
		pd = PDDocument.load(f);
		System.out.println("Total Number Of pages :" + pd.getNumberOfPages());
		PDFTextStripper pdf1 = new PDFTextStripper(); 
		System.out.print(pdf1.getText(pd));
		Reporter.log("<B><font color = 'orange'> </font>  " + pdf1.getText(pd));
		Thread.sleep(2000);
		f.deleteOnExit();

	} 	 
	
	
	
	public void Productivity_Reports_pdf() throws IOException, CsvException, InterruptedException {

		

		File f = new File(DU.Data_info("Productivity_Reports_pdf"));

		PDDocument pd;
		pd = PDDocument.load(f);
		System.out.println("Total Number Of pages :" + pd.getNumberOfPages());
		PDFTextStripper pdf1 = new PDFTextStripper();
		System.out.print(pdf1.getText(pd));
		Reporter.log("<B><font color = 'orange'> </font>  " + pdf1.getText(pd));
		Thread.sleep(2000);
		f.deleteOnExit();

	}
	
	
	public void Web_site_sheet_Excel_data() throws IOException, InterruptedException {

		String excel_File_path = DU.Data_info("Websites");
		FileInputStream fis = new FileInputStream(excel_File_path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(row.getCell(j));
				Reporter.log("<B><font color = 'blue'> .</font></B>  -" + data);

				System.out.print(data + " || ");
			}
			System.out.println(); 
		} 

	}
	
	
	@SuppressWarnings("resource")
public void Productivity_Reports_CSV_Dot_files() throws IOException, CsvException {
		
		
		/*
		 *  This Code Only to Accept Excel sheets but  in Path End  .CSV  files only read the data
		 *  ex:- "C:\Users\Official\Downloads\Tasks List (Sep 28, 2022).csv"
		 */
		/*
		 *   Complete Data Read   
		 */
		
		CSVReader reader = new CSVReader(
				new FileReader(DU.Data_info("Productivity_Reports_csv")));

		List<String[]> list = reader.readAll();
		System.out.println("Total rows which we have is " + list.size());

		// create Iterator reference
		Iterator<String[]> iterator = list.iterator();

		// Iterate all values
		while (iterator.hasNext()) {

			String[] str = iterator.next();

			System.out.print("  ||  ");
 
			for (int i = 0; i < str.length; i++) {

				System.out.print(" " + str[i]);
				Reporter.log("<B><font color = 'blue'> .</font></B>  -" + str[i]);
 
			}
			System.out.println("||");  

		}
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	 
	 

}