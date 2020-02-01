package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.AboutPage;
import pageObject.Base;
import pageObject.BlogPage;
import pageObject.ContactPage;
import pageObject.HomePageobj;
import pageObject.PracticePage;
import pageObject.interviewGuid;
import pageObject.VideoPage;

public class NavigationTest extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void navigations() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		HomePageobj hpo = new HomePageobj(driver);
		hpo.getHome().click();
		driver.navigate().back();

		AboutPage abp = new AboutPage(driver);
		abp.getaboutPage().click();
		driver.navigate().back();

		BlogPage bo = new BlogPage(driver);
		bo.getBlogPage().click();
		driver.navigate().back();

		ContactPage cp = new ContactPage(driver);
		cp.getContactPage().click();
		driver.navigate().back();

		interviewGuid ig = new interviewGuid(driver);
		ig.getinterGuid().click();
		driver.navigate().back();

		VideoPage vp = new VideoPage(driver);
		vp.getvedio().click();
		driver.navigate().back();

		PracticePage pp = new PracticePage(driver);
		pp.getpracicePage().click();
		driver.navigate().back();

	}

	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
		driver = null;
	}
}