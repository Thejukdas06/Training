package Classwork_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;

public class Google_switchTo_newtab_perform_action {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com/");
		Thread.sleep(2000);
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.contextClick(rclick).perform();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		for (String s : allwh)
		{
			driver.switchTo().window(s);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Hassan");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
