package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	public WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
	}

	By PracticePage = By.linkText("PRACTICE");
	By Name = By.id("name");
	By Alert = By.id("alertbtn");
	By confirmbtn = By.id("confirmbtn");
	By checkBoxOption1 = By.id("checkBoxOption1");
	By checkBoxOption2 = By.id("checkBoxOption2");
	By checkBoxOption3 = By.id("checkBoxOption3");
	By Tablechild = By.cssSelector("tr th:nth-child(3)");
	By TagName = By.tagName("a");
	By Footer = By.id("gf-BIG");
	By Countlink = By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul");

	public WebElement getpracicePage() {
		return driver.findElement(PracticePage);
	}

	public WebElement getName() {
		return driver.findElement(Name);
	}

	public WebElement getAlert() {
		return driver.findElement(Alert);
	}

	public WebElement getconfirmbtn() {
		return driver.findElement(confirmbtn);
	}

	public WebElement getcheckBoxOption1() {
		return driver.findElement(checkBoxOption1);
	}

	public WebElement getcheckBoxOption2() {
		return driver.findElement(checkBoxOption2);
	}

	public WebElement getcheckBoxOption3() {
		return driver.findElement(checkBoxOption3);
	}

	public WebElement getChild() {
		return driver.findElement(Tablechild);
	}

	public WebElement getTagName() {
		return driver.findElement(TagName);
	}

	public WebElement getFooter() {
		return driver.findElement(Footer);
	}

	public WebElement getCountlink() {
		return driver.findElement(Countlink);
	}

}
