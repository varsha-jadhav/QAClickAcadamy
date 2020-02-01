package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Base;
import pageObject.PracticePage;

public class LinkCountTest extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
	}

	@Test
	public void countLink() {

		driver.get(prop.getProperty("url"));

		PracticePage pp = new PracticePage(driver);
		pp.getpracicePage().click();
		System.out.println("All Link Count:" + driver.findElements(By.tagName("a")).size());

		WebElement Footer = pp.getFooter();

		System.out.println("Footer  Link Count:" + Footer.findElements(By.tagName("a")).size());
		WebElement Countlink = Footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(Countlink.findElements(By.tagName("a")).size());
		for (int i = 1; i < Countlink.findElements(By.tagName("a")).size(); i++) {
			String clickonTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Countlink.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

	@AfterTest
	public void tearDown() throws IOException {
		if (driver == null) {
			driver.close();
		}

	}
}
