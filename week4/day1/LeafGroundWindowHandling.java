package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		 
		 //Maximize the browser window.
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		//String mainWindow = driver.getWindowHandle();
		//System.out.println(mainWindow);
		String mainTitle = driver.getTitle();
		//System.out.println(mainTitle);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		
		//Ensuring new windows opened
		Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<String>(windowHandles);
        for (String window : windows) {
        	driver.switchTo().window(window);
            String childTitle = driver.getTitle();
        	//System.out.println(childTitle);
            if(!childTitle.equalsIgnoreCase(mainTitle)) {
        		System.out.println("New window is opened and the title is "+ childTitle);
        		driver.close();
        	} 
			
		}
		
        driver.switchTo().window(windows.get(0));
        Thread.sleep(2000);

        
        //Opening multiple tabs and counting the windows
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        windowHandles = driver.getWindowHandles();
        windows = new ArrayList<String>(windowHandles);
        int numberOfTabs = windows.size();
        System.out.println("The number of opened tabs is " + numberOfTabs);
        for (int i = 1; i < numberOfTabs; i++) {
        	driver.switchTo().window(windows.get(i));
        	driver.close();
        	}
        driver.switchTo().window(windows.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        windowHandles = driver.getWindowHandles();
        windows = new ArrayList<String>(windowHandles);
        numberOfTabs = windows.size();
        //Closing all windows except primary
        for (int i = 1; i < numberOfTabs; i++) {
        	driver.switchTo().window(windows.get(i));
        	driver.close();
        	
		}
        
        //Closing all windows so make sure to close windows in the previous tasks
        Thread.sleep(2000);
        driver.switchTo().window(windows.get(0));
        windowHandles = driver.getWindowHandles();
        windows = new ArrayList<String>(windowHandles);
        //System.out.println(windows.size());
        if(windows.size()==1) {
        	System.out.println("All windows closed except the primary window");
        }
        
        Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		  windowHandles = driver.getWindowHandles(); 
		  windows = new ArrayList<String>(windowHandles); 
		  for (String window : windows) {
		  driver.switchTo().window(window); 
		  System.out.println("The title is " + driver.getTitle()); 
		  }
		 
          driver.quit();
        
	}

}
