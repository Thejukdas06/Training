package TestNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataDrivenTesting 
{
	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password)
	{
		
		 System.setProperty("webdriver.chrome.driver",
		 "./Software_2/chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
	
	@DataProvider(name="loginData",parallel = true)
	public String[][] testData()
	{
		String[][] data=MultipleReadExcel.readMultipleData("Login");
		
		return data;
		
	}

}
