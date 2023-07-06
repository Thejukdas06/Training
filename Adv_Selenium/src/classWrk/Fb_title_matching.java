package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_title_matching {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9632267796");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("theju@696");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
