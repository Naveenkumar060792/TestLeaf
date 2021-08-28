package week3.day2.weeklyAssignment;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver Manager
		WebDriverManager.chromedriver().setup();
		//Instantiating chrome driver
		ChromeDriver driver=new ChromeDriver();
		//Invoking URL
		driver.get("https://www.ajio.com/");
		//Maximize Page
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		//
		driver.findElement(By.xpath("//input[@id='Men']/following::label")).click();
		//
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following::label")).click();
		//
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		//
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		//
		for (WebElement webElement : bagBrandList) {
			String brandName=webElement.getText();
			System.out.println("The brand is : "+brandName);
		}		
		
		List<WebElement> productnames = driver.findElementsByClassName("name");
		for (WebElement webElement1 : productnames) {
			String products=webElement1.getText();
			System.out.println("The product is : "+products);
		}
	}

}
