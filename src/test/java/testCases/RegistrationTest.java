package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Base;
import pageObject.RegistrationPage;

public class RegistrationTest extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
	}

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[2][4];
		data[0][0] = "varsha";
		data[0][1] = "vmore58@gmail.com";
		data[0][2] = "cbj@123";
		data[0][3] = "cbj@123";

		data[1][0] = "siya";
		data[1][1] = "chaitanyabj@gmail.com";
		data[1][2] = "cbj@123";
		data[1][3] = "cbj@123";

		return data;

	}

	@Test(dataProvider = "getdata")
	public void resitrationPage(String userName, String email, String passwd, String passwdconf)
			throws InterruptedException {

		driver.get(prop.getProperty("url"));

		RegistrationPage rp = new RegistrationPage(driver);
		rp.getRegistrationPage().click();
		rp.getuserNAme().sendKeys(userName);
		rp.getUserEmail().sendKeys(email);
		rp.getPasswd().sendKeys(passwd);
		rp.getPasswdComfirm().sendKeys(passwdconf);
		rp.getcaptcha().click();
		rp.getCheckbox1().click();
		rp.getCheckbox2().click();
		rp.getSign_In().click();

	}

	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
		driver = null;
	}
}
