package autodemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationLink {

	WebDriver driver;

	public RegistrationLink(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "registration form")
	@CacheLookup
	WebElement registrationLink;

	public void clickRegistrationLink() {
		registrationLink.click();
	}

}
