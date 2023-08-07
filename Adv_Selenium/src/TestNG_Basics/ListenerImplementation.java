package TestNG_Basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		LocalDateTime date=LocalDateTime.now();
		String SSDate = date.toString().replace(":", "-");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "./Software_2/chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://snowcityblr.com/contact-us/");
		 */
		
		TakesScreenshot ts=(TakesScreenshot) Base_Test.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/"+SSDate+"SS1.png");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
