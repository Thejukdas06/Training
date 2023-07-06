package Classwork_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_without_methods {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com/");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
			}
}
