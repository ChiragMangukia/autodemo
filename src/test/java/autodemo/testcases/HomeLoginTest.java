package autodemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import autodemo.pageobjects.HomeLogin;
import autodemo.resources.Base;

public class HomeLoginTest extends Base {

	@Test
	public void loginTest() {

		driver.get(homeURL);

		HomeLogin homeLogin = new HomeLogin(driver);
		homeLogin.setUsername(homeUsername);
		homeLogin.setPassword(homePassword);
		homeLogin.clickLogin();

		if (driver.getTitle().equals("Sign-on: Mercury Tours")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
