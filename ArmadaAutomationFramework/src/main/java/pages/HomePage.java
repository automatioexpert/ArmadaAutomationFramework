package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a.navbar-brand")
	private WebElement homepageDemo;

	@FindBy(xpath = "//button[contains(text(),'Add Task')]")
	private WebElement addTask;
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	

	public WebElement getHomePageDemo() {

		return homepageDemo;
	}

	
	public WebElement getAddTask() {

		return addTask;
	}
	
	
	public WebElement getDashboard() {
		
		return dashboard;
	}
	

}
