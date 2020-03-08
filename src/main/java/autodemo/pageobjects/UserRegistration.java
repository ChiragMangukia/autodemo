package autodemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration {
	
	WebDriver driver;
	
	public UserRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(how = How.NAME, using = "userName")
	@CacheLookup
	WebElement email;
	
	@FindBy(how = How.NAME, using = "address1")
	@CacheLookup
	WebElement addressLine1;
	
	@FindBy(how = How.NAME, using = "address2")
	@CacheLookup
	WebElement addressLine2;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	@CacheLookup
	WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	@CacheLookup
	WebElement country;
	
	@FindBy(how = How.NAME, using = "email")
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	@CacheLookup
	WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "register")
	@CacheLookup
	WebElement submit;
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}
	
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}
	
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	
	public void setState(String state) {
		this.state.sendKeys(state);
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode.sendKeys(postalCode);
	}
	
	public void setCountry(String country) {
		Select ddlCountry = new Select(this.country);
		ddlCountry.selectByVisibleText(country.toUpperCase());
	}
	
	public void setUserName(String email) {
		this.username.sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void clickSubmit() {
		this.submit.click();;
	}

}
