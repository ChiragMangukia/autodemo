package autodemo.resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class Base {

	public static WebDriver driver;
	public static String homeURL = "http://newtours.demoaut.com";
	public static String homeUsername = "test";
	public static String homePassword = "test";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@AfterSuite
	public void killDrivers() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}
	
	public void getScreenshot(String fileName) throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile, new File(fileName + ".png"));
	}

}
