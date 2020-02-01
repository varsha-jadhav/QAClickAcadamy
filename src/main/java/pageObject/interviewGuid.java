package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class interviewGuid extends Base {
	public WebDriver driver;

	public interviewGuid(WebDriver driver) {
		this.driver = driver;
	}

	By interGuid = By.linkText("INTERVIEW GUIDE");

	public WebElement getinterGuid() {
		return driver.findElement(interGuid);
	}

}
