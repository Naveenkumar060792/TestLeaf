package week5.Day1.Assignment;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@Test
	public void createlead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveenkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98745332");
		driver.findElement(By.name("submitButton")).click();
}
}






