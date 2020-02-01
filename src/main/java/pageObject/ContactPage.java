package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends Base {

	public WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}

	By ContactPage = By.linkText("CONTACT");
	By userName = By.id("username");
	By mobileno = By.id("mobileno");
	By country = By.id("country");
	By email = By.id("email");
	By subject = By.id("subject");
	By message = By.id("message");
	By sendMsgBtn = By.xpath("//*[@class='theme-btn btn-style-one']");
	By contact = By.linkText("Contact");
	By closemsg = By.xpath("//*[@class='btn btn-default']");
	By closeMsgcontent = By.linkText("Home");

	public WebElement getContactPage() {
		return driver.findElement(ContactPage);// h2[contains(text(),'Featured Courses
	}

	public WebElement getContact() {
		return driver.findElement(contact);
	}

	public WebElement getuserName() {
		return driver.findElement(userName);
	}

	public WebElement getmobileno() {
		return driver.findElement(mobileno);
	}

	public WebElement getcountry() {
		return driver.findElement(country);
	}

	public WebElement getemail() {
		return driver.findElement(email);
	}

	public WebElement getsubject() {
		return driver.findElement(subject);
	}

	public WebElement getmessage() {
		return driver.findElement(message);
	}

	public WebElement getsendMsgBtn() {
		return driver.findElement(sendMsgBtn);
	}

	public WebElement getclosemsg() {
		return driver.findElement(closemsg);
	}

	public WebElement getcloseMsgcontent() {
		return driver.findElement(closeMsgcontent);
	}

}
