package seleniumHomeWorkShamsu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15_03152022_A01 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shams\\git\\January2022CoreJava\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bestbuy.com/");
		
	}
	@Test(priority = 1)
	   public void ButtonTest01() throws InterruptedException {
		  driver.findElement(By.id("gh-search-input")).click();
		  Thread.sleep(5000);
	   }
	   @Test(priority = 2)
	   public void ButtonTest02() throws InterruptedException {
		 driver.findElement(By.className("search-input")).click();
		  Thread.sleep(5000);
	   }
	   @Test(priority = 3)
	   public void ButtonTest03() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@name='footer-email-signup']")).click();
		 Thread.sleep(5000);
	   }
  @ AfterTest 
    public void tearUp() {
	 driver.quit();
}
}
