package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setup browser Driver
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://www.ajio.com/");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Entering bags in search tab
		 driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		 
		 //Checking the checkbox using java execute
		 WebElement findElement1 = driver.findElement(By.xpath("//input[@id='Men']"));
		 driver.executeScript("arguments[0].click();", findElement1);
		 
		 //Checking the checkbox using java execute
		 WebElement findElement2 = driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']"));
		 driver.executeScript("arguments[0].click();", findElement2);
		 Thread.sleep(2000);
		 
		 //Obtaining the total no of items
		 String totalItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		 System.out.println("The total number of items are \t" + (totalItems.replaceAll("[^0-9]", "")));
		 Thread.sleep(2000);
		 
		 //Obtaining the list of brands
		 List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		 for (WebElement brand : brands) {
			 System.out.println("The brand name is \t" + brand.getText());
			
		}
		 Thread.sleep(2000);
		 
		 //Obtaining the list of names of bags
		 List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		 for (WebElement name : names) {
			System.out.println("The name of the bag is \t" + name.getText());
		}
	}

}
