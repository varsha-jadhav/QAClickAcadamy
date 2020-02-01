package testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Base;
import pageObject.PracticePage;

public class TableTest extends Base {
	@BeforeTest
	public void setUp() throws IOException {

		driver = initiliseDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void tableSortig() {
		driver.get(prop.getProperty("url"));

		PracticePage pp = new PracticePage(driver);
		pp.getpracicePage().click();
		List<WebElement> tableitemlist = driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		ArrayList<String> orizanallist = new ArrayList<String>();
		for (int i = 0; i < tableitemlist.size(); i++) {
			orizanallist.add(tableitemlist.get(i).getText());
		}
		ArrayList<String> copiedlist = new ArrayList<String>();
		for (int i = 0; i < orizanallist.size(); i++) {
			copiedlist.add(orizanallist.get(i));
		}
		Collections.sort(copiedlist);
		Collections.reverse(copiedlist);

		for (String s : copiedlist) {
			System.out.println(s);

		}
		System.out.println("*******************************");
		for (String s1 : orizanallist) {
			System.out.println(s1);
		}
	}

	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
		driver = null;
	}
}
