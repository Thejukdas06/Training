package Classwork_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_Browsers {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}

}
