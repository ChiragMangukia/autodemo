package autodemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import autodemo.pageobjects.UserRegistration;
import autodemo.resources.Base;
import autodemo.utilities.XLUtils;

public class UserRegistrationTest extends Base {
	
	@Test(dataProvider="RegistrationData")
	public void registerUser(String url, String firstName, String lastName, String phone, String email, String addressLine1, String addressLine2,
			String city, String state, String postalCode, String country, String userName, String password,
			String confirmPassword) throws InterruptedException {
		
		driver.get(url);

		UserRegistration userRegistration = new UserRegistration(driver);

		userRegistration.setFirstName(firstName);
		userRegistration.setLastName(lastName);
		userRegistration.setPhone(phone);
		userRegistration.setEmail(email);
		userRegistration.setAddressLine1(addressLine1);
		userRegistration.setAddressLine2(addressLine2);
		userRegistration.setCity(city);
		userRegistration.setState(state);
		userRegistration.setPostalCode(postalCode);
		userRegistration.setCountry(country);
		userRegistration.setUserName(userName);
		userRegistration.setPassword(password);
		userRegistration.setConfirmPassword(confirmPassword);
		
		userRegistration.clickSubmit();
		
		String pageSource = driver.getPageSource();
		
		if(pageSource.contains("Thank you for registering123")) {
			if(pageSource.contains(userName)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} else
			Assert.assertTrue(false);
	}

	@DataProvider(name = "RegistrationData")
	String[][] getData() throws IOException {
		
		String path = System.getProperty("user.dir") + "/Testdata/TestData.xlsx";

		int rownum = XLUtils.getRowCount(path, "UserRegData");
		int colcount = XLUtils.getCellCount(path, "UserRegData", 1);

		String registrationData[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				registrationData[i - 1][j] = XLUtils.getCellData(path, "UserRegData", i, j);// 1 0
			}
		}
		return registrationData;
	}
}
