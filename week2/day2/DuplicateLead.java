package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	    //maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find Leads tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Entering Email tab
		driver.findElement(By.xpath("//span[contains(text(),'Email')]/ancestor::a")).click();
		
		//Entering email address
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("student@gmail.com");
		
		//Clicking the button for find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Need time or else retrieves previous page
		Thread.sleep(2000);
		
		//Capturing Name of the first row
		String leadName = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-firstName')]/div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
		System.out.println(leadName);
		
		//Clicking the name field
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-firstName')]/div[contains(@class,'x-grid3-col-firstName')]/a")).click();
		//Clicking button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Obtaining the title 
		String titlePage = driver.findElement(By.xpath("//div[contains(@class,'sectionHeaderTitle')]")).getText();
		
		//Checking 2 strings
		if(titlePage.equalsIgnoreCase("Duplicate Lead")) {
			System.out.println("Title verified and it is" + titlePage);
			
		} else {
			System.out.println("error");
		}
		
		//Obtaining the name from duplicate lead
		//String firstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String obtainedName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		//Checking two names
		if (leadName.equals(obtainedName)) {
			System.out.println("The name is verified and it is" + leadName);
		} else {
			System.out.println("error");
			
		}
		
		driver.close();
		
		
	}

}
