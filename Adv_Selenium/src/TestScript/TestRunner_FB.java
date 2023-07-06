package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Pom2;

public class TestRunner_FB 
{
@Test
public void test2()
{
	System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Pom2 p=new Pom2(driver);
	p.passUN("admin");
	p.passPWD("123");
	p.clickButton();
}
}
