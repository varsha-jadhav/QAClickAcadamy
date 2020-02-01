package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	public WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	By RegistrationPage = By.linkText("Register");
	By userNAme = By.id("user_name");
	By UserEmail = By.id("user_email");
	By Passwd = By.id("user_password");
	By PasswdComfirm = By.id("user_password_confirmation");
	By captcha = By.id("recaptcha-anchor");
	By Checkbox1 = By.id("user_unsubscribe_from_marketing_emails");
	By Checkbox2 = By.id("user_agreed_to_terms");
	By Sign_In = By.xpath("//input[@type='submit']");

	public WebElement getRegistrationPage() {
		return driver.findElement(RegistrationPage);
	}

	public WebElement getPasswd() {
		return driver.findElement(Passwd);
	}

	public WebElement getUserEmail() {
		return driver.findElement(UserEmail);
	}

	public WebElement getuserNAme() {
		return driver.findElement(userNAme);
	}

	public WebElement getPasswdComfirm() {
		return driver.findElement(PasswdComfirm);
	}

	public WebElement getcaptcha() {
		return driver.findElement(captcha);
	}

	public WebElement getCheckbox1() {
		return driver.findElement(Checkbox1);
	}

	public WebElement getCheckbox2() {
		return driver.findElement(Checkbox2);
	}

	public WebElement getSign_In() {
		return driver.findElement(Sign_In);
	}
}
