package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_action {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/bangalore");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//ScrollBy
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		//ScrollTo
		js.executeScript("window.scrollTo(0,300);");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h4[text()='Truffles']"));
		//ele.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);", ele);
		driver.close();

	}

}
