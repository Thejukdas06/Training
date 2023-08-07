package TestNG_Basics;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Demo extends Base_Test
{
@Test
public void Login()
{
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("Thejaswinikrupadas@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Theju@123");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();

}
}
