package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("kiruthika");
		driver.findElement(By.id("lastNameField")).sendKeys("Arumugam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("kiru");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Arumugam");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("student");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("I am a student");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("student@gmail.com");
		
		WebElement eleTool = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select dropDown = new Select(eleTool);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Hello,I am a student");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		driver.close();
		
		
	}

}
