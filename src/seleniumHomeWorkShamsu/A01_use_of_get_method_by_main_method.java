package seleniumHomeWorkShamsu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_use_of_get_method_by_main_method {

	public static void main(String[] args) throws InterruptedException {
		//system is a cless and setproperty is a method
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shams\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.get("https://www.bestbuy.com");
          Thread.sleep(5000);
          driver.quit();
       }
	}
