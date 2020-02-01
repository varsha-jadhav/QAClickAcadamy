package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout extends Base {
	public WebDriver driver;

	By logout = By.xpath("//a[@class='spc__log-out']");

	public Logout(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlogout() {
		return driver.findElement(logout);

	}

}
