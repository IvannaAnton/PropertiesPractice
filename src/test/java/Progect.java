import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Progect {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void loadIn() {
        driver.get(ConfigLoader.getMyValue("URL"));
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys(ConfigLoader.getMyValue("user"));
        driver.findElement(By.id("passwd")).sendKeys(ConfigLoader.getMyValue("password"));
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
