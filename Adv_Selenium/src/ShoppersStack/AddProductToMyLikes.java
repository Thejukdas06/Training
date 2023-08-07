package ShoppersStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddProductToMyLikes extends Base_Test
{
@Test
public void myLikes() throws InterruptedException
{
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.xpath("//button[text()='Shopper Login']")).click();
	driver.findElement(By.id("Email")).sendKeys("thejaswinishopper@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[text()='My Profile']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='My Likes']"))));
	driver.findElement(By.xpath("//div[text()='My Likes']")).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.id("Category"));
	
	Select s=new Select(ele);
	s.selectByVisibleText("Beauty");
	Thread.sleep(3000);
	
	WebElement cat_type = driver.findElement(By.id("Category Type"));
	Select s1=new Select(cat_type);
	s1.selectByVisibleText("Kajal");
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[text()='My Likes']")).click();
	//Thread.sleep(4000);
	WebDriverWait wait1=new WebDriverWait(driver, 10);
	wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']"))));
	driver.findElement(By.xpath("//img[@class='MuiAvatar-img css-1hy9t21']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//li[text()='Logout']")).click();
	
}

}

