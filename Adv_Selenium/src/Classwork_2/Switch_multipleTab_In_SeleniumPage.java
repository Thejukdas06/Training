package Classwork_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch_multipleTab_In_SeleniumPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//a[@href='/downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[@href='/documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[@href='/projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[@href='/support']"));
		ArrayList<WebElement>l=new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		Actions act = new Actions(driver);
		Robot r = new Robot();
		for (WebElement we : l)
		{
			act.contextClick(we).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String>l2=new ArrayList<String>(allwh);
		 String add = l2.get(3);
		 driver.switchTo().window(add);

	}

}
