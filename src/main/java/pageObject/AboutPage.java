package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage extends Base {
	public WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	By AboutPage = By.linkText("ABOUT");

	public WebElement getaboutPage() {
		return driver.findElement(AboutPage);
	}

}
