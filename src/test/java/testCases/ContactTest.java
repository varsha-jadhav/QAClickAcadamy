package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Base;
import pageObject.ContactPage;

public class ContactTest extends Base {

	@BeforeTest
	public void setUp() throws IOException {
		driver = initiliseDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void getContact() {
		driver.get(prop.getProperty("url"));
		ContactPage cp = new ContactPage(driver);
		cp.getContactPage().click();
		cp.getContact().click();
		cp.getuserName().sendKeys("varha");

		cp.getmobileno().sendKeys("9677565444");

		cp.getcountry().sendKeys("india");
		cp.getemail().sendKeys("abc@gamil.com");

		cp.getsubject().click();
		WebElement myEle = cp.getsubject();
		Select Supjectdropdown = new Select(myEle);
		Supjectdropdown.selectByIndex(1);
		cp.getmessage().sendKeys("i have completed selenium cource");

		cp.getsendMsgBtn().click();

		String actual = cp.getcloseMsgcontent().getText();
		System.out.println(cp.getcloseMsgcontent().getText());

		assertEquals(actual, "Home");
		// cp.getclosemsg().click();

	}

	@AfterTest
	public void tearDown() throws IOException {
		// driver.close();
		driver = null;
	}
}
