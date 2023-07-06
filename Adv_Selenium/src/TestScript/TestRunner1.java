package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Pom1;

public class TestRunner1 
{
@Test
public void test1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://106.51.87.42:9007/");
	Pom1 p=new Pom1(driver);
	p.clickLogin();
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	p.clickLogin();
}

}
