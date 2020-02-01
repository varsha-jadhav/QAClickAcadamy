package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By Email = By.id("user_email");
	By passwd = By.id("user_password");
	By Submit = By.xpath("//input[@type='submit']");

	public WebElement getEmailid() {
		return driver.findElement(Email);
	}

	public WebElement getpasswd() {
		return driver.findElement(passwd);
	}

	public WebElement Submit() {
		return driver.findElement(Submit);
	}
}