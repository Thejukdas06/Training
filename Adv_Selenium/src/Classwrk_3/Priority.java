package Classwrk_3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 1)
public void test() throws IOException
{
	System.setProperty("webdriver.chrome.driver", 
			"./Software_2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("D:\\Java\\popup.jpeg");
	FileHandler.copy(src, dst);
}
@Test
public void test2()
{
Reporter.log("Hello world",true);
}
}