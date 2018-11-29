package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleValidations {

	private WebDriver driver;
	private String expectedValue;
	private String actualValue;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
	}

	@Test(priority=0)
	public void verifyTitle() {
		expectedValue = "LinkedIn: Log In or Sign Up";
		actualValue = driver.getTitle();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(priority=1)
	public void verifySignInBtnVisibility() {
		boolean signInBtnStatus = driver.findElement(By.id("login-submit")).isDisplayed();
		Assert.assertTrue(signInBtnStatus);
	}

	
	@Test(priority=2)
	public void verifyText() {
		expectedValue = "Be great at what you do";
		actualValue = driver.findElement(By.cssSelector("#regForm > h2")).getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(priority=3,enabled=false)
	public void verifySearchBtnStatusBeforeEnteringText() {
		boolean searchBtnStatus = driver.findElement(By.name("search")).isEnabled();
		Assert.assertFalse(searchBtnStatus);
	}

	@Test(priority=4)
	public void verifySearchBtnStatusAfterEnteringText() {
		driver.findElement(By.name("first")).sendKeys("ABC");
		boolean searchBtnStatus = driver.findElement(By.name("search")).isEnabled();
		Assert.assertTrue(searchBtnStatus);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
