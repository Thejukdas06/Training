package ShoppersStack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base_Test 
{
	public WebDriver driver;
	@BeforeClass
	public void OpenAppln()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void CloseAppln() 
	{		
		driver.close();
	}
}

