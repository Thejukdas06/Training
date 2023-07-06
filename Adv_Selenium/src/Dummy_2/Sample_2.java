package Dummy_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample_2 {
	@Test
public void test2()
{
			System.setProperty("webdriver.gecko.driver", 
					"./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.instagram.com/");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9632267796");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("theju@696");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.close();
		}
}
