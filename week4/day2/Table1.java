package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://html.com/tags/table/");
		 
		 //Maximize the browser window.
		 
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 List<WebElement> findElements = driver.findElements(By.xpath("//table/thead/tr/th"));
		 int numOfCol = findElements.size();
		 System.out.println("The num of cols  "+ numOfCol);
		 List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
         int numOfRows = findElements2.size();
         System.out.println("The number of rows  "+ numOfRows);
	}

}
