package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://leafground.com/drag.xhtml;jsessionid=node01qey7o6oowt9dc09s8l9hc4bu437441.node0");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 Actions builder = new Actions(driver);
		 WebElement dragSource = driver.findElement(By.xpath("//span[text()='Drag me around']"));
         builder.dragAndDropBy(dragSource, 300, 0).perform();
         System.out.println(dragSource.getLocation());
         
         WebElement dragSource1 = driver.findElement(By.xpath("//p[text()='Drag to target']"));
         WebElement dragTarget1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
         builder.dragAndDrop(dragSource1, dragTarget1).perform();
         
         
         WebElement dragColumnSource = driver.findElement(By.xpath("//span[text()='Category']/parent::th[contains(@class,'ui-draggable-column')]"));
         WebElement dragColumnTarget = driver.findElement(By.xpath("//span[text()='Quantity']/parent::th[contains(@class,'ui-draggable-column')]"));
         Point location = dragColumnTarget.getLocation();
         int x = location.getX();
         int y = location.getY();
         System.out.println("The x is"+ x + "the y is" + y);
         Thread.sleep(2000);
         builder.dragAndDrop(dragColumnSource,dragColumnTarget).build().perform();
         
         
         
         WebElement dragRowSource = driver.findElement(By.xpath("//tbody[contains(@class,'ui-sortable')]/tr[@data-ri='0']"));
         WebElement dragRowTarget = driver.findElement(By.xpath("//tbody[contains(@class,'ui-sortable')]/tr[@data-ri='3']"));
         builder.dragAndDrop(dragRowSource, dragRowTarget).perform();
         
         
	}
	

}
