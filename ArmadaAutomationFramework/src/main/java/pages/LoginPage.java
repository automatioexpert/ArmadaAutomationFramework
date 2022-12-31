package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	//Initialize the page objects
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name = "login[email]")
	private WebElement email;

	@FindBy(name = "login[password]")
	private WebElement passwordBox;

	@FindBy(css = "button[type='submit']")
	private WebElement loginBtn;

	public HomePage login(String username, String password) {
		email.sendKeys(username);
		passwordBox.sendKeys(password);
		loginBtn.click();
		
		return new HomePage(driver);
	}

}
