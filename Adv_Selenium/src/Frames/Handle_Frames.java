package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handle_Frames
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Selenium/mainpage.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("un")).sendKeys("Hiii");
	Thread.sleep(2000);
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("f1");
	WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(ele);
	Thread.sleep(2000);
	driver.findElement(By.id("pwd")).sendKeys("Hello");
	driver.close();
	}
}
