package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageobj extends Base {
	public WebDriver driver;

	public HomePageobj(WebDriver driver) {
		this.driver = driver;
	}

	By HomePage = By.linkText("HOME");

	public WebElement getHome() {
		return driver.findElement(HomePage);

	}

}
