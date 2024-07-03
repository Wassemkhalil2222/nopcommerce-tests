package nopcommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterationPageTests {
	ChromeDriver mydriver;

	@BeforeTest
	public void open_browser() {
		mydriver = new ChromeDriver();
		mydriver.get("https://demo.nopcommerce.com/");
		mydriver.manage().window().maximize();
	}

	@Test
	public void ab() {
		mydriver.findElement(By.name("userName")).click();
		mydriver.findElement(By.name("userName")).clear();
		mydriver.findElement(By.name("userName")).sendKeys("admin");
		mydriver.findElement(By.name("password")).clear();
		mydriver.findElement(By.name("password")).sendKeys("admin");
		mydriver.findElement(By.name("submit")).click();
	}

	@Test
	public void ac() {
		mydriver.findElement(By.name("userName")).click();
		mydriver.findElement(By.name("userName")).clear();
		mydriver.findElement(By.name("userName")).sendKeys("test");
		mydriver.findElement(By.name("password")).clear();
		mydriver.findElement(By.name("password")).sendKeys("test");
		mydriver.findElement(By.name("submit")).click();
	}

	@AfterTest
	public void close() {
		mydriver.close();
	}
}
