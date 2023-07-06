package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("9632267796");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("theju@696");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
