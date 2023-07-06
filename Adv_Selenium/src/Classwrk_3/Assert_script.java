package Classwrk_3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_script extends Generic_script {
	@Test
	public void test() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("9632267796");
	driver.findElement(By.id("pass")).sendKeys("theju@696");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up");
	System.out.println("1");
}
}