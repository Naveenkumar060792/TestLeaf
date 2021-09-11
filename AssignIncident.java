package week5.Day1.serviceNowApplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;


public class AssignIncident extends BaseClassServiceNow {

	public void assignIncident() throws InterruptedException {
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
					Thread.sleep(2000);
					driver.findElement(By.id("sys_display.incident.caller_id")).clear();
					WebElement groupSearch=driver.findElement(By.id("AC.incident.caller_id"));
					WebElement softwareSearch=driver.findElement(By.xpath("//td[text()='Software Manager']"));
					Actions builder= new Actions(driver);
					//builder.clickAndHold().perform();
					builder.moveToElement(softwareSearch).click().perform();
					driver.findElement(By.id("sysverb_update_bottom")).click();
					driver.switchTo().defaultContent();
					//Search
					driver.switchTo().frame(0);
					driver.findElement(By.xpath("//span[@id='incident_breadcrumb']//b")).click();
					driver.findElement(By.xpath("(//label[text()='Search'])/following::input")).sendKeys(incidentvalue + Keys.ENTER);
					driver.findElement(By.linkText(incidentvalue)).click();
					driver.switchTo().defaultContent();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					Thread.sleep(2000);
					WebElement groupSearchval=driver.findElement(By.id("sys_display.incident.caller_id"));
					String text = groupSearchval.getAttribute("value");
					if(text.equals("Software")) {
						System.out.println("Values are same");
					}
					else {
						System.out.println("Values are not same");
					}
				}
			}
		}
		

	}

}
