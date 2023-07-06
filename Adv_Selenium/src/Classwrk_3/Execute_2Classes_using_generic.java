package Classwrk_3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_2Classes_using_generic extends Generic_script {
	@Test
	public void test()
	{
			driver.findElement(By.id("email")).sendKeys("9632267796");
			driver.findElement(By.id("pass")).sendKeys("theju@696");
			driver.findElement(By.name("login")).click();
			
		}
}
