package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Logging in
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 //Clicking the widgets
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 driver.findElement(By.xpath("//table[@widgetid='ComboBox_partyIdFrom']/following-sibling::a")).click();
		 
		 //Moving to new window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windows = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(windows.get(1));
		 driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '][1]//a")).click();
		 
		 //Moving back to main window and clicking the widget again
		 driver.switchTo().window(windows.get(0));
		 driver.findElement(By.xpath("//table[@widgetid='ComboBox_partyIdTo']/following-sibling::a")).click();
		 
		 //Moving to new window and window ids changed and so assign to new variable
		 Set<String> windowHandles1 = driver.getWindowHandles();
		 List<String> windows1 = new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(windows1.get(1));
		 driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '][1] )[2]//a")).click();
		 
		 //Moving back to old window and merging 
		 driver.switchTo().window(windows1.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 //Alert opened
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 String title = driver.getTitle();
		 if (title.contains("View Contact")) {
			 System.out.println("The title is verified and it is " + title);
		 }
	}

}
