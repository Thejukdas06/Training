package TestNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningParallelExecution 
{
	@Test(threadPoolSize = 4,invocationCount = 2)
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Thejaswinikrupadas@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Theju@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed())
		{
			System.out.println("PASS: User is logged in");
		}
		else
		{
			System.out.println("FAIL: User is not logged in");
		}
		driver.quit();
	}
}
