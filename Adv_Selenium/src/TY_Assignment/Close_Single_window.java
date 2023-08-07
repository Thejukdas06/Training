package TY_Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Single_window {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		String Parent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
		}
		if(driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"))
		{
			driver.close();
		}
	}

}
