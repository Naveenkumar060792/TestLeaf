package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		WebDriverManager.chromedriver().setup();
		//
		ChromeDriver driver=new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.get("http://leafground.com/pages/Dropdown.html");
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		WebElement dropdownIndex = driver.findElement(By.id("dropdown1"));
		Select findIndex= new Select(dropdownIndex);
		findIndex.selectByIndex(1);
		String firstSelectedOption = findIndex.getFirstSelectedOption().getText();
		String selectIndex="Selenium";
		//System.out.println(firstSelectedOption);
		if(selectIndex.equals(firstSelectedOption)) {
			System.out.println("Great select by index works!!");
		}
		else {
			System.out.println("Keep working to get the selected index value");
		}
		//
		WebElement dropdownText = driver.findElement(By.name("dropdown2"));
		Select findText= new Select(dropdownText);
		findText.selectByVisibleText("UFT/QTP");
		String selectText = findText.getFirstSelectedOption().getText();
		String selectTextval="UFT/QTP";
		if(selectText.equals(selectTextval)) {
			System.out.println("Great select by text works!!");
		}
		else {
			System.out.println("Keep working to get the selected text");
		}
		//
		WebElement dropdownValue = driver.findElement(By.id("dropdown3"));
		Select findValue= new Select(dropdownValue);
		findValue.selectByValue("2");
		String textValue = findValue.getFirstSelectedOption().getText();
		String selectedValue="Appium";
		if(selectedValue.equals(textValue)) {
			System.out.println("Great select by value works!!");
		}
		else {
			System.out.println("Keep working to get the selected value");
		}
		//
		WebElement dropdownCount = driver.findElement(By.className("dropdown"));
		Select drpdownCount=new Select(dropdownCount);
		int lastIndexOf = drpdownCount.getOptions().size();
		int listCount=5;
		if(lastIndexOf==listCount) {
		System.out.println("Great get options with size works!!");
		}
		else {
			System.out.println("Keep working to get options with size");
		}
		//
		WebElement val=driver.findElement(By.xpath("(//div[@class='example'])[5]//select"));
		val.sendKeys("Loadrunner");
		
		//
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='example'])[6]//select"));
		Select multipleSelect=new Select(findElement);
		multipleSelect.selectByIndex(2);
		
	}

}
