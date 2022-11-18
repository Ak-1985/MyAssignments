package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the url
		driver.get("https://en-gb.facebook.com/");
		
	    //maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kiruthika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Meena");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9494396408");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("kiruthika@123");
		WebElement ele1 = driver.findElement(By.name("birthday_day"));
		Select dropDown = new Select(ele1);
		dropDown.selectByValue("17");
		WebElement ele2 = driver.findElement(By.name("birthday_month"));
		Select dropDown2 = new Select(ele2);
		dropDown2.selectByVisibleText("Sep");
		WebElement ele3 = driver.findElement(By.name("birthday_year"));
		Select dropDown3 = new Select(ele3);
		dropDown3.selectByVisibleText("1985");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		
		
		
		
		

	}

}
