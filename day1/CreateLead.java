package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	    //maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kiruthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kiruthika");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("student");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("student");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("student@gmail.com");
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(element);
		
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
			
		

	}

}
