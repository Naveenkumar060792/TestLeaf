package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoke of WebDriverManager
		WebDriverManager.chromedriver().setup();
		// Local browser Setup
		ChromeDriver driver = new ChromeDriver();
		// Maximizing the browser
		driver.manage().window().maximize();
		// URL
		driver.get("http://leafground.com/pages/Image.html");
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		driver.findElement(By.xpath("//div[@class='row']//img")).click();
		// Get the home page title
		String Homepage = "TestLeaf - Selenium Playground";
		String homeTitle = driver.getTitle();
		// Verifying the page navigation
		if (Homepage.equals(homeTitle)) {
			System.out.println("Successfully landed into Homepage");
		} else {
			System.out.println("Sorry not landed into Homepage");
		}
		//
		driver.navigate().back();
		//
		driver.findElement(By.xpath("(//div[@class='row'])[2]//img")).click();
	}

}
