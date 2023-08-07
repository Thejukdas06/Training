package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Thejswini%20GK/Downloads/iframe.html");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("frame2");
		//driver.switchTo().frame("FR2");
		WebElement frameElement = driver.findElement(By.id("FR2"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("(//a[contains(@title,'Facebook')])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
	}

}
