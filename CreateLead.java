package week2.day1.classAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps");
		//Login Page
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM Link Page
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Home Page of CRM
		String ActualTitle="My Home | opentaps CRM";
		String HomeTitle=driver.getTitle();
		//Condition to verify it is routed to home page
		if(ActualTitle.equals(HomeTitle)) {
			
			System.out.println("Successfully logged into Home page");
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			//Form fields
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NaveenKumar.Co");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveenkumar");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
			
			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select srcdropdwn= new Select(source);
			srcdropdwn.selectByIndex(4);
			
			WebElement mrktng = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select mrktnddrpdown= new Select(mrktng);
			mrktnddrpdown.selectByValue("CATRQ_AUTOMOBILE");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Naveenkumar");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Baskaran");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR.");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/23/21");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("WelcomeTo");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
			
			WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select currencydrpdown= new Select(currency);
			currencydrpdown.selectByVisibleText("INR - Indian Rupee");
			
			WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select industryvalue= new Select(industry);
			industryvalue.selectByIndex(2);
			
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
			
			WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select owner=new Select(ownership);
			owner.selectByValue("OWN_CCORP");
			
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AB987CD");
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("****");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi, Welcome to our new automation");
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note: Listen Carefully");
			//Contact Information
			WebElement CountryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
			CountryCode.clear();
			CountryCode.sendKeys("91");
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("Coimbatore");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654");
			driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0006");
			driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Naveen");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@aa.com");
			driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Naveen.html");
			
			//Primary Address
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Baskaran");
			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mr.Baskaran");
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Door No. 123");
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("goodwill Street");
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
			
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("321654");
			
			WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select statevalue= new Select(state);
			statevalue.selectByIndex(12);
			driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("65");
			
			driver.findElement(By.name("submitButton")).click();
			
			String viewLead= "View Lead | opentaps CRM";
			String viewleadTitle = driver.getTitle();
			if(viewLead.contentEquals(viewleadTitle)) {
				System.out.println("Successfully created Lead!!!");
			}
			
			
		}
		else {
			System.out.println("Not routed to home page");
		}

		// driver.close();
	}

}
