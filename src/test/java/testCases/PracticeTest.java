package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Base;
import pageObject.PracticePage;

public class PracticeTest extends Base {
	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void PopupHandle() {
		driver.get(prop.getProperty("url"));

		PracticePage pp = new PracticePage(driver);
		pp.getpracicePage().click();
		pp.getName().sendKeys("varsha");
		pp.getAlert().click();
		driver.switchTo().alert().accept();
		pp.getconfirmbtn().click();
		driver.switchTo().alert().dismiss();

	}

	@Test
	public void CheckBox() {
		driver.get(prop.getProperty("url"));
		PracticePage pp = new PracticePage(driver);
		pp.getpracicePage().click();
		pp.getcheckBoxOption1().click();

	}

	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
		driver = null;
	}
}