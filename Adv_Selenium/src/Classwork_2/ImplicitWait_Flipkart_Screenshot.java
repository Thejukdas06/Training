package Classwork_2;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitWait_Flipkart_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.Flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Realme 8 5G");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='realme 8 5G (Supersonic Blue, 128 GB)']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String s : allwh) 
		{
			driver.switchTo().window(s);
		}
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement ele = driver.findElement(By.xpath("//button[text()='Buy Now']"));
			Point loc = ele.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			js.executeScript("window.scrollBy("+x+","+y+")");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("C:\\Users\\Thejswini GK\\Desktop\\Selenium\\SS.jpeg");
			FileHandler.copy(src, dst);
			driver.close();
		

	}
	
}
