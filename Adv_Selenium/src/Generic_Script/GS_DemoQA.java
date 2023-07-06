package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GS_DemoQA implements QA_Form_Const
{
		public WebDriver driver;
		@BeforeMethod
		public void OpenAppln()
		{
			System.setProperty(chrome_key,chrome_value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(base_url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		@AfterMethod
		public void CloseAppln()
		{
			driver.close();
		}
	}

