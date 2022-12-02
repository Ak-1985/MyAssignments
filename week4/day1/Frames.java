package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.switchTo().frame("frame1");
		 driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Testleaf Assignment");
		 //driver.switchTo().defaultContent();
		 
		 //Since it is nested element no need to move to default content
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input[@id='a']")).click();
		 
		 //Frame 2 is outside the nested frame
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("frame2");
		 WebElement findElement = driver.findElement(By.id("animals"));
		 Select dropDown = new Select (findElement);
		 dropDown.selectByValue("big baby cat");
		 driver.switchTo().defaultContent();
		 driver.close();
	}

}
