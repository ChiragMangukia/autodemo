package autodemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLogin {

	WebDriver driver;

	public HomeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement password;

	@FindBy(name = "login")
	@CacheLookup
	WebElement login;

	public void setUsername(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		login.click();
	}

}
