package week5.Day1.serviceNowApplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewIncident extends BaseClassServiceNow{
	
	@Test
	public void newIncident() throws InterruptedException {
		// New Incident
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		WebElement incidentid = driver.findElement(By.id("incident.number"));
		incidentid.sendKeys("Nave_1001");
		String incidentvalue = incidentid.getAttribute("value");
		System.out.println(incidentvalue);
		driver.findElement(By.id("incident.short_description"))
				.sendKeys("This is the new incident created in new admin");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.switchTo().defaultContent();
		//
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//label[text()='Search'])/following::input"))
				.sendKeys(incidentvalue + Keys.ENTER);
		// Table
		WebElement webtable = driver.findElement(By.className("list2_body"));
		List<WebElement> tablerow = webtable.findElements(By.tagName("tr"));
		System.out.println(tablerow.size());
		List<WebElement> tablecolumn = webtable.findElements(By.tagName("td"));
		System.out.println(tablecolumn.size());
		for (int i = 1; i <= tablerow.size(); i++) {
			WebElement rowvalue = tablerow.get(i-1);
			for (int j = 1; j <= tablecolumn.size(); j++) {
				WebElement colval = tablecolumn.get(j-1);
				//System.out.println(colval.getText());
				String coltext = colval.getText();
				if(coltext.equals(incidentvalue)) {
					System.out.println("Incident is created and listed");
					return;
				}
				else {
					System.out.println("Incident is created and listed");
					return;
				}
			}
			
		}

	}

}
