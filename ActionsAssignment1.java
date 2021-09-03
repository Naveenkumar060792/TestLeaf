package week4.day2.weeklyAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		driver.manage().window().maximize();
		//
		System.out.println("=======================Sortable==================================");
		driver.get("http://www.leafground.com/pages/sortable.html");
		//
		WebElement sortsrc = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement sortdest = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions builder= new Actions(driver);
		builder.dragAndDrop(sortsrc, sortdest).perform();
		Thread.sleep(4000);

		// 
		System.out.println("=======================Selectable==================================");
		driver.get("http://www.leafground.com/pages/selectable.html");
		/*List<WebElement> findElements = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		for(int i=1; i<findElements.size()+1; i++) {
			System.out.println(i);
			driver.findElement(By.xpath("//li[text()='Item "+i+"']")).click();
		}*/
		WebElement selectsrc = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement selectdest = driver.findElement(By.xpath("//li[text()='Item 7']"));
		builder.clickAndHold(selectsrc).moveToElement(selectdest).release().perform();
		
		//
		System.out.println("=======================Drag==================================");
		driver.get("http://www.leafground.com/pages/drag.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(drag, 67, 92).perform();
		
		//
		System.out.println("=======================Drag and Drop==================================");
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(drag1, drop).perform();
		//builder.clickAndHold(findElement7).moveToElement(findElement6).release().perform();
		
		//
		System.out.println("=======================Mouse Hover==================================");
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.findElement(By.linkText("TestLeaf Courses")).click();
		WebElement hover = driver.findElement(By.linkText("RPA"));
		builder.moveToElement(hover).perform();
		
	}

}
