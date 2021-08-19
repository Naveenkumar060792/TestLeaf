package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoke of WebDriverManager
		WebDriverManager.chromedriver().setup();
		// Local browser Setup
		ChromeDriver driver = new ChromeDriver();
		// Maximizing the browser
		driver.manage().window().maximize();
		// URL
		driver.get("http://leafground.com/pages/Link.html");
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Click on Homepage link
		driver.findElement(By.xpath("// div[@class='example']//a[1]")).click();
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
		driver.findElement(By.xpath("(//div[@class='example'])[2]//a[1]")).click();
		String buttonPage = "TestLeaf - Interact with Buttons";
		String buttonTitle = driver.getTitle();
		if (buttonPage.equals(buttonTitle)) {
			System.out.println("Successfully landed into Button Page");
		} else {
			System.out.println("Sorry not landed into Button Page");
		}
		//
		driver.navigate().back();
		//
		driver.findElement(By.xpath("(//div[@class='example'])[3]//a[1]")).click();
		String brokenLink = "HTTP Status 404 – Not Found";
		String brokenPage = driver.getTitle();
		if (brokenLink.equals(brokenPage)) {
			System.out.println("Successfully landed into broken page");
		} else {
			System.out.println("Sorry not landed into broken page");
		}
		//
		driver.navigate().back();
		//
		driver.findElement(By.xpath("(//div[@class='row'])[4]//a")).click();
		// Verifying the page navigation
		if (Homepage.equals(homeTitle)) {
			System.out.println("Successfully landed into Homepage");
		} else {
			System.out.println("Sorry not landed into Homepage");
		}
		//
		driver.navigate().back();
		//
		driver.findElement(By.xpath("//a[text()='How many links are available in this page?']")).click();
		int size = driver.findElements(By.tagName("a")).size();
		
		System.out.println("The available links in the page are : "+ size);

	}

}
