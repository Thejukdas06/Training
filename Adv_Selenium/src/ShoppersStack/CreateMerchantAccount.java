package ShoppersStack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateMerchantAccount extends Base_Test
{
	@Test
	public void createAccount() throws InterruptedException
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//button[text()='Merchant Login']")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Enter Admin Email")).sendKeys("thejaswinigkadmin@gmail.com");
		driver.findElement(By.xpath("//*[name()='svg'][@data-testid='LinkIcon']")).click();
		driver.findElement(By.xpath("//span[text()='Merchant Signup']")).click();
		driver.findElement(By.id("First Name")).sendKeys("Anjali");
		driver.findElement(By.id("Last Name")).sendKeys("D Y");
		driver.findElement(By.id("E-mail")).sendKeys("anjali_dy@gmail.com");
		driver.findElement(By.id("Phone Number")).sendKeys("8865897614");
		driver.findElement(By.id("Password")).sendKeys("Anjali@123");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.id("Company Name")).sendKeys("AnjaliPharmacy");
		driver.findElement(By.id("Company Email")).sendKeys("anjaliPharmacy@gmail.com");
		driver.findElement(By.id("Company Phone Number")).sendKeys("8861759088");
		driver.findElement(By.id("Company GSTN")).sendKeys("AMR963");
		driver.findElement(By.id("Company Registration Number")).sendKeys("ANJU04");
		driver.findElement(By.id("Company Website")).sendKeys("AnjaliPharmacy.com");
		driver.findElement(By.id("Commission")).sendKeys("20");
		driver.findElement(By.id("Company Type")).click();
		driver.findElement(By.xpath("//li[text()='Pharmacy']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		driver.findElement(By.id("Building Information")).sendKeys("Maruti Complex");
		driver.findElement(By.id("Landmark")).sendKeys("Near KSRTC Bus stand");
		driver.findElement(By.id("Street Info")).sendKeys("BM Road");
		driver.findElement(By.id("Pincode")).sendKeys("573201");
		driver.findElement(By.id("Country")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("State")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Karnataka']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("City")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Hassan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Terms And Conditions")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", ele);
		Thread.sleep(1000);
		ele.click();
		driver.findElement(By.xpath("//button[text()='I Agree']")).click();
		driver.findElement(By.xpath("//span[text()='Finish']")).click();
		Thread.sleep(4000);
		
	}
}
