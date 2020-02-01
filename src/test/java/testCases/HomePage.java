package testCases;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelReader;
import pageObject.Base;
import pageObject.Cources;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.Logout;

public class HomePage extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
	}

	@Test(dataProvider = "getdata")
	public void basepageNavigationUsingDataProvider(String userName, String passwd, String text)
			throws InterruptedException {

		driver.get(prop.getProperty("url"));

		LandingPage lp = new LandingPage(driver);
		lp.getlogin().click();
		LoginPage loginp = new LoginPage(driver);
		loginp.getEmailid().sendKeys(userName);
		loginp.getpasswd().sendKeys(passwd);
		loginp.Submit().click();
		Cources c = new Cources(driver);
		c.getCources().sendKeys("Selenium Webdriver");
		c.BtnCources().click();
		c.SelectCource().click();
		c.EnrollBtn().click();
		Logout lo = new Logout(driver);
		lo.getlogout().click();

	}

	@Test
	public void basepageNavigationUsingExcelData() throws InterruptedException, IOException {

		ArrayList<String> inputData = ExcelReader.getData();

		driver.get(prop.getProperty("url"));

		LandingPage lp = new LandingPage(driver);
		lp.getlogin().click();
		LoginPage loginp = new LoginPage(driver);
		loginp.getEmailid().sendKeys(inputData.get(0));
		loginp.getpasswd().sendKeys(inputData.get(1));
		loginp.Submit().click();
		Cources c = new Cources(driver);
		c.getCources().sendKeys("Selenium Webdriver");
		c.BtnCources().click();
		c.SelectCource().click();
		c.EnrollBtn().click();
		Logout lo = new Logout(driver);
		lo.getlogout().click();

	}

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[2][3];
		data[0][0] = "vmore58@gmail.com";
		data[0][1] = "cbj@123";
		data[0][2] = "Restricteduser";

		data[1][0] = "vmore58@gmail.com";
		data[1][1] = "cbj@123";
		data[1][2] = "nonRestricteduser";

		return data;

	}

	@AfterTest
	public void tearUp() {
		if (driver != null) {
			driver.close();
		}

	}

}