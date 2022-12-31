package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage login;
	HomePage home;

	@BeforeClass
	public void beforeClass() {
		login = new LoginPage(driver);
		home = new HomePage(driver);

	}

	@Test(priority = 0)
	public void verifyDashboard() {

		Assert.assertTrue(home.getDashboard().isDisplayed());

	}

	@Test(priority = 1)
	public void verifyTask() {
		Assert.assertTrue(home.getAddTask().isDisplayed());
	}

}
