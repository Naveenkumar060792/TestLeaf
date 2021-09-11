package week5.Day1.serviceNowApplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExistingIncident extends BaseClassServiceNow{
	@Test
	public void existingIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		//
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		String incidentvalue="Nave_1001";
		driver.findElement(By.xpath("(//label[text()='Search'])/following::input")).sendKeys(incidentvalue + Keys.ENTER);
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
					driver.findElement(By.linkText(coltext)).click();
					driver.switchTo().defaultContent();
					driver.switchTo().frame(0);
					Thread.sleep(2000);
					String incidenturg="1 - High";
					WebElement urgency = driver.findElement(By.id("incident.urgency"));
					Select urgerncyval= new Select(urgency);
					urgerncyval.selectByVisibleText(incidenturg);
					Thread.sleep(2000);
					String status="In Progress";
					WebElement incidentstat = driver.findElement(By.id("incident.state"));
					Select incidentval= new Select(incidentstat);
					incidentval.selectByVisibleText(status);
					driver.findElement(By.id("sysverb_update_bottom")).click();
				}
				else {
					System.out.println("Incident is created and listed");
				}
			}
		}
		
	}

}
