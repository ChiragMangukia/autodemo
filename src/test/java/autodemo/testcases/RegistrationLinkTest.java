package autodemo.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import autodemo.pageobjects.HomeLogin;
import autodemo.pageobjects.RegistrationLink;
import autodemo.resources.Base;

public class RegistrationLinkTest extends Base {

	@Test
	public void clickOnRegistrationLinkTest() {
		driver.get(homeURL);

		HomeLogin homeLogin = new HomeLogin(driver);
		homeLogin.setUsername(homeUsername);
		homeLogin.setPassword(homePassword);
		homeLogin.clickLogin();

		RegistrationLink registrationLink = new RegistrationLink(driver);
		registrationLink.clickRegistrationLink();

		if (driver.getTitle().equals("Register: Mercury Tours")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
}
