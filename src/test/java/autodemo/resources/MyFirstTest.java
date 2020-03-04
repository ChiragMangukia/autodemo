package autodemo.resources;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest extends Base {
	
	@Test
	public void MyTest() throws IOException, InterruptedException {
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google123")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
