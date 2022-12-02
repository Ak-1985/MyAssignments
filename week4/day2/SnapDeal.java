package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
	     
	     // Launch the browser
	     ChromeDriver driver = new ChromeDriver(option);
		 
		 		 
		 //Launch the url
		 driver.get("https://www.snapdeal.com/");
		 
		 //Maximize the browser window.
		 
		 driver.manage().window().maximize();
		 
		//Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 Actions builder = new Actions(driver);
		 //WebElement findElement2 = driver.findElement(By.xpath("//div[@class='menuIconBar whiteBack']"));
		 //builder.moveToElement(findElement2).perform();
		 WebElement findElement = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[contains(text(),'Men')]"));
		 builder.moveToElement(findElement).perform();
		 driver.findElement(By.xpath("//span[text()='Footwear']/following::span[text()='Sports Shoes']")).click();
		 String sportsshoesCount = driver.findElement(By.xpath("//h1[@category='Sports Shoes for Men']/following-sibling::span")).getText().replaceAll("[^0-9]","");
		 System.out.println("The number of sports shoes are " + sportsshoesCount);
		 driver.findElement(By.xpath("//a[@class='child-cat-node dp-widget-link hashAdded']/div[text()='Training Shoes']")).click();
         driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
         driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
         Thread.sleep(3000);
         List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='product-price-row clearfix']//span[@class='lfloat product-price']"));
         List<Integer> priceList = new ArrayList<Integer>();
         for (WebElement findElement1:findElements) {
			String priceString = findElement1.getText().replaceAll("[^0-9]","");
			int price = Integer.parseInt(priceString);
			priceList.add(price);
			
		}
         List<Integer> sortedList = new ArrayList<Integer>(priceList);
         Collections.sort(sortedList);
         for(int i=0; i <priceList.size();i++) {
        	 if (priceList.get(i) == sortedList.get(i)) {
        		 System.out.println(priceList.get(i)+"  price matches  "+ sortedList.get(i));
        		 continue;
        	 } else {
        		 System.out.println(priceList.get(i)+"Not match"+sortedList.get(i));
        	 }
         }
         
         driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
         driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
         driver.findElement(By.xpath("//input[@name='toVal']")).clear();
         driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
         driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
         String color = driver.findElement(By.xpath("//div[@class='filters']//a[@data-key='Color_s|Color']")).getText();
         String range = driver.findElement(By.xpath("//div[@class='filters']//a[@data-key='Price|Price']")).getText();
         if ((color.equals("Yellow"))&& (range.contains("Rs"))) {
        	 System.out.println("filters applied");
        	 
         } else {
        	 System.out.println("filter not applied");
         }
         WebElement findElement3 = driver.findElement(By.xpath("//picture[@class='picture-elem']/img"));
         builder.moveToElement(findElement3).perform();
         driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]")).click();
         WebElement findElement4 = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
         if((findElement4.isDisplayed()&& findElement4.isEnabled())){
        	 String priceObtained = findElement4.getText().replaceAll("[^0-9]","");
        	 System.out.println("The price is" + priceObtained);
        	 System.out.println("element clickable");
         }
         String percentDiscount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText().replaceAll("[^0-9]","");
         System.out.println("The percent discount is" + percentDiscount);
         Thread.sleep(2000);
         File source = driver.getScreenshotAs(OutputType.FILE);
         File dest = new File("./snaps/shoe.jpeg");
         FileUtils.copyFile(source,dest);
         
         driver.close();
         
         
         
         
	}

}
