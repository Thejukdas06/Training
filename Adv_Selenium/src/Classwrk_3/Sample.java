package Classwrk_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sample extends Generic_script{
@Test
public void test()
{
	{
		driver.findElement(By.id("email")).sendKeys("9632267796");
		driver.findElement(By.id("pass")).sendKeys("theju@696");
		driver.findElement(By.name("login")).click();
	}
}
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).click();
	}
}

