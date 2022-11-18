package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	    //maximize the window
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//Create Lead
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
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("student");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
