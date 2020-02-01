package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cources extends Base {
	public WebDriver driver;

	public Cources(WebDriver driver) {
		this.driver = driver;
	}

	By Cources = By.id("search-courses");
	By BtnCources = By.id("search-course-button");
	By SelectCource = By.xpath("//div[@title='Selenium Webdriver with Java  (Basics+Advanced+Interview Guide)']");
	By EnrollBtn = By.id("enroll-button-top");

	public WebElement getCources() {
		return driver.findElement(Cources);
	}

	public WebElement BtnCources() {
		return driver.findElement(BtnCources);
	}

	public WebElement SelectCource() {
		return driver.findElement(SelectCource);
	}

	public WebElement EnrollBtn() {
		return driver.findElement(EnrollBtn);
	}

}
