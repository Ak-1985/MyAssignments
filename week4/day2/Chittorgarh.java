package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://www.chittorgarh.com/");
		 
		 //Maximize the browser window.
		 
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		 driver.findElement(By.linkText("NSE Bulk Deals")).click();
		 List<WebElement> securityNameElement = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr/td[3]"));
         List<String> securityNameList = new ArrayList<String>();
         for (WebElement element : securityNameElement) {
			securityNameList.add(element.getText());
			System.out.println("The names are  " + (element.getText()));
		}
         HashSet<String> securityNameSet = new HashSet<String>(securityNameList);
         if(securityNameList.size() == securityNameSet.size()) {
        	 System.out.println("No duplicates present");
         } else {
        	 System.out.println("duplicates present");
         }
         
	}

}
