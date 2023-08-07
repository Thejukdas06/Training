package ShoppersStack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Buy_Product extends Base_Test
{

	@Test
	public void buyProduct() throws InterruptedException
	{
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//button[text()='Shopper Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("thejaswinishopper@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	
		Thread.sleep(4000);
		driver.findElement(By.id("electronics")).click();
		driver.findElement(By.id("search")).sendKeys("mobile");
		driver.findElement(By.id("searchBtn")).click(); 
		
		driver.findElement(By.xpath("(//span[text()='apple'])[1]/../../div[2]/child::button")).click();
		driver.findElement(By.xpath("//a[@class='navbar_cartIcon__iMaBM']")).click();
		driver.findElement(By.id("buynow_fl")).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='selectaddress_adneadd__kZf+o']"))));
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']"))));
		driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']")).click();
		driver.findElement(By.xpath("//li[text()='My Orders']")).click();
		//driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
		Thread.sleep(3000);

	}

}
