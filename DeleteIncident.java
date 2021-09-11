package week5.Day1.serviceNowApplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident extends BaseClassServiceNow{
	@Test
	public void deleteIncident() throws InterruptedException {
		// TODO Auto-generated method stub
		// Assign Incident
		//Thread.sleep(2000);
		Thread.sleep(2000);
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
					Thread.sleep(4000);
					driver.findElement(By.id("sysverb_delete")).click();
					driver.findElement(By.id("ok_button")).click();
				}
			}
		}

	}

}
