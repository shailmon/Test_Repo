package com.w2a.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Page {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	// public static ExtentTest test;
	public static String browser;

	public static void initConfiguration() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		log.debug("Launching Chrome Browser for Test");
		driver.get(Constants.testurl);
		driver.manage().window().maximize();

	}

	public static void click(WebElement element) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.click();
		log.debug("Clicking on an Element : " + element);
		// test.log(LogStatus.INFO, "Clicking on : " + element);
	}

	public static void type(WebElement element, String value) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.sendKeys(value);
		log.debug("Typing in an Element : " + element + " entered value as : " + value);
		// test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " +
		// value);

	}

	public static void type(WebElement element, Keys value) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.sendKeys(value);
		log.debug("Typing in an Element : " + element + " entered value as : " + value);
		// test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " +
		// value);

	}

	public static String getTxt(WebElement element) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return element.getText();

		/*
		 * System.out.println(driver.getWindowHandle()); Set<String> st
		 * =driver.getWindowHandles();
		 * 
		 * for(String s : st) {
		 * 
		 * System.out.println(s); }
		 * 
		 * List<WebElement> list=driver.findElements(By.xpath("//*[@id]"));
		 * System.out.println(list.size()); for(WebElement e : list) {
		 * 
		 * System.out.println(e.getText()); } ArrayList<String> tabs = new
		 * ArrayList<String> (driver.getWindowHandles());
		 * System.out.println(tabs.size()); System.out.println(tabs.get(0));
		 * System.out.println(tabs.get(1)); driver.switchTo().window(tabs.get(1));
		 * System.out.println(driver.findElement(By.xpath("//h1/span")).getText());
		 * 
		 * 
		 * driver.switchTo().window(tabs.get(1));
		 * driver.switchTo().window("1F56C9127C0993A849BAF58FBC3ADEFE");
		 * 
		 * //return driver.findElement(By.xpath("//h1/span")).getText(); return "ok" ;
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 15);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1/span"
		 * ))); return driver.findElement(By.xpath("//h1/span")).getText();
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver; String t=(String)
		 * js.executeScript("return arguments[0].value", element); String
		 * txt=element.getText();
		 * log.debug("returniung text from  : "+element+"  value as : "+txt);
		 * //test.log(LogStatus.INFO, "returing of : " + element + " value as " + txt);
		 */

	}

	public static void quitBrowser() {

		driver.quit();

	}

	public static void getAmazonPage() {

		 //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

		driver.get(Constants.testurl1);
	}

	public static void SwitchToNewWindow() {
		
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
		driver.switchTo().window(tabs.get(tabs.size() - 1));
		System.out.println("Switched to Window:"+tabs.get(tabs.size() - 1));
		
	}
	public static void WaitForElementToBeVisible(WebElement element) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		

	}

}
