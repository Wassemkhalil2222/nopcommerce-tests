package nopcommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

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
		mydriver.findElement(By.linkText("Register")).click();

		mydriver.findElement(By.name("FirstName")).clear();
		mydriver.findElement(By.name("FirstName")).sendKeys("admin");
		mydriver.findElement(By.name("LastName")).clear();
		mydriver.findElement(By.name("LastName")).sendKeys("admin");

		WebElement dayDropdown = mydriver.findElement(By.name("DateOfBirthDay"));

		Select selectDay = new Select(dayDropdown);

		selectDay.selectByVisibleText("15");

		WebElement monthDropdown = mydriver.findElement(By.name("DateOfBirthMonth"));

		Select selectMonth = new Select(monthDropdown);

		selectMonth.selectByVisibleText("May");

		WebElement yearDropdown = mydriver.findElement(By.name("DateOfBirthYear"));

		Select selectYear = new Select(yearDropdown);

		selectYear.selectByVisibleText("1990");

		mydriver.findElement(By.name("Email")).click();
		mydriver.findElement(By.name("Email")).clear();
		mydriver.findElement(By.name("Email")).sendKeys("waseem_tharwat@yahoo.com");

		JavascriptExecutor js = (JavascriptExecutor) mydriver;
		js.executeScript("window.scrollBy(0,1000)");
		mydriver.findElement(By.name("Password")).clear();
		mydriver.findElement(By.name("Password")).sendKeys("test222");
		mydriver.findElement(By.name("ConfirmPassword")).clear();
		mydriver.findElement(By.name("ConfirmPassword")).sendKeys("test222");

		mydriver.findElement(By.name("register-button")).click();
	}

	@Test
	public void ac() {
		mydriver.findElement(By.linkText("Register")).click();

		mydriver.findElement(By.name("FirstName")).clear();
		mydriver.findElement(By.name("FirstName")).sendKeys("admin");
		mydriver.findElement(By.name("LastName")).clear();
		mydriver.findElement(By.name("LastName")).sendKeys("admin");

		WebElement dayDropdown = mydriver.findElement(By.name("DateOfBirthDay"));

		Select selectDay = new Select(dayDropdown);

		selectDay.selectByVisibleText("15");

		WebElement monthDropdown = mydriver.findElement(By.name("DateOfBirthMonth"));

		Select selectMonth = new Select(monthDropdown);

		selectMonth.selectByVisibleText("May");

		WebElement yearDropdown = mydriver.findElement(By.name("DateOfBirthYear"));

		Select selectYear = new Select(yearDropdown);

		selectYear.selectByVisibleText("1990");

		mydriver.findElement(By.name("Email")).click();
		mydriver.findElement(By.name("Email")).clear();
		mydriver.findElement(By.name("Email")).sendKeys("waseemtharwat@yahoo.com");

		JavascriptExecutor js = (JavascriptExecutor) mydriver;
		js.executeScript("window.scrollBy(0,1000)");
		mydriver.findElement(By.name("Password")).clear();
		mydriver.findElement(By.name("Password")).sendKeys("test333");
		mydriver.findElement(By.name("ConfirmPassword")).clear();
		mydriver.findElement(By.name("ConfirmPassword")).sendKeys("test333");

		mydriver.findElement(By.name("register-button")).click();
		mydriver.close();
	}

}
