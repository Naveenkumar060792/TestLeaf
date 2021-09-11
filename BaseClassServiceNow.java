package week5.Day1.serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassServiceNow {
	WebDriver driver;
	@BeforeMethod
	public void browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev67600.service-now.com/navpage.do");
		// Login
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Automation@TestLeaf2021");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();

		//
		String title = driver.getTitle();
		System.out.println(title);
		//
		Thread.sleep(2000);
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("Incident");
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
