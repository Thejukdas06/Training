package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendmail_through_yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_yb_af6tc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("thejaswinigk@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("theju@0603");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='root_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("thejaswini.gkdas06@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Script to send mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi I'm Thejaswini, I have written script to send mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
	}

}
