package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends Base {
	public WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}

	By BlogPage = By.linkText("BLOG");

	public WebElement getBlogPage() {
		return driver.findElement(BlogPage);
	}

}
