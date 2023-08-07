package TestNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test 
{
	public static WebDriver driver;
//@Parameters("URL")
@BeforeMethod
public void setupBrowser()
{
	System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
