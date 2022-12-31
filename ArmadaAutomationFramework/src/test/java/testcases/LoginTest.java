package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage login;
	HomePage home;

	@BeforeClass
	public void beforeClass() {

		login = new LoginPage(driver);

	}

	@Test
	public void loginTest() {

		HomePage home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean status = home.getHomePageDemo().isDisplayed();
		Assert.assertTrue(status, "Login page Failed as header is not displayed");

	}

	@AfterClass
	public void afterClass() {

	}
}
