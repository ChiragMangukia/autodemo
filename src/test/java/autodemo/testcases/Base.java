package autodemo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	public static String homeURL = "http://newtours.demoaut.com/mercuryregister.php";
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

}
