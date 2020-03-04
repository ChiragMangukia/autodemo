package autodemo.resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	
	public static WebDriver driver;
	
	public Base() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void teardown() throws IOException {
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}

}
