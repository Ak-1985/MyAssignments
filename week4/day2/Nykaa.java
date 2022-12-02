package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://www.nykaa.com/");
		 
		 //Maximize the browser window.
		 
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 
		 //Mouseover to element
		 Actions builder = new Actions(driver);
		 WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		 builder.moveToElement(findElement).perform();
		 driver.findElement(By.xpath("//div[@id='scroller-container']/div/a[contains(text(),'Oreal Paris')]")).click();
		 
		 //Get the title of page and it should be changed
		 String title = driver.getTitle();
		 if (title.contains("Oreal Paris")) {
			 System.out.println("The title is verified and it is " + title);
		 } else {
			 System.out.println("Not verified");
		 }
		 
		 //Clicking the sort feature
		 driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		 Thread.sleep(2000);
		 WebElement findElement3 = driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']"));
		 driver.executeScript("arguments[0].click();", findElement3);
		 //Clicking the various elements and applying filters
		 driver.findElement(By.xpath("//span[text()='Category']")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Hair']/parent::div")).click();
		 driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]/parent::div")).click();
		 driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		 driver.findElement(By.xpath("//span[text()='Concern']")).click();
		 driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		 
		 //Checking the filter
		 String filter1 = driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[text()='Shampoo']")).getText();
		 String filter2 = driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[text()='Color Protection']")).getText();
		 if (((filter1.equals("Shampoo")) && (filter2.equals("Color Protection")))){
			 System.out.println("filters are applied");
			 
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();
		 
		 //Moving to new window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(windows.get(1));
		 
		 //Selecting dropdown
		 WebElement findElement2 = driver.findElement(By.xpath("//select[@title='SIZE']"));
		 Select dropDown = new Select(findElement2);
		 dropDown.selectByValue("1");
		 
		 //Obtaining the price
		 String priceOfTheProduct = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
		 System.out.println("The price is " + priceOfTheProduct);
		 
		 //Select the shopping bag
		 driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		 driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		 
		 //Moving to iframe 
		 WebElement findElement4 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		 driver.switchTo().frame(findElement4);
		 
		 //Obtaining the grand Total
		 String grandTotal = driver.findElement(By.xpath("//div[contains(@class,'footer-layout')]//div/span[contains(text(),'₹')]")).getText();
		 System.out.println("The grand total is" + grandTotal);
		 driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		 
	}

}
