package nopcommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	ChromeDriver mydriver;

	@BeforeTest
	public void open_browser() {
		mydriver = new ChromeDriver();
		mydriver.get("https://demo.nopcommerce.com/");
		mydriver.manage().window().maximize();
	}

	@Test
	public void ab() {
		mydriver.findElement(By.linkText("Log in")).click();
		mydriver.findElement(By.name("Email")).click();
		mydriver.findElement(By.name("Email")).clear();
		mydriver.findElement(By.name("Email")).sendKeys("waseem_tharwat@yahoo.com");
		mydriver.findElement(By.name("Password")).clear();
		mydriver.findElement(By.name("Password")).sendKeys("test111");
		mydriver.findElement(By.xpath(
				"//button[@type='submit' and contains(@class, 'button-1') and contains(@class, 'login-button')]"))
				.click();
		mydriver.close();
	}
}