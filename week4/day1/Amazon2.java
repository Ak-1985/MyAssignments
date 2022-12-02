package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        //		Maximize the browser		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //		Load the URL
		driver.get("https://www.amazon.in");

        // search box
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("OnePlus 9 pro", Keys.ENTER);

        // Price for First Product
		WebElement firstMobilePrice = driver.findElement(By.xpath("//span[@class = 'a-price-whole']"));
		String text = firstMobilePrice.getText().replace(",", "");
		Double price1 = Double.parseDouble(text);
		System.out.println("1st product Price Amount :- " + price1);
		driver.findElement(By.xpath("//a[@class = 'a-popover-trigger a-declarative']/i")).click();
		Thread.sleep(2000);
		WebElement ratings = driver.findElement(
				By.xpath("//span[@class = 'a-size-medium a-color-base a-text-beside-button a-text-bold']"));
		String text2 = ratings.getText();
		System.out.println(text2);
		Actions builder = new Actions(driver);
		builder.moveToElement(ratings).pause(Duration.ofSeconds(2)).click(ratings).perform();

        // Click first text link of first image
		driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));

        // Screenshot for product
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileUtils.copyFile(source, dest);

        // Click Add to Cart
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-button")).click();

        // Get Cart Subtotal
		Thread.sleep(5000);
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(subTotal);
		String replaceAll = subTotal.replaceAll("₹", "").replaceAll(",", "");
		System.out.println(replaceAll);
		double price2 = Double.parseDouble(replaceAll);
		System.out.println("Sub Total amount :- " + price2);
		if (price1 == price2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}
	}


	}


