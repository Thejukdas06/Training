package ShoppersStack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateShopperAccount extends Base_Test
{

	@Test
	public void createAccount()
	{
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Create Account")).click();
		driver.findElement(By.id("First Name")).sendKeys("Thejaswini");
		driver.findElement(By.id("Last Name")).sendKeys("");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("8861759089");
		driver.findElement(By.id("Email Address")).sendKeys("thejaswinishopper@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin@123");
		driver.findElement(By.id("Confirm Password")).sendKeys("Admin@123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		}

}
