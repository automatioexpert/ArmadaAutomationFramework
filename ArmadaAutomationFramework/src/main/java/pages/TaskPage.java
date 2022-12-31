package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	public WebDriver driver;

	@FindBy(name = "form_projects_id")
	private WebElement projectDropDown;

	@FindBy(xpath = "//h4")
	private WebElement TaskHeader;
	
	@FindBy(css="input#tasks_name")
	private WebElement taskName;
	

	public TaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskHeader() {

		return TaskHeader;
	}

	public void selectProjectOption() {

		driver.findElement(By.cssSelector("select#form_projects_id")).click();
		List<WebElement> options = driver.findElements(By.cssSelector("select#form_projects_id>option"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Test Project 1")) {
				option.click();
			}
		}
		
		
		
		
		/*
		 * Select select = new Select(projectDropDown);
		 * select.selectByValue("Test Project 1");
		 * System.out.println("Test Project 1 got selected");
		 */

	}
	public WebElement getTaskName() {
		return taskName;
	}
	

}
