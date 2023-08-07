package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Thejswini%20GK/Downloads/demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		//driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		String Parent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
		}
		if(driver.getTitle().contains("Apple"))
		{
			driver.close();
		}
		else if(driver.getCurrentUrl().contains("file:///C:/Users/Thejswini%20GK/Downloads/demo.html"))
		{
			driver.close();
		}
	}
}
