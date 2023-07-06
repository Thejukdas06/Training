package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_insta_using_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9632267796");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("theju@696");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
