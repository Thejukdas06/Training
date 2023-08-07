package TestNG_Basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo_Register extends Base_Test
{
@Test
public void Register()
{
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Thejaswini");
	driver.findElement(By.id("LastName")).sendKeys("GK");
	driver.findElement(By.id("Email")).sendKeys("Thejaswinikrupadas@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Theju@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Theju@123");
	driver.findElement(By.id("register-button")).click();
	driver.close();
}
}
