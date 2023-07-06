package Classwork_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

}
