package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.cssSelector("input#user_login");
	By password=By.id("user_pass");
	By login = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver x) {
		
		this.driver = x;
	}
	
	//Get email
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
