package ShoppersStack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyProductThroughWishlist extends Base_Test
{
	@Test
	public void wishlist() throws InterruptedException
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//button[text()='Shopper Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("thejaswinishopper@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	
		Thread.sleep(4000);
		driver.findElement(By.id("electronics")).click();
		driver.findElement(By.id("search")).sendKeys("watch");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='firebolt']/../../div[2]/*[2])[1]")).click();
		driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']")).click();
		driver.findElement(By.xpath("//li[text()='Wish List']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'firebolt')]/../div[2]/button[1]")).click();
		driver.findElement(By.xpath("//a[@class='navbar_cartIcon__iMaBM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("buynow_fl")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']"))));
		driver.findElement(By.xpath("//a[@class='navbar_cartIcon__iMaBM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='My Orders']")).click();
	}
}
