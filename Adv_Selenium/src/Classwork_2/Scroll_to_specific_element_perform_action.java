package Classwork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_specific_element_perform_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//a[text()='Germany']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();

	}

}
