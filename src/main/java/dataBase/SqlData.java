package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SqlData {

	@Test
	public void getConnection() throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mydb", "root", "root");

		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("select * from employeeinfo where name='siya'");

		while (r.next()) {

			WebDriver driver = new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/");
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("user_email")).sendKeys(r.getString("name"));
			driver.findElement(By.id("user_password")).sendKeys(r.getString("name"));

		}

	}
}