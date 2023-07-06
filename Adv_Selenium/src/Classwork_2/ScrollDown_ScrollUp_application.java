package Classwork_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDown_ScrollUp_application {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}

	}

}
