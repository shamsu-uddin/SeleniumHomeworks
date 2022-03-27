package seleniumHomeWorkShamsu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15_3152023_A02 {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shams\\git\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
	}
    @Test(priority = 4)
	public void ButtonTest04() throws InterruptedException {
		driver.findElement(By.linkText("How to sell")).click();
		Thread.sleep(5000);
	}
    @Test(priority = 5)
	public void ButtonTest05() throws InterruptedException {
		driver.findElement(By.partialLinkText("Business s")).click();
		Thread.sleep(5000);
	}
    @Test(priority = 6)
	public void ButtonTest06() throws InterruptedException {
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).click();
		Thread.sleep(5000);
	}
    @AfterTest
	public void tearUp() {
		driver.quit();
	}
}
