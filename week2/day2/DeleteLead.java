package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Clicking Phone number tab
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]/ancestor::a")).click();
		
		//Entering phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9496560964");
		
		//Click button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Need time to retrieve list of leads
		Thread.sleep(2000);
		  
		//Obtain leadID  
		String leadID = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
		System.out.println(leadID);
		
		//Entering LeadID
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		
		//Deleting the record
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Checking whether the record is absent
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String obtained = driver.findElement(By.xpath("//div[@class='x-panel-bbar']//div[text()='No records to display']")).getText();
		//String original = "No records to display";
		if(obtained.contains("No records to display")) {
			System.out.println("Message verified");
		}else {
			System.out.println("error");
		}
		driver.close();
		
	}

}
