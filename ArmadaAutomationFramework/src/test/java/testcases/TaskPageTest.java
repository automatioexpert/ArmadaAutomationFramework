package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.TaskPage;

public class TaskPageTest extends TestBase {

	LoginPage login;
	HomePage home;
	TaskPage task;

	@BeforeClass
	public void beforeClass() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		task = new TaskPage(driver);
	}

	@Test(priority = 0)
	public void loginTest() {

		HomePage home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean status = home.getHomePageDemo().isDisplayed();
		Assert.assertTrue(status, "Login page Failed as header is not displayed");

	}

	@Test(priority = 1)
	public void navigateToTaskPageTest() throws InterruptedException {

		home.getAddTask().click();
		String expectedHeader = "New Task";
		Thread.sleep(5000);
		String actualHeader = task.getTaskHeader().getText();
		Assert.assertEquals(actualHeader, expectedHeader);

	}

	@Test(priority = 2)
	public void createTaskTest() {

		task.selectProjectOption();
		task.getTaskName().sendKeys("TaskName");

	}

	@AfterClass
	public void afterClass() {

	}

}
