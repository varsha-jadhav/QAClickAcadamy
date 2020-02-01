package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPage extends Base {
	public WebDriver driver;

	public VideoPage(WebDriver driver) {
		this.driver = driver;
	}

	By vedioPage = By.linkText("VIDEOS");

	public WebElement getvedio() {
		return driver.findElement(vedioPage);
	}
}