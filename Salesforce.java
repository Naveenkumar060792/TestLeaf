package week2.day1.classAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
		// Step 3: Load the URL  https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Naveenkumar");
		driver.findElement(By.name("UserLastName")).sendKeys("Baskaran");
		driver.findElement(By.name("UserEmail")).sendKeys("naveen@tetsleaf.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("000000666");
		// Step 7: Handle all the dropdowns
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select jobTitle= new Select(job);
		jobTitle.selectByIndex(4);
		
		WebElement compEmploy = driver.findElement(By.name("CompanyEmployees"));
		Select companyEmp= new Select(compEmploy);
		companyEmp.selectByValue("250");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countryname= new Select(country);
		countryname.selectByVisibleText("Italy");
		// Step 8: Click the check box
		// Step 9: Close the browser

	}

}
