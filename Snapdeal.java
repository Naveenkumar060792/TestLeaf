package week4.day2.weeklyAssignment;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//
		ChromeDriver driver= new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		//2. Go to Mens Fashion
		WebElement menfashion = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(menfashion).perform();
		//3. Go to Sports Shoes
		driver.findElement(By.linkText("Sports Shoes")).click();
		//4. Get the count of the sports shoes
		WebElement sport = driver.findElement(By.xpath("//h1[@class='category-name']/span"));
		String text = sport.getText();
		String count = text.replaceAll("[^0-9]", "");
		System.out.println("The total number of shoes is: "+count);
		//5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//6. Sort by Low to High
		driver.findElement(By.xpath("//span[@class='sort-label']//following-sibling::div")).click();
		
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(2000);
		//7. Check if the items displayed are sorted correctly
		List<WebElement> itemsdis = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int size = itemsdis.size();
		int prevint=0;
		for(int i=0; i<size; i++) {
			String itemtitle = itemsdis.get(i).getText();
			String replaceAll1 = itemtitle.replaceAll("[^0-9]", "");
			//System.out.println(replaceAll1);
			int parseInt = Integer.parseInt(replaceAll1);
			System.out.println(parseInt);
			if(prevint<=parseInt) {
				System.out.println("The prices is Sorted");
			}
			else {
				System.out.println("The price is not sorted");
			}
			prevint=parseInt;
		}
		//8. Mouse Hover on puma Blue Training shoes
		WebElement trainshoe = driver.findElement(By.xpath("//source[@title='Columbus White Training Shoes'][1]"));
		builder.moveToElement(trainshoe).perform();
		//9. click QuickView button
		WebElement quickview = driver.findElement(By.xpath("(//source[@title='Columbus White Training Shoes'])/following::div[2]"));
		quickview.click();
		//10. Print the cost and the discount percentage
		Thread.sleep(2000);
		String discpercent = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println("The discount percentage is: "+discpercent);
		//11. Take the snapshot of the shoes.
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snapdeal/snapshot.png");
		FileUtils.copyFile(screenshotAs, destination);
		//12. Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
		//13. Close the main window
		driver.quit();		
	}

}
