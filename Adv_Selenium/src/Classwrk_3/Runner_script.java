package Classwrk_3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner_script extends Generic_script {
@Test
public void fblogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("abc");
	driver.findElement(By.id("pass")).sendKeys("123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
}
}
